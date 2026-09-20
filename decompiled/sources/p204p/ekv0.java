package p204p;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ekv0 extends C2647ze {

    /* JADX INFO: renamed from: d */
    public final fkv0 f60542d;

    /* JADX INFO: renamed from: e */
    public final WeakHashMap f60543e = new WeakHashMap();

    public ekv0(fkv0 fkv0Var) {
        this.f60542d = fkv0Var;
    }

    @Override // p204p.C2647ze
    /* JADX INFO: renamed from: a */
    public final boolean mo39305a(View view, AccessibilityEvent accessibilityEvent) {
        C2647ze c2647ze = (C2647ze) this.f60543e.get(view);
        return c2647ze != null ? c2647ze.mo39305a(view, accessibilityEvent) : this.f281839a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p204p.C2647ze
    /* JADX INFO: renamed from: b */
    public final s5f1 mo39306b(View view) {
        C2647ze c2647ze = (C2647ze) this.f60543e.get(view);
        return c2647ze != null ? c2647ze.mo39306b(view) : super.mo39306b(view);
    }

    @Override // p204p.C2647ze
    /* JADX INFO: renamed from: c */
    public final void mo39307c(View view, AccessibilityEvent accessibilityEvent) {
        C2647ze c2647ze = (C2647ze) this.f60543e.get(view);
        if (c2647ze != null) {
            c2647ze.mo39307c(view, accessibilityEvent);
        } else {
            super.mo39307c(view, accessibilityEvent);
        }
    }

    @Override // p204p.C2647ze
    /* JADX INFO: renamed from: d */
    public void mo1668d(View view, C2374sf c2374sf) {
        AccessibilityNodeInfo accessibilityNodeInfo = c2374sf.f208417a;
        fkv0 fkv0Var = this.f60542d;
        RecyclerView recyclerView = fkv0Var.f70627d;
        RecyclerView recyclerView2 = fkv0Var.f70627d;
        boolean zM1000Y = recyclerView.m1000Y();
        View.AccessibilityDelegate accessibilityDelegate = this.f281839a;
        if (zM1000Y || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().m1116m0(view, c2374sf);
        C2647ze c2647ze = (C2647ze) this.f60543e.get(view);
        if (c2647ze != null) {
            c2647ze.mo1668d(view, c2374sf);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // p204p.C2647ze
    /* JADX INFO: renamed from: e */
    public final void mo39308e(View view, AccessibilityEvent accessibilityEvent) {
        C2647ze c2647ze = (C2647ze) this.f60543e.get(view);
        if (c2647ze != null) {
            c2647ze.mo39308e(view, accessibilityEvent);
        } else {
            super.mo39308e(view, accessibilityEvent);
        }
    }

    @Override // p204p.C2647ze
    /* JADX INFO: renamed from: f */
    public final boolean mo39309f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C2647ze c2647ze = (C2647ze) this.f60543e.get(viewGroup);
        return c2647ze != null ? c2647ze.mo39309f(viewGroup, view, accessibilityEvent) : this.f281839a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // p204p.C2647ze
    /* JADX INFO: renamed from: g */
    public final boolean mo39310g(View view, int i, Bundle bundle) {
        fkv0 fkv0Var = this.f60542d;
        RecyclerView recyclerView = fkv0Var.f70627d;
        RecyclerView recyclerView2 = fkv0Var.f70627d;
        if (recyclerView.m1000Y() || recyclerView2.getLayoutManager() == null) {
            return super.mo39310g(view, i, bundle);
        }
        C2647ze c2647ze = (C2647ze) this.f60543e.get(view);
        if (c2647ze != null) {
            if (c2647ze.mo39310g(view, i, bundle)) {
                return true;
            }
        } else if (super.mo39310g(view, i, bundle)) {
            return true;
        }
        vjv0 vjv0Var = recyclerView2.getLayoutManager().f1294b.f1233c;
        return false;
    }

    @Override // p204p.C2647ze
    /* JADX INFO: renamed from: h */
    public final void mo39311h(View view, int i) {
        C2647ze c2647ze = (C2647ze) this.f60543e.get(view);
        if (c2647ze != null) {
            c2647ze.mo39311h(view, i);
        } else {
            super.mo39311h(view, i);
        }
    }

    @Override // p204p.C2647ze
    /* JADX INFO: renamed from: i */
    public final void mo39312i(View view, AccessibilityEvent accessibilityEvent) {
        C2647ze c2647ze = (C2647ze) this.f60543e.get(view);
        if (c2647ze != null) {
            c2647ze.mo39312i(view, accessibilityEvent);
        } else {
            super.mo39312i(view, accessibilityEvent);
        }
    }

    /* JADX INFO: renamed from: j */
    public final C2647ze m39313j(View view) {
        return (C2647ze) this.f60543e.remove(view);
    }

    /* JADX INFO: renamed from: k */
    public final void m39314k(View view) {
        C2647ze c2647ze;
        View.AccessibilityDelegate accessibilityDelegateM61553e = mec1.m61553e(view);
        if (accessibilityDelegateM61553e == null) {
            c2647ze = null;
        } else {
            c2647ze = accessibilityDelegateM61553e instanceof C2610ye ? ((C2610ye) accessibilityDelegateM61553e).f271884a : new C2647ze(accessibilityDelegateM61553e);
        }
        if (c2647ze == null || c2647ze == this) {
            return;
        }
        this.f60543e.put(view, c2647ze);
    }
}
