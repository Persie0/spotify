package p204p;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import io.reactivex.rxjava3.core.ObservableEmitter;

/* JADX INFO: loaded from: classes.dex */
public final class z2a {

    /* JADX INFO: renamed from: a */
    public final BluetoothAdapter f278521a;

    /* JADX INFO: renamed from: b */
    public final Context f278522b;

    /* JADX INFO: renamed from: c */
    public final qp0 f278523c;

    /* JADX INFO: renamed from: d */
    public final a0a f278524d;

    /* JADX INFO: renamed from: e */
    public final a0a f278525e;

    /* JADX INFO: renamed from: f */
    public final wg61 f278526f = new wg61(new bj9(this, 12));

    /* JADX INFO: renamed from: g */
    public x2a f278527g;

    public z2a(BluetoothAdapter bluetoothAdapter, Context context, qp0 qp0Var, a0a a0aVar, a0a a0aVar2) {
        this.f278521a = bluetoothAdapter;
        this.f278522b = context;
        this.f278523c = qp0Var;
        this.f278524d = a0aVar;
        this.f278525e = a0aVar2;
    }

    /* JADX INFO: renamed from: a */
    public static final void m95179a(z2a z2aVar, ObservableEmitter observableEmitter, ScanResult scanResult) {
        int iM67005b;
        oi9 oi9VarM86353m = vsg1.m86353m(scanResult, z2aVar.f278524d.isEnabled());
        int rssi = scanResult.getRssi();
        BluetoothDevice device = scanResult.getDevice();
        String strM70092q = null;
        Integer numValueOf = oi9VarM86353m != null ? Integer.valueOf(oi9VarM86353m.m67004a()) : null;
        if (oi9VarM86353m != null && (iM67005b = oi9VarM86353m.m67005b()) != 0) {
            strM70092q = pi9.m70092q(iM67005b);
        }
        observableEmitter.onNext(new v2a(new jby0(rssi, device, numValueOf, strM70092q)));
    }
}
