package p204p;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: p.cg */
/* JADX INFO: loaded from: classes5.dex */
public final class AccessibilityManagerAccessibilityStateChangeListenerC1740cg implements AccessibilityManager.AccessibilityStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sir0 f37490a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2014jg f37491b;

    public AccessibilityManagerAccessibilityStateChangeListenerC1740cg(sir0 sir0Var, C2014jg c2014jg) {
        this.f37490a = sir0Var;
        this.f37491b = c2014jg;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.f37490a.mo30231j(Boolean.valueOf(C2014jg.m53246a(this.f37491b)));
    }
}
