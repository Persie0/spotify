package p204p;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes3.dex */
public final class igx extends viv0 {
    @Override // p204p.viv0
    /* JADX INFO: renamed from: H1 */
    public final qqi0 mo50569H1() {
        qqi0 qqi0Var = new qqi0(0, new Rect[16]);
        qqi0Var.m73557c(qqi0Var.f191610c, yjg1.m93925q(this).getSystemGestureExclusionRects());
        return qqi0Var;
    }

    @Override // p204p.viv0
    /* JADX INFO: renamed from: I1 */
    public final void mo50570I1(qqi0 qqi0Var) {
        yjg1.m93925q(this).setSystemGestureExclusionRects(qqi0Var.m73560f());
    }
}
