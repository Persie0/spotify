package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class pd60 {

    /* JADX INFO: renamed from: d */
    public static final pd60 f176359d = new pd60(esw0.f62510c, 6);

    /* JADX INFO: renamed from: a */
    public final esw0 f176360a;

    /* JADX INFO: renamed from: b */
    public final md70 f176361b;

    /* JADX INFO: renamed from: c */
    public final esw0 f176362c;

    public pd60(esw0 esw0Var, md70 md70Var, esw0 esw0Var2) {
        this.f176360a = esw0Var;
        this.f176361b = md70Var;
        this.f176362c = esw0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd60)) {
            return false;
        }
        pd60 pd60Var = (pd60) obj;
        return this.f176360a == pd60Var.f176360a && wj50.m88271j(this.f176361b, pd60Var.f176361b) && this.f176362c == pd60Var.f176362c;
    }

    public final int hashCode() {
        int iHashCode = this.f176360a.hashCode() * 31;
        md70 md70Var = this.f176361b;
        return this.f176362c.hashCode() + ((iHashCode + (md70Var == null ? 0 : md70Var.f142340d)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f176360a + ", sinceVersion=" + this.f176361b + ", reportLevelAfter=" + this.f176362c + ')';
    }

    public pd60(esw0 esw0Var, int i) {
        this(esw0Var, (i & 2) != 0 ? new md70(1, 0, 0) : null, esw0Var);
    }
}
