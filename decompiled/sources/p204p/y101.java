package p204p;

import android.content.Context;
import androidx.glance.session.SessionWorker;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class y101 implements t101 {

    /* JADX INFO: renamed from: a */
    public final lsi0 f268121a = msi0.m62770a();

    /* JADX INFO: renamed from: b */
    public final x101 f268122b = new x101(this);

    /* JADX INFO: renamed from: a */
    public static final void m92608a(y101 y101Var, Context context) {
        l0e1.m57799S(context).m55007t("sessionWorkerKeepEnabled", 2, (lnl0) ((knl0) ((knl0) new knl0(SessionWorker.class).m31261h(3650L, TimeUnit.DAYS)).m31259f(new a8j(new thj0(null), 1, true, false, false, false, -1L, -1L, g6f.m43736n1(new LinkedHashSet())))).m31255b());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final Object m92609b(th00 th00Var, ibk ibkVar) {
        u101 u101Var;
        lsi0 lsi0Var;
        y101 y101Var;
        th00 th00Var2;
        Throwable th;
        jsi0 jsi0Var;
        if (ibkVar instanceof u101) {
            u101Var = (u101) ibkVar;
            int i = u101Var.f225642f;
            if ((i & Integer.MIN_VALUE) != 0) {
                u101Var.f225642f = i - Integer.MIN_VALUE;
            } else {
                u101Var = new u101(this, ibkVar);
            }
        } else {
            u101Var = new u101(this, ibkVar);
        }
        Object obj = u101Var.f225640d;
        int i2 = u101Var.f225642f;
        Object obj2 = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                u101Var.f225637a = this;
                u101Var.f225638b = (mb61) th00Var;
                lsi0Var = this.f268121a;
                u101Var.f225639c = lsi0Var;
                u101Var.f225642f = 1;
                if (lsi0Var.mo54248a(u101Var) != obj2) {
                    y101Var = this;
                    th00Var2 = th00Var;
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jsi0Var = (jsi0) u101Var.f225637a;
                try {
                    bga.m29073P(obj);
                    jsi0Var.mo54249c(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    jsi0Var.mo54249c(null);
                    throw th;
                }
            }
            lsi0 lsi0Var2 = u101Var.f225639c;
            th00 th00Var3 = (th00) u101Var.f225638b;
            y101Var = (y101) u101Var.f225637a;
            bga.m29073P(obj);
            lsi0Var = lsi0Var2;
            th00Var2 = th00Var3;
            Object obj3 = y101Var.f268122b;
            u101Var.f225637a = lsi0Var;
            u101Var.f225638b = null;
            u101Var.f225639c = null;
            u101Var.f225642f = 2;
            Object objInvoke = th00Var2.invoke(obj3, u101Var);
            if (objInvoke != obj2) {
                lsi0 lsi0Var3 = lsi0Var;
                obj = objInvoke;
                jsi0Var = lsi0Var3;
                jsi0Var.mo54249c(null);
                return obj;
            }
            return obj2;
        } catch (Throwable th3) {
            lsi0 lsi0Var4 = lsi0Var;
            th = th3;
            jsi0Var = lsi0Var4;
            jsi0Var.mo54249c(null);
            throw th;
        }
    }
}
