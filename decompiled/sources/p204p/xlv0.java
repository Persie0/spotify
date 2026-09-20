package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xlv0 implements zlv0 {

    /* JADX INFO: renamed from: a */
    public final String f263242a;

    /* JADX INFO: renamed from: b */
    public final String f263243b;

    public xlv0(String str, String str2) {
        this.f263242a = str;
        this.f263243b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlv0)) {
            return false;
        }
        xlv0 xlv0Var = (xlv0) obj;
        return wj50.m88271j(this.f263242a, xlv0Var.f263242a) && wj50.m88271j(this.f263243b, xlv0Var.f263243b);
    }

    public final int hashCode() {
        return this.f263243b.hashCode() + (this.f263242a.hashCode() * 31);
    }
}
