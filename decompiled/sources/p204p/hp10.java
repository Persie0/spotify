package p204p;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class hp10 implements d7x0 {

    /* JADX INFO: renamed from: a */
    public final Status f93675a;

    /* JADX INFO: renamed from: b */
    public final GoogleSignInAccount f93676b;

    public hp10(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f93676b = googleSignInAccount;
        this.f93675a = status;
    }

    @Override // p204p.d7x0
    public final Status getStatus() {
        return this.f93675a;
    }
}
