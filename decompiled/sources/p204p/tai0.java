package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public final class tai0 extends n040 {

    /* JADX INFO: renamed from: t1 */
    public final iac1 f218617t1;

    /* JADX INFO: renamed from: u1 */
    public String f218618u1;

    public tai0(Context context, iac1 iac1Var) {
        super(context);
        this.f218617t1 = iac1Var;
        setPlayablePredicate(new esa0(this, 13));
    }

    @Override // p204p.n040
    public String getIdentifier() {
        return this.f218618u1;
    }

    @Override // com.spotify.betamax.player.VideoSurfaceView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f218617t1.m50050b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f218617t1.m50055g(this);
    }

    @Override // p204p.n040
    public void setIdentifier(String str) {
        this.f218618u1 = str;
        lac1 lac1Var = this.listener;
        if (lac1Var != null) {
            ((rg41) lac1Var).m75467n(this);
        }
    }
}
