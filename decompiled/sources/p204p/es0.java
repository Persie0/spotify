package p204p;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class es0 {

    /* JADX INFO: renamed from: a */
    public final w0e1 f62234a;

    /* JADX INFO: renamed from: b */
    public final br0 f62235b;

    /* JADX INFO: renamed from: c */
    public final i4t0 f62236c;

    /* JADX INFO: renamed from: d */
    public final l3a1 f62237d;

    /* JADX INFO: renamed from: e */
    public final xre f62238e;

    /* JADX INFO: renamed from: f */
    public final kr0 f62239f;

    /* JADX INFO: renamed from: g */
    public final is0 f62240g;

    /* JADX INFO: renamed from: h */
    public final qt21 f62241h;

    /* JADX INFO: renamed from: i */
    public final c9k f62242i;

    /* JADX INFO: renamed from: j */
    public final zv41 f62243j = jag1.m52819d(null);

    public es0(w0e1 w0e1Var, br0 br0Var, ron ronVar, l3a1 l3a1Var, xre xreVar, kr0 kr0Var, is0 is0Var, qt21 qt21Var, luk lukVar) {
        this.f62234a = w0e1Var;
        this.f62235b = br0Var;
        this.f62236c = ronVar;
        this.f62237d = l3a1Var;
        this.f62238e = xreVar;
        this.f62239f = kr0Var;
        this.f62240g = is0Var;
        this.f62241h = qt21Var;
        this.f62242i = edb.m38577z(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m39851a(lr0 lr0Var, ibk ibkVar) {
        as0 as0Var;
        Object objM86940n;
        Object obj;
        fh0 fh0Var;
        if (ibkVar instanceof as0) {
            as0Var = (as0) ibkVar;
            int i = as0Var.f19273e;
            if ((i & Integer.MIN_VALUE) != 0) {
                as0Var.f19273e = i - Integer.MIN_VALUE;
            } else {
                as0Var = new as0(this, ibkVar);
            }
        } else {
            as0Var = new as0(this, ibkVar);
        }
        Object obj2 = as0Var.f19271c;
        int i2 = as0Var.f19273e;
        Object obj3 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj2);
            as0Var.f19273e = 1;
            objM86940n = this.f62234a.m86940n(lr0Var, as0Var);
            if (objM86940n != obj3) {
            }
            return obj3;
        }
        if (i2 == 1) {
            bga.m29073P(obj2);
            objM86940n = ((s6x0) obj2).f206218a;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fh0Var = as0Var.f19270b;
            obj = as0Var.f19269a;
            bga.m29073P(obj2);
        }
        this.f62237d.m57994b(fh0Var);
        objM86940n = obj;
        if (objM86940n instanceof c6x0) {
            return null;
        }
        return objM86940n;
        if (!(objM86940n instanceof c6x0)) {
            fh0 fh0Var2 = (fh0) objM86940n;
            as0Var.f19269a = objM86940n;
            as0Var.f19270b = fh0Var2;
            as0Var.f19273e = 2;
            if (m39856f(as0Var) != obj3) {
                obj = objM86940n;
                fh0Var = fh0Var2;
                this.f62237d.m57994b(fh0Var);
                objM86940n = obj;
            }
            return obj3;
        }
        if (objM86940n instanceof c6x0) {
            return null;
        }
        return objM86940n;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m39852b(ibk ibkVar) {
        bs0 bs0Var;
        if (ibkVar instanceof bs0) {
            bs0Var = (bs0) ibkVar;
            int i = bs0Var.f30204d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bs0Var.f30204d = i - Integer.MIN_VALUE;
            } else {
                bs0Var = new bs0(this, ibkVar);
            }
        } else {
            bs0Var = new bs0(this, ibkVar);
        }
        Object objM76980u = bs0Var.f30202b;
        int i2 = bs0Var.f30204d;
        fbk fbkVar = null;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM76980u);
            long jM94585c = ((yt3) this.f62236c.get()).m94585c();
            C1819em c1819em = new C1819em(this, fbkVar, 5);
            bs0Var.f30204d = 1;
            objM76980u = s1h1.m76980u(jM94585c, c1819em, bs0Var);
            if (objM76980u != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fh0 fh0Var = bs0Var.f30201a;
            bga.m29073P(objM76980u);
            return fh0Var;
        }
        bga.m29073P(objM76980u);
        fh0 fh0Var2 = (fh0) objM76980u;
        if (fh0Var2 == null) {
            return null;
        }
        bs0Var.f30201a = fh0Var2;
        bs0Var.f30204d = 2;
        return m39856f(bs0Var) == obj ? obj : fh0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: c */
    public final Object m39853c(ibk ibkVar) {
        cs0 cs0Var;
        c9k c9kVar = this.f62242i;
        is0 is0Var = this.f62240g;
        if (ibkVar instanceof cs0) {
            cs0Var = (cs0) ibkVar;
            int i = cs0Var.f41429c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cs0Var.f41429c = i - Integer.MIN_VALUE;
            } else {
                cs0Var = new cs0(this, ibkVar);
            }
        } else {
            cs0Var = new cs0(this, ibkVar);
        }
        cs0 cs0Var2 = cs0Var;
        Object objM73785a = cs0Var2.f41427a;
        yuk yukVar = yuk.f276404a;
        int i2 = cs0Var2.f41429c;
        boolean z = false;
        if (i2 == 0) {
            bga.m29073P(objM73785a);
            if (!((yt3) this.f62236c.get()).m94584b()) {
                return qyg1.m74178H(false);
            }
            if (is0Var.f105081b == null) {
                sr4 sr4VarM76275a = ((rr4) is0Var.f105080a).m76275a("ad-on-app-open");
                sr4VarM76275a.f213231f = "android-ad-on-app-open";
                is0Var.f105081b = sr4VarM76275a;
            }
            qlg1.m73215t(c9kVar.f35578a);
            this.f62243j.m97090l(null);
            qt21 qt21Var = this.f62241h;
            mv0 mv0Var = mv0.f147461b;
            ytg1.m94622m();
            mv0 mv0Var2 = mv0.f147468i;
            wxf1.m89255l(c9kVar, b0g1.m27776L(qt21Var.m73786b(mv0Var2), new C2241p2(this, null, 4)));
            kr0.m57130a(this.f62239f, jr0.CORE_FETCH_AD_REQUESTED, null, null, null, 62);
            is0Var.m51477a(3);
            qt21 qt21Var2 = this.f62241h;
            ytg1.m94622m();
            hs21 hs21Var = hs21.FETCH;
            cs0Var2.f41429c = 1;
            objM73785a = qt21.m73785a(qt21Var2, mv0Var2, hs21Var, null, cs0Var2, 12);
            if (objM73785a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM73785a);
        }
        ks21 ks21Var = (ks21) objM73785a;
        if (wj50.m88271j(ks21Var, js21.f115370a)) {
            sr4 sr4Var = is0Var.f105081b;
            if (sr4Var != null) {
                sr4Var.m79016f(fr0.m42458b(3));
            }
            z = true;
        } else {
            if (!(ks21Var instanceof is21)) {
                throw new NoWhenBranchMatchedException();
            }
            is0Var.m51479c(3, 2);
            kr0.m57130a(this.f62239f, jr0.CORE_FETCH_AD_FAILED, null, null, ((is21) ks21Var).m51481a(), 30);
        }
        return qyg1.m74178H(z);
    }

    /* JADX INFO: renamed from: d */
    public final Date m39854d() {
        ize1 ize1VarMo60302b;
        xre xreVar = this.f62238e;
        try {
            ((wy3) xreVar).getClass();
            z050 z050VarM95040p6 = z050.m95040p6(System.currentTimeMillis());
            gze1 gze1VarM46199p = gze1.m46199p();
            z050VarM95040p6.getClass();
            jba0 jba0Var = pze1.m71734n6(z050VarM95040p6, gze1VarM46199p).f183683d.f131611d;
            gze1 gze1VarM46199p2 = gze1.m46199p();
            jba0Var.getClass();
            jlg1.m53716z(gze1VarM46199p2, "zone");
            lba0 lba0VarM58641v6 = lba0.m58641v6(jba0Var, dfa0.f48554t);
            if (!(gze1VarM46199p2 instanceof hze1) && (ize1VarMo60302b = gze1VarM46199p2.mo46200f().mo60302b(lba0VarM58641v6)) != null && ize1VarMo60302b.m51999g()) {
                lba0VarM58641v6 = ize1VarMo60302b.m51993a();
            }
            pze1 pze1VarM71735o6 = pze1.m71735o6(lba0VarM58641v6, gze1VarM46199p2, null);
            return new Date(z050.m95041q6(pze1VarM71735o6.toEpochSecond(), pze1VarM71735o6.f183683d.f131612e.f48558g).m95047v6());
        } catch (Exception e) {
            kr0.m57130a(this.f62239f, jr0.DATE_TIME_PARSING_FAILED, null, null, y85.m93049F(e), 30);
            ((wy3) xreVar).getClass();
            Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            return new Date(calendar.getTimeInMillis());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m39855e(ibk ibkVar) {
        ds0 ds0Var;
        if (ibkVar instanceof ds0) {
            ds0Var = (ds0) ibkVar;
            int i = ds0Var.f52455c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ds0Var.f52455c = i - Integer.MIN_VALUE;
            } else {
                ds0Var = new ds0(this, ibkVar);
            }
        } else {
            ds0Var = new ds0(this, ibkVar);
        }
        Object objM65530p = ds0Var.f52453a;
        int i2 = ds0Var.f52455c;
        if (i2 == 0) {
            bga.m29073P(objM65530p);
            Date dateM39854d = m39854d();
            ((wy3) this.f62238e).getClass();
            Date date = new Date(System.currentTimeMillis());
            ds0Var.f52455c = 1;
            br0 br0Var = this.f62235b;
            objM65530p = nsf1.m65530p(ds0Var, new C1966i4(br0Var, dateM39854d, date), br0Var.f29923a, true, false);
            yuk yukVar = yuk.f276404a;
            if (objM65530p == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM65530p);
        }
        ir0 ir0Var = (ir0) objM65530p;
        if (ir0Var == null) {
            return qyg1.m74178H(true);
        }
        return !ir0Var.m51419a() ? qyg1.m74178H(true) : qyg1.m74178H(false);
    }

    /* JADX INFO: renamed from: f */
    public final Object m39856f(ibk ibkVar) {
        long jM94583a = ((yt3) this.f62236c.get()).m94583a();
        Date dateM39854d = m39854d();
        ((wy3) this.f62238e).getClass();
        ir0 ir0Var = new ir0(dateM39854d, false, new Date(TimeUnit.SECONDS.toMillis(jM94583a) + System.currentTimeMillis()));
        br0 br0Var = this.f62235b;
        Object objM65530p = nsf1.m65530p(ibkVar, new C1966i4(9, br0Var, ir0Var), br0Var.f29923a, false, true);
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (objM65530p != yukVar) {
            objM65530p = w2a1Var;
        }
        return objM65530p == yukVar ? objM65530p : w2a1Var;
    }
}
