package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes6.dex */
public final class loe implements dfo {

    /* JADX INFO: renamed from: X */
    public final wxh0 f135404X;

    /* JADX INFO: renamed from: Y */
    public final cph f135405Y;

    /* JADX INFO: renamed from: Z */
    public final i5x f135406Z;

    /* JADX INFO: renamed from: a */
    public final pgo f135407a;

    /* JADX INFO: renamed from: b */
    public final sqa1 f135408b;

    /* JADX INFO: renamed from: c */
    public final v0y f135409c;

    /* JADX INFO: renamed from: d */
    public final boolean f135410d;

    /* JADX INFO: renamed from: e */
    public final l971 f135411e = new l971((String) null, 3);

    /* JADX INFO: renamed from: f */
    public final l971 f135412f = new l971((String) null, 3);

    /* JADX INFO: renamed from: g */
    public final c9k f135413g;

    /* JADX INFO: renamed from: h */
    public boolean f135414h;

    /* JADX INFO: renamed from: i */
    public final tjo f135415i;

    /* JADX INFO: renamed from: t */
    public final hk1 f135416t;

    public loe(pgo pgoVar, sqa1 sqa1Var, v0y v0yVar, boolean z) {
        this.f135407a = pgoVar;
        this.f135408b = sqa1Var;
        this.f135409c = v0yVar;
        this.f135410d = z;
        x461 x461VarM64613f = njg1.m64613f();
        n5q n5qVar = xsr.f265651a;
        this.f135413g = kk40.m56661c(opo.m67570t(x461VarM64613f, pvb0.f181680a.f197428f));
        jqv0 jqv0Var = qpv0.f191387a;
        this.f135415i = pag1.m69486v(new rko(new jqx(jqv0Var.mo54112b(v140.class)), 2, x2e.f257439Y, new pko(x2e.f257454t), x2e.f257441Z), new rko(new jqx(jqv0Var.mo54112b(erc1.class)), 2, x2e.f257425L0, new pko(x2e.f257437X), x2e.f257426M0), b7e.f24242Y);
        this.f135416t = new hk1(this, 6);
        this.f135404X = uuf1.m83998r(x2e.f257453i, null, null, new sgd(this, 5), 6);
        fyf fyfVar = new fyf(new bhd(this, 10), true, 87246558);
        wpi0 wpi0Var = xwt.f266743a;
        this.f135405Y = new cph(fyfVar, 3);
        this.f135406Z = mhf1.m61771p(this).m94133b(nlc.f155053V0, nlc.f155054W0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: f */
    public static final Object m59560f(loe loeVar, String str, Set set, ibk ibkVar) {
        joe joeVar;
        loeVar.getClass();
        if (ibkVar instanceof joe) {
            joeVar = (joe) ibkVar;
            int i = joeVar.f114410c;
            if ((i & Integer.MIN_VALUE) != 0) {
                joeVar.f114410c = i - Integer.MIN_VALUE;
            } else {
                joeVar = new joe(loeVar, ibkVar);
            }
        } else {
            joeVar = new joe(loeVar, ibkVar);
        }
        Object obj = joeVar.f114408a;
        int i2 = joeVar.f114410c;
        w2a1 w2a1Var = w2a1.f247311a;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
                return w2a1Var;
            }
            bga.m29073P(obj);
            String string = wl51.m88491o1(loeVar.f135412f.m58500d().f226935c.toString()).toString();
            if (string.length() != 0 && !set.isEmpty()) {
                aik aikVar = new aik(string);
                ArrayList arrayList = new ArrayList();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ene eneVar = (ene) it.next();
                    List list = eneVar.f61148b;
                    ArrayList arrayList2 = new ArrayList(i6f.m49804T(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new s5l(new bjk(eneVar.f61147a, str, (String) it2.next()), aikVar));
                    }
                    j6f.m52564V(arrayList2, arrayList);
                }
                if (!arrayList.isEmpty()) {
                    pgo pgoVar = loeVar.f135407a;
                    bek bekVar = new bek(((s5l) g6f.m43741q0(arrayList)).f205854a, new aek(Collections.singletonList(fjk.f70301a), Collections.singletonList(yik.f273132a), null, 4));
                    efk efkVar = new efk(arrayList);
                    joeVar.f114410c = 1;
                    Object objMo25865a = pgoVar.mo25865a(bekVar, efkVar, joeVar);
                    yuk yukVar = yuk.f276404a;
                    if (objMo25865a == yukVar) {
                        return yukVar;
                    }
                }
            }
            return w2a1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: g */
    public static final Object m59561g(loe loeVar, String str, ibk ibkVar) {
        koe koeVar;
        loeVar.getClass();
        if (ibkVar instanceof koe) {
            koeVar = (koe) ibkVar;
            int i = koeVar.f124770c;
            if ((i & Integer.MIN_VALUE) != 0) {
                koeVar.f124770c = i - Integer.MIN_VALUE;
            } else {
                koeVar = new koe(loeVar, ibkVar);
            }
        } else {
            koeVar = new koe(loeVar, ibkVar);
        }
        Object obj = koeVar.f124768a;
        int i2 = koeVar.f124770c;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            ((s6x0) obj).getClass();
            return w2a1Var;
        }
        bga.m29073P(obj);
        String string = wl51.m88491o1(loeVar.f135411e.m58500d().f226935c.toString()).toString();
        if (string.length() > 0) {
            sqa1 sqa1Var = loeVar.f135408b;
            u8t u8tVar = new u8t(str, string);
            koeVar.f124770c = 1;
            Object objM78942a = sqa1Var.m78942a(u8tVar, koeVar);
            yuk yukVar = yuk.f276404a;
            if (objM78942a == yukVar) {
                return yukVar;
            }
        }
        return w2a1Var;
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f135406Z;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f135405Y;
    }

    @Override // p204p.izd1
    /* JADX INFO: renamed from: e */
    public final pgo mo24649e() {
        return this.f135407a;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f135404X;
    }

    @Override // p204p.izd1
    public final mko getData() {
        return this.f135416t;
    }
}
