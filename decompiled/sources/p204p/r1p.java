package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class r1p implements s1p {

    /* JADX INFO: renamed from: a */
    public final String f194891a;

    public r1p(String str) {
        this.f194891a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m74485a() {
        return this.f194891a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1p) && wj50.m88271j(this.f194891a, ((r1p) obj).f194891a);
    }

    public final int hashCode() {
        return this.f194891a.hashCode();
    }
}
