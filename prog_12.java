// Hybrid Inheritance 
interface Logger {
    void log(String message);
 }
 class ConsoleLogger implements Logger {
    public void log(String message) {
        System.out.println("Console: " + message);
    }
 }
 class BaseService {
    protected Logger logger;
    public BaseService(Logger logger) {
        this.logger = logger;
    }
    public void process() {
        logger.log("BaseService processing");
    }
 }
 class AdvancedService extends BaseService {
    public AdvancedService(Logger logger) {
        super(logger);
    }
    public void advancedProcess() {
        logger.log("Advanced processing");
    }
 }
 public class HybridDemo {
    public static void main(String[] args) {
        Logger console = new ConsoleLogger();
        AdvancedService svc = new AdvancedService(console);
        svc.process();
        svc.advancedProcess();
    }
 }