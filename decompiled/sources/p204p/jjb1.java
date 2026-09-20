package p204p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: classes4.dex */
public final class jjb1 implements ewr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f112975a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pa9 f112976b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ VideoSurfaceView f112977c;

    public /* synthetic */ jjb1(pa9 pa9Var, VideoSurfaceView videoSurfaceView, int i) {
        this.f112975a = i;
        this.f112976b = pa9Var;
        this.f112977c = videoSurfaceView;
    }

    @Override // p204p.ewr
    public final void dispose() {
        switch (this.f112975a) {
            case 0:
                pa9 pa9Var = this.f112976b;
                pa9Var.m69441f();
                pa9Var.m69446k(this.f112977c);
                break;
            default:
                pa9 pa9Var2 = this.f112976b;
                pa9Var2.m69441f();
                pa9Var2.m69446k(this.f112977c);
                break;
        }
    }
}
