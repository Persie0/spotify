package p204p;

import android.graphics.drawable.LayerDrawable;

/* JADX INFO: loaded from: classes7.dex */
public final class nh10 extends LayerDrawable implements hny0 {
    @Override // p204p.hny0
    /* JADX INFO: renamed from: a */
    public final void mo32831a(float f, int i) {
        if (getDrawable(0) instanceof hny0) {
            ((hny0) getDrawable(0)).mo32831a(f, i);
        }
        if (getDrawable(1) instanceof hny0) {
            ((hny0) getDrawable(1)).mo32831a(f, i);
        }
    }
}
