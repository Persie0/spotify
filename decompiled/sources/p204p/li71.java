package p204p;

import com.spotify.betamax.player.VideoSurfaceView;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class li71 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f133737a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rv41 f133738b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ li71(rv41 rv41Var, int i) {
        super(1);
        this.f133737a = i;
        this.f133738b = rv41Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f133737a) {
            case 0:
                ((fdx0) obj).m41380b(((Number) this.f133738b.getValue()).floatValue());
                return w2a1.f247311a;
            case 1:
                xth xthVar = (xth) obj;
                if (!(xthVar instanceof xth)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((gh00) this.f133738b.getValue()).invoke(new h8b1(xthVar.f265871a, xthVar.f265872b));
                return w2a1.f247311a;
            case 2:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) obj;
                lg21 lg21Var = (lg21) this.f133738b.getValue();
                if (lg21Var != null) {
                    lg21Var.m58931j(videoSurfaceView);
                }
                return w2a1.f247311a;
            case 3:
                ((fdx0) obj).m41380b(((Number) this.f133738b.getValue()).floatValue());
                return w2a1.f247311a;
            case 4:
                ((fdx0) obj).m41380b(((Number) this.f133738b.getValue()).floatValue());
                return w2a1.f247311a;
            case 5:
                ((fdx0) obj).m41380b(((Number) this.f133738b.getValue()).floatValue());
                return w2a1.f247311a;
            case 6:
                ((fdx0) obj).m41380b(((Number) this.f133738b.getValue()).floatValue());
                return w2a1.f247311a;
            default:
                ((fdx0) obj).m41396v(-((Number) this.f133738b.getValue()).floatValue());
                return w2a1.f247311a;
        }
    }
}
