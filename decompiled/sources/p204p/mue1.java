package p204p;

import android.content.Context;
import com.spotify.music.R;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class mue1 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final Context f147322a;

    /* JADX INFO: renamed from: b */
    public final hkh f147323b;

    /* JADX INFO: renamed from: c */
    public final due1 f147324c;

    /* JADX INFO: renamed from: d */
    public final twz0 f147325d;

    /* JADX INFO: renamed from: e */
    public final d501 f147326e;

    /* JADX INFO: renamed from: f */
    public final jco f147327f;

    /* JADX INFO: renamed from: g */
    public final kco f147328g;

    /* JADX INFO: renamed from: h */
    public final lco f147329h;

    /* JADX INFO: renamed from: i */
    public final w0e1 f147330i;

    /* JADX INFO: renamed from: j */
    public final z9j0 f147331j;

    /* JADX INFO: renamed from: k */
    public final pue1 f147332k;

    /* JADX INFO: renamed from: l */
    public final ajq0 f147333l;

    /* JADX INFO: renamed from: m */
    public final tun f147334m;

    /* JADX INFO: renamed from: n */
    public final vun f147335n;

    /* JADX INFO: renamed from: o */
    public final pfm0 f147336o;

    public mue1(Context context, hkh hkhVar, due1 due1Var, twz0 twz0Var, d501 d501Var, jco jcoVar, kco kcoVar, lco lcoVar, w0e1 w0e1Var, z9j0 z9j0Var, pue1 pue1Var, ajq0 ajq0Var, tun tunVar, vun vunVar) {
        this.f147322a = context;
        this.f147323b = hkhVar;
        this.f147324c = due1Var;
        this.f147325d = twz0Var;
        this.f147326e = d501Var;
        this.f147327f = jcoVar;
        this.f147328g = kcoVar;
        this.f147329h = lcoVar;
        this.f147330i = w0e1Var;
        this.f147331j = z9j0Var;
        this.f147332k = pue1Var;
        this.f147333l = ajq0Var;
        this.f147334m = tunVar;
        this.f147335n = vunVar;
        e6m0 e6m0Var = new e6m0(true);
        sw91 sw91Var = new sw91(14, ajq0Var.f16338b.m43664q(), false, false);
        pw71 pw71Var = new pw71(new p1x0(R.string.yourpremium_title));
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f147336o = new pfm0(new qfm0[]{e6m0Var, sw91Var, pw71Var, new q040(xgg1.m90827k6(), xoc1.f264012W1, null), new maa0()}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f147336o;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        boolean zM43643F = this.f147333l.f16338b.m43643F();
        hkh hkhVar = this.f147323b;
        fbk fbkVar = null;
        if (!zM43643F) {
            return hkhVar.m47840a(tky.m81027c(new v4a0[]{new v4a0()}, new fue1(this, fbkVar, 0)), rkk.m75763o(new hue1(this, 0), true, -857446279), new u5a0(new iue1(this), zme1.f284263e, new coc1()), new hlh(null, null, null, false, 63));
        }
        return hkhVar.m47840a(tky.m81027c(new v4a0[]{new v4a0()}, new fue1(this, fbkVar, 1)), rkk.m75763o(new hue1(this, 1), true, 932061481), new u5a0(lue1.f137075a, zme1.f284264f, bxq0.f31956Y0), new hlh(null, null, null, false, 63));
    }
}
