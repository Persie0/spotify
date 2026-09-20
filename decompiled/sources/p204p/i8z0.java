package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class i8z0 {

    /* JADX INFO: renamed from: a */
    public final String f99876a;

    public i8z0(String str) {
        this.f99876a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i8z0) && wj50.m88271j(this.f99876a, ((i8z0) obj).f99876a);
    }

    public final int hashCode() {
        return this.f99876a.hashCode();
    }
}
