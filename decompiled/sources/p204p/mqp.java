package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public final class mqp extends C2647ze {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f146330d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f146331e;

    public /* synthetic */ mqp(String str, int i) {
        this.f146330d = i;
        this.f146331e = str;
    }

    @Override // p204p.C2647ze
    /* JADX INFO: renamed from: d */
    public final void mo1668d(View view, C2374sf c2374sf) {
        switch (this.f146330d) {
            case 0:
                this.f281839a.onInitializeAccessibilityNodeInfo(view, c2374sf.f208417a);
                c2374sf.m77978m(this.f146331e);
                break;
            default:
                this.f281839a.onInitializeAccessibilityNodeInfo(view, c2374sf.f208417a);
                c2374sf.m77968b(new C2212of(16, this.f146331e));
                break;
        }
    }
}
