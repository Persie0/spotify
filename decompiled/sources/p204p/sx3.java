package p204p;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class sx3 {

    /* JADX INFO: renamed from: a */
    public final BluetoothAdapter f214795a;

    /* JADX INFO: renamed from: b */
    public final cej0 f214796b;

    /* JADX INFO: renamed from: c */
    public final luk f214797c;

    /* JADX INFO: renamed from: d */
    public final Context f214798d;

    public sx3(Context context, BluetoothAdapter bluetoothAdapter, cej0 cej0Var, luk lukVar) {
        this.f214795a = bluetoothAdapter;
        this.f214796b = cej0Var;
        this.f214797c = lukVar;
        this.f214798d = context.getApplicationContext();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m79572a(ibk ibkVar) throws Throwable {
        rx3 rx3Var;
        if (ibkVar instanceof rx3) {
            rx3Var = (rx3) ibkVar;
            int i = rx3Var.f203479c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rx3Var.f203479c = i - Integer.MIN_VALUE;
            } else {
                rx3Var = new rx3(this, ibkVar);
            }
        } else {
            rx3Var = new rx3(this, ibkVar);
        }
        Object obj = rx3Var.f203477a;
        int i2 = rx3Var.f203479c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        C1819em c1819em = new C1819em(this, null, 27);
        rx3Var.f203479c = 1;
        Object objM89557A = x0h1.m89557A(this.f214797c, c1819em, rx3Var);
        yuk yukVar = yuk.f276404a;
        return objM89557A == yukVar ? yukVar : objM89557A;
    }
}
