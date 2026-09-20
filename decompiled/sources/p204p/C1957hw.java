package p204p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: renamed from: p.hw */
/* JADX INFO: loaded from: classes4.dex */
public final class C1957hw {

    /* JADX INFO: renamed from: a */
    public final qwx0 f95822a;

    /* JADX INFO: renamed from: b */
    public final boolean f95823b;

    /* JADX INFO: renamed from: c */
    public final boolean f95824c;

    /* JADX INFO: renamed from: d */
    public final C2429tv f95825d;

    /* JADX INFO: renamed from: e */
    public final wg61 f95826e;

    public C1957hw(Observable observable, qwx0 qwx0Var, boolean z, boolean z2, C2429tv c2429tv) {
        this.f95822a = qwx0Var;
        this.f95823b = z;
        this.f95824c = z2;
        this.f95825d = c2429tv;
        this.f95826e = new wg61(new C2038k3(observable, 7));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m48902a(ibk ibkVar) {
        C1875fw c1875fw;
        if (ibkVar instanceof C1875fw) {
            c1875fw = (C1875fw) ibkVar;
            int i = c1875fw.f73912c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1875fw.f73912c = i - Integer.MIN_VALUE;
            } else {
                c1875fw = new C1875fw(this, ibkVar);
            }
        } else {
            c1875fw = new C1875fw(this, ibkVar);
        }
        Object objM86755t = c1875fw.f73910a;
        int i2 = c1875fw.f73912c;
        qwx0 qwx0Var = this.f95822a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            if (!this.f95823b) {
                return Boolean.FALSE;
            }
            C2373se c2373se = new C2373se(k0e1.m54985d(((rwx0) qwx0Var).m76590a("is-account-switching-add-account-page-enabled", "0")), 1);
            c1875fw.f73912c = 1;
            objM86755t = vyf1.m86755t(c2373se, c1875fw);
            if (objM86755t != yukVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
            return objM86755t;
        }
        bga.m29073P(objM86755t);
        if (((Boolean) objM86755t).booleanValue()) {
            return Boolean.TRUE;
        }
        if (!this.f95824c) {
            return Boolean.FALSE;
        }
        C2373se c2373se2 = new C2373se(k0e1.m54985d(((rwx0) qwx0Var).m76590a("is-account-switching-add-account-page-v2-enabled", "0")), 2);
        c1875fw.f73912c = 2;
        Object objM86755t2 = vyf1.m86755t(c2373se2, c1875fw);
        return objM86755t2 == yukVar ? yukVar : objM86755t2;
    }

    /* JADX INFO: renamed from: b */
    public final xv41 m48903b() {
        return (xv41) this.f95826e.getValue();
    }
}
