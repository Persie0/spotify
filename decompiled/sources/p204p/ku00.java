package p204p;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class ku00 {

    /* JADX INFO: renamed from: a */
    public final epx f126417a;

    /* JADX INFO: renamed from: b */
    public final gof f126418b;

    /* JADX INFO: renamed from: c */
    public final i4t0 f126419c;

    /* JADX INFO: renamed from: d */
    public final fiz f126420d;

    /* JADX INFO: renamed from: e */
    public final c9k f126421e;

    /* JADX INFO: renamed from: f */
    public Object f126422f;

    /* JADX INFO: renamed from: g */
    public final zv41 f126423g;

    /* JADX INFO: renamed from: h */
    public final zv41 f126424h;

    public ku00(epx epxVar, gof gofVar, vfn vfnVar, luk lukVar, fiz fizVar) {
        this.f126417a = epxVar;
        this.f126418b = gofVar;
        this.f126419c = vfnVar;
        this.f126420d = fizVar;
        this.f126421e = dq60.m36621u(lukVar);
        nau nauVar = nau.f152117a;
        this.f126422f = nauVar;
        this.f126423g = jag1.m52819d(nauVar);
        this.f126424h = jag1.m52819d(nauVar);
    }

    /* JADX INFO: renamed from: a */
    public static final void m57366a(ku00 ku00Var, st00 st00Var, vt00 vt00Var) {
        Object value;
        LinkedHashMap linkedHashMapM56709v0;
        zv41 zv41Var = ku00Var.f126424h;
        do {
            value = zv41Var.getValue();
            linkedHashMapM56709v0 = kkc0.m56709v0((Map) value);
            linkedHashMapM56709v0.put(st00Var, vt00Var);
        } while (!zv41Var.m97089k(value, linkedHashMapM56709v0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public final xr00 m57367b(String str, Map map, Map map2) {
        st00 st00Var = (st00) this.f126422f.get(str);
        if (st00Var != null) {
            if (wj50.m88271j(map2.get(st00Var), ut00.f233736a)) {
                return vr00.f244041a;
            }
            du00 du00Var = (du00) map.get(st00Var);
            if (wj50.m88271j(du00Var, bu00.f30978a)) {
                return ur00.f233167a;
            }
            if (du00Var instanceof yt00) {
                return new rr00(((yt00) du00Var).m94580b());
            }
            if (du00Var instanceof wt00) {
                return new pr00(((wt00) du00Var).m88902a());
            }
            if (du00Var instanceof cu00) {
                return new wr00(((cu00) du00Var).m33854a());
            }
            if (du00Var instanceof zt00) {
                zt00 zt00Var = (zt00) du00Var;
                return new sr00(zt00Var.m96899b(), zt00Var.m96898a());
            }
            if (du00Var instanceof xt00) {
                xt00 xt00Var = (xt00) du00Var;
                return new qr00(xt00Var.m91998a(), xt00Var.m91999b(), xt00Var.m92000c());
            }
            if (!wj50.m88271j(du00Var, au00.f19780a) && du00Var != null) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return tr00.f222936a;
    }

    /* JADX INFO: renamed from: c */
    public final void m57368c() {
        x0h1.m89578u(this.f126421e, null, 0, new joz(this, (fbk) null, 11), 3);
    }

    /* JADX INFO: renamed from: d */
    public final nuu0 m57369d(String str) {
        pz2 pz2Var = new pz2(this, str, (fbk) null, 5);
        zv41 zv41Var = this.f126423g;
        zv41 zv41Var2 = this.f126424h;
        return bzf1.m31029u(g0g1.m43299d(zv41Var, zv41Var2, pz2Var), this.f126421e, hf11.m47320a(3, 0L), m57367b(str, (Map) zv41Var.getValue(), (Map) zv41Var2.getValue()));
    }

    /* JADX INFO: renamed from: e */
    public final void m57370e() {
        kk40.m56680v(this.f126421e, null);
        zv41 zv41Var = this.f126423g;
        zv41Var.getClass();
        nau nauVar = nau.f152117a;
        zv41Var.m97091m(null, nauVar);
        zv41 zv41Var2 = this.f126424h;
        zv41Var2.getClass();
        zv41Var2.m97091m(null, nauVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: f */
    public final Object m57371f(String str, ibk ibkVar) {
        ju00 ju00Var;
        if (ibkVar instanceof ju00) {
            ju00Var = (ju00) ibkVar;
            int i = ju00Var.f116005c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ju00Var.f116005c = i - Integer.MIN_VALUE;
            } else {
                ju00Var = new ju00(this, ibkVar);
            }
        } else {
            ju00Var = new ju00(this, ibkVar);
        }
        Object objM89557A = ju00Var.f116003a;
        int i2 = ju00Var.f116005c;
        if (i2 == 0) {
            bga.m29073P(objM89557A);
            st00 st00Var = (st00) kkc0.m56692e0(str, this.f126422f);
            du00 du00Var = (du00) ((Map) this.f126423g.getValue()).get(st00Var);
            if (du00Var instanceof yt00) {
                as00 as00VarM94579a = ((yt00) du00Var).m94579a();
                if (as00VarM94579a != null) {
                    return as00VarM94579a;
                }
            } else if (du00Var instanceof zt00) {
                ju00Var.f116005c = 1;
                objM89557A = x0h1.m89557A(this.f126421e.f35578a, new dmx(this, st00Var, (fbk) null, 20), ju00Var);
                yuk yukVar = yuk.f276404a;
                if (objM89557A == yukVar) {
                    return yukVar;
                }
            } else if (!(du00Var instanceof cu00) && !(du00Var instanceof wt00) && !(du00Var instanceof xt00) && !wj50.m88271j(du00Var, bu00.f30978a) && !wj50.m88271j(du00Var, au00.f19780a) && du00Var != null) {
                throw new NoWhenBranchMatchedException();
            }
            return cs00.f41430a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(objM89557A);
        return ((Boolean) objM89557A).booleanValue() ? ds00.f52456a : bs00.f30205a;
    }
}
