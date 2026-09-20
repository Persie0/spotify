package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class br10 {

    /* JADX INFO: renamed from: a */
    public final String f29934a;

    /* JADX INFO: renamed from: b */
    public final float f29935b;

    public br10(String str, float f) {
        this.f29934a = str;
        this.f29935b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br10)) {
            return false;
        }
        br10 br10Var = (br10) obj;
        return wj50.m88271j(this.f29934a, br10Var.f29934a) && Float.compare(this.f29935b, br10Var.f29935b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f29935b) + (this.f29934a.hashCode() * 31);
    }
}
