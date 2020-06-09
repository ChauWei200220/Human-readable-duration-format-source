package DALTUD_try;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TimeFormatterController implements ActionListener {
    haha obj;
    final static int MtoS = 60;
    final static int HtoS = MtoS*60;
    final static int DtoS = HtoS*24;
    final static int YtoS = DtoS*365;
    public static String formatDuration(Long seconds) {
        if (seconds == 0)
            return "now";
        Long times[]  = new Long[5];
        times[0] = seconds/YtoS;// years
        seconds %= YtoS;
        times[1] = seconds/DtoS;// days
        seconds %= DtoS;
        times[2] = seconds/HtoS;//hour
        seconds %= HtoS;
        times[3] = seconds/MtoS;// minutes
        seconds %= MtoS;
        times[4] = seconds; // sec

        int count = 0;
        String result = "";
        String[] timeFormats = {" year", " day", " hour", " minute", " second"};
        for (int i = 0; i < times.length; i++){
            if (times[i] == 0)
                continue;
            if (times[i] == 1)
                result += times[i] + timeFormats[i];
            else
                result += times[i] + timeFormats[i] + "s";
            count++;
            result += ", ";
        }
        result = result.substring(0, result.lastIndexOf(","));
        if (count == 1)
            return result;
        return result.substring(0, result.lastIndexOf(",")) + " and "
                + result.substring(result.lastIndexOf(",")+2,result.length());
    }
    public TimeFormatterController(haha obj){
        this.obj = obj;
    }
    public void actionPerformed(ActionEvent q){
        firstMenu menu = new firstMenu();
        if(q.getActionCommand().equals("Enter")){
            try {
                Long in = Long.parseLong(obj.textField.getText());
                obj.ta.setText(formatDuration(in));
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
        else if(q.getActionCommand().equals("Reset")){
            try {
                obj.textField.setText(null);
                obj.ta.setText(null);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
        else if (q.getActionCommand().equals("Exit")){
            try{
                /*System.exit(0);*/
                obj.setVisible(false);
                menu.setVisible(true);
            }
            catch (Exception e){}
        }
    }
    public static void main(String[]args){

    }

}




