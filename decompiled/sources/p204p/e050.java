package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class e050 {

    /* JADX INFO: renamed from: a */
    public final String f54856a;

    /* JADX INFO: renamed from: b */
    public final long f54857b;

    /* JADX INFO: renamed from: c */
    public final String f54858c;

    /* JADX INFO: renamed from: d */
    public final long f54859d;

    /* JADX INFO: renamed from: e */
    public final Long f54860e;

    /* JADX INFO: renamed from: f */
    public final Long f54861f;

    /* JADX INFO: renamed from: g */
    public final boolean f54862g;

    public e050(String str, long j, String str2, long j2, Long l, Long l2, boolean z) {
        this.f54856a = str;
        this.f54857b = j;
        this.f54858c = str2;
        this.f54859d = j2;
        this.f54860e = l;
        this.f54861f = l2;
        this.f54862g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e050)) {
            return false;
        }
        e050 e050Var = (e050) obj;
        return wj50.m88271j(this.f54856a, e050Var.f54856a) && this.f54857b == e050Var.f54857b && wj50.m88271j(this.f54858c, e050Var.f54858c) && this.f54859d == e050Var.f54859d && wj50.m88271j(this.f54860e, e050Var.f54860e) && wj50.m88271j(this.f54861f, e050Var.f54861f) && this.f54862g == e050Var.f54862g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    public final int hashCode() {
        String str = this.f54856a;
        int iM36605e = dq60.m36605e((str == null ? 0 : str.hashCode()) * 31, this.f54857b, 31);
        String str2 = this.f54858c;
        int iM36605e2 = dq60.m36605e((iM36605e + (str2 == null ? 0 : str2.hashCode())) * 31, this.f54859d, 31);
        Long l = this.f54860e;
        int iHashCode = (iM36605e2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f54861f;
        int iHashCode2 = (iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        boolean z = this.f54862g;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return iHashCode2 + r0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallReferrerResult(appStore=");
        sb.append(this.f54856a);
        sb.append(", installBeginTimestampSeconds=");
        sb.append(this.f54857b);
        sb.append(", installReferrer=");
        sb.append(this.f54858c);
        sb.append(", referrerClickTimestampSeconds=");
        sb.append(this.f54859d);
        sb.append(", installBeginTimestampServerSeconds=");
        sb.append(this.f54860e);
        sb.append(", referrerClickTimestampServerSeconds=");
        sb.append(this.f54861f);
        sb.append(", isClickThrough=");
        return s571.m77253l(sb, this.f54862g, ')');
    }
}
