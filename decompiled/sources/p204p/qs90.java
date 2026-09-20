package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class qs90 {

    /* JADX INFO: renamed from: a */
    public final String f192045a;

    /* JADX INFO: renamed from: b */
    public final String f192046b;

    public qs90(String str, String str2) {
        this.f192045a = str;
        this.f192046b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs90)) {
            return false;
        }
        qs90 qs90Var = (qs90) obj;
        return wj50.m88271j(this.f192045a, qs90Var.f192045a) && wj50.m88271j(this.f192046b, qs90Var.f192046b);
    }

    public final int hashCode() {
        return this.f192046b.hashCode() + (this.f192045a.hashCode() * 31);
    }
}
