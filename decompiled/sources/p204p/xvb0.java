package p204p;

import android.R;
import android.animation.ObjectAnimator;
import androidx.constraintlayout.widget.Barrier;

/* JADX INFO: loaded from: classes8.dex */
public final class xvb0 {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ qr60[] f266342i = {new spi0(xvb0.class, "bottomGradientBarrierMargin", "getBottomGradientBarrierMargin()I", 0), new spi0(xvb0.class, "isScrolledToBottom", "isScrolledToBottom()Z", 0), new spi0(xvb0.class, "pageSurroundingsProperty", "getPageSurroundingsProperty()Lcom/spotify/mainlayout/pageproperties/PageSurroundings;", 0)};

    /* JADX INFO: renamed from: a */
    public final Barrier f266343a;

    /* JADX INFO: renamed from: b */
    public final long f266344b;

    /* JADX INFO: renamed from: c */
    public ObjectAnimator f266345c;

    /* JADX INFO: renamed from: d */
    public final int f266346d;

    /* JADX INFO: renamed from: e */
    public final int f266347e;

    /* JADX INFO: renamed from: f */
    public final wvb0 f266348f;

    /* JADX INFO: renamed from: g */
    public final wvb0 f266349g;

    /* JADX INFO: renamed from: h */
    public final wvb0 f266350h;

    public xvb0(Barrier barrier, boolean z) {
        this.f266343a = barrier;
        this.f266344b = barrier.getResources().getInteger(R.integer.config_shortAnimTime);
        int margin = barrier.getMargin();
        this.f266346d = margin;
        this.f266347e = z ? 0 : -barrier.getResources().getDimensionPixelSize(com.spotify.music.R.dimen.main_layout_bottom_gradient_collapsed_height);
        this.f266348f = new wvb0(Integer.valueOf(margin), this);
        this.f266349g = new wvb0(this, 1);
        this.f266350h = new wvb0(this, 2);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX INFO: renamed from: a */
    public final void m92232a() {
        int i;
        qr60[] qr60VarArr = f266342i;
        qr60 qr60Var = qr60VarArr[1];
        if (((Boolean) this.f266349g.f61172a).booleanValue()) {
            i = this.f266347e;
        } else {
            qr60 qr60Var2 = qr60VarArr[2];
            tkm0 tkm0Var = (tkm0) this.f266350h.f61172a;
            if ((tkm0Var != null ? tkm0Var.f221185b : 0) == 2) {
                i = this.f266347e;
            } else {
                i = this.f266346d;
            }
        }
        this.f266348f.m39516c(qr60VarArr[0], this, Integer.valueOf(i));
    }
}
