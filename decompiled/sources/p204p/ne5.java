package p204p;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final class ne5 {

    /* JADX INFO: renamed from: a */
    public final Context f152924a;

    /* JADX INFO: renamed from: b */
    public final BroadcastReceiver f152925b;

    /* JADX INFO: renamed from: c */
    public final le10 f152926c;

    public ne5(Context context, BroadcastReceiver broadcastReceiver, le10 le10Var) {
        this.f152924a = context;
        this.f152925b = broadcastReceiver;
        this.f152926c = le10Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (r9.invoke((int[]) r10, r0) == r5) goto L27;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m64236a(lyp0 lyp0Var, ibk ibkVar) throws Throwable {
        me5 me5Var;
        if (ibkVar instanceof me5) {
            me5Var = (me5) ibkVar;
            int i = me5Var.f142616d;
            if ((i & Integer.MIN_VALUE) != 0) {
                me5Var.f142616d = i - Integer.MIN_VALUE;
            } else {
                me5Var = new me5(this, ibkVar);
            }
        } else {
            me5Var = new me5(this, ibkVar);
        }
        Object objM89557A = me5Var.f142614b;
        int i2 = me5Var.f142616d;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    lyp0Var = me5Var.f142613a;
                    bga.m29073P(objM89557A);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM89557A);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(objM89557A);
            ComponentName componentName = new ComponentName(this.f152924a, this.f152925b.getClass());
            n5q n5qVar = xsr.f265651a;
            tlp tlpVar = tlp.f221498c;
            C2241p2 c2241p2 = new C2241p2(this, componentName, fbkVar, 29);
            me5Var.f142613a = lyp0Var;
            me5Var.f142616d = 1;
            objM89557A = x0h1.m89557A(tlpVar, c2241p2, me5Var);
            if (objM89557A == yukVar) {
            }
            return yukVar;
            me5Var.f142613a = null;
            me5Var.f142616d = 2;
        } catch (RemoteException e) {
            Logger.m3967c(e, "Failed to update recommendations widget", new Object[0]);
        }
    }
}
