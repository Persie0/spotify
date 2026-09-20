package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wrx implements xrx {

    /* JADX INFO: renamed from: a */
    public final String f254458a;

    /* JADX INFO: renamed from: b */
    public final long f254459b;

    public wrx(String str, long j) {
        this.f254458a = str;
        this.f254459b = j;
    }

    @Override // p204p.xrx
    /* JADX INFO: renamed from: a */
    public final String mo88871a() {
        return this.f254458a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrx)) {
            return false;
        }
        wrx wrxVar = (wrx) obj;
        return wj50.m88271j(this.f254458a, wrxVar.f254458a) && this.f254459b == wrxVar.f254459b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f254459b) + (this.f254458a.hashCode() * 31);
    }
}
