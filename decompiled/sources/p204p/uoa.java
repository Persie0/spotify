package p204p;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.browsita.p033v1.resolved.ResolvedBrowse;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.TimeZone;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes.dex */
public final class uoa implements boa, rdc1, nuf1 {

    /* JADX INFO: renamed from: a */
    public Object f232361a;

    /* JADX INFO: renamed from: b */
    public Object f232362b;

    /* JADX INFO: renamed from: c */
    public Object f232363c;

    /* JADX INFO: renamed from: d */
    public Object f232364d;

    /* JADX INFO: renamed from: e */
    public Object f232365e;

    /* JADX INFO: renamed from: f */
    public final Object f232366f;

    public /* synthetic */ uoa(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.f232361a = obj;
        this.f232362b = obj2;
        this.f232363c = obj3;
        this.f232364d = obj4;
        this.f232365e = obj5;
        this.f232366f = obj6;
    }

    /* JADX INFO: renamed from: b */
    public static final dmc0 m83601b(uoa uoaVar, tl11 tl11Var) {
        ArrayList<d0w> arrayListM46400k = h15.m46400k(tl11Var.getItems());
        ArrayList arrayList = new ArrayList(i6f.m49804T(arrayListM46400k, 10));
        for (d0w d0wVar : arrayListM46400k) {
            arrayList.add(new alc0(d0wVar.m34568g(), d0wVar.m34566e(), d0wVar.m34567f(), d0wVar.m34564c(), d0wVar.m34571j(), d0wVar.m34570i(), d0wVar.m34569h()));
        }
        return new dmc0(tl11Var.m81030b().f261993a, arrayList);
    }

