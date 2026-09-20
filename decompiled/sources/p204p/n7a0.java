package p204p;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class n7a0 implements dqk0 {

    /* JADX INFO: renamed from: a */
    public final jgc1 f151121a;

    /* JADX INFO: renamed from: b */
    public boolean f151122b = false;

    public n7a0(l5f1 l5f1Var, jgc1 jgc1Var) {
        this.f151121a = jgc1Var;
    }

    @Override // p204p.dqk0
    /* JADX INFO: renamed from: b */
    public final void mo31453b(Object obj) {
        SignInHubActivity signInHubActivity = (SignInHubActivity) this.f151121a.f112156b;
        signInHubActivity.setResult(signInHubActivity.f1758a1, signInHubActivity.f1759b1);
        signInHubActivity.finish();
        this.f151122b = true;
    }

    public final String toString() {
        return this.f151121a.toString();
    }
}
