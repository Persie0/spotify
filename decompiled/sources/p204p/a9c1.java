package p204p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: classes5.dex */
public final class a9c1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13540a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ra9 f13541b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f13542c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ lqi0 f13543d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a9c1(ra9 ra9Var, kqi0 kqi0Var, lqi0 lqi0Var, int i) {
        super(1);
        this.f13540a = i;
        this.f13541b = ra9Var;
        this.f13542c = kqi0Var;
        this.f13543d = lqi0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f13540a) {
            case 0:
                tqg1.m81322j((VideoSurfaceView) obj, this.f13541b);
                this.f13542c.setValue(null);
                ((zv41) this.f13543d).m97090l(null);
                break;
            default:
                tqg1.m81322j((VideoSurfaceView) obj, this.f13541b);
                this.f13542c.setValue(null);
                ((zv41) this.f13543d).m97090l(null);
                break;
        }
        return w2a1.f247311a;
    }
}
