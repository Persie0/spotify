package p204p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.MobiusAndroid;

/* JADX INFO: loaded from: classes10.dex */
public final class lph0 implements u9m0, tlm0, kx41 {

    /* JADX INFO: renamed from: a */
    public final ixi f135770a;

    /* JADX INFO: renamed from: b */
    public final u5a0 f135771b;

    /* JADX INFO: renamed from: c */
    public final Object f135772c;

    /* JADX INFO: renamed from: d */
    public final z5a0 f135773d;

    /* JADX INFO: renamed from: e */
    public final or91 f135774e = new or91(new ilh(this, 4));

    /* JADX INFO: renamed from: f */
    public Bundle f135775f;

    /* JADX INFO: renamed from: g */
    public MobiusLoop.Controller f135776g;

    public lph0(ixi ixiVar, u5a0 u5a0Var, Object obj, z5a0 z5a0Var) {
        this.f135770a = ixiVar;
        this.f135771b = u5a0Var;
        this.f135772c = obj;
        this.f135773d = z5a0Var;
    }

    @Override // p204p.tlm0
    /* JADX INFO: renamed from: b */
    public final boolean mo35686b(olm0 olm0Var) {
        return this.f135774e.mo35686b(olm0Var);
    }

    @Override // p204p.u9m0
    /* JADX INFO: renamed from: c */
    public final void mo24481c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f135774e.mo24481c(context, layoutInflater, viewGroup);
    }

    @Override // p204p.kx41
    /* JADX INFO: renamed from: d */
    public final void mo57584d(Bundle bundle) {
        this.f135775f = bundle.getBundle("mobius-model");
        if (bundle.getBundle("delegate-state") != null) {
            this.f135774e.getClass();
        }
    }

    @Override // p204p.u9m0
    /* JADX INFO: renamed from: e */
    public final void mo59670e(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f135774e.mo59670e(context, bundle, layoutInflater, viewGroup);
    }

    @Override // p204p.kx41
    /* JADX INFO: renamed from: f */
    public final Bundle mo57585f() {
        Bundle bundle = new Bundle();
        bundle.putBundle("delegate-state", this.f135774e.mo57585f());
        MobiusLoop.Controller controller = this.f135776g;
        Object objMo15602a = controller != null ? controller.mo15602a() : null;
        gh00 gh00Var = this.f135771b.f226963d;
        if (objMo15602a != null && gh00Var != null) {
            bundle.putBundle("mobius-model", (Bundle) gh00Var.invoke(objMo15602a));
        }
        return bundle;
    }

    @Override // p204p.u9m0
    public final View getView() {
        return this.f135774e.getView();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [p.qe70, p.th00] */
    @Override // p204p.u9m0
    public final void start() {
        or91 or91Var = this.f135774e;
        or91Var.start();
        hr91 hr91Var = or91Var.f168514b;
        hxi hxiVar = hr91Var instanceof hxi ? (hxi) hr91Var : null;
        if (hxiVar != null) {
            u5a0 u5a0Var = this.f135771b;
            ?? r2 = u5a0Var.f226960a;
            z5a0 z5a0Var = this.f135773d;
            Object obj = this.f135772c;
            MobiusLoop.Controller controllerM15618b = MobiusAndroid.m15618b((MobiusLoop.Factory) r2.invoke(obj, z5a0Var), u5a0Var.f226961b.invoke(obj, this.f135775f), u5a0Var.f226962c);
            controllerM15618b.mo15604c(hxiVar);
            controllerM15618b.start();
            this.f135776g = controllerM15618b;
        }
    }

    @Override // p204p.u9m0
    public final void stop() {
        MobiusLoop.Controller controller;
        or91 or91Var = this.f135774e;
        hr91 hr91Var = or91Var.f168514b;
        if ((hr91Var instanceof hxi ? (hxi) hr91Var : null) != null && (controller = this.f135776g) != null) {
            controller.stop();
            controller.disconnect();
        }
        or91Var.stop();
    }
}
