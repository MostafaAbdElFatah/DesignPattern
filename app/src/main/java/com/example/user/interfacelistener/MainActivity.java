package com.example.user.interfacelistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.user.interfacelistener.DesignPattern.AdapterDesignPattern.BirdAdapter;
import com.example.user.interfacelistener.DesignPattern.AdapterDesignPattern.PlasticToyBird;
import com.example.user.interfacelistener.DesignPattern.AdapterDesignPattern.Sparrow;
import com.example.user.interfacelistener.DesignPattern.AdapterDesignPattern.ToyBird;
import com.example.user.interfacelistener.DesignPattern.BuilderDesignPattern.User;
import com.example.user.interfacelistener.DesignPattern.CommandDesignPattern.Example1.Broker;
import com.example.user.interfacelistener.DesignPattern.CommandDesignPattern.Example1.BuyStock;
import com.example.user.interfacelistener.DesignPattern.CommandDesignPattern.Example1.SellStock;
import com.example.user.interfacelistener.DesignPattern.CommandDesignPattern.Example1.Stock;
import com.example.user.interfacelistener.DesignPattern.CommandDesignPattern.Example2.CommandDemo;
import com.example.user.interfacelistener.DesignPattern.CompositeDesignPattern.Developer;
import com.example.user.interfacelistener.DesignPattern.CompositeDesignPattern.Employee;
import com.example.user.interfacelistener.DesignPattern.CompositeDesignPattern.Manager;
import com.example.user.interfacelistener.DesignPattern.DecoratorDesignPattern.Example1.Circle;
import com.example.user.interfacelistener.DesignPattern.DecoratorDesignPattern.Example1.Rectangle;
import com.example.user.interfacelistener.DesignPattern.DecoratorDesignPattern.Example1.RedShape;
import com.example.user.interfacelistener.DesignPattern.DecoratorDesignPattern.Example1.Shape;
import com.example.user.interfacelistener.DesignPattern.DecoratorDesignPattern.Example2.BorderWidget;
import com.example.user.interfacelistener.DesignPattern.DecoratorDesignPattern.Example2.ScrollWidget;
import com.example.user.interfacelistener.DesignPattern.DecoratorDesignPattern.Example2.TextField;
import com.example.user.interfacelistener.DesignPattern.DecoratorDesignPattern.Example2.Widget;
import com.example.user.interfacelistener.DesignPattern.FacadeDesignPattern.HotelExample.HotelKeeper;
import com.example.user.interfacelistener.DesignPattern.FacadeDesignPattern.ShapeExample.ShapeMaker;
import com.example.user.interfacelistener.DesignPattern.IteratorDesignPattern.Iterator;
import com.example.user.interfacelistener.DesignPattern.IteratorDesignPattern.NameRepository;
import com.example.user.interfacelistener.DesignPattern.MementoDesignPattern.Example1.CareTaker;
import com.example.user.interfacelistener.DesignPattern.MementoDesignPattern.Example1.Originator;
import com.example.user.interfacelistener.DesignPattern.MementoDesignPattern.Example2.Life;
import com.example.user.interfacelistener.DesignPattern.ObserverDesignPattern.Example1.BinaryObserver;
import com.example.user.interfacelistener.DesignPattern.ObserverDesignPattern.Example1.HexaObserver;
import com.example.user.interfacelistener.DesignPattern.ObserverDesignPattern.Example1.OctalObserver;
import com.example.user.interfacelistener.DesignPattern.ObserverDesignPattern.Example1.Subject;
import com.example.user.interfacelistener.DesignPattern.ObserverDesignPattern.Example2.Gates;
import com.example.user.interfacelistener.DesignPattern.ObserverDesignPattern.Example2.Lighting;
import com.example.user.interfacelistener.DesignPattern.ObserverDesignPattern.Example2.SensorSystem;
import com.example.user.interfacelistener.DesignPattern.ObserverDesignPattern.Example2.Surveillance;
import com.example.user.interfacelistener.DesignPattern.PrototypeDesignPattern.Example1.PrototypeShape;
import com.example.user.interfacelistener.DesignPattern.PrototypeDesignPattern.Example1.ShapeCache;
import com.example.user.interfacelistener.DesignPattern.PrototypeDesignPattern.Example2.ColorStore;
import com.example.user.interfacelistener.DesignPattern.Proxy.Image;
import com.example.user.interfacelistener.DesignPattern.Proxy.ProxyImage;
import com.example.user.interfacelistener.DesignPattern.StrategyDesignPattern.AddOpertions;
import com.example.user.interfacelistener.DesignPattern.StrategyDesignPattern.Context;
import com.example.user.interfacelistener.DesignPattern.StrategyDesignPattern.MultiplyOperation;
import com.example.user.interfacelistener.DesignPattern.StrategyDesignPattern.SubstractOperation;


public class MainActivity extends AppCompatActivity implements  InterfaceListener {


