package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ygl implements ahl {

    /* JADX INFO: renamed from: a */
    public final String f272594a;

    /* JADX INFO: renamed from: b */
    public final String f272595b;

    /* JADX INFO: renamed from: c */
    public final long f272596c;

    /* JADX INFO: renamed from: d */
    public final long f272597d;

    public ygl(String str, long j, long j2, String str2) {
        this.f272594a = str;
        this.f272595b = str2;
        this.f272596c = j;
        this.f272597d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygl)) {
            return false;
        }
        ygl yglVar = (ygl) obj;
        return wj50.m88271j(this.f272594a, yglVar.f272594a) && wj50.m88271j(this.f272595b, yglVar.f272595b) && this.f272596c == yglVar.f272596c && this.f272597d == yglVar.f272597d;
    }

    @Override // p204p.ahl
    public final String getContextUri() {
        return this.f272594a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f272597d) + dq60.m36605e(s571.m77243b(this.f272594a.hashCode() * 31, 31, this.f272595b), this.f272596c, 31);
    }
}
