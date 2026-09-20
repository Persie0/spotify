package p204p;

import androidx.credentials.exceptions.CreateCredentialException;

/* JADX INFO: loaded from: classes8.dex */
public final class t7y0 implements w7y0 {

    /* JADX INFO: renamed from: a */
    public final CreateCredentialException f217930a;

    public t7y0(CreateCredentialException createCredentialException) {
        this.f217930a = createCredentialException;
    }

    /* JADX INFO: renamed from: a */
    public final CreateCredentialException m80252a() {
        return this.f217930a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t7y0) && wj50.m88271j(this.f217930a, ((t7y0) obj).f217930a);
    }

    public final int hashCode() {
        return this.f217930a.hashCode();
    }
}
