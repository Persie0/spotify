package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class uve0 {

    /* JADX INFO: renamed from: a */
    public final String f234430a;

    /* JADX INFO: renamed from: b */
    public final String f234431b;

    public uve0(String str, String str2) {
        this.f234430a = str;
        this.f234431b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uve0)) {
            return false;
        }
        uve0 uve0Var = (uve0) obj;
        return wj50.m88271j(this.f234430a, uve0Var.f234430a) && wj50.m88271j(this.f234431b, uve0Var.f234431b);
    }

    public final int hashCode() {
        return this.f234431b.hashCode() + (this.f234430a.hashCode() * 31);
    }
}
