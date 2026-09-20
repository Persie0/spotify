package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class le30 {

    /* JADX INFO: renamed from: a */
    public final fh0 f132439a;

    /* JADX INFO: renamed from: b */
    public final String f132440b;

    /* JADX INFO: renamed from: c */
    public final float f132441c;

    public le30(fh0 fh0Var, String str, float f) {
        this.f132439a = fh0Var;
        this.f132440b = str;
        this.f132441c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le30)) {
            return false;
        }
        le30 le30Var = (le30) obj;
        return wj50.m88271j(this.f132439a, le30Var.f132439a) && wj50.m88271j(this.f132440b, le30Var.f132440b) && Float.compare(this.f132441c, le30Var.f132441c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f132441c) + s571.m77243b(this.f132439a.hashCode() * 31, 31, this.f132440b);
    }
}
