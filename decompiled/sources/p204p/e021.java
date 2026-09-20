package p204p;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes8.dex */
public final class e021 extends f021 {

    /* JADX INFO: renamed from: a */
    public final GoogleSignInAccount f54833a;

    public e021(GoogleSignInAccount googleSignInAccount) {
        this.f54833a = googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e021) && wj50.m88271j(this.f54833a, ((e021) obj).f54833a);
    }

    public final int hashCode() {
        return this.f54833a.hashCode();
    }
}
