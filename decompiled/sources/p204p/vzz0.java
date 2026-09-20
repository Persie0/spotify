package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class vzz0 {

    /* JADX INFO: renamed from: a */
    public final String f246598a;

    /* JADX INFO: renamed from: b */
    public final String f246599b;

    /* JADX INFO: renamed from: c */
    public final int f246600c;

    /* JADX INFO: renamed from: d */
    public final long f246601d;

    public vzz0(int i, String str, String str2, long j) {
        this.f246598a = str;
        this.f246599b = str2;
        this.f246600c = i;
        this.f246601d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzz0)) {
            return false;
        }
        vzz0 vzz0Var = (vzz0) obj;
        return wj50.m88271j(this.f246598a, vzz0Var.f246598a) && wj50.m88271j(this.f246599b, vzz0Var.f246599b) && this.f246600c == vzz0Var.f246600c && this.f246601d == vzz0Var.f246601d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f246601d) + mt60.m62800g(this.f246600c, s571.m77243b(this.f246598a.hashCode() * 31, 31, this.f246599b), 31);
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f246598a + ", firstSessionId=" + this.f246599b + ", sessionIndex=" + this.f246600c + ", sessionStartTimestampUs=" + this.f246601d + ')';
    }
}
