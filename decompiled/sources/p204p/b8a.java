package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class b8a {

    /* JADX INFO: renamed from: a */
    public final String f24536a;

    /* JADX INFO: renamed from: b */
    public final long f24537b;

    /* JADX INFO: renamed from: c */
    public final long f24538c;

    /* JADX INFO: renamed from: d */
    public final String f24539d;

    /* JADX INFO: renamed from: e */
    public final long f24540e;

    public b8a(long j, long j2, long j3, String str, String str2) {
        this.f24536a = str;
        this.f24537b = j;
        this.f24538c = j2;
        this.f24539d = str2;
        this.f24540e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8a)) {
            return false;
        }
        b8a b8aVar = (b8a) obj;
        return wj50.m88271j(this.f24536a, b8aVar.f24536a) && this.f24537b == b8aVar.f24537b && this.f24538c == b8aVar.f24538c && wj50.m88271j(this.f24539d, b8aVar.f24539d) && this.f24540e == b8aVar.f24540e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24540e) + s571.m77243b(dq60.m36605e(dq60.m36605e(this.f24536a.hashCode() * 31, this.f24537b, 31), this.f24538c, 31), 31, this.f24539d);
    }
}
