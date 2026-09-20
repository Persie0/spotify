package p204p;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;

/* JADX INFO: loaded from: classes5.dex */
public final class xe8 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f260655a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bf8 f260656b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xe8(bf8 bf8Var, int i) {
        super(1);
        this.f260655a = i;
        this.f260656b = bf8Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f260655a) {
            case 0:
                BluetoothGattService bluetoothGattServiceMo28911b = ((cg8) obj).mo28911b();
                this.f260656b.getClass();
                return bf8.m29000d(bluetoothGattServiceMo28911b, qe8.f187861a);
            case 1:
                BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) obj;
                this.f260656b.getClass();
                if ((bluetoothGattCharacteristic.getProperties() & 2) == 0) {
                    bluetoothGattCharacteristic = null;
                }
                return bf8.m29000d(bluetoothGattCharacteristic, pe8.f176650a);
            case 2:
                BluetoothGattService bluetoothGattServiceMo28911b2 = ((cg8) obj).mo28911b();
                this.f260656b.getClass();
                return bf8.m29000d(bluetoothGattServiceMo28911b2, qe8.f187861a);
            default:
                BluetoothGattCharacteristic bluetoothGattCharacteristic2 = (BluetoothGattCharacteristic) obj;
                this.f260656b.getClass();
                if ((bluetoothGattCharacteristic2.getProperties() & 8) == 0) {
                    bluetoothGattCharacteristic2 = null;
                }
                return bf8.m29000d(bluetoothGattCharacteristic2, pe8.f176650a);
        }
    }
}
