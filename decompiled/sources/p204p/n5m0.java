package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
public final class n5m0 implements vh50 {

    /* JADX INFO: renamed from: a */
    public final k5m0 f150584a;

    public n5m0(k5m0 k5m0Var) {
        this.f150584a = k5m0Var;
    }

    @Override // p204p.vh50
    /* JADX INFO: renamed from: a */
    public final void mo42972a(String str, String str2, String str3) {
        mo42973c(pp91.m70528i(), str, str2, str3);
    }

    @Override // p204p.vh50
    /* JADX INFO: renamed from: c */
    public final void mo42973c(Bundle bundle, String str, String str2, String str3) {
        bundle.putString("result-receiver-id", str);
        this.f150584a.mo55543b(str2, str3, bundle);
    }

    @Override // p204p.vh50
    public final void pop() {
        this.f150584a.mo55548j();
    }
}
