package p204p;

import com.ravelin.core.model.RavelinError;

/* JADX INFO: loaded from: classes9.dex */
public final class hau0 extends lau0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mab0 f89282a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f89283b;

    public hau0(mab0 mab0Var, String str) {
        this.f89282a = mab0Var;
        this.f89283b = str;
    }

    @Override // p204p.lau0
    /* JADX INFO: renamed from: a */
    public final void mo46940a(RavelinError ravelinError) {
        ((guf) this.f89282a.f141550b).m45754w0(new IllegalStateException(edb.m38564m("Ravelin trackFingerprint failed: ", ravelinError.getMessage())));
    }

    @Override // p204p.lau0
    /* JADX INFO: renamed from: b */
    public final void mo46941b() {
        ((guf) this.f89282a.f141550b).m38797k0(this.f89283b);
    }
}
