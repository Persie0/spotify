package p204p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class f5a0 implements i7o0 {

    /* JADX INFO: renamed from: a */
    public final qe70 f65999a;

    /* JADX WARN: Multi-variable type inference failed */
    public f5a0(gh00 gh00Var) {
        this.f65999a = (qe70) gh00Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.eh00, p.qe70] */
    @Override // p204p.i7o0
    /* JADX INFO: renamed from: a */
    public h7o0 mo40751a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        r6o0 r6o0Var = (r6o0) this.f65999a.invoke();
        r6o0Var.mo24481c(context, layoutInflater, viewGroup);
        if (bundle != null) {
            kx41 kx41Var = r6o0Var instanceof kx41 ? (kx41) r6o0Var : null;
            if (kx41Var != null) {
                kx41Var.mo57584d(bundle);
            }
        }
        return new e5a0(r6o0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f5a0(eh00 eh00Var) {
        this.f65999a = (qe70) eh00Var;
    }
}