    TextView textView;
    Button btn;
    InterfaceListener interfaceListener ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        btn = findViewById(R.id.button);

        //Builder Design Pattern

        User user = new User.Builder()
                .setFirstName("Mostafa")
                .setLastName("Abd El Fatah")
                .setAge(24)
                .setJob("Android & IOS Developer")
                .build();

        // Composite Design Pattern

        Employee emp1=new Developer("John", 10000);
        Employee emp2=new Developer("David", 15000);
        Employee manager1=new Manager("Daniel",25000);
        manager1.add(emp1);
        manager1.add(emp2);
        Employee emp3=new Developer("Michael", 20000);
        Manager generalManager=new Manager("Mark", 50000);
        generalManager.add(emp3);
        generalManager.add(manager1);
        generalManager.print();


        /**
         * Facade Design Pattern
         */

        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

        // ex2
        HotelKeeper keeper = new HotelKeeper();

        String v = keeper.getVegMenu();
        String nv = keeper.getNonVegMenu();
        String both = keeper.getVegNonMenu();

        System.out.println("\nv:"+ v +" ,nv:"+nv+" ,Both:"+both);

        /**
         * Adapter Design Pattern
         * */

        Sparrow sparrow = new Sparrow();
        PlasticToyBird toyDuck = new PlasticToyBird();

        // Wrap a bird in a birdAdapter so that it
        // behaves like toy duck
        ToyBird birdAdapter = new BirdAdapter(sparrow);

        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("ToyDuck...");
        toyDuck.squeak();

        // bird behaving like a toy duck
        System.out.println("BirdAdapter...");
        birdAdapter.squeak();

        /**
         * Decorator Design Pattern
         * */
        // ex1
        Shape circle = new Circle();

        Shape redCircle = new RedShape(new Circle());

        Shape redRectangle = new RedShape(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

        //ex2

        Widget borderScrollWidget = new BorderWidget(new ScrollWidget(new TextField(80, 24)));
        borderScrollWidget.draw();

        Widget scrollWidget = new ScrollWidget(new TextField(80, 24));
        scrollWidget.draw();

        /**
         * Observer Design Pattern
         * */
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);

        // Ex2

        SensorSystem sensorSystem = new SensorSystem();
        sensorSystem.register(new Gates());
        sensorSystem.register(new Lighting());
        sensorSystem.register(new Surveillance());
        sensorSystem.soundTheAlarm();

        /**
         * Command Design Pattern
         * */

        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();

        // Ex2

        CommandDemo commandDemo =new CommandDemo();
        commandDemo.produceRequests();
        /**
         * Strategy Design Pattern
         * */

        Context context = new Context(new AddOpertions());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new SubstractOperation());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new MultiplyOperation());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        /**
         * Memento Design Pattern
         * */
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());

        //Ex2

        Life life = new Life();
        CareTaker savedTimes = new CareTaker();
        //time travel and record the eras
        life.set("1000 B.C.");
        savedTimes.add(life.saveToMemento());
        life.set("1000 A.D.");
        savedTimes.add(life.saveToMemento());
        life.set("2000 A.D.");
        savedTimes.add(life.saveToMemento());
        life.set("4000 A.D.");
        life.restoreFromMemento(savedTimes.get(0));

        /**
         * Iterator Design Pattern
         * */
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }

        /**
         * Proxy Design Pattern
         * */

        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");
        //image will not be loaded from disk
        image.display();


        /**
         * Prototype Design Pattern
         * */

        ShapeCache.loadCache();

        PrototypeShape clonedShape = (PrototypeShape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        PrototypeShape clonedShape2 = (PrototypeShape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        PrototypeShape clonedShape3 = (PrototypeShape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());

        // Ex2
        ColorStore.getColor("blue").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("blue").addColor();

        /*
        //Factory Design Pattern

        Computer pc = ComputerFactory.getComputer(ComputerType.PC,"2 GB","500 GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer(ComputerType.SERVER,"16 GB","1 TB","2.9 GHz");
        textView.setText( "Factory Method PC Config::" + pc.toString());
        textView.setText(textView.getText() + "Factory Method Server Config::" + server.toString());

        PC pc2 =(PC) AbstractComputerFactory.getFactory(ComputerType.PC,"2 GB","500 GB","2.4 GHz");
        Server server2 = (Server) AbstractComputerFactory.getFactory(ComputerType.SERVER,"16 GB","1 TB","2.9 GHz");
        textView.setText(textView.getText() + "Abstract Factory PC Config::" + pc2);
        textView.setText(textView.getText() + "Abstract Factory Server Config::" + server2);
        */
        // custom  listener
        interfaceListener = this;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interfaceListener != null)
                    interfaceListener.onClickedBtn("you clicked Button");
            }
        });

    }



    @Override
    public void onClickedBtn(String text) {
        textView.setText(text);
    }

}
