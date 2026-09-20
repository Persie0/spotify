package p204p;

import android.text.SegmentFinder;

/* JADX INFO: loaded from: classes3.dex */
public final class c45 extends SegmentFinder {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ uj81 f33846a;

    public c45(uj81 uj81Var) {
        this.f33846a = uj81Var;
    }

    public final int nextEndBoundary(int i) {
        return this.f33846a.mo30542e(i);
    }

    public final int nextStartBoundary(int i) {
        return this.f33846a.mo30540b(i);
    }

    public final int previousEndBoundary(int i) {
        return this.f33846a.mo30543h(i);
    }

    public final int previousStartBoundary(int i) {
        return this.f33846a.mo30541d(i);
    }
}
