package p204p;

import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p002ui.platform.ComposeView;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class xn2 implements r7k0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f263488a;

    /* JADX INFO: renamed from: b */
    public di41 f263489b;

    /* JADX INFO: renamed from: c */
    public final Object f263490c;

    /* JADX INFO: renamed from: d */
    public final Object f263491d;

    /* JADX INFO: renamed from: e */
    public final Object f263492e;

    /* JADX INFO: renamed from: f */
    public final Object f263493f;

    /* JADX INFO: renamed from: g */
    public Object f263494g;

    /* JADX INFO: renamed from: h */
    public final Object f263495h;

    public xn2(r55 r55Var, er70 er70Var, er70 er70Var2, er70 er70Var3) {
        this.f263488a = 0;
        this.f263490c = r55Var;
        this.f263491d = er70Var;
        this.f263492e = er70Var2;
        this.f263493f = er70Var3;
        this.f263495h = new wg61(new un2(this, 2));
    }

    /* JADX INFO: renamed from: a */
    public static final void m91486a(xn2 xn2Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2;
        xq00Var.m91775k0(-734139282);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(xn2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            xq00Var2 = xq00Var;
            mif1.m61869b((cxc) ((wg61) xn2Var.f263495h).getValue(), new axc((uyc) sam.m77671j(((ck2) ((aj2) ((er70) xn2Var.f263491d).get())).f38778q, xq00Var, 0).getValue(), zsf1.m96848h(leu.m58816b(xq00Var).f117230b.f224761d, 0.0f, 2), true), null, null, xq00Var2, 0, 12);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new a60(xn2Var, i, 8);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m91487b(xn2 xn2Var, fyf fyfVar, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-142295447);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(fyfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(xn2Var) ? 32 : 16;
        }
        int i3 = 0;
        int i4 = 1;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            wy41 wy41Var = pda0.f176396a;
            boolean zM91770i = xq00Var.m91770i(xn2Var);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new un2(xn2Var, i3);
                xq00Var.m91793t0(objM91750T);
            }
            qqg1.m73532b(pda0.m69677c((eh00) objM91750T, xq00Var), rkk.m75772x(-1028574423, new vn2(fyfVar, i4), xq00Var), xq00Var, 56);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C2314qu(xn2Var, fyfVar, i, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static final Object m91488e(xn2 xn2Var, PlayerState playerState, ibk ibkVar) {
        ezb1 ezb1Var;
        if (ibkVar instanceof ezb1) {
            ezb1Var = (ezb1) ibkVar;
            int i = ezb1Var.f64330c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ezb1Var.f64330c = i - Integer.MIN_VALUE;
            } else {
                ezb1Var = new ezb1(xn2Var, ibkVar);
            }
        } else {
            ezb1Var = new ezb1(xn2Var, ibkVar);
        }
        Object obj = ezb1Var.f64328a;
        int i2 = ezb1Var.f64330c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                Completable completableM91490g = xn2Var.m91490g(playerState);
                ezb1Var.f64330c = 1;
                Object objM96565n = zn91.m96565n(completableM91490g, ezb1Var);
                yuk yukVar = yuk.f276404a;
                if (objM96565n == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3967c(e2, "Failed to prefetch video manifest", new Object[0]);
        }
        return w2a1.f247311a;
    }

    @Override // p204p.r7k0
    /* JADX INFO: renamed from: c */
    public final void mo30305c() {
        switch (this.f263488a) {
            case 0:
                this.f263489b = x0h1.m89578u(n5h1.m63737m((r55) this.f263490c), null, 0, new C1819em(this, null, 20), 3);
                break;
            default:
                di41 di41Var = this.f263489b;
                fbk fbkVar = null;
                if (di41Var != null) {
                    di41Var.mo26601e(null);
                }
                this.f263489b = x0h1.m89578u((c9k) this.f263495h, null, 0, new pwb1(this, fbkVar, 3), 3);
                break;
        }
    }

    @Override // p204p.r7k0
    /* JADX INFO: renamed from: d */
    public final void mo30306d() {
        switch (this.f263488a) {
            case 0:
                di41 di41Var = this.f263489b;
                if (di41Var != null) {
                    di41Var.mo26601e(null);
                }
                this.f263489b = null;
                m91489f();
                break;
            default:
                if (!((vb4) this.f263490c).m85110e()) {
                    kk40.m56680v((c9k) this.f263495h, null);
                } else {
                    di41 di41Var2 = this.f263489b;
                    if (di41Var2 != null) {
                        di41Var2.mo26601e(null);
                    }
                    this.f263489b = null;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m91489f() {
        ((ck2) ((aj2) ((er70) this.f263491d).get())).m33057N(false);
        ComposeView composeView = (ComposeView) this.f263494g;
        if (composeView == null) {
            return;
        }
        ViewParent parent = composeView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(composeView);
        }
        this.f263494g = null;
    }

    /* JADX INFO: renamed from: g */
    public Completable m91490g(PlayerState playerState) {
        tkd0 tkd0Var = (tkd0) this.f263491d;
        ContextTrack contextTrack = (ContextTrack) playerState.track().mo49283h();
        String str = contextTrack != null ? (String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_ASSOCIATED_VIDEO_MANIFEST_ID) : null;
        if (str == null) {
            str = "";
        }
        return tkd0Var.m81002a("npv-manifests", new ek00(new fr50[]{new oq50(str, null, null)}));
    }

    public xn2(Flowable flowable, nh61 nh61Var, ulp ulpVar, qwx0 qwx0Var, vb4 vb4Var, tkd0 tkd0Var, luk lukVar) {
        this.f263488a = 1;
        this.f263490c = vb4Var;
        this.f263491d = tkd0Var;
        d0k[] d0kVarArr = bmu0.f28619a;
        onc oncVar = new onc(flowable);
        this.f263492e = oncVar;
        fbk fbkVar = null;
        this.f263493f = g0g1.m43302g(oncVar, xtm0.m92074U(oncVar, new zf01(fbkVar, nh61Var, 24)), mvl0.m62953p(new in21(k0e1.m54985d(((rwx0) qwx0Var).f203428a), 12)), new f1i(this, fbkVar, 2));
        this.f263494g = k0e1.m54985d(ulpVar.f231606e);
        this.f263495h = kk40.m56661c(opo.m67570t(lukVar, njg1.m64613f()).mo26608y(new g12(efy.f59152X0, 17)));
    }
}
