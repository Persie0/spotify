package p204p;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Build;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class pt61 {

    /* JADX INFO: renamed from: a */
    public final Context f181057a;

    /* JADX INFO: renamed from: c */
    public BluetoothGatt f181059c;

    /* JADX INFO: renamed from: d */
    public String f181060d;

    /* JADX INFO: renamed from: e */
    public String f181061e;

    /* JADX INFO: renamed from: f */
    public String f181062f;

    /* JADX INFO: renamed from: b */
    public final bqa f181058b = xtm0.m92080a(16, 0, 6);

    /* JADX INFO: renamed from: g */
    public final ot61 f181063g = new ot61(this);

    public pt61(Context context) {
        this.f181057a = context;
    }

    /* JADX INFO: renamed from: a */
    public static final void m70910a(pt61 pt61Var, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(mt61.f146964f);
        if (descriptor == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            bluetoothGatt.writeDescriptor(descriptor, BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        } else {
            descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            bluetoothGatt.writeDescriptor(descriptor);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m70911b(pt61 pt61Var, BluetoothGatt bluetoothGatt, UUID uuid, byte[] bArr, int i) {
        if (i != 0) {
            return;
        }
        if (uuid.equals(mt61.f146961c)) {
            pt61Var.f181060d = new String(bArr, vuc.f244913a);
            m70913e(bluetoothGatt, mt61.f146962d);
        } else if (uuid.equals(mt61.f146962d)) {
            pt61Var.f181061e = new String(bArr, vuc.f244913a);
            m70913e(bluetoothGatt, mt61.f146963e);
        } else if (uuid.equals(mt61.f146963e)) {
            pt61Var.f181062f = new String(bArr, vuc.f244913a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m70912c(pt61 pt61Var, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        if (bArr.length != 0 && bArr[0] == 1) {
            String str = pt61Var.f181060d;
            if (str == null) {
                str = "unknown";
            }
            String str2 = pt61Var.f181062f;
            if (str2 == null) {
                str2 = "unknown";
            }
            String str3 = pt61Var.f181061e;
            pt61Var.f181058b.mo30231j(new nt61(str, str2, str3 != null ? str3 : "unknown"));
            byte[] bArr2 = {0};
            if (Build.VERSION.SDK_INT >= 33) {
                bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic, bArr2, 2);
            } else {
                bluetoothGattCharacteristic.setValue(bArr2);
                bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m70913e(BluetoothGatt bluetoothGatt, UUID uuid) {
        BluetoothGattCharacteristic characteristic;
        BluetoothGattService service = bluetoothGatt.getService(mt61.f146959a);
        if (service == null || (characteristic = service.getCharacteristic(uuid)) == null) {
            return;
        }
        bluetoothGatt.readCharacteristic(characteristic);
    }

    /* JADX INFO: renamed from: d */
    public final void m70914d() {
        BluetoothGatt bluetoothGatt = this.f181059c;
        if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
        }
        BluetoothGatt bluetoothGatt2 = this.f181059c;
        if (bluetoothGatt2 != null) {
            bluetoothGatt2.close();
        }
        this.f181059c = null;
        this.f181060d = null;
        this.f181061e = null;
        this.f181062f = null;
    }
}
