package p204p;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lvu0 {

    /* JADX INFO: renamed from: a */
    public final vb40 f137393a;

    /* JADX INFO: renamed from: b */
    public final List f137394b;

    /* JADX INFO: renamed from: c */
    public final int f137395c;

    /* JADX INFO: renamed from: d */
    public final vb40 f137396d;

    /* JADX INFO: renamed from: e */
    public final ci21 f137397e;

    /* JADX INFO: renamed from: f */
    public final v5x f137398f;

    /* JADX INFO: renamed from: g */
    public final boolean f137399g;

    public lvu0(vb40 vb40Var, List list, int i, vb40 vb40Var2, ci21 ci21Var, v5x v5xVar, boolean z) {
        this.f137393a = vb40Var;
        this.f137394b = list;
        this.f137395c = i;
        this.f137396d = vb40Var2;
        this.f137397e = ci21Var;
        this.f137398f = v5xVar;
        this.f137399g = z;
    }

    /* JADX INFO: renamed from: b */
    public static lvu0 m60081b(lvu0 lvu0Var, int i, vb40 vb40Var, int i2) {
        if ((i2 & 1) != 0) {
            i = lvu0Var.f137395c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            vb40Var = lvu0Var.f137396d;
        }
        ci21 ci21Var = lvu0Var.f137397e;
        return new lvu0(lvu0Var.f137393a, lvu0Var.f137394b, i3, vb40Var, ci21Var, lvu0Var.f137398f, lvu0Var.f137399g);
    }

    /* JADX INFO: renamed from: a */
    public final void m60082a(vb40 vb40Var, ic50 ic50Var) {
        Context context = vb40Var.f239399a;
        vb40 vb40Var2 = this.f137393a;
        if (context != vb40Var2.f239399a) {
            throw new IllegalStateException(("Interceptor '" + ic50Var + "' cannot modify the request's context.").toString());
        }
        if (vb40Var.f239400b == flk0.f70785a) {
            throw new IllegalStateException(("Interceptor '" + ic50Var + "' cannot set the request's data to null.").toString());
        }
        if (vb40Var.f239401c != vb40Var2.f239401c) {
            throw new IllegalStateException(("Interceptor '" + ic50Var + "' cannot modify the request's target.").toString());
        }
        if (vb40Var.f239414p == vb40Var2.f239414p) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + ic50Var + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m60083c(ibk ibkVar) {
        jvu0 jvu0Var;
        ic50 ic50Var;
        if (ibkVar instanceof jvu0) {
            jvu0Var = (jvu0) ibkVar;
            int i = jvu0Var.f116491d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jvu0Var.f116491d = i - Integer.MIN_VALUE;
            } else {
                jvu0Var = new jvu0(this, ibkVar);
            }
        } else {
            jvu0Var = new jvu0(this, ibkVar);
        }
        Object obj = jvu0Var.f116489b;
        int i2 = jvu0Var.f116491d;
        if (i2 == 0) {
            bga.m29073P(obj);
            List list = this.f137394b;
            int i3 = this.f137395c;
            ic50 ic50Var2 = (ic50) list.get(i3);
            lvu0 lvu0VarM60081b = m60081b(this, i3 + 1, null, 6);
            jvu0Var.f116488a = ic50Var2;
            jvu0Var.f116491d = 1;
            Object objMo44137a = ic50Var2.mo44137a(lvu0VarM60081b, jvu0Var);
            Object obj2 = yuk.f276404a;
            if (objMo44137a == obj2) {
                return obj2;
            }
            ic50Var = ic50Var2;
            obj = objMo44137a;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ic50Var = jvu0Var.f116488a;
            bga.m29073P(obj);
        }
        ec40 ec40Var = (ec40) obj;
        m60082a(ec40Var.getRequest(), ic50Var);
        return ec40Var;
    }
}
