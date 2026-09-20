package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class u781 implements z781 {

    /* JADX INFO: renamed from: a */
    public final int f227532a;

    /* JADX INFO: renamed from: b */
    public final String f227533b;

    public u781(int i, String str) {
        this.f227532a = i;
        this.f227533b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u781)) {
            return false;
        }
        u781 u781Var = (u781) obj;
        return this.f227532a == u781Var.f227532a && wj50.m88271j(this.f227533b, u781Var.f227533b);
    }

    public final int hashCode() {
        return this.f227533b.hashCode() + (Integer.hashCode(this.f227532a) * 31);
    }
}
