package p204p;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes10.dex */
public final class xo50 implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f263761a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pir0 f263762b;

    public /* synthetic */ xo50(pir0 pir0Var, int i) {
        this.f263761a = i;
        this.f263762b = pir0Var;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        switch (this.f263761a) {
            case 0:
                this.f263762b.setValue(Boolean.valueOf(z));
                break;
            default:
                this.f263762b.setValue(Boolean.valueOf(z));
                break;
        }
    }
}
