package p204p;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.AbstractC0110a;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class fkv0 extends C2647ze {

    /* JADX INFO: renamed from: d */
    public final RecyclerView f70627d;

    /* JADX INFO: renamed from: e */
    public final ekv0 f70628e;

    public fkv0(RecyclerView recyclerView) {
        this.f70627d = recyclerView;
        C2647ze c2647zeMo40436j = mo40436j();
        if (c2647zeMo40436j != null) {
            this.f70628e = (ekv0) c2647zeMo40436j;
        } else {
            this.f70628e = new ekv0(this);
        }
    }

    @Override // p204p.C2647ze
    /* JADX INFO: renamed from: c */
    public final void mo39307c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo39307c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f70627d.m1000Y()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo944k0(accessibilityEvent);
        }
    }

    @Override // p204p.C2647ze
    /* JADX INFO: renamed from: d */
    public void mo1668d(View view, C2374sf c2374sf) {
        this.f281839a.onInitializeAccessibilityNodeInfo(view, c2374sf.f208417a);
        RecyclerView recyclerView = this.f70627d;
        if (recyclerView.m1000Y() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC0110a layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f1294b;
        layoutManager.mo905l0(recyclerView2.f1233c, recyclerView2.f1194F1, c2374sf);
    }

    @Override // p204p.C2647ze
    /* JADX INFO: renamed from: g */
    public final boolean mo39310g(View view, int i, Bundle bundle) {
        if (super.mo39310g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f70627d;
        if (recyclerView.m1000Y() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        AbstractC0110a layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f1294b;
        return layoutManager.mo1088A0(recyclerView2.f1233c, recyclerView2.f1194F1, i, bundle);
    }

    /* JADX INFO: renamed from: j */
    public C2647ze mo40436j() {
        return this.f70628e;
    }
}
