package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ru5 {

    /* JADX INFO: renamed from: a */
    public final String f202753a;

    /* JADX INFO: renamed from: b */
    public final String f202754b;

    public ru5(String str, String str2) {
        this.f202753a = str;
        this.f202754b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru5)) {
            return false;
        }
        ru5 ru5Var = (ru5) obj;
        return wj50.m88271j(this.f202753a, ru5Var.f202753a) && wj50.m88271j(this.f202754b, ru5Var.f202754b);
    }

    public final int hashCode() {
        return this.f202754b.hashCode() + (this.f202753a.hashCode() * 31);
    }
}
