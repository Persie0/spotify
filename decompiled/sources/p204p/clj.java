package p204p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class clj implements dut {

    /* JADX INFO: renamed from: L0 */
    public final Object f39290L0;

    /* JADX INFO: renamed from: M0 */
    public final Object f39291M0;

    /* JADX INFO: renamed from: N0 */
    public final uut f39292N0;

    /* JADX INFO: renamed from: X */
    public final Object f39293X;

    /* JADX INFO: renamed from: Y */
    public final Object f39294Y;

    /* JADX INFO: renamed from: Z */
    public final Object f39295Z;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39296a;

    /* JADX INFO: renamed from: b */
    public boolean f39297b;

    /* JADX INFO: renamed from: c */
    public final i5x f39298c;

    /* JADX INFO: renamed from: d */
    public final cph f39299d;

    /* JADX INFO: renamed from: e */
    public final Object f39300e;

    /* JADX INFO: renamed from: f */
    public final Object f39301f;

    /* JADX INFO: renamed from: g */
    public final Object f39302g;

    /* JADX INFO: renamed from: h */
    public final Object f39303h;

    /* JADX INFO: renamed from: i */
    public final Object f39304i;

    /* JADX INFO: renamed from: t */
    public final Object f39305t;

    public clj(zam0 zam0Var, rk0 rk0Var, e940 e940Var, ra9 ra9Var, l89 l89Var, eou0 eou0Var, ru91 ru91Var, yhv yhvVar, abn abnVar, k4k0 k4k0Var, w090 w090Var, boolean z, djn djnVar) {
        this.f39296a = 0;
        this.f39300e = zam0Var;
        this.f39301f = rk0Var;
        this.f39302g = e940Var;
        this.f39303h = ra9Var;
        this.f39304i = l89Var;
        this.f39305t = eou0Var;
        this.f39293X = ru91Var;
        this.f39294Y = yhvVar;
        this.f39297b = z;
        this.f39295Z = djnVar.m36212a(rk0Var);
        this.f39290L0 = abnVar.m25369a(k4k0Var);
        this.f39291M0 = abnVar.m25369a(w090Var);
        int i = 3;
        this.f39292N0 = uuf1.m83999s(ubj.f228789Z, null, null, new fyf(new iy6(this, i), true, 2051135809), 6);
        this.f39298c = mhf1.m61771p(this).m94133b(new sgd(this, 22), agi.f15383S0);
        fyf fyfVar = new fyf(new r4i(this, 6), true, -1727261592);
        wpi0 wpi0Var = xwt.f266743a;
        this.f39299d = new cph(fyfVar, i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static final Object m33276e(clj cljVar, ibk ibkVar) {
        y841 y841Var;
        if (ibkVar instanceof y841) {
            y841Var = (y841) ibkVar;
            int i = y841Var.f270199c;
            if ((i & Integer.MIN_VALUE) != 0) {
                y841Var.f270199c = i - Integer.MIN_VALUE;
            } else {
                y841Var = new y841(cljVar, ibkVar);
            }
        } else {
            y841Var = new y841(cljVar, ibkVar);
        }
        Object obj = y841Var.f270197a;
        int i2 = y841Var.f270199c;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (cljVar.f39297b) {
                Single singleMo48412a = ((hrw) cljVar.f39303h).mo48412a(new x7p0("sponsored_playlist", false));
                y841Var.f270199c = 1;
                Object objM96567o = zn91.m96567o(singleMo48412a, y841Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        lqi0 lqi0Var = (lqi0) cljVar.f39295Z;
        Boolean bool = Boolean.TRUE;
        zv41 zv41Var = (zv41) lqi0Var;
        zv41Var.getClass();
        zv41Var.m97091m(null, bool);
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (p204p.zn91.m96567o(r8, r0) == r5) goto L22;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m33277f(clj cljVar, ibk ibkVar) {
        z841 z841Var;
        clj cljVar2;
        if (ibkVar instanceof z841) {
            z841Var = (z841) ibkVar;
            int i = z841Var.f280383d;
            if ((i & Integer.MIN_VALUE) != 0) {
                z841Var.f280383d = i - Integer.MIN_VALUE;
            } else {
                z841Var = new z841(cljVar, ibkVar);
            }
        } else {
            z841Var = new z841(cljVar, ibkVar);
        }
        Object objM86757v = z841Var.f280381b;
        int i2 = z841Var.f280383d;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86757v);
            fiz fizVar = (fiz) cljVar.f39290L0;
            z841Var.f280380a = cljVar;
            z841Var.f280383d = 1;
            objM86757v = vyf1.m86757v(fizVar, z841Var);
            if (objM86757v != yukVar) {
                cljVar2 = cljVar;
            }
            return yukVar;
        }
        if (i2 == 1) {
            cljVar2 = z841Var.f280380a;
            bga.m29073P(objM86757v);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86757v);
        }
        lqi0 lqi0Var = (lqi0) cljVar.f39295Z;
        Boolean bool = Boolean.FALSE;
        zv41 zv41Var = (zv41) lqi0Var;
        zv41Var.getClass();
        zv41Var.m97091m(null, bool);
        return w2a1.f247311a;
        cljVar2.f39297b = wj50.m88271j(objM86757v, Boolean.TRUE);
        Single singleMo48412a = ((hrw) cljVar.f39303h).mo48412a(new u7p0("sponsored_playlist", false));
        z841Var.f280380a = null;
        z841Var.f280383d = 2;
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        switch (this.f39296a) {
            case 0:
                break;
        }
        return this.f39298c;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        switch (this.f39296a) {
            case 0:
                break;
        }
        return this.f39299d;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        switch (this.f39296a) {
            case 0:
                return (wxh0) this.f39292N0;
            default:
                return (xiz) this.f39292N0;
        }
    }

    public clj(gt0 gt0Var, r741 r741Var, z9j0 z9j0Var, hrw hrwVar, k9b k9bVar, om0 om0Var, Flowable flowable, hs01 hs01Var, etz etzVar, xv41 xv41Var, String str) {
        Object objPutIfAbsent;
        int i = 1;
        this.f39296a = 1;
        this.f39300e = gt0Var;
        this.f39301f = r741Var;
        this.f39302g = z9j0Var;
        this.f39303h = hrwVar;
        this.f39304i = k9bVar;
        this.f39305t = om0Var;
        this.f39293X = etzVar;
        this.f39294Y = xv41Var;
        ConcurrentHashMap concurrentHashMap = h941.f88875a;
        Object objM52819d = concurrentHashMap.get(str);
        if (objM52819d == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (objM52819d = jag1.m52819d(Boolean.TRUE)))) != null) {
            objM52819d = objPutIfAbsent;
        }
        this.f39295Z = (lqi0) objM52819d;
        d0k[] d0kVarArr = bmu0.f28619a;
        fiz fizVarM62953p = mvl0.m62953p(new p741(new onc(flowable), 2));
        this.f39290L0 = fizVarM62953p;
        this.f39291M0 = xtm0.m92074U(new zux(hs01Var, fizVarM62953p, w841.f248853h, i), new x13((fbk) null, this, 15));
        this.f39292N0 = axf1.m27398m(new v841(this, 0), m541.f140125i, new zm31(this, 5), null, new v841(this, i), 8);
        this.f39298c = mhf1.m61771p(this).m94133b(m441.f139834f, m441.f139835g);
        fyf fyfVar = new fyf(new lx11(this, 24), true, 1699345880);
        wpi0 wpi0Var = xwt.f266743a;
        this.f39299d = new cph(fyfVar, 3);
    }
}
