package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class tpm0 {

    /* JADX INFO: renamed from: a */
    public final boolean f222566a;

    public tpm0(boolean z) {
        this.f222566a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tpm0) && this.f222566a == ((tpm0) obj).f222566a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + s571.m77245d(Boolean.hashCode(true) * 31, 31, this.f222566a);
    }
}
