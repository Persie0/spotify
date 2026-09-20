package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cw0 {

    /* JADX INFO: renamed from: a */
    public final mv0 f42585a;

    /* JADX INFO: renamed from: b */
    public final fus0 f42586b;

    /* JADX INFO: renamed from: c */
    public final qt21 f42587c;

    /* JADX INFO: renamed from: d */
    public final jiz f42588d;

    /* JADX INFO: renamed from: e */
    public final luk f42589e;

    /* JADX INFO: renamed from: f */
    public final zv41 f42590f;

    /* JADX INFO: renamed from: g */
    public guf f42591g;

    /* JADX INFO: renamed from: h */
    public di41 f42592h;

    /* JADX INFO: renamed from: i */
    public final nuu0 f42593i;

    public cw0(mv0 mv0Var, fus0 fus0Var, qt21 qt21Var, jiz jizVar, luk lukVar) {
        this.f42585a = mv0Var;
        this.f42586b = fus0Var;
        this.f42587c = qt21Var;
        this.f42588d = jizVar;
        this.f42589e = lukVar;
        zv41 zv41VarM52819d = jag1.m52819d(rv0.f202973a);
        this.f42590f = zv41VarM52819d;
        this.f42591g = mlg1.m62210c();
        this.f42593i = bzf1.m31021m(zv41VarM52819d);
    }

    /* JADX INFO: renamed from: b */
    public static Object m34074b(cw0 cw0Var, Map map, ibk ibkVar) {
        cw0Var.getClass();
        return m34075c(cw0Var, map, ibkVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m34075c(cw0 cw0Var, Map map, ibk ibkVar) {
        yv0 yv0Var;
        if (ibkVar instanceof yv0) {
            yv0Var = (yv0) ibkVar;
            int i = yv0Var.f276515d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yv0Var.f276515d = i - Integer.MIN_VALUE;
            } else {
                yv0Var = new yv0(ibkVar);
            }
        } else {
            yv0Var = new yv0(ibkVar);
        }
        Object objM34076a = yv0Var.f276514c;
        int i2 = yv0Var.f276515d;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM34076a);
            yv0Var.f276512a = cw0Var;
            yv0Var.f276513b = map;
            yv0Var.f276515d = 1;
            objM34076a = cw0Var.m34076a(yv0Var);
            if (objM34076a != yukVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM34076a);
            return objM34076a;
        }
        map = yv0Var.f276513b;
        cw0Var = yv0Var.f276512a;
        bga.m29073P(objM34076a);
        Map map2 = map;
        if (!((Boolean) objM34076a).booleanValue()) {
            return new es21(edb.m38564m("awaitInitialization fail for slot ", cw0Var.f42585a.f147472a));
        }
        Logger.m3969e(s571.m77251j("Performing immediate fetch for slot ", cw0Var.f42585a.f147472a, "."), new Object[0]);
        qt21 qt21Var = cw0Var.f42587c;
        yv0Var.f276512a = null;
        yv0Var.f276513b = null;
        yv0Var.f276515d = 2;
        Object objM89557A = x0h1.m89557A(qt21Var.f192266e, new lmz0(cw0Var.f42585a, map2, qt21Var, null, 27), yv0Var);
        return objM89557A == yukVar ? yukVar : objM89557A;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m34076a(ibk ibkVar) {
        xv0 xv0Var;
        if (ibkVar instanceof xv0) {
            xv0Var = (xv0) ibkVar;
            int i = xv0Var.f266237c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xv0Var.f266237c = i - Integer.MIN_VALUE;
            } else {
                xv0Var = new xv0(this, ibkVar);
            }
        } else {
            xv0Var = new xv0(this, ibkVar);
        }
        Object objM76981v = xv0Var.f266235a;
        int i2 = xv0Var.f266237c;
        if (i2 == 0) {
            bga.m29073P(objM76981v);
            hvi0 hvi0Var = cks.f39079b;
            long jM54450E = jwg1.m54450E(30L, ils.SECONDS);
            vv0 vv0Var = new vv0(this, null, 2);
            xv0Var.f266237c = 1;
            objM76981v = s1h1.m76981v(jM54450E, vv0Var, xv0Var);
            yuk yukVar = yuk.f276404a;
            if (objM76981v == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM76981v);
        }
        Boolean bool = (Boolean) objM76981v;
        return qyg1.m74178H(bool != null ? bool.booleanValue() : false);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x00b2, please report this as an issue */
    /* JADX INFO: renamed from: d */
    public final Object m34077d(hs21 hs21Var, Map map, ibk ibkVar) {
        zv0 zv0Var;
        Object objM34076a;
        hs21 hs21Var2;
        Map map2;
        hs21 hs21Var3;
        ks21 ks21Var;
        mv0 mv0Var = this.f42585a;
        String str = mv0Var.f147472a;
        if (ibkVar instanceof zv0) {
            zv0Var = (zv0) ibkVar;
            int i = zv0Var.f286574e;
            if ((i & Integer.MIN_VALUE) != 0) {
                zv0Var.f286574e = i - Integer.MIN_VALUE;
            } else {
                zv0Var = new zv0(this, ibkVar);
            }
        } else {
            zv0Var = new zv0(this, ibkVar);
        }
        zv0 zv0Var2 = zv0Var;
        Object objM73785a = zv0Var2.f286572c;
        int i2 = zv0Var2.f286574e;
        w2a1 w2a1Var = w2a1.f247311a;
        rv0 rv0Var = rv0.f202973a;
        zv41 zv41Var = this.f42590f;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM73785a);
            zv0Var2.f286570a = hs21Var;
            zv0Var2.f286571b = map;
            zv0Var2.f286574e = 1;
            objM34076a = m34076a(zv0Var2);
            if (objM34076a != obj) {
                hs21Var2 = hs21Var;
                map2 = map;
            }
            return obj;
        }
        if (i2 == 1) {
            Map map3 = zv0Var2.f286571b;
            hs21 hs21Var4 = zv0Var2.f286570a;
            bga.m29073P(objM73785a);
            objM34076a = objM73785a;
            map2 = map3;
            hs21Var2 = hs21Var4;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hs21Var3 = zv0Var2.f286570a;
            bga.m29073P(objM73785a);
        }
        ks21Var = (ks21) objM73785a;
        if (ks21Var instanceof is21) {
            Logger.m3969e("Failed to perform " + hs21Var3 + " on slot " + str + ". Error: " + ((is21) ks21Var).m51481a(), new Object[0]);
            zv41Var.getClass();
            zv41Var.m97091m(null, rv0Var);
        }
        return w2a1Var;
        if (!((Boolean) objM34076a).booleanValue()) {
            zv41Var.getClass();
            zv41Var.m97091m(null, rv0Var);
            return w2a1Var;
        }
        Logger.m3969e("Performing " + hs21Var2 + " for slot " + str + ".", new Object[0]);
        zv0Var2.f286570a = hs21Var2;
        zv0Var2.f286571b = null;
        zv0Var2.f286574e = 2;
        objM73785a = qt21.m73785a(this.f42587c, mv0Var, hs21Var2, map2, zv0Var2, 8);
        if (objM73785a != obj) {
            hs21Var3 = hs21Var2;
            ks21Var = (ks21) objM73785a;
            if (ks21Var instanceof is21) {
                Logger.m3969e("Failed to perform " + hs21Var3 + " on slot " + str + ". Error: " + ((is21) ks21Var).m51481a(), new Object[0]);
                zv41Var.getClass();
                zv41Var.m97091m(null, rv0Var);
            }
            return w2a1Var;
        }
        return obj;
    }

    /* JADX INFO: renamed from: e */
    public final Object m34078e(ibk ibkVar) {
        Object objM34077d = m34077d(hs21.NOW, nau.f152117a, ibkVar);
        return objM34077d == yuk.f276404a ? objM34077d : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: f */
    public final void m34079f() {
        di41 di41Var = this.f42592h;
        fbk fbkVar = null;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        this.f42591g = mlg1.m62210c();
        this.f42592h = x0h1.m89578u(kk40.m56661c(this.f42589e), null, 0, new C2069kx(this, fbkVar, 1), 3);
    }

    /* JADX INFO: renamed from: g */
    public final void m34080g() {
        di41 di41Var = this.f42592h;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        zv41 zv41Var = this.f42590f;
        zv41Var.getClass();
        zv41Var.m97091m(null, rv0.f202973a);
    }
}
