package p204p;

import android.content.Context;
import android.hardware.display.DisplayManager;

/* JADX INFO: loaded from: classes.dex */
public final class i9s0 implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sir0 f100069a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f100070b;

    public i9s0(sir0 sir0Var, Context context) {
        this.f100069a = sir0Var;
        this.f100070b = context;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        k9s0.m55842i(this.f100069a, this.f100070b);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        k9s0.m55842i(this.f100069a, this.f100070b);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        k9s0.m55842i(this.f100069a, this.f100070b);
    }
}
