package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class q3s {

    /* JADX INFO: renamed from: a */
    public final qas f184935a;

    /* JADX INFO: renamed from: b */
    public final boolean f184936b;

    /* JADX INFO: renamed from: c */
    public final boolean f184937c;

    /* JADX INFO: renamed from: d */
    public final String f184938d;

    /* JADX INFO: renamed from: e */
    public final wfj f184939e;

    public q3s(qas qasVar, boolean z, boolean z2, String str, wfj wfjVar) {
        this.f184935a = qasVar;
        this.f184936b = z;
        this.f184937c = z2;
        this.f184938d = str;
        this.f184939e = wfjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3s)) {
            return false;
        }
        q3s q3sVar = (q3s) obj;
        return wj50.m88271j(this.f184935a, q3sVar.f184935a) && this.f184936b == q3sVar.f184936b && this.f184937c == q3sVar.f184937c && wj50.m88271j(this.f184938d, q3sVar.f184938d) && wj50.m88271j(this.f184939e, q3sVar.f184939e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(this.f184935a.hashCode() * 31, 31, this.f184936b), 31, this.f184937c);
        String str = this.f184938d;
        return this.f184939e.hashCode() + ((iM77245d + (str == null ? 0 : str.hashCode())) * 31);
    }
}
