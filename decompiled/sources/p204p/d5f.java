package p204p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes8.dex */
public final class d5f implements dfo {

    /* JADX INFO: renamed from: L0 */
    public final Object f45409L0;

    /* JADX INFO: renamed from: M0 */
    public final Object f45410M0;

    /* JADX INFO: renamed from: N0 */
    public final Object f45411N0;

    /* JADX INFO: renamed from: X */
    public final Object f45412X;

    /* JADX INFO: renamed from: Y */
    public final Object f45413Y;

    /* JADX INFO: renamed from: Z */
    public final Object f45414Z;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45415a;

    /* JADX INFO: renamed from: b */
    public final pgo f45416b;

    /* JADX INFO: renamed from: c */
    public final cph f45417c;

    /* JADX INFO: renamed from: d */
    public final Object f45418d;

    /* JADX INFO: renamed from: e */
    public final Object f45419e;

    /* JADX INFO: renamed from: f */
    public final Object f45420f;

    /* JADX INFO: renamed from: g */
    public final Object f45421g;

    /* JADX INFO: renamed from: h */
    public final Object f45422h;

    /* JADX INFO: renamed from: i */
    public final Object f45423i;

    /* JADX INFO: renamed from: t */
    public final Object f45424t;

    public d5f(csn csnVar, dsn dsnVar, e3p e3pVar, fiz fizVar, jnb jnbVar, p0p0 p0p0Var, xfp0 xfp0Var, yz80 yz80Var, m47 m47Var, pgo pgoVar) {
        this.f45415a = 1;
        this.f45418d = csnVar;
        this.f45419e = dsnVar;
        this.f45420f = e3pVar;
        this.f45421g = fizVar;
        this.f45422h = jnbVar;
        this.f45423i = p0p0Var;
        this.f45424t = xfp0Var;
        this.f45412X = yz80Var;
        this.f45413Y = m47Var;
        this.f45416b = pgoVar;
        this.f45414Z = pag1.m69487w(new rko(gyx.f85770X, 2, zol.f284823U0, new pko(zol.f284821S0), zol.f284824V0), zol.f284822T0);
        this.f45409L0 = new evi(e3pVar.m37691z(), 17);
        this.f45410M0 = axf1.m27398m(new adk(this, 22), zol.f284820R0, new e9l(this, 8), null, null, 24);
        this.f45411N0 = new j2a1();
        fyf fyfVar = new fyf(new jql(this, 0), true, 2035921461);
        wpi0 wpi0Var = xwt.f266743a;
        this.f45417c = new cph(fyfVar, 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public static final Object m34984f(d5f d5fVar, List list, String str, ibk ibkVar) {
        fql fqlVar;
        List list2;
        List list3;
        Set setM43736n1;
        if (ibkVar instanceof fql) {
            fqlVar = (fql) ibkVar;
            int i = fqlVar.f72232e;
            if ((i & Integer.MIN_VALUE) != 0) {
                fqlVar.f72232e = i - Integer.MIN_VALUE;
            } else {
                fqlVar = new fql(d5fVar, ibkVar);
            }
        } else {
            fqlVar = new fql(d5fVar, ibkVar);
        }
        Object obj = fqlVar.f72230c;
        int i2 = fqlVar.f72232e;
        try {
            if (i2 == 0) {
                ArrayList arrayListM93485o = yds.m93485o(obj);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (wj50.m88271j(((qla1) obj2).f189803b, str)) {
                        arrayListM93485o.add(obj2);
                    } else {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    return list;
                }
                try {
                    e3p e3pVar = (e3p) d5fVar.f45420f;
                    ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((qla1) it.next()).f189803b);
                    }
                    fqlVar.f72228a = arrayListM93485o;
                    fqlVar.f72229b = arrayList;
                    fqlVar.f72232e = 1;
                    Serializable serializableM59330g = e3pVar.f55841b.m59330g(arrayList2, fqlVar);
                    yuk yukVar = yuk.f276404a;
                    if (serializableM59330g == yukVar) {
                        return yukVar;
                    }
                    list2 = arrayListM93485o;
                    obj = serializableM59330g;
                    list3 = arrayList;
                } catch (Throwable unused) {
                    list2 = arrayListM93485o;
                    list3 = arrayList;
                    setM43736n1 = gbu.f78413a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list3 = fqlVar.f72229b;
                list2 = fqlVar.f72228a;
                try {
                    bga.m29073P(obj);
                } catch (Throwable unused2) {
                    setM43736n1 = gbu.f78413a;
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : (Iterable) obj) {
                if (((lob) obj3).f135369b) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((lob) it2.next()).f135368a);
            }
            setM43736n1 = g6f.m43736n1(arrayList4);
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : list3) {
                if (setM43736n1.contains(((qla1) obj4).f189803b)) {
                    arrayList5.add(obj4);
                }
            }
            return g6f.m43700N0(arrayList5, list2);
        } catch (CancellationException e) {
            throw e;
        }
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        switch (this.f45415a) {
            case 0:
                return (i5x) this.f45410M0;
            default:
                return (j2a1) this.f45411N0;
        }
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        switch (this.f45415a) {
            case 0:
                break;
        }
        return this.f45417c;
    }

    @Override // p204p.izd1
    /* JADX INFO: renamed from: e */
    public final pgo mo24649e() {
        switch (this.f45415a) {
            case 0:
                break;
        }
        return this.f45416b;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        switch (this.f45415a) {
            case 0:
                return (t5c) this.f45409L0;
            default:
                return (xiz) this.f45410M0;
        }
    }

    @Override // p204p.izd1
    public final mko getData() {
        switch (this.f45415a) {
            case 0:
                return (ns5) this.f45411N0;
            default:
                return (tjo) this.f45414Z;
        }
    }

    public d5f(h1k h1kVar, nbn nbnVar, n190 n190Var, hln hlnVar, v300 v300Var, pgo pgoVar, hrw hrwVar, hc80 hc80Var, String str, cbm0 cbm0Var, fyc0 fyc0Var) {
        this.f45415a = 0;
        this.f45418d = h1kVar;
        this.f45419e = nbnVar;
        this.f45420f = n190Var;
        this.f45421g = hlnVar;
        this.f45422h = v300Var;
        this.f45416b = pgoVar;
        this.f45423i = hrwVar;
        this.f45424t = hc80Var;
        this.f45412X = str;
        this.f45413Y = cbm0Var;
        this.f45414Z = fyc0Var;
        this.f45409L0 = new t5c(this, 1);
        this.f45410M0 = mhf1.m61771p(this).m94133b(jte.f115849i, jte.f115850t);
        fyf fyfVar = new fyf(new bhd(this, 15), true, -1891096139);
        wpi0 wpi0Var = xwt.f266743a;
        this.f45417c = new cph(fyfVar, 3);
        this.f45411N0 = ns5.f157668f;
    }
}
