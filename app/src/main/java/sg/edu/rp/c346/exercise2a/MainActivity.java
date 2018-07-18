package sg.edu.rp.c346.exercise2a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvWork;
    ArrayList<WorkItem> alWorkList;
    CustomAdapter caWork;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_main);

        lvWork= findViewById(R.id.listViewWork);

        alWorkList = new ArrayList<>();

        WorkItem work1 = new WorkItem("John","Software Technical Leader",3400.0);

        WorkItem work2 = new WorkItem("May","Programmer",2200.0);
        alWorkList.add(work1);
        alWorkList.add(work2);
        alWorkList.add(new WorkItem("A","A",2200.0));
        alWorkList.add(new WorkItem("B","A",2200.0));
        alWorkList.add(new WorkItem("AC","A",2200.0));
        alWorkList.add(new WorkItem("AASD","A",2200.0));
        alWorkList.add(new WorkItem("AQWD","A",2200.0));
        alWorkList.add(new WorkItem("AVA","A",2200.0));
        alWorkList.add(new WorkItem("ADWQ","A",2200.0));
        alWorkList.add(new WorkItem("AWQE2","A",2200.0));
        alWorkList.add(new WorkItem("AQWC","A",2200.0));
        alWorkList.add(new WorkItem("A","A",2200.0));
        alWorkList.add(new WorkItem("A","A",2200.0));
        alWorkList.add(new WorkItem("A","A",2200.0));
        alWorkList.add(new WorkItem("A","A",2200.0));



        caWork= new CustomAdapter(this,R.layout.modify,alWorkList);

        lvWork.setAdapter(caWork);


    }
}
