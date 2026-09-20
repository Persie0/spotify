package p204p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class pr91 implements r6o0, tlm0, kx41 {

    /* JADX INFO: renamed from: a */
    public final i7o0 f180535a;

    /* JADX INFO: renamed from: b */
    public h7o0 f180536b;

    public pr91(i7o0 i7o0Var) {
        this.f180535a = i7o0Var;
    }

    @Override // p204p.r6o0
    /* JADX INFO: renamed from: a */
    public final void mo29574a(boolean z) {
        h7o0 h7o0Var = this.f180536b;
        if (h7o0Var != null) {
            h7o0Var.mo37808a(z);
        }
    }

    @Override // p204p.tlm0
    /* JADX INFO: renamed from: b */
    public final boolean mo35686b(olm0 olm0Var) {
        h7o0 h7o0Var = this.f180536b;
        tlm0 tlm0Var = h7o0Var instanceof tlm0 ? (tlm0) h7o0Var : null;
        if (tlm0Var != null) {
            return tlm0Var.mo35686b(olm0Var);
        }
        return false;
    }

    @Override // p204p.u9m0
    /* JADX INFO: renamed from: c */
    public final void mo24481c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f180536b = this.f180535a.mo40751a(context, null, layoutInflater, viewGroup);
    }

    @Override // p204p.u9m0
    /* JADX INFO: renamed from: e */
    public final void mo59670e(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f180536b = this.f180535a.mo40751a(context, bundle, layoutInflater, viewGroup);
    }

    @Override // p204p.kx41
    /* JADX INFO: renamed from: f */
    public final Bundle mo57585f() {
        Bundle bundleSerialize;
        h7o0 h7o0Var = this.f180536b;
        return (h7o0Var == null || (bundleSerialize = h7o0Var.serialize()) == null) ? new Bundle() : bundleSerialize;
    }

    @Override // p204p.u9m0
    public final View getView() {
        h7o0 h7o0Var = this.f180536b;
        if (h7o0Var != null) {
            return (View) h7o0Var.getView();
        }
        return null;
    }

    @Override // p204p.u9m0
    public final void start() {
        h7o0 h7o0Var = this.f180536b;
        if (h7o0Var != null) {
            h7o0Var.start();
        }
    }

    @Override // p204p.u9m0
    public final void stop() {
        h7o0 h7o0Var = this.f180536b;
        if (h7o0Var != null) {
            h7o0Var.stop();
        }
    }

    @Override // p204p.kx41
    /* JADX INFO: renamed from: d */
    public final void mo57584d(Bundle bundle) {
    }
}
