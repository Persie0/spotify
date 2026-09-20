package p204p;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: loaded from: classes3.dex */
public final class adr0 implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ edr0 f14670a;

    public adr0(edr0 edr0Var) {
        this.f14670a = edr0Var;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        edr0 edr0Var = this.f14670a;
        Display display = edr0Var.getDisplay();
        if (display == null || display.getDisplayId() != i) {
            return;
        }
        edr0Var.m38620a();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
