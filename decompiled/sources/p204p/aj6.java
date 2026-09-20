package p204p;

import android.os.Bundle;
import androidx.recyclerview.widget.AbstractC0110a;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: classes5.dex */
public final class aj6 implements hr91 {

    /* JADX INFO: renamed from: a */
    public final sk6 f16176a;

    /* JADX INFO: renamed from: b */
    public final MobiusLoop.Controller f16177b;

    public aj6(sk6 sk6Var, MobiusLoop.Controller controller) {
        this.f16176a = sk6Var;
        this.f16177b = controller;
    }

    @Override // p204p.hr91
    public final Object getView() {
        return this.f16176a.f210039g;
    }

    @Override // p204p.hr91
    public final Bundle serialize() {
        sk6 sk6Var = this.f16176a;
        sk6Var.getClass();
        Bundle bundle = new Bundle();
        AbstractC0110a layoutManager = sk6Var.f210041i.getLayoutManager();
        bundle.putParcelable("RECYCLER_VIEW_SAVED_STATE", layoutManager != null ? layoutManager.mo963y0() : null);
        return bundle;
    }

    @Override // p204p.hr91
    public final void start() {
        sk6 sk6Var = this.f16176a;
        MobiusLoop.Controller controller = this.f16177b;
        controller.mo15604c(sk6Var);
        controller.start();
    }

    @Override // p204p.hr91
    public final void stop() {
        MobiusLoop.Controller controller = this.f16177b;
        controller.stop();
        controller.disconnect();
    }
}
