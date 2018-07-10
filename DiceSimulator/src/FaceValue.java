
public class FaceValue{

  int pitch;
  int yaw;

  public FaceValue(int yaw, int pitch){
    this.pitch = pitch;
    this.yaw = yaw;
  }

  public int value(){

    if(yaw == 180 && pitch == 270 || yaw == 360 && pitch == 90 || yaw == 0 && pitch == 90)
      return 1;
    if(yaw == 180 && pitch == 180 || yaw == 360 && pitch == 360 || yaw == 0 && pitch == 0 || yaw == 0 && pitch == 360 || yaw == 360 && pitch == 0)
      return 2;
    if(yaw == 90 && pitch == 0 || yaw == 90 && pitch == 90 || yaw == 90 && pitch == 180 || yaw == 90 && pitch == 270 || yaw == 90 && pitch == 360)
      return 3;
    if(yaw == 270 && pitch == 180 || yaw == 270 && pitch == 0 || yaw == 270 && pitch == 90 || yaw == 270 && pitch == 360 || yaw == 270 && pitch == 270)
      return 4;
    if(yaw == 0 && pitch == 180 || yaw == 360 && pitch == 180 || yaw == 180 && pitch == 0 || yaw == 180 && pitch == 360)
      return 5;
    if(yaw == 360 && pitch == 270 || yaw == 0 && pitch == 270 || yaw == 180 && pitch == 90)
      return 6;
    else{
      return 0;
    }
  }

}
