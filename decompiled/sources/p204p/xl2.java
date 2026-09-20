package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class xl2 {

    /* JADX INFO: renamed from: a */
    public final String f263006a;

    /* JADX INFO: renamed from: b */
    public final String f263007b;

    public xl2(String str, String str2) {
        this.f263006a = str;
        this.f263007b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m91372a() {
        return this.f263006a;
    }

    /* JADX INFO: renamed from: b */
    public final String m91373b() {
        return this.f263007b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl2)) {
            return false;
        }
        xl2 xl2Var = (xl2) obj;
        return wj50.m88271j(this.f263006a, xl2Var.f263006a) && wj50.m88271j(this.f263007b, xl2Var.f263007b);
    }

    public final int hashCode() {
        return this.f263007b.hashCode() + (this.f263006a.hashCode() * 31);
    }
}
