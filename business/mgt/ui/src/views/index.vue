<template>
    <div class="index">
        <Row type="flex" justify="center" align="middle">
            <Col span="24">
            <h1>
                <img src="../images/logo.png">
            </h1>
            <h2>
                <p>Welcome to your iView app!</p>
                <Button @click="handleStart">Start iView</Button>
            </h2>
            </Col>
        </Row>
    </div>
</template>
<script>
	export default {
		methods: {
			handleStart() {
				this.$Modal.info({
					title: 'Bravo',
					content: 'Now, enjoy the convenience of iView.'
				});
			}
		}
	}
</script>
