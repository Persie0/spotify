package p204p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class e640 extends d6a0 {

    /* JADX INFO: renamed from: d */
    public final zsf f56552d;

    /* JADX INFO: renamed from: e */
    public final epx f56553e;

    /* JADX INFO: renamed from: f */
    public final l640 f56554f;

    /* JADX INFO: renamed from: g */
    public final c9k f56555g;

    /* JADX INFO: renamed from: h */
    public Object f56556h = lau.f131415a;

    /* JADX INFO: renamed from: i */
    public String f56557i = "";

    public e640(zsf zsfVar, epx epxVar, l640 l640Var, luk lukVar) {
        this.f56552d = zsfVar;
        this.f56553e = epxVar;
        this.f56554f = l640Var;
        this.f56555g = p3n0.m69075f(lukVar);
    }

    /* JADX INFO: renamed from: k */
    public static final Object m37888k(e640 e640Var, String str, es1 es1Var) {
        Set set = dd41.f47702f;
        gn80 gn80Var = r46.m74726U(str).f47709c;
        int iOrdinal = gn80Var.ordinal();
        if (iOrdinal == 845) {
            return e640Var.m37890m(str, es1Var);
        }
        if (iOrdinal == 861) {
            return e640Var.m37891n(str, es1Var);
        }
        e640Var.m35105h(new Throwable("Invalid uri type: " + gn80Var));
        return "";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection] */
    @Override // p204p.d6a0
    /* JADX INFO: renamed from: e */
    public final void mo25474e() {
        if (!this.f56556h.isEmpty()) {
            m35106i();
            return;
        }
        m35107j();
        x0h1.m89578u(this.f56555g, null, 0, new es1(this, null), 3);
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: f */
    public final void mo25475f() {
        kk40.m56680v(this.f56555g, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: l */
    public final List m37889l() {
        return this.f56556h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m37890m(String str, ibk ibkVar) {
        c640 c640Var;
        if (ibkVar instanceof c640) {
            c640Var = (c640) ibkVar;
            int i = c640Var.f34380c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c640Var.f34380c = i - Integer.MIN_VALUE;
            } else {
                c640Var = new c640(this, ibkVar);
            }
        } else {
            c640Var = new c640(this, ibkVar);
        }
        Object objM77561k = c640Var.f34378a;
        int i2 = c640Var.f34380c;
        if (i2 == 0) {
            bga.m29073P(objM77561k);
            c640Var.f34380c = 1;
            objM77561k = s95.m77561k(this.f56553e, str, xaw.class, c640Var);
            yuk yukVar = yuk.f276404a;
            if (objM77561k == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM77561k);
        }
        xaw xawVar = (xaw) objM77561k;
        if (xawVar != null) {
            return xawVar.f259776c;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m37891n(String str, ibk ibkVar) {
        d640 d640Var;
        if (ibkVar instanceof d640) {
            d640Var = (d640) ibkVar;
            int i = d640Var.f45573c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d640Var.f45573c = i - Integer.MIN_VALUE;
            } else {
                d640Var = new d640(this, ibkVar);
            }
        } else {
            d640Var = new d640(this, ibkVar);
        }
        Object objM77561k = d640Var.f45571a;
        int i2 = d640Var.f45573c;
        if (i2 == 0) {
            bga.m29073P(objM77561k);
            d640Var.f45573c = 1;
            objM77561k = s95.m77561k(this.f56553e, str, fs11.class, d640Var);
            yuk yukVar = yuk.f276404a;
            if (objM77561k == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM77561k);
        }
        fs11 fs11Var = (fs11) objM77561k;
        if (fs11Var != null) {
            return fs11Var.f72738b;
        }
        return null;
    }
}
