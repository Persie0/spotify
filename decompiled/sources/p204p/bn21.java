package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bn21 {

    /* JADX INFO: renamed from: a */
    public final String f28682a;

    /* JADX INFO: renamed from: b */
    public final int f28683b;

    /* JADX INFO: renamed from: c */
    public final int f28684c;

    public bn21(String str, int i, int i2) {
        this.f28682a = str;
        this.f28683b = i;
        this.f28684c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn21)) {
            return false;
        }
        bn21 bn21Var = (bn21) obj;
        return wj50.m88271j(this.f28682a, bn21Var.f28682a) && this.f28683b == bn21Var.f28683b && this.f28684c == bn21Var.f28684c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28684c) + mt60.m62800g(this.f28683b, this.f28682a.hashCode() * 31, 31);
    }
}