    /* JADX INFO: renamed from: f */
    public static uoa m83602f(View view) {
        int i = R.id.empty_view;
        View viewM85629k = vie1.m85629k(view, R.id.empty_view);
        if (viewM85629k != null) {
            i = R.id.header;
            View viewM85629k2 = vie1.m85629k(view, R.id.header);
            if (viewM85629k2 != null) {
                i = R.id.header_shadow;
                View viewM85629k3 = vie1.m85629k(view, R.id.header_shadow);
                if (viewM85629k3 != null) {
                    i = R.id.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) vie1.m85629k(view, R.id.recycler_view);
                    if (recyclerView != null) {
                        i = R.id.touch_overlay;
                        View viewM85629k4 = vie1.m85629k(view, R.id.touch_overlay);
                        if (viewM85629k4 != null) {
                            return new uoa((ConstraintLayout) view, viewM85629k, viewM85629k2, viewM85629k3, recyclerView, viewM85629k4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p204p.nuf1
    /* JADX INFO: renamed from: a */
    public aog1 mo30254a(String str, String str2, aef1 aef1Var, long j) {
        return new aog1(66, new ib9(this, str, str2, aef1Var, j, null), null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // p204p.boa
    /* JADX INFO: renamed from: c */
    public Object mo30074c(laa0 laa0Var, boolean z, fbk fbkVar) {
        toa toaVar;
        xre xreVar = (xre) this.f232364d;
        f44 f44Var = (f44) this.f232365e;
        if (fbkVar instanceof toa) {
            toaVar = (toa) fbkVar;
            int i = toaVar.f222209c;
            if ((i & Integer.MIN_VALUE) != 0) {
                toaVar.f222209c = i - Integer.MIN_VALUE;
            } else {
                toaVar = new toa(this, (ibk) fbkVar);
            }
        } else {
            toaVar = new toa(this, (ibk) fbkVar);
        }
        toa toaVar2 = toaVar;
        Object objM78643a = toaVar2.f222207a;
        int i2 = toaVar2.f222209c;
        if (i2 == 0) {
            bga.m29073P(objM78643a);
            soa soaVar = (soa) this.f232361a;
            String strM76804r = rzg1.m76804r(laa0Var);
            Boolean boolM74178H = qyg1.m74178H(e0b1.m37490b((Context) this.f232366f));
            if (!f44Var.m40712h()) {
                boolM74178H = null;
            }
            String id = TimeZone.getDefault().getID();
            Boolean boolM74178H2 = z ? qyg1.m74178H(true) : null;
            toaVar2.f222209c = 1;
            objM78643a = soaVar.m78643a(strM76804r, boolM74178H, id, boolM74178H2, toaVar2);
            yuk yukVar = yuk.f276404a;
            if (objM78643a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM78643a);
        }
        o2x0 o2x0Var = (o2x0) objM78643a;
        ResolvedBrowse resolvedBrowse = (ResolvedBrowse) o2x0Var.f161172b;
        if (resolvedBrowse == null) {
            throw new HttpException(o2x0Var);
        }
        String str = rzg1.m76805s(o2x0Var, xreVar) ? "cache" : "remote";
        ((y6m0) this.f232363c).mo32278c(new z6m0("data_source", str));
        return rzw0.m76836a(resolvedBrowse, ((rmx) this.f232362b).m75983b(), str, f44Var.m40706b());
    }

    @Override // p204p.nuf1
    /* JADX INFO: renamed from: d */
    public cog1 mo30257d(String str, String str2) {
        return new cog1(new z8a1(this, str, str2, (fbk) null, 10));
    }

    @Override // p204p.nuf1
    /* JADX INFO: renamed from: e */
    public aog1 mo30258e(long j, gef1 gef1Var) {
        return new aog1(65, new C2004j6(this, j, gef1Var, (fbk) null, 23), null);
    }

    /* JADX INFO: renamed from: g */
    public hvu0 m83603g() {
        Context context = (Context) this.f232366f;
        sb40 sb40Var = (sb40) this.f232361a;
        g5y g5yVar = (g5y) this.f232365e;
        g5yVar.getClass();
        sb40 sb40VarM77707a = sb40.m77707a(sb40Var, new h5y(q0f1.m71826S(g5yVar.f76784a)), 8191);
        wg61 wg61Var = new wg61(new w73(19));
        wg61 wg61Var2 = (wg61) this.f232362b;
        if (wg61Var2 == null) {
            wg61Var2 = new wg61(new mo4(this, 28));
        }
        wg61 wg61Var3 = (wg61) this.f232363c;
        if (wg61Var3 == null) {
            wg61Var3 = new wg61(new w73(20));
        }
        cxf cxfVar = (cxf) this.f232364d;
        if (cxfVar == null) {
            lau lauVar = lau.f131415a;
            cxfVar = new cxf(lauVar, lauVar, lauVar, lauVar, lauVar);
        }
        return new hvu0(new fvu0(context, sb40VarM77707a, wg61Var, wg61Var2, wg61Var3, cxfVar));
    }

    @Override // p204p.rdc1
    public View getRoot() {
        return (ConstraintLayout) this.f232361a;
    }

    /* JADX INFO: renamed from: h */
    public s6z0 m83604h(uno0 uno0Var, dut dutVar) {
        pqm0 pqm0VarM96807p;
        int i = ((kfx) this.f232365e).f122237b;
        String strMo45279b = uno0Var.mo45279b();
        if (strMo45279b == null) {
            strMo45279b = "";
        }
        ro80 ro80VarM44508o = geg1.m44508o();
        un20 un20VarMo45281d = uno0Var.mo45281d();
        if (un20VarMo45281d != null && (pqm0VarM96807p = ((zs0) this.f232364d).m96807p(un20VarMo45281d)) != null) {
            ro80VarM44508o.add(ndg1.m64220q((dut) pqm0VarM96807p.f180350a, pqm0VarM96807p.f180351b, i));
        }
        ro80VarM44508o.add(ndg1.m64220q(dutVar, uno0Var.mo45278a(), i));
        return new s6z0(strMo45279b, geg1.m44506m(ro80VarM44508o), new k1l0(uno0Var, 28));
    }

    /* JADX INFO: renamed from: i */
    public ecm m83605i(xv41 xv41Var) {
        return glf1.m45136f(w9h1.m87517y(vvx.m86519t((t6z0) this.f232363c, new m5l0(26, this, ((tmo0) this.f232361a).mo27525a(new smo0(((kfx) this.f232365e).f122237b), xv41Var))), null, null, 3), new ono0(this, 0));
    }

    /* JADX INFO: renamed from: j */
    public fcm m83606j(pgo pgoVar) {
        dmk dmkVarMo30896a = ((ino0) this.f232362b).mo30896a(pgoVar, hno0.m48013a(), new smo0(((kfx) this.f232365e).f122237b));
        return glf1.m45137g(opo.m67550G(new lno0((t6z0) this.f232363c, dmkVarMo30896a, new m5l0(27, this, d3h1.m34841e(dmkVarMo30896a))), null, null, 3), new jfo0(this, 8));
    }

    public uoa(kkc1 kkc1Var, sef0 sef0Var, f7d1 f7d1Var, okj0 okj0Var, c03 c03Var) {
        this.f232361a = kkc1Var;
        this.f232362b = sef0Var;
        this.f232363c = f7d1Var;
        this.f232366f = okj0Var;
        this.f232364d = c03Var;
    }

    public uoa(bqe1 bqe1Var, uo80 uo80Var, pqg1 pqg1Var, y0i0 y0i0Var, okj0 okj0Var) {
        this.f232361a = bqe1Var;
        this.f232362b = uo80Var;
        this.f232363c = pqg1Var;
        this.f232364d = y0i0Var;
        this.f232366f = okj0Var;
        this.f232365e = msi0.m62770a();
    }

    public uoa(yl11 yl11Var, fm11 fm11Var, vl11 vl11Var, h15 h15Var, t46 t46Var, bq11 bq11Var, t5p t5pVar, smc0 smc0Var) {
        this.f232361a = yl11Var;
        this.f232362b = fm11Var;
        this.f232363c = vl11Var;
        this.f232364d = bq11Var;
        this.f232365e = t5pVar;
        this.f232366f = smc0Var;
    }

    public uoa() {
        this.f232363c = jag1.m52819d(Boolean.FALSE);
        this.f232364d = zix0.f283296i;
        this.f232366f = new f8w0(this, 20);
    }

    public uoa(tmo0 tmo0Var, ino0 ino0Var, t6z0 t6z0Var, zs0 zs0Var, kfx kfxVar) {
        this.f232361a = tmo0Var;
        this.f232362b = ino0Var;
        this.f232363c = t6z0Var;
        this.f232364d = zs0Var;
        this.f232365e = kfxVar;
        rmo0.f200594i0.getClass();
        this.f232366f = qmo0.f190364b;
    }

    public uoa(Context context) {
        this.f232366f = context.getApplicationContext();
        this.f232361a = sb40.f207334o;
        this.f232362b = null;
        this.f232363c = null;
        this.f232364d = null;
        this.f232365e = new g5y();
    }

    public uoa(ycm0 ycm0Var) {
        this.f232361a = ycm0.m93352a(ycm0Var);
        this.f232362b = ycm0.m93353b(ycm0Var);
        this.f232363c = ycm0.m93354c(ycm0Var);
        this.f232364d = ycm0.m93355d(ycm0Var);
        this.f232365e = ycm0.m93356e(ycm0Var);
        this.f232366f = ycm0.m93357f(ycm0Var);
    }
}
