package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ffp0 {

    /* JADX INFO: renamed from: a */
    public final String f69064a;

    /* JADX INFO: renamed from: b */
    public final String f69065b;

    public ffp0(String str, String str2) {
        this.f69064a = str;
        this.f69065b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffp0)) {
            return false;
        }
        ffp0 ffp0Var = (ffp0) obj;
        return wj50.m88271j(this.f69064a, ffp0Var.f69064a) && wj50.m88271j(this.f69065b, ffp0Var.f69065b);
    }

    public final int hashCode() {
        return this.f69065b.hashCode() + (this.f69064a.hashCode() * 31);
    }
}
