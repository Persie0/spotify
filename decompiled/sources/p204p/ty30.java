package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class ty30 extends C2647ze {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f224814d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f224815e;

    public ty30(View view, int i) {
        this.f224814d = view;
        this.f224815e = i;
    }

    @Override // p204p.C2647ze
    /* JADX INFO: renamed from: d */
    public final void mo1668d(View view, C2374sf c2374sf) {
        this.f281839a.onInitializeAccessibilityNodeInfo(view, c2374sf.f208417a);
        c2374sf.m77968b(new C2212of(16, this.f224814d.getContext().getString(this.f224815e)));
        c2374sf.m77978m("android.widget.Button");
    }
}
