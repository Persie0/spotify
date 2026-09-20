package p204p;

import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final class gi10 extends View implements fh10, InterfaceC2333rc {
    @Override // p204p.fh10
    public int getTotalScrollRange() {
        return 0;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, 1073741824));
    }

    @Override // p204p.fh10
    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // p204p.InterfaceC2333rc
    public void setCoordinatorAccessoryOffset(int i) {
    }

    @Override // p204p.hny0
    /* JADX INFO: renamed from: a */
    public final void mo32831a(float f, int i) {
    }
}
