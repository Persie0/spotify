package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hnk {

    /* JADX INFO: renamed from: a */
    public final String f93351a;

    /* JADX INFO: renamed from: b */
    public final String f93352b;

    /* JADX INFO: renamed from: c */
    public final long f93353c;

    /* JADX INFO: renamed from: d */
    public final long f93354d;

    public hnk(String str, long j, long j2, String str2) {
        this.f93351a = str;
        this.f93352b = str2;
        this.f93353c = j;
        this.f93354d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hnk)) {
            return false;
        }
        hnk hnkVar = (hnk) obj;
        return wj50.m88271j(this.f93351a, hnkVar.f93351a) && wj50.m88271j(this.f93352b, hnkVar.f93352b) && this.f93353c == hnkVar.f93353c && this.f93354d == hnkVar.f93354d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f93354d) + dq60.m36605e(s571.m77243b(this.f93351a.hashCode() * 31, 31, this.f93352b), this.f93353c, 31);
    }
}
