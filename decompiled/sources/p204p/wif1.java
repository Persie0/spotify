package p204p;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class wif1 extends ywh0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dz8 f251625b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wif1(dz8 dz8Var, Looper looper) {
        super(looper, 6);
        this.f251625b = dz8Var;
    }

    @Override // p204p.ywh0, android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        a6f1 a6f1Var;
        dz8 dz8Var = this.f251625b;
        if (dz8Var.f54579x.get() != message.arg1) {
            int i = message.what;
            if ((i == 2 || i == 1 || i == 7) && (a6f1Var = (a6f1) message.obj) != null) {
                synchronized (a6f1Var) {
                    a6f1Var.f12789a = null;
                }
                dz8 dz8Var2 = a6f1Var.f12791c;
                synchronized (dz8Var2.m37421P()) {
                    dz8Var2.m37421P().remove(a6f1Var);
                }
                return;
            }
            return;
        }
        int i2 = message.what;
        if ((i2 == 1 || i2 == 7 || i2 == 4 || i2 == 5) && !dz8Var.m37443y()) {
            a6f1 a6f1Var2 = (a6f1) message.obj;
            if (a6f1Var2 != null) {
                synchronized (a6f1Var2) {
                    a6f1Var2.f12789a = null;
                }
                dz8 dz8Var3 = a6f1Var2.f12791c;
                synchronized (dz8Var3.m37421P()) {
                    dz8Var3.m37421P().remove(a6f1Var2);
                }
                return;
            }
            return;
        }
        int i3 = message.what;
        if (i3 == 4) {
            dz8Var.m37425T(new lzi(message.arg2, null, null));
            if (dz8Var.m37418M() && !dz8Var.m37426U()) {
                dz8Var.m37415J(3);
                return;
            }
            lzi lziVarM37424S = dz8Var.m37424S() != null ? dz8Var.m37424S() : new lzi(8, null, null);
            dz8Var.f54565j.mo34415e(lziVarM37424S);
            dz8Var.mo37444z(lziVarM37424S);
            return;
        }
        if (i3 == 5) {
            lzi lziVarM37424S2 = dz8Var.m37424S() != null ? dz8Var.m37424S() : new lzi(8, null, null);
            dz8Var.f54565j.mo34415e(lziVarM37424S2);
            dz8Var.mo37444z(lziVarM37424S2);
            return;
        }
        if (i3 == 3) {
            Object obj = message.obj;
            lzi lziVar = new lzi(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null);
            dz8Var.f54565j.mo34415e(lziVar);
            dz8Var.mo37444z(lziVar);
            return;
        }
        if (i3 == 6) {
            dz8Var.m37415J(5);
            if (dz8Var.m37422Q() != null) {
                ((wj10) dz8Var.m37422Q().f33927b).mo28092v1(message.arg2);
            }
            dz8Var.mo37407A();
            dz8Var.m37416K(5, 1, null);
            return;
        }
        if (i3 == 2 && !dz8Var.m37442x()) {
            a6f1 a6f1Var3 = (a6f1) message.obj;
            if (a6f1Var3 != null) {
                synchronized (a6f1Var3) {
                    a6f1Var3.f12789a = null;
                }
                dz8 dz8Var4 = a6f1Var3.f12791c;
                synchronized (dz8Var4.m37421P()) {
                    dz8Var4.m37421P().remove(a6f1Var3);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 != 2 && i4 != 1 && i4 != 7) {
            new StringBuilder(String.valueOf(i4).length() + 34);
            new Exception();
            return;
        }
        a6f1 a6f1Var4 = (a6f1) message.obj;
        synchronized (a6f1Var4) {
            try {
                bool = a6f1Var4.f12789a;
                if (a6f1Var4.f12790b) {
                    new StringBuilder(a6f1Var4.toString().length() + 47);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            dz8 dz8Var5 = a6f1Var4.f12794f;
            int i5 = a6f1Var4.f12792d;
            if (i5 != 0) {
                dz8Var5.m37415J(1);
                Bundle bundle = a6f1Var4.f12793e;
                a6f1Var4.mo24866b(new lzi(i5, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!a6f1Var4.mo24865a()) {
                dz8Var5.m37415J(1);
                a6f1Var4.mo24866b(new lzi(8, null, null));
            }
        }
        synchronized (a6f1Var4) {
            a6f1Var4.f12790b = true;
        }
        synchronized (a6f1Var4) {
            a6f1Var4.f12789a = null;
        }
        dz8 dz8Var6 = a6f1Var4.f12791c;
        synchronized (dz8Var6.m37421P()) {
            dz8Var6.m37421P().remove(a6f1Var4);
        }
    }
}
