package p204p;

import androidx.credentials.exceptions.CreateCredentialException;

/* JADX INFO: loaded from: classes8.dex */
public final class fal implements hal {

    /* JADX INFO: renamed from: a */
    public final CreateCredentialException f67577a;

    public fal(CreateCredentialException createCredentialException) {
        this.f67577a = createCredentialException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fal) && wj50.m88271j(this.f67577a, ((fal) obj).f67577a);
    }

    public final int hashCode() {
        return this.f67577a.hashCode();
    }
}
