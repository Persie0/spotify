package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class m101 {

    /* JADX INFO: renamed from: a */
    public final String f138782a;

    /* JADX INFO: renamed from: b */
    public final String f138783b;

    /* JADX INFO: renamed from: c */
    public final int f138784c;

    /* JADX INFO: renamed from: d */
    public final long f138785d;

    /* JADX INFO: renamed from: e */
    public final gdo f138786e;

    /* JADX INFO: renamed from: f */
    public final String f138787f;

    /* JADX INFO: renamed from: g */
    public final String f138788g;

    public m101(String str, String str2, int i, long j, gdo gdoVar, String str3, String str4) {
        this.f138782a = str;
        this.f138783b = str2;
        this.f138784c = i;
        this.f138785d = j;
        this.f138786e = gdoVar;
        this.f138787f = str3;
        this.f138788g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m101)) {
            return false;
        }
        m101 m101Var = (m101) obj;
        return wj50.m88271j(this.f138782a, m101Var.f138782a) && wj50.m88271j(this.f138783b, m101Var.f138783b) && this.f138784c == m101Var.f138784c && this.f138785d == m101Var.f138785d && wj50.m88271j(this.f138786e, m101Var.f138786e) && wj50.m88271j(this.f138787f, m101Var.f138787f) && wj50.m88271j(this.f138788g, m101Var.f138788g);
    }

    public final int hashCode() {
        return this.f138788g.hashCode() + s571.m77243b((this.f138786e.hashCode() + dq60.m36605e(mt60.m62800g(this.f138784c, s571.m77243b(this.f138782a.hashCode() * 31, 31, this.f138783b), 31), this.f138785d, 31)) * 31, 31, this.f138787f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.f138782a);
        sb.append(", firstSessionId=");
        sb.append(this.f138783b);
        sb.append(", sessionIndex=");
        sb.append(this.f138784c);
        sb.append(", eventTimestampUs=");
        sb.append(this.f138785d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.f138786e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f138787f);
        sb.append(", firebaseAuthenticationToken=");
        return dq60.m36617q(sb, this.f138788g, ')');
    }
}
