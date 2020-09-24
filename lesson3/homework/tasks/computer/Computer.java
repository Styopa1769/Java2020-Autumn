public interface Computer {
    String turnOn(int currentVoltage);
    String turnOff();
    String connect(ConnectionStatus status);
}
