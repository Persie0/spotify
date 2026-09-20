package p204p;

import android.content.Context;
import androidx.compose.p002ui.geometry.Offset;
import com.spotify.betamax.player.VideoSurfaceView;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class vm01 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f242653a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eh00 f242654b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vm01(int i, eh00 eh00Var) {
        super(1);
        this.f242653a = i;
        this.f242654b = eh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f242653a) {
            case 0:
                long j = ((Offset) obj).f493a;
                this.f242654b.invoke();
                return w2a1.f247311a;
            case 1:
                long j2 = ((Offset) obj).f493a;
                this.f242654b.invoke();
                return w2a1.f247311a;
            case 2:
                long j3 = ((Offset) obj).f493a;
                this.f242654b.invoke();
                return w2a1.f247311a;
            case 3:
                this.f242654b.invoke();
                return w2a1.f247311a;
            case 4:
                this.f242654b.invoke();
                return w2a1.f247311a;
            case 5:
                long j4 = ((Offset) obj).f493a;
                this.f242654b.invoke();
                return w2a1.f247311a;
            case 6:
                ((Boolean) obj).booleanValue();
                this.f242654b.invoke();
                return w2a1.f247311a;
            case 7:
                long j5 = ((Offset) obj).f493a;
                this.f242654b.invoke();
                return w2a1.f247311a;
            case 8:
                this.f242654b.invoke();
                return w2a1.f247311a;
            case 9:
                long j6 = ((Offset) obj).f493a;
                this.f242654b.invoke();
                return w2a1.f247311a;
            case 10:
                if (z7b1.f280148a[((t5b1) obj).ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f242654b.invoke();
                return w2a1.f247311a;
            case 11:
                int iOrdinal = ((y3x) obj).ordinal();
                if (iOrdinal == 0) {
                    this.f242654b.invoke();
                } else if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                return w2a1.f247311a;
            case 12:
                this.f242654b.invoke();
                return w2a1.f247311a;
            case 13:
                this.f242654b.invoke();
                return w2a1.f247311a;
            case 14:
                kqy kqyVar = (kqy) obj;
                if ((kqyVar instanceof fqy) || (kqyVar instanceof iqy) || (kqyVar instanceof jqy)) {
                    this.f242654b.invoke();
                } else if (!(kqyVar instanceof gqy) && !(kqyVar instanceof hqy) && !(kqyVar instanceof dqy)) {
                    throw new NoWhenBranchMatchedException();
                }
                return w2a1.f247311a;
            case 15:
                ((Boolean) obj).booleanValue();
                this.f242654b.invoke();
                return w2a1.f247311a;
            case 16:
                ((Boolean) obj).booleanValue();
                this.f242654b.invoke();
                return w2a1.f247311a;
            case 17:
                ((Boolean) obj).booleanValue();
                this.f242654b.invoke();
                return w2a1.f247311a;
            case 18:
                ((Boolean) obj).booleanValue();
                this.f242654b.invoke();
                return w2a1.f247311a;
            case 19:
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView((Context) obj);
                videoSurfaceView.setBufferingThrobberEnabled(false);
                videoSurfaceView.setScaleType(mac1.ASPECT_FILL);
                videoSurfaceView.setVideoSurfaceCallback(new lmh0(new ljb1(11, this.f242654b)));
                return videoSurfaceView;
            case 20:
                ((Boolean) obj).booleanValue();
                this.f242654b.invoke();
                return w2a1.f247311a;
            case 21:
                this.f242654b.invoke();
                return w2a1.f247311a;
            default:
                this.f242654b.invoke();
                return w2a1.f247311a;
        }
    }
}
