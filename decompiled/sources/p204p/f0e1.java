package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class f0e1 {

    /* JADX INFO: renamed from: a */
    public final String f64629a;

    /* JADX INFO: renamed from: b */
    public final int f64630b;

    public f0e1(String str, int i) {
        this.f64629a = str;
        this.f64630b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0e1)) {
            return false;
        }
        f0e1 f0e1Var = (f0e1) obj;
        return wj50.m88271j(this.f64629a, f0e1Var.f64629a) && this.f64630b == f0e1Var.f64630b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f64630b) + (this.f64629a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.f64629a);
        sb.append(", generation=");
        return edb.m38567p(sb, this.f64630b, ')');
    }
}
