package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class twq0 {

    /* JADX INFO: renamed from: a */
    public final String f224465a;

    /* JADX INFO: renamed from: b */
    public final String f224466b;

    public twq0(String str, String str2) {
        this.f224465a = str;
        this.f224466b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twq0)) {
            return false;
        }
        twq0 twq0Var = (twq0) obj;
        return wj50.m88271j(this.f224465a, twq0Var.f224465a) && wj50.m88271j(this.f224466b, twq0Var.f224466b);
    }

    public final int hashCode() {
        return this.f224466b.hashCode() + (this.f224465a.hashCode() * 31);
    }
}
