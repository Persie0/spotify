package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rsf0 implements ssf0 {

    /* JADX INFO: renamed from: a */
    public final String f202320a;

    public rsf0(String str) {
        this.f202320a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rsf0) && wj50.m88271j(this.f202320a, ((rsf0) obj).f202320a);
    }

    public final int hashCode() {
        return this.f202320a.hashCode();
    }
}
