package p204p;

import androidx.compose.foundation.gestures.FlingCancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class wr3 implements nly0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f254249a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f254250b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f254251c;

    public /* synthetic */ wr3(int i, Object obj, Object obj2) {
        this.f254249a = i;
        this.f254250b = obj;
        this.f254251c = obj2;
    }

    @Override // p204p.nly0
    /* JADX INFO: renamed from: f */
    public final float mo42170f(float f) {
        switch (this.f254249a) {
            case 0:
                yr3 yr3Var = (yr3) this.f254250b;
                float fM73666e = yr3Var.f275374h1.m73666e(f);
                float fM84031v = fM73666e - yr3Var.f275374h1.f191972j.m84031v();
                ((ms3) this.f254251c).m62695a(fM73666e, 0.0f);
                return fM84031v;
            default:
                nny0 nny0Var = (nny0) this.f254250b;
                if (Math.abs(f) == 0.0f || ((Boolean) nny0Var.f156526h.invoke()).booleanValue()) {
                    return nny0Var.m65222d(nny0Var.m65225g(((mny0) this.f254251c).m62372a(2, nny0Var.m65223e(nny0Var.m65226h(f)))));
                }
                throw new FlingCancellationException();
        }
    }
}
