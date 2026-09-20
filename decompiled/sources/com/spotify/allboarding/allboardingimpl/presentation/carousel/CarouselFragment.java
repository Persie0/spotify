package com.spotify.allboarding.allboardingimpl.presentation.carousel;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.platform.ComposeView;
import com.spotify.music.R;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p204p.b250;
import p204p.bbm0;
import p204p.cbm0;
import p204p.d6c;
import p204p.d9c;
import p204p.e7i0;
import p204p.e940;
import p204p.fau;
import p204p.fh61;
import p204p.fiy0;
import p204p.fr70;
import p204p.fub;
import p204p.i500;
import p204p.i600;
import p204p.i9c;
import p204p.jj3;
import p204p.joc1;
import p204p.jx1;
import p204p.kc3;
import p204p.kv91;
import p204p.ky51;
import p204p.l7i0;
import p204p.lbf;
import p204p.lq91;
import p204p.lt91;
import p204p.lx9;
import p204p.oiy0;
import p204p.q3d0;
import p204p.qic1;
import p204p.qpv0;
import p204p.r250;
import p204p.r6c;
import p204p.rfg1;
import p204p.s6c;
import p204p.s7i0;
import p204p.s9p0;
import p204p.thm0;
import p204p.toc1;
import p204p.voc1;
import p204p.wj50;
import p204p.wqs;
import p204p.x150;
import p204p.x8y0;
import p204p.xgg1;
import p204p.yj3;
import p204p.yo3;
import p204p.yva;
import p204p.zam0;
import p204p.zc3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/allboarding/allboardingimpl/presentation/carousel/CarouselFragment;", "Lp/i500;", "Lp/bbm0;", "Lp/toc1;", "Lp/i600;", "injector", "<init>", "(Lp/i600;)V", "src_main_java_com_spotify_allboarding_allboardingimpl-allboardingimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CarouselFragment extends i500 implements bbm0, toc1 {

    /* JADX INFO: renamed from: A1 */
    public final i600 f2780A1;

    /* JADX INFO: renamed from: B1 */
    public e940 f2781B1;

    /* JADX INFO: renamed from: C1 */
    public zc3 f2782C1;

    /* JADX INFO: renamed from: D1 */
    public l7i0 f2783D1;

    /* JADX INFO: renamed from: E1 */
    public i9c f2784E1;

    /* JADX INFO: renamed from: F1 */
    public boolean f2785F1;

    /* JADX INFO: renamed from: G1 */
    public kv91 f2786G1;

    /* JADX INFO: renamed from: H1 */
    public lt91 f2787H1;

    /* JADX INFO: renamed from: I1 */
    public thm0 f2788I1;

    /* JADX INFO: renamed from: J1 */
    public final qic1 f2789J1;

    /* JADX INFO: renamed from: K1 */
    public ComposeView f2790K1;

    /* JADX INFO: renamed from: L1 */
    public s7i0 f2791L1;

    /* JADX INFO: renamed from: M1 */
    public s9p0 f2792M1;

    /* JADX INFO: renamed from: N1 */
    public final voc1 f2793N1;

    public CarouselFragment(i600 i600Var) {
        this.f2780A1 = i600Var;
        r6c r6cVar = new r6c(this, 4);
        fr70 fr70VarM72078I = q3d0.m72078I(3, new fub(new r6c(this, 3), 2));
        this.f2789J1 = new qic1(qpv0.f191387a.mo54112b(d9c.class), new jx1(fr70VarM72078I, 2), r6cVar, new jx1(fr70VarM72078I, 3));
        this.f2793N1 = yj3.CAROUSEL.f273280b;
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: E0 */
    public final void mo875E0(Context context) {
        this.f2780A1.mo24367f(this);
        super.mo875E0(context);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: F0 */
    public final void mo876F0(Bundle bundle) {
        super.mo876F0(bundle);
        l7i0 l7i0Var = this.f2783D1;
        if (l7i0Var == null) {
            wj50.m88260d0("multiPlayerFactory");
            throw null;
        }
        s7i0 s7i0VarM61064a = l7i0Var.m58415a(new yo3(0)).m61064a(new e7i0(null, yva.f276606X), 5);
        this.f2791L1 = s7i0VarM61064a;
        this.f2792M1 = s7i0VarM61064a.mo43757c(false);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: G0 */
    public final View mo877G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        b250 b250Var;
        s7i0 s7i0Var;
        super.mo877G0(layoutInflater, viewGroup, bundle);
        if (bundle == null) {
            zc3 zc3Var = this.f2782C1;
            if (zc3Var == null) {
                wj50.m88260d0("screenProvider");
                throw null;
            }
            oiy0 oiy0Var = zc3Var.f281446a;
            if (oiy0Var instanceof fiy0) {
                m3096h1().m15621f(new d6c((fiy0) oiy0Var));
            }
        }
        s9p0 s9p0Var = this.f2792M1;
        if (s9p0Var != null && (s7i0Var = this.f2791L1) != null) {
            s7i0Var.mo32673a(s9p0Var);
        }
        fh61 fh61Var = new fh61(0, 0, 2, ky51.f127669X0);
        wqs.m88787a(m49699V0(), fh61Var, fh61Var);
        ComposeView composeView = new ComposeView(m49702X0(), null, 0, 6, null);
        this.f2790K1 = composeView;
        if (this.f2785F1) {
            x150 x150Var = new x150(new r6c(this, 0));
            kv91 kv91Var = this.f2786G1;
            if (kv91Var == null) {
                wj50.m88260d0("ubiLogger");
                throw null;
            }
            lt91 lt91Var = this.f2787H1;
            if (lt91Var == null) {
                wj50.m88260d0("ubiDwellTimeLogger");
                throw null;
            }
            r250 r250Var = new r250(new lq91(lt91Var, null, kv91Var));
            b250 lbfVar = fau.f67640b;
            if (x150Var.equals(lbfVar) && r250Var.equals(lbfVar)) {
                b250Var = lbfVar;
            } else if (x150Var.equals(lbfVar)) {
                b250Var = r250Var;
            } else if (!r250Var.equals(lbfVar)) {
                b250Var = x150Var;
                lbfVar = new lbf(x150Var, r250Var);
                b250Var = lbfVar;
            }
            b250Var = x150Var;
            joc1.m53876c(composeView, b250Var);
        }
        m49699V0().mo31751N().m28385a(m49724w0(), new lx9(this, 3));
        ComposeView composeView2 = this.f2790K1;
        if (composeView2 != null) {
            return composeView2;
        }
        wj50.m88260d0("composeView");
        throw null;
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: H0 */
    public final void mo3093H0() {
        this.f98702f1 = true;
        this.f2791L1 = null;
        this.f2792M1 = null;
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: I0 */
    public final void mo878I0() {
        this.f98702f1 = true;
        s7i0 s7i0Var = this.f2791L1;
        if (s7i0Var != null) {
            s7i0Var.mo43758d();
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: M0 */
    public final void mo3094M0() {
        s7i0 s7i0Var;
        this.f98702f1 = true;
        d9c d9cVarM3096h1 = m3096h1();
        d9cVarM3096h1.f46784g.m90234d(d9cVarM3096h1.m15622g(), "VIEW_STATE");
        s9p0 s9p0Var = this.f2792M1;
        if (s9p0Var == null || (s7i0Var = this.f2791L1) == null) {
            return;
        }
        s7i0Var.mo32674b(s9p0Var);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: N0 */
    public final void mo3095N0() {
        s7i0 s7i0Var;
        this.f98702f1 = true;
        s9p0 s9p0Var = this.f2792M1;
        if (s9p0Var == null || (s7i0Var = this.f2791L1) == null) {
            return;
        }
        s7i0Var.mo32673a(s9p0Var);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: R0 */
    public final void mo881R0(View view, Bundle bundle) {
        m3096h1().f5623c.mo15616c(this, new jj3(this, 2));
        m3096h1().f5622b.m33099f(m49724w0(), new s6c(this, 0));
        ((x8y0) rfg1.m75453w(this).m84255h(R.id.carousel).f234932X.getValue()).m90233c("skipDialogResult").m33099f(this, new s6c(this, 1));
    }

    @Override // p204p.toc1
    /* JADX INFO: renamed from: a, reason: from getter */
    public final voc1 getF225715T1() {
        return this.f2793N1;
    }

    @Override // p204p.bbm0
    /* JADX INFO: renamed from: c */
    public final zam0 mo3039c() {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        return xgg1.m90662N1("ALLBOARDING_CAROUSEL", "allboarding/carousel", 143, kc3.f121351b);
    }

    /* JADX INFO: renamed from: h1 */
    public final d9c m3096h1() {
        return (d9c) this.f2789J1.getValue();
    }
}
