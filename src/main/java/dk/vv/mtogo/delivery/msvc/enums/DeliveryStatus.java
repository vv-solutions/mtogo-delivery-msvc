package dk.vv.mtogo.delivery.msvc.enums;

public enum DeliveryStatus {
    ERROR(0),
    RECEIVED(1),
    IN_PROGRESS(2),
    DELIVERED(3);

    private int _value;

    DeliveryStatus(int Value) {
        this._value = Value;
    }

    public int value() {
        return _value;
    }

    public static DeliveryStatus fromInt(int i) {
        for (DeliveryStatus b : DeliveryStatus.values()) {
            if (b.value() == i) { return b; }
        }
        return null;
    }

}
