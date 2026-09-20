package p204p;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ot61 extends BluetoothGattCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pt61 f168988a;

    public ot61(pt61 pt61Var) {
        this.f168988a = pt61Var;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        pt61.m70912c(this.f168988a, bluetoothGatt, bluetoothGattCharacteristic, bArr);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i) {
        pt61.m70911b(this.f168988a, bluetoothGatt, bluetoothGattCharacteristic.getUuid(), bArr, i);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        if (i == 0 && i2 == 2) {
            bluetoothGatt.discoverServices();
        } else if (i2 == 0) {
            this.f168988a.f181058b.mo30210A(null);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
        if (i2 == 0) {
            pt61.m70913e(bluetoothGatt, mt61.f146961c);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        BluetoothGattCharacteristic characteristic;
        if (i != 0) {
            return;
        }
        List<BluetoothGattService> services = bluetoothGatt.getServices();
        services.size();
        ArrayList arrayList = new ArrayList(i6f.m49804T(services, 10));
        Iterator<T> it = services.iterator();
        while (it.hasNext()) {
            arrayList.add(((BluetoothGattService) it.next()).getUuid());
        }
        BluetoothGattService service = bluetoothGatt.getService(mt61.f146959a);
        if (service == null || (characteristic = service.getCharacteristic(mt61.f146960b)) == null) {
            return;
        }
        bluetoothGatt.setCharacteristicNotification(characteristic, true);
        bluetoothGatt.requestMtu(517);
        pt61.m70910a(this.f168988a, bluetoothGatt, characteristic);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        pt61.m70912c(this.f168988a, bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue());
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        pt61.m70911b(this.f168988a, bluetoothGatt, bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue(), i);
    }
}
