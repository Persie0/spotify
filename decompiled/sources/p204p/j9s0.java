package p204p;

import android.companion.virtual.VirtualDeviceManager$VirtualDeviceListener;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class j9s0 implements VirtualDeviceManager$VirtualDeviceListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sir0 f110243a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f110244b;

    public j9s0(sir0 sir0Var, Context context) {
        this.f110243a = sir0Var;
        this.f110244b = context;
    }

    public final void onVirtualDeviceClosed(int i) {
        k9s0.m55842i(this.f110243a, this.f110244b);
    }

    public final void onVirtualDeviceCreated(int i) {
        k9s0.m55842i(this.f110243a, this.f110244b);
    }
}
