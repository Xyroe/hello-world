
public class particle {

	private String identity;
	private double mass;
	private double momentum;
	private double acceleration;
	private double velocity;
	private double[] position;
	
	public particle(){
		identity = "";
		mass = 0;
		momentum = 0;
		acceleration = 0;
		velocity = 0;
		position;
		
	}
	
	public particle(String a, double b, double c, double d, double e, double[] f){
		identity = a;
		mass = b;
		momentum = c;
		acceleration = d;
		velocity = e;
		position = f;
		
	}
	
	public String getIdentity(){
		return identity;
	}
	
	public double getMass(){
		return mass;
	}
	
	public double getMomentum(){
		return momentum;
	}
	
	public double getAcceleration(){
		return acceleration;
	}
	
	public double getVelocity(){
		return velocity;
	}
	
	public 
	
	
	
}
