package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class qw60 implements sw60 {

    /* JADX INFO: renamed from: a */
    public final boolean f193189a;

    public qw60(boolean z) {
        this.f193189a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qw60) && this.f193189a == ((qw60) obj).f193189a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f193189a);
    }
}
