package p204p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class or91 implements u9m0, tlm0, kx41 {

    /* JADX INFO: renamed from: a */
    public final ir91 f168513a;

    /* JADX INFO: renamed from: b */
    public hr91 f168514b;

    public or91(ir91 ir91Var) {
        this.f168513a = ir91Var;
    }

    @Override // p204p.tlm0
    /* JADX INFO: renamed from: b */
    public final boolean mo35686b(olm0 olm0Var) {
        hr91 hr91Var = this.f168514b;
        tlm0 tlm0Var = hr91Var instanceof tlm0 ? (tlm0) hr91Var : null;
        if (tlm0Var != null) {
            return tlm0Var.mo35686b(olm0Var);
        }
        return false;
    }

    @Override // p204p.u9m0
    /* JADX INFO: renamed from: c */
    public final void mo24481c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f168514b = this.f168513a.mo34693a(context, null, layoutInflater, viewGroup);
    }

    @Override // p204p.u9m0
    /* JADX INFO: renamed from: e */
    public final void mo59670e(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f168514b = this.f168513a.mo34693a(context, bundle, layoutInflater, viewGroup);
    }

    @Override // p204p.kx41
    /* JADX INFO: renamed from: f */
    public final Bundle mo57585f() {
        Bundle bundleSerialize;
        hr91 hr91Var = this.f168514b;
        return (hr91Var == null || (bundleSerialize = hr91Var.serialize()) == null) ? new Bundle() : bundleSerialize;
    }

    @Override // p204p.u9m0
    public final View getView() {
        hr91 hr91Var = this.f168514b;
        if (hr91Var != null) {
            return (View) hr91Var.getView();
        }
        return null;
    }

    @Override // p204p.u9m0
    public final void start() {
        hr91 hr91Var = this.f168514b;
        if (hr91Var != null) {
            hr91Var.start();
        }
    }

    @Override // p204p.u9m0
    public final void stop() {
        hr91 hr91Var = this.f168514b;
        if (hr91Var != null) {
            hr91Var.stop();
        }
    }

    @Override // p204p.kx41
    /* JADX INFO: renamed from: d */
    public final void mo57584d(Bundle bundle) {
    }
}
