package p204p;

import androidx.credentials.exceptions.GetCredentialException;

/* JADX INFO: loaded from: classes8.dex */
public final class kuw0 implements puw0 {

    /* JADX INFO: renamed from: a */
    public final GetCredentialException f126726a;

    public kuw0(GetCredentialException getCredentialException) {
        this.f126726a = getCredentialException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kuw0) && wj50.m88271j(this.f126726a, ((kuw0) obj).f126726a);
    }

    public final int hashCode() {
        return this.f126726a.hashCode();
    }
}
