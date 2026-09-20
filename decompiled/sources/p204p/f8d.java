package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class f8d implements kad {

    /* JADX INFO: renamed from: a */
    public final String f66956a;

    public f8d(String str) {
        this.f66956a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f8d) && wj50.m88271j(this.f66956a, ((f8d) obj).f66956a);
    }

    public final int hashCode() {
        return this.f66956a.hashCode();
    }
}
