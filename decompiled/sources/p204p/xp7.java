package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class xp7 {

    /* JADX INFO: renamed from: a */
    public final vq7 f264520a;

    /* JADX INFO: renamed from: b */
    public final String f264521b;

    public xp7(String str, vq7 vq7Var) {
        this.f264520a = vq7Var;
        this.f264521b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp7)) {
            return false;
        }
        xp7 xp7Var = (xp7) obj;
        return wj50.m88271j(this.f264520a, xp7Var.f264520a) && wj50.m88271j(this.f264521b, xp7Var.f264521b);
    }

    public final int hashCode() {
        return this.f264521b.hashCode() + (this.f264520a.hashCode() * 31);
    }
}
