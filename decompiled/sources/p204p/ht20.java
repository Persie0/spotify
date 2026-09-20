package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ht20 {

    /* JADX INFO: renamed from: a */
    public final String f94902a;

    /* JADX INFO: renamed from: b */
    public final boolean f94903b;

    public ht20(String str, boolean z) {
        this.f94902a = str;
        this.f94903b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht20)) {
            return false;
        }
        ht20 ht20Var = (ht20) obj;
        return wj50.m88271j(this.f94902a, ht20Var.f94902a) && this.f94903b == ht20Var.f94903b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f94903b) + (this.f94902a.hashCode() * 31);
    }
}
