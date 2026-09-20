package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class k731 implements s731 {

    /* JADX INFO: renamed from: a */
    public final String f119938a;

    /* JADX INFO: renamed from: b */
    public final i731 f119939b;

    public k731(String str, i731 i731Var) {
        this.f119938a = str;
        this.f119939b = i731Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k731)) {
            return false;
        }
        k731 k731Var = (k731) obj;
        return wj50.m88271j(this.f119938a, k731Var.f119938a) && wj50.m88271j(this.f119939b, k731Var.f119939b);
    }

    public final int hashCode() {
        return this.f119939b.hashCode() + (this.f119938a.hashCode() * 31);
    }
}
