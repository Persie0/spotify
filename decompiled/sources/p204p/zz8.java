package p204p;

import android.os.Bundle;
import com.comscore.streaming.ContentType;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zz8 implements i6m0, zmm0 {

    /* JADX INFO: renamed from: L0 */
    public kbm0 f287908L0;

    /* JADX INFO: renamed from: X */
    public yz8 f287909X;

    /* JADX INFO: renamed from: Y */
    public long f287910Y;

    /* JADX INFO: renamed from: Z */
    public kbm0 f287911Z;

    /* JADX INFO: renamed from: a */
    public final lbm0 f287912a;

    /* JADX INFO: renamed from: b */
    public final mv91 f287913b;

    /* JADX INFO: renamed from: c */
    public final ot91 f287914c;

    /* JADX INFO: renamed from: d */
    public final dbm0 f287915d;

    /* JADX INFO: renamed from: e */
    public final Set f287916e;

    /* JADX INFO: renamed from: f */
    public final gfm0 f287917f;

    /* JADX INFO: renamed from: g */
    public final gt91 f287918g;

    /* JADX INFO: renamed from: h */
    public final boolean f287919h;

    /* JADX INFO: renamed from: i */
    public int f287920i = 1;

    /* JADX INFO: renamed from: t */
    public final zv41 f287921t;

    public zz8(zam0 zam0Var, fnm0 fnm0Var, afm0 afm0Var, lbm0 lbm0Var, mv91 mv91Var, ot91 ot91Var, xre xreVar, dbm0 dbm0Var, Set set, gfm0 gfm0Var, gt91 gt91Var, boolean z) {
        this.f287912a = lbm0Var;
        this.f287913b = mv91Var;
        this.f287914c = ot91Var;
        this.f287915d = dbm0Var;
        this.f287916e = set;
        this.f287917f = gfm0Var;
        this.f287918g = gt91Var;
        this.f287919h = z;
        this.f287921t = jag1.m52819d(new pam0(zam0Var, fnm0Var));
        this.f287909X = new yz8(zam0Var, fnm0Var, lbm0Var.m58672a());
        if (gfm0Var.f79397c) {
            gfm0Var.f79399e = afm0Var;
            if (gfm0Var.f79396b && gfm0Var.f79409o == null) {
                x461 x461VarM64613f = njg1.m64613f();
                n5q n5qVar = xsr.f265651a;
                gfm0Var.f79409o = kk40.m56661c(mlg1.m62205A(x461VarM64613f, pvb0.f181680a.f197428f));
            }
        }
        gfm0Var.f79406l = new yic1(this, 29);
    }

    /* JADX INFO: renamed from: A */
    public final Bundle m97274A() {
        this.f287915d.mo35570f(this.f287909X.f277729c);
        return pp91.m70529j(pft0.m69840u("PBL:PageInstanceId", this.f287909X.f277729c.f121231a), pft0.m69840u("PBL:PresentationIndex", Integer.valueOf(this.f287917f.f79398d)));
    }

    /* JADX INFO: renamed from: B */
    public final ocm0 m97275B(yz8 yz8Var) {
        kbm0 kbm0Var = yz8Var.f277729c;
        fnm0 fnm0Var = yz8Var.f277728b;
        return new ocm0(kbm0Var, fnm0Var != null ? fnm0Var.f71323a : null, yz8Var.f277727a.path(), Integer.valueOf(this.f287917f.f79398d));
    }

    /* JADX INFO: renamed from: C */
    public final void m97276C(zam0 zam0Var, fnm0 fnm0Var) {
        kbm0 kbm0Var;
        kbm0 kbm0Var2 = this.f287909X.f277729c;
        kbm0 kbm0VarM58672a = this.f287911Z;
        if (kbm0VarM58672a == null) {
            kbm0VarM58672a = this.f287912a.m58672a();
        }
        this.f287909X = new yz8(zam0Var, fnm0Var, kbm0VarM58672a);
        this.f287911Z = null;
        if (!kbm0VarM58672a.equals(this.f287908L0) && !wj50.m88271j(kbm0Var2, this.f287908L0) && (kbm0Var = this.f287908L0) != null) {
            this.f287915d.mo35571h(kbm0Var);
        }
        this.f287908L0 = kbm0Var2;
    }

    /* JADX INFO: renamed from: D */
    public final d850 m97277D(d850 d850Var, av91 av91Var) {
        st91 st91Var = st91.f213865b;
        sr31 sr31VarM25937i = ahf1.m25937i();
        sr31VarM25937i.m79004u(av91Var.f202551c.m27170b());
        sr31VarM25937i.m78998o(av91Var.f202551c.m27169a());
        return new d850(d850Var.f46380a, d850Var.f46381b, d850Var.f46382c, d850Var.f46383d, d850Var.f46384e, d850Var.f46385f, new gt91(g6f.m43701O0(new gv91(d850Var.f46380a, d850Var.f46381b, sr31VarM25937i.m78989b()), this.f287918g.f84116a), null), d850Var.f46387h, d850Var.f46388i, d850Var.f46389t);
    }

    @Override // p204p.zmm0
    /* JADX INFO: renamed from: c */
    public final Observable mo24811c() {
        return k0e1.m54988g(this.f287921t, dau.f47107a);
    }

    @Override // p204p.lt91
    /* JADX INFO: renamed from: d */
    public final jt91 mo59874d(kt91 kt91Var) {
        ocm0 ocm0VarM97275B = m97275B(this.f287909X);
        ot91 ot91Var = this.f287914c;
        ot91Var.getClass();
        ou91 ou91Var = kt91Var.f126193a;
        if (((Boolean) ot91Var.f169007a.invoke()).booleanValue()) {
            ot91Var.f169008b.mo57449i(ou91Var, null);
            return vgf1.m85438j();
        }
        ot91Var.f169012f.m68125a(ou91Var);
        vt91 vt91VarM88914a = ot91Var.f169010d.m88914a();
        kbm0 kbm0Var = ocm0VarM97275B.f163959a;
        String str = ocm0VarM97275B.f163960b;
        if (str == null) {
            str = "";
        }
        return ot91Var.m67776c(kt91Var, vt91.m86373a(vt91VarM88914a, kbm0Var, null, str, 493));
    }

    @Override // p204p.anm0
    /* JADX INFO: renamed from: g */
    public final bnm0 getF6890r1() {
        return zy5.m97225f(this);
    }

    @Override // p204p.kv91
    /* JADX INFO: renamed from: i */
    public final zi40 mo57449i(ou91 ou91Var, Set set) {
        ocm0 ocm0VarM97275B = m97275B(this.f287909X);
        Set setM68906i = p271.m68906i(p271.m68905h(set, iq91.f104704b), this.f287916e);
        mv91 mv91Var = this.f287913b;
        mv91Var.getClass();
        String str = ocm0VarM97275B.f163960b;
        mv91Var.f147540e.m68125a(ou91Var);
        vt91 vt91VarM62913a = mv91.m62913a(mv91Var.f147537b.m88914a(), ocm0VarM97275B);
        String str2 = vt91VarM62913a.f244587g;
        String str3 = vt91VarM62913a.f244586f;
        String str4 = vt91VarM62913a.f244584d;
        String str5 = vt91VarM62913a.f244581a;
        mv91Var.f147539d.getClass();
        boolean z = mv91Var.f147542g;
        gt91 gt91Var = this.f287918g;
        if (z) {
            return mv91Var.m62916d(ou91Var, str5, ocm0VarM97275B.f163959a, ocm0VarM97275B.f163961c, str4, str != null ? str : "", str3, str2, setM68906i, vt91VarM62913a.f244588h, vt91VarM62913a.f244589i, gt91Var);
        }
        return mv91Var.m62918g(ou91Var, str5, ocm0VarM97275B.f163959a, ocm0VarM97275B.f163961c, str4, str != null ? str : "", str3, str2, setM68906i, vt91VarM62913a.f244588h, vt91VarM62913a.f244589i, gt91Var);
    }

    @Override // p204p.kv91
    /* JADX INFO: renamed from: o */
    public final zi40 mo57451o(ou91 ou91Var) {
        ocm0 ocm0VarM97275B = m97275B(this.f287909X);
        mv91 mv91Var = this.f287913b;
        mv91Var.f147540e.m68125a(ou91Var);
        vt91 vt91VarM62913a = mv91.m62913a(mv91Var.f147537b.m88914a(), ocm0VarM97275B);
        mv91Var.f147539d.getClass();
        String str = vt91VarM62913a.f244581a;
        kbm0 kbm0Var = ocm0VarM97275B.f163959a;
        String str2 = ocm0VarM97275B.f163961c;
        String str3 = vt91VarM62913a.f244584d;
        String str4 = ocm0VarM97275B.f163960b;
        if (str4 == null) {
            str4 = "";
        }
        return mv91Var.m62918g(ou91Var, str, kbm0Var, str2, str3, str4, vt91VarM62913a.f244586f, vt91VarM62913a.f244587g, null, vt91VarM62913a.f244588h, vt91VarM62913a.f244589i, this.f287918g);
    }

    @Override // p204p.kv91
    /* JADX INFO: renamed from: p */
    public final d850 mo57452p(av91 av91Var) {
        ocm0 ocm0VarM97275B = m97275B(this.f287909X);
        mv91 mv91Var = this.f287913b;
        mv91Var.f147540e.m68125a(av91Var);
        vt91 vt91VarM62913a = mv91.m62913a(mv91Var.f147537b.m88914a(), ocm0VarM97275B);
        mv91Var.f147539d.getClass();
        String str = vt91VarM62913a.f244581a;
        kbm0 kbm0Var = ocm0VarM97275B.f163959a;
        String str2 = ocm0VarM97275B.f163961c;
        String str3 = vt91VarM62913a.f244584d;
        String str4 = ocm0VarM97275B.f163960b;
        if (str4 == null) {
            str4 = "";
        }
        return m97277D(mv91Var.m62919h(av91Var, str, kbm0Var, str2, str3, str4, vt91VarM62913a.f244586f, vt91VarM62913a.f244587g, null, null, vt91VarM62913a.f244588h, vt91VarM62913a.f244589i, this.f287918g), av91Var);
    }

    @Override // p204p.lt91
    /* JADX INFO: renamed from: q */
    public final String mo59875q(jt91 jt91Var) {
        return this.f287914c.mo59875q(jt91Var);
    }

    @Override // p204p.kv91
    /* JADX INFO: renamed from: r */
    public final d850 mo57453r(av91 av91Var, x401 x401Var) {
        av91 av91Var2;
        d850 d850VarM62919h;
        boolean zIsEmpty = this.f287918g.f84116a.isEmpty();
        iq91 iq91Var = iq91.f104704b;
        Set setM68905h = !zIsEmpty ? p271.m68905h(p271.m68905h(x401Var, iq91Var), bq91.f29751b) : p271.m68905h(x401Var, iq91Var);
        ocm0 ocm0VarM97275B = m97275B(this.f287909X);
        mv91 mv91Var = this.f287913b;
        mv91Var.getClass();
        String str = ocm0VarM97275B.f163960b;
        mv91Var.f147540e.m68125a(av91Var);
        vt91 vt91VarM62913a = mv91.m62913a(mv91Var.f147537b.m88914a(), ocm0VarM97275B);
        String str2 = vt91VarM62913a.f244587g;
        String str3 = vt91VarM62913a.f244586f;
        String str4 = vt91VarM62913a.f244584d;
        String str5 = vt91VarM62913a.f244581a;
        mv91Var.f147539d.getClass();
        boolean z = mv91Var.f147542g;
        gt91 gt91Var = this.f287918g;
        if (z) {
            d850VarM62919h = mv91Var.m62917e(av91Var, str5, ocm0VarM97275B.f163959a, ocm0VarM97275B.f163961c, str4, str == null ? "" : str, str3, str2, setM68905h, ocm0VarM97275B.f163962d, vt91VarM62913a.f244588h, vt91VarM62913a.f244589i, gt91Var);
            av91Var2 = av91Var;
        } else {
            String str6 = str;
            kbm0 kbm0Var = ocm0VarM97275B.f163959a;
            String str7 = ocm0VarM97275B.f163961c;
            if (str6 == null) {
                str6 = "";
            }
            av91Var2 = av91Var;
            d850VarM62919h = mv91Var.m62919h(av91Var2, str5, kbm0Var, str7, str4, str6, str3, str2, setM68905h, ocm0VarM97275B.f163962d, vt91VarM62913a.f244588h, vt91VarM62913a.f244589i, gt91Var);
        }
        return m97277D(d850VarM62919h, av91Var2);
    }

    /* JADX INFO: renamed from: s */
    public final xhf1 m97278s(aj40 aj40Var, Set set) {
        return this.f287915d.mo35567a(aj40Var, System.currentTimeMillis(), p271.m68906i(p271.m68905h(set, iq91.f104704b), this.f287916e));
    }

    /* JADX INFO: renamed from: t */
    public final aj40 m97279t(ou91 ou91Var, Set set) {
        return this.f287915d.mo35568b(ou91Var, m97275B(this.f287909X), p271.m68906i(p271.m68905h(set, iq91.f104704b), this.f287916e), this.f287918g);
    }

    /* JADX INFO: renamed from: u */
    public final void m97280u(kbm0 kbm0Var, zam0 zam0Var, fnm0 fnm0Var, long j, ifm0 ifm0Var, List list) {
        gnm0 gnm0Var = new gnm0(kbm0Var, zam0Var, j, fnm0Var, ifm0Var, list, this.f287919h, 272);
        zv41 zv41Var = this.f287921t;
        zv41Var.getClass();
        zv41Var.m97091m(null, gnm0Var);
    }

    /* JADX INFO: renamed from: v */
    public final void m97281v() {
        gfm0 gfm0Var = this.f287917f;
        sjn0 sjn0Var = gfm0Var.f79405k;
        gfm0Var.f79405k = null;
        gfm0Var.f79404j = zhi0.f282939f;
        if (sjn0Var != null) {
            ArrayList arrayList = gfm0Var.f79408n;
            List listM43728j1 = g6f.m43728j1(arrayList);
            arrayList.clear();
            m97280u(sjn0Var.f209881a, sjn0Var.f209882b, sjn0Var.f209883c, sjn0Var.f209884d, null, g6f.m43700N0(geg1.m44518y(b6j0.f23976c), listM43728j1));
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m97282w() {
        gfm0 gfm0Var = this.f287917f;
        ArrayList arrayList = gfm0Var.f79408n;
        long jCurrentTimeMillis = this.f287910Y;
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        long j = jCurrentTimeMillis;
        kbm0 kbm0Var = this.f287909X.f277729c;
        zv41 zv41Var = this.f287921t;
        Object value = zv41Var.getValue();
        gnm0 gnm0Var = value instanceof gnm0 ? (gnm0) value : null;
        if (wj50.m88271j(kbm0Var, gnm0Var != null ? gnm0Var.f82737a : null)) {
            return;
        }
        m97281v();
        yz8 yz8Var = this.f287909X;
        kbm0 kbm0Var2 = yz8Var.f277729c;
        zam0 zam0Var = yz8Var.f277727a;
        fnm0 fnm0Var = yz8Var.f277728b;
        boolean z = gfm0Var.f79397c;
        Object obj = dfm0.f48622a;
        if (z && gfm0Var.f79396b) {
            gfm0Var.f79407m = null;
            arrayList.clear();
            zam0 zam0Var2 = gfm0Var.f79401g;
            if (zam0Var2 != null && !wj50.m88271j(zam0Var2.path(), zam0Var.path())) {
                gfm0Var.f79399e = null;
            }
            gfm0Var.f79400f = kbm0Var2;
            gfm0Var.f79401g = zam0Var;
            if (gfm0Var.f79403i) {
                gfm0Var.f79403i = false;
            } else {
                gfm0Var.f79398d = 0;
            }
            if (gfm0Var.f79399e == null) {
                gfm0Var.f79404j = new efm0(kbm0Var2, zam0Var);
                gfm0Var.f79405k = new sjn0(kbm0Var2, zam0Var, fnm0Var, j);
                obj = cfm0.f37405a;
            } else {
                gfm0Var.f79411q.m97090l(gfm0Var.m44624a());
            }
        }
        if (obj instanceof dfm0) {
            yz8 yz8Var2 = this.f287909X;
            kbm0 kbm0Var3 = yz8Var2.f277729c;
            zam0 zam0Var3 = yz8Var2.f277727a;
            fnm0 fnm0Var2 = yz8Var2.f277728b;
            ifm0 ifm0VarM44624a = gfm0Var.m44624a();
            List listM43728j1 = g6f.m43728j1(arrayList);
            arrayList.clear();
            m97280u(kbm0Var3, zam0Var3, fnm0Var2, j, ifm0VarM44624a, listM43728j1);
        } else {
            if (!(obj instanceof cfm0)) {
                throw new NoWhenBranchMatchedException();
            }
            yz8 yz8Var3 = this.f287909X;
            gnm0 gnm0Var2 = new gnm0(yz8Var3.f277729c, yz8Var3.f277727a, j, yz8Var3.f277728b, null, null, this.f287919h, ContentType.LONG_FORM_ON_DEMAND);
            zv41Var.getClass();
            zv41Var.m97091m(null, gnm0Var2);
        }
        this.f287910Y = 0L;
    }

    /* JADX INFO: renamed from: x */
    public final void m97283x() {
        int i = this.f287920i;
        if (i == 2 || i == 3) {
            return;
        }
        this.f287910Y = System.currentTimeMillis();
        if (this.f287920i == 4 && !wj50.m88271j(this.f287909X.f277729c, this.f287911Z)) {
            yz8 yz8Var = this.f287909X;
            m97276C(yz8Var.f277727a, yz8Var.f277728b);
        }
        this.f287920i = 2;
    }

    /* JADX INFO: renamed from: y */
    public final void m97284y(boolean z) {
        bfm0 bfm0Var;
        int i = this.f287920i;
        if (i == 4 || i == 1) {
            return;
        }
        this.f287920i = 4;
        this.f287911Z = this.f287912a.m58672a();
        yz8 yz8Var = this.f287909X;
        pam0 pam0Var = new pam0(yz8Var.f277727a, yz8Var.f277728b);
        zv41 zv41Var = this.f287921t;
        zv41Var.getClass();
        zv41Var.m97091m(null, pam0Var);
        if (z) {
            return;
        }
        gfm0 gfm0Var = this.f287917f;
        z2j0 z2j0Var = gfm0Var.f79407m;
        if (z2j0Var != null) {
            gfm0Var.f79408n.add(new f6j0(z2j0Var));
            gfm0Var.f79407m = null;
        }
        m97281v();
        kbm0 kbm0Var = this.f287909X.f277729c;
        if (gfm0Var.f79397c) {
            gfm0Var.f79404j = zhi0.f282939f;
            gfm0Var.f79400f = null;
            qnm0 qnm0Var = gfm0Var.f79395a;
            String str = kbm0Var.f121231a;
            ifm0 ifm0VarM44624a = gfm0Var.m44624a();
            qnm0Var.f190650d.mo30231j(new pnm0(qnm0Var, str, (ifm0VarM44624a == null || (bfm0Var = ifm0VarM44624a.f101785a) == null) ? 0 : bfm0Var.f26744a, System.currentTimeMillis(), TimeZone.getDefault().getID()));
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m97285z(Bundle bundle) {
        String string = bundle.getString("PBL:PageInstanceId");
        if (string != null) {
            yz8 yz8Var = this.f287909X;
            kbm0.Companion.getClass();
            yz8 yz8VarM94971a = yz8.m94971a(yz8Var, null, new kbm0(string), 3);
            this.f287909X = yz8VarM94971a;
            this.f287915d.mo35569c(yz8VarM94971a.f277729c);
        }
        if (bundle.containsKey("PBL:PresentationIndex")) {
            this.f287917f.f79398d = bundle.getInt("PBL:PresentationIndex");
        }
    }
}
