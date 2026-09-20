package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
public final class l7k implements j7k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ z9j0 f130666a;

    public l7k(z9j0 z9j0Var) {
        this.f130666a = z9j0Var;
    }

    @Override // p204p.j7k
    /* JADX INFO: renamed from: b */
    public final void mo52628b(String str, d850 d850Var, Bundle bundle) {
        z9j0 z9j0Var = this.f130666a;
        if (d850Var != null) {
            z9j0Var.mo47342b(str, d850Var, bundle);
        } else if (bundle != null) {
            z9j0Var.mo47347h(str, bundle);
        } else {
            z9j0Var.mo47346g(str);
        }
    }
}
