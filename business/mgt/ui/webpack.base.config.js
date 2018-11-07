const path = require('path');
const webpack = require('webpack');
const ExtractTextPlugin = require('extract-text-webpack-plugin');

module.exports = {
	// 入口文件
	entry: {
		main: './src/main',
		vendors: './src/vendors'
	},
	output: {
		path: path.join(__dirname, './dist') //打包后文件存放位置 注：__dirname 是node.js中的一个全局变量，它指向当前执行脚本所在目录。
	},
	module: {
		rules: [
			{
				test: /\.vue$/,
				use: [
					{
						loader: 'vue-loader',
						options: {
							loaders: {
								less: ExtractTextPlugin.extract({
									use: ['css-loader?minimize', 'autoprefixer-loader', 'less-loader'],
									fallback: 'vue-style-loader'
								}),
								css: ExtractTextPlugin.extract({
									use: ['css-loader', 'autoprefixer-loader', 'less-loader'],
									fallback: 'vue-style-loader'
								})
							}
						}
					},
					{
						loader: 'iview-loader',
						options: {
							prefix: false
						}
					}
				]
			},
			{
				test: /iview\/.*?js$/,    // 匹配需要loader处理文件的扩展名的正则表达式
				loader: 'babel-loader'    // loader名称
			},
			{
				test: /\.js$/,
				loader: 'babel-loader',
				exclude: /node_modules/   // include 手动添加需要处理的文件/文件夹   exclude 手动排除不需要处理的文件/文件夹
			},
			{
				test: /\.css$/,
				use: ExtractTextPlugin.extract({
					use: ['css-loader?minimize', 'autoprefixer-loader'],
					fallback: 'style-loader'
				})
			},
			{
				test: /\.less/,
				use: ExtractTextPlugin.extract({
					use: ['css-loader?minimize', 'autoprefixer-loader', 'less-loader'],
					fallback: 'style-loader'
				})
			},
			{
				test: /\.(gif|jpg|png|woff|svg|eot|ttf)\??.*$/,
				loader: 'url-loader?limit=1024'
			},
			{
				test: /\.(html|tpl)$/,
				loader: 'html-loader'
			}
		]
	},
	resolve: {
		extensions: ['.js', '.vue'],
		alias: {
			'vue': 'vue/dist/vue.esm.js',
			'@': resolve('src')
		}
	}
};