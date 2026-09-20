package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class usf0 {

    /* JADX INFO: renamed from: a */
    public final b791 f233623a;

    /* JADX INFO: renamed from: b */
    public final String f233624b;

    public usf0(b791 b791Var, String str) {
        this.f233623a = b791Var;
        this.f233624b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usf0)) {
            return false;
        }
        usf0 usf0Var = (usf0) obj;
        return wj50.m88271j(this.f233623a, usf0Var.f233623a) && wj50.m88271j(this.f233624b, usf0Var.f233624b);
    }

    public final int hashCode() {
        b791 b791Var = this.f233623a;
        return this.f233624b.hashCode() + ((b791Var == null ? 0 : b791Var.hashCode()) * 31);
    }
}
