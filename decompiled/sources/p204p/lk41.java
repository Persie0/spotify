package p204p;

import com.spotify.music.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class lk41 implements ml20 {

    /* JADX INFO: renamed from: L0 */
    public final qe4 f134238L0;

    /* JADX INFO: renamed from: M0 */
    public final tjo f134239M0;

    /* JADX INFO: renamed from: N0 */
    public final ay7 f134240N0;

    /* JADX INFO: renamed from: O0 */
    public final kuf0 f134241O0;

    /* JADX INFO: renamed from: P0 */
    public final rvw0 f134242P0;

    /* JADX INFO: renamed from: Q0 */
    public final ro80 f134243Q0;

    /* JADX INFO: renamed from: R0 */
    public final tjo f134244R0;

    /* JADX INFO: renamed from: S0 */
    public final sr31 f134245S0;

    /* JADX INFO: renamed from: T0 */
    public final ot21 f134246T0;

    /* JADX INFO: renamed from: X */
    public final ttf0 f134247X;

    /* JADX INFO: renamed from: Y */
    public final nbn f134248Y;

    /* JADX INFO: renamed from: Z */
    public final nwn f134249Z;

    /* JADX INFO: renamed from: a */
    public final mb80 f134250a;

    /* JADX INFO: renamed from: b */
    public final pgo f134251b;

    /* JADX INFO: renamed from: c */
    public final u190 f134252c;

    /* JADX INFO: renamed from: d */
    public final String f134253d;

    /* JADX INFO: renamed from: e */
    public final oge0 f134254e;

    /* JADX INFO: renamed from: f */
    public final q831 f134255f;

    /* JADX INFO: renamed from: g */
    public final voi f134256g;

    /* JADX INFO: renamed from: h */
    public final fjf0 f134257h;

    /* JADX INFO: renamed from: i */
    public final wek0 f134258i;

    /* JADX INFO: renamed from: t */
    public final thm f134259t;

    public lk41(mb80 mb80Var, pgo pgoVar, u190 u190Var, String str, wrf0 wrf0Var, oge0 oge0Var, q831 q831Var, voi voiVar, fjf0 fjf0Var, kvb1 kvb1Var, ekn eknVar, wek0 wek0Var, thm thmVar, bon bonVar, boolean z, ttf0 ttf0Var, nbn nbnVar, nwn nwnVar, qe4 qe4Var) {
        this.f134250a = mb80Var;
        this.f134251b = pgoVar;
        this.f134252c = u190Var;
        this.f134253d = str;
        this.f134254e = oge0Var;
        this.f134255f = q831Var;
        this.f134256g = voiVar;
        this.f134257h = fjf0Var;
        this.f134258i = wek0Var;
        this.f134259t = thmVar;
        this.f134247X = ttf0Var;
        this.f134248Y = nbnVar;
        this.f134249Z = nwnVar;
        this.f134238L0 = qe4Var;
        this.f134239M0 = kvb1Var.m57456a(str);
        this.f134240N0 = psh.m70869m(pgoVar, str);
        this.f134241O0 = bonVar.m30088a(st91.f213865b);
        this.f134242P0 = eknVar.m39304a(null);
        ro80 ro80VarM44508o = geg1.m44508o();
        ro80VarM44508o.add(in80.f103923d);
        ro80VarM44508o.add(in80.f103926g);
        ro80VarM44508o.add(in80.f103927h);
        ro80VarM44508o.add(in80.f103920a);
        ro80VarM44508o.add(in80.f103929t);
        ro80VarM44508o.add(in80.f103925f);
        if (z) {
            ro80VarM44508o.add(in80.f103921b);
        }
        this.f134243Q0 = geg1.m44506m(ro80VarM44508o);
        this.f134244R0 = pag1.m69486v(new rko(wyx.f256380X, 1, lj41.f133972Z, new pko(new vd41(this, 8)), lj41.f133956L0), new rko(y3z.f269033g, 2, lj41.f133968X, new pko(lj41.f133983h), lj41.f133970Y), ek41.f60373b);
        this.f134245S0 = new sr31(this);
        this.f134246T0 = new ot21(3, new i941(this, 10));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX INFO: renamed from: a */
    public static final Object m59213a(lk41 lk41Var, u190 u190Var, d850 d850Var, ibk ibkVar) {
        jk41 jk41Var;
        boolean zBooleanValue;
        d850 d850Var2;
        Integer numValueOf = Integer.valueOf(R.string.video_playback_not_available);
        if (ibkVar instanceof jk41) {
            jk41Var = (jk41) ibkVar;
            int i = jk41Var.f113213e;
            if ((i & Integer.MIN_VALUE) != 0) {
                jk41Var.f113213e = i - Integer.MIN_VALUE;
            } else {
                jk41Var = new jk41(lk41Var, ibkVar);
            }
        } else {
            jk41Var = new jk41(lk41Var, ibkVar);
        }
        Object objM76493f = jk41Var.f113211c;
        int i2 = jk41Var.f113213e;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM76493f);
            rvw0 rvw0Var = lk41Var.f134242P0;
            String str = lk41Var.f134253d;
            jk41Var.f113209a = u190Var;
            jk41Var.f113210b = d850Var;
            jk41Var.f113213e = 1;
            objM76493f = rvw0Var.m76493f(str, jk41Var);
            if (objM76493f != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            d850Var = jk41Var.f113210b;
            u190Var = jk41Var.f113209a;
            bga.m29073P(objM76493f);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d850Var2 = jk41Var.f113210b;
            bga.m29073P(objM76493f);
        }
        zBooleanValue = ((Boolean) objM76493f).booleanValue();
        wek0.m87885d(lk41Var.f134258i, d850Var2.f46380a);
        return Boolean.valueOf(zBooleanValue);
        eob1 eob1Var = (eob1) objM76493f;
        if (wj50.m88271j(eob1Var, dob1.f51007c)) {
            jk41Var.f113209a = null;
            jk41Var.f113210b = d850Var;
            jk41Var.f113213e = 2;
            objM76493f = u190Var.m82200f(d850Var, jk41Var);
            if (objM76493f != yukVar) {
                d850Var2 = d850Var;
                zBooleanValue = ((Boolean) objM76493f).booleanValue();
                wek0.m87885d(lk41Var.f134258i, d850Var2.f46380a);
            }
            return yukVar;
        }
        if (wj50.m88271j(eob1Var, dob1.f51006b)) {
            q831 q831Var = lk41Var.f134255f;
            na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf);
            na6.m63963k(true, "Invalid resource ID provided: %s", null);
            q831Var.m72305j(new g631(null, "", numValueOf, null, null, null, null, null, false));
        } else if (!wj50.m88271j(eob1Var, dob1.f51005a)) {
            throw new NoWhenBranchMatchedException();
        }
        zBooleanValue = false;
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m59214b(lk41 lk41Var, fni0 fni0Var, ibk ibkVar) {
        kk41 kk41Var;
        if (ibkVar instanceof kk41) {
            kk41Var = (kk41) ibkVar;
            int i = kk41Var.f123511c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kk41Var.f123511c = i - Integer.MIN_VALUE;
            } else {
                kk41Var = new kk41(lk41Var, ibkVar);
            }
        } else {
            kk41Var = new kk41(lk41Var, ibkVar);
        }
        Object objM86757v = kk41Var.f123509a;
        int i2 = kk41Var.f123511c;
        if (i2 == 0) {
            bga.m29073P(objM86757v);
            ou8 ou8Var = fni0Var.f71303b;
            kk41Var.f123511c = 1;
            objM86757v = vyf1.m86757v(ou8Var, kk41Var);
            yuk yukVar = yuk.f276404a;
            if (objM86757v == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86757v);
        }
        Boolean bool = (Boolean) objM86757v;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }

    @Override // p204p.nm20
    /* JADX INFO: renamed from: c */
    public final el11 mo40516c() {
        return this.f134245S0;
    }

    @Override // p204p.nm20
    /* JADX INFO: renamed from: d */
    public final ot21 mo40517d() {
        return this.f134246T0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m59215e(ibk ibkVar) {
        dk41 dk41Var;
        if (ibkVar instanceof dk41) {
            dk41Var = (dk41) ibkVar;
            int i = dk41Var.f49879c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dk41Var.f49879c = i - Integer.MIN_VALUE;
            } else {
                dk41Var = new dk41(this, ibkVar);
            }
        } else {
            dk41Var = new dk41(this, ibkVar);
        }
        Object objM86755t = dk41Var.f49877a;
        int i2 = dk41Var.f49879c;
        boolean z = true;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            be11 be11Var = new be11(this.f134240N0, 22);
            dk41Var.f49879c = 1;
            objM86755t = vyf1.m86755t(be11Var, dk41Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        nt80 nt80Var = new nt80[]{mt80.f146986a}[0];
        Set set = (Set) objM86755t;
        if ((set instanceof Collection) && set.isEmpty()) {
            z = false;
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (((nt80) it.next()).getClass() == nt80Var.getClass()) {
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
