package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class mxk implements w5j0 {

    /* JADX INFO: renamed from: a */
    public final z9j0 f148066a;

    public /* synthetic */ mxk(z9j0 z9j0Var) {
        this.f148066a = z9j0Var;
    }

    @Override // p204p.w5j0
    /* JADX INFO: renamed from: b */
    public void mo24744b(String str, d850 d850Var, Bundle bundle) {
        z9j0 z9j0Var = this.f148066a;
        if (d850Var != null) {
            z9j0Var.mo47342b(str, d850Var, bundle);
        } else if (bundle != null) {
            z9j0Var.mo47347h(str, bundle);
        } else {
            z9j0Var.mo47346g(str);
        }
    }

    @Override // p204p.w5j0
    /* JADX INFO: renamed from: d */
    public void mo24745d(String str) {
        this.f148066a.mo47345e();
    }
}
