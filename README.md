Application main-app is java application being deployed to cloud foundry with a sidecar process
To make sidecar development separate from application deployment, we inject sidecar into application via buildpack
Version 1
	the sidecar is a dummy project that only upload a file and run the file during sidecar process

Version 2
	the sidecar buildpack downloads java jar from s3 bucket and store it in the droplet
	created new feature branch : sidecar-buildpack-s3
