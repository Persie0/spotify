package p204p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class brb extends lkv0 {

    /* JADX INFO: renamed from: S0 */
    public final Observable f30043S0;

    /* JADX INFO: renamed from: T0 */
    public final emm f30044T0;

    /* JADX INFO: renamed from: U0 */
    public final Single f30045U0;

    /* JADX INFO: renamed from: V0 */
    public final l89 f30046V0;

    /* JADX INFO: renamed from: W0 */
    public final e940 f30047W0;

    /* JADX INFO: renamed from: X0 */
    public final fmu0 f30048X0;

    /* JADX INFO: renamed from: Y0 */
    public final lwr f30049Y0;

    /* JADX INFO: renamed from: Z0 */
    public final ViewGroup f30050Z0;

    /* JADX INFO: renamed from: a1 */
    public final ImageView f30051a1;

    /* JADX INFO: renamed from: b1 */
    public final VideoSurfaceView f30052b1;

    /* JADX INFO: renamed from: c1 */
    public final ImageView f30053c1;

    /* JADX INFO: renamed from: d1 */
    public final List f30054d1;

    /* JADX INFO: renamed from: e1 */
    public pa9 f30055e1;

    /* JADX INFO: renamed from: f1 */
    public x02 f30056f1;

    /* JADX WARN: Illegal instructions before constructor call */
    public brb(Observable observable, emm emmVar, Single single, l89 l89Var, e940 e940Var, fmu0 fmu0Var, hc80 hc80Var, ViewGroup viewGroup) {
        View viewM59289E = lkv0.m59289E(R.layout.ads_mode_carousel_canvas_ad, viewGroup);
        super(viewM59289E);
        this.f30043S0 = observable;
        this.f30044T0 = emmVar;
        this.f30045U0 = single;
        this.f30046V0 = l89Var;
        this.f30047W0 = e940Var;
        this.f30048X0 = fmu0Var;
        this.f30049Y0 = new lwr();
        this.f30050Z0 = srz.m79152j(viewGroup);
        this.f30051a1 = (ImageView) mec1.m61562n(viewM59289E, R.id.image_surface);
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) mec1.m61562n(viewM59289E, R.id.video_surface);
        this.f30052b1 = videoSurfaceView;
        this.f30053c1 = (ImageView) mec1.m61562n(viewM59289E, R.id.fallback_cover_art_image);
        videoSurfaceView.setScaleType(mac1.ASPECT_FILL);
        this.f30054d1 = Collections.singletonList(new yqb(this));
        hc80Var.getLifecycle().mo31986a(new ne2(this, 1));
    }

    /* JADX INFO: renamed from: I */
    public static final void m30292I(brb brbVar, x02 x02Var) {
        brbVar.f30056f1 = x02Var;
        VideoSurfaceView videoSurfaceView = brbVar.f30052b1;
        videoSurfaceView.setVisibility(8);
        ImageView imageView = brbVar.f30051a1;
        imageView.setVisibility(8);
        brbVar.f30053c1.setVisibility(8);
        AbstractC1861fi abstractC1861fi = x02Var.f256763Z;
        if (!(abstractC1861fi instanceof idl)) {
            if (!(abstractC1861fi instanceof hdl)) {
                brbVar.m30294K(abstractC1861fi.f69733a);
                return;
            }
            String str = ((hdl) abstractC1861fi).f90159c;
            tug1.m81576n(imageView);
            brbVar.f30047W0.mo24613j(str).m60185k(imageView, null);
            return;
        }
        idl idlVar = (idl) abstractC1861fi;
        tug1.m81576n(videoSurfaceView);
        pa9 pa9Var = brbVar.f30055e1;
        if (pa9Var != null) {
            pa9Var.m69439d(videoSurfaceView);
            noo0 noo0Var = new noo0(0L, 0L, true, false, null, null, false, 243);
            String str2 = idlVar.f101150c;
            pa9Var.m69451q(true);
            pa9Var.m69443h(new l1p0(str2, 14, null), noo0Var);
        }
    }

    /* JADX INFO: renamed from: J */
    public static final arb m30293J(brb brbVar) {
        return new arb(brbVar, 0);
    }

    @Override // p204p.lkv0
    /* JADX INFO: renamed from: D */
    public final void mo27077D(int i, Object obj) {
        this.f30049Y0.m60127a(this.f30043S0.firstOrError().subscribe(new zqb(this, 0)));
    }

    @Override // p204p.lkv0
    /* JADX INFO: renamed from: F */
    public final void mo27078F() {
        pa9 pa9Var = this.f30055e1;
        VideoSurfaceView videoSurfaceView = this.f30052b1;
        if (pa9Var != null) {
            pa9Var.m69439d(videoSurfaceView);
        }
        tug1.m81576n(videoSurfaceView);
        pa9 pa9Var2 = this.f30055e1;
        if (pa9Var2 != null) {
            pa9Var2.m69447l();
        }
    }

    @Override // p204p.lkv0
    /* JADX INFO: renamed from: G */
    public final void mo27079G() {
        pa9 pa9Var = this.f30055e1;
        if (pa9Var != null) {
            pa9Var.m69441f();
        }
        VideoSurfaceView videoSurfaceView = this.f30052b1;
        videoSurfaceView.setVisibility(8);
        this.f30051a1.setVisibility(8);
        this.f30053c1.setVisibility(8);
        pa9 pa9Var2 = this.f30055e1;
        if (pa9Var2 != null) {
            pa9Var2.m69446k(videoSurfaceView);
        }
    }

    @Override // p204p.lkv0
    /* JADX INFO: renamed from: H */
    public final void mo27080H() {
        pa9 pa9Var = this.f30055e1;
        if (pa9Var != null) {
            pa9Var.m69455u();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m30294K(String str) {
        ImageView imageView = this.f30053c1;
        tug1.m81576n(imageView);
        ViewGroup viewGroup = this.f30050Z0;
        srz.m79151i(mec1.m61562n(viewGroup, R.id.carousel_item_safe_barrier_top), mec1.m61562n(viewGroup, R.id.carousel_item_safe_barrier_bottom), imageView, this.f30048X0.getValue() instanceof ko6);
        srz.m79163u(imageView, str, this.f30047W0);
    }
}
