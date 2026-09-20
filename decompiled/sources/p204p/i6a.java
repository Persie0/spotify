package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class i6a {

    /* JADX INFO: renamed from: a */
    public final String f99198a;

    public i6a(String str) {
        this.f99198a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i6a) && wj50.m88271j(this.f99198a, ((i6a) obj).f99198a);
    }

    public final int hashCode() {
        return this.f99198a.hashCode();
    }
}
