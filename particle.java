public class particle {

	private String identity;
	private double mass;
	private double[] momentum = {0,0,0};
	private double[] acceleration = {0,0,0};
	private double[] velocity = {0,0,0};
	private double[] position = {0,0,0};
	
	public particle(){
		identity = "";
		mass = 0;
		
	}
	
	public particle(String a, double b){
		identity = a;
		mass = b;
		
	}
	
	public String getIdentity(){
		return identity;
	}
	
	public double getMass(){
		return mass;
	}
	
	public double getMomentum(){
		return Math.sqrt(Math.pow(momentum[0],2)+Math.pow(momentum[1],2)+Math.pow(momentum[2],2));
	}
	
	public double getAcceleration(){
		return Math.sqrt(Math.pow(acceleration[0],2)+Math.pow(acceleration[1],2)+Math.pow(acceleration[2],2));
	}
	
	public double getVelocity(){
		return Math.sqrt(Math.pow(velocity[0],2)+Math.pow(velocity[1],2)+Math.pow(velocity[2],2));
	}
	
	public String getPosition(){
		String p = "";
		for(int i = 0;i<position.length;i++){
			p+=(position[i]+" ");
		}
		return p;
	}
	
	public double getOriginDistance(){
		return Math.sqrt(Math.pow(position[0],2)+Math.pow(position[1],2)+Math.pow(position[2],2));
	}
	
	public double getPositionX(){
		return position[0];
	}
	
	public double getPositionY(){
		return position[1];
	}
	
	public double getPositionZ(){
		return position[2];
	}


	public double getVelocityX(){
		return velocity[0];
	}
	
	public double getVelocityY(){
		return velocity[1];
	}
	
	public double getVelocityZ(){
		return velocity[2];
	}


	public double getAccelerationX(){
		return acceleration[0];
	}
	
	public double getAccelerationY(){
		return acceleration[1];
	}
	
	public double getAccelerationZ(){
		return acceleration[2];
	}


	public double getMomentumX(){
		return momentum[0];
	}
	
	public double getMomentumY(){
		return momentum[1];
	}
	
	public double getMomentumZ(){
		return momentum[2];
	}

}
