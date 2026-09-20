package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class u7a {

    /* JADX INFO: renamed from: a */
    public final String f227544a;

    /* JADX INFO: renamed from: b */
    public final int f227545b;

    /* JADX INFO: renamed from: c */
    public final String f227546c;

    /* JADX INFO: renamed from: d */
    public final boolean f227547d;

    public u7a(String str, int i, String str2, boolean z) {
        this.f227544a = str;
        this.f227545b = i;
        this.f227546c = str2;
        this.f227547d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7a)) {
            return false;
        }
        u7a u7aVar = (u7a) obj;
        return wj50.m88271j(this.f227544a, u7aVar.f227544a) && this.f227545b == u7aVar.f227545b && wj50.m88271j(this.f227546c, u7aVar.f227546c) && this.f227547d == u7aVar.f227547d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227547d) + s571.m77243b(mt60.m62800g(this.f227545b, this.f227544a.hashCode() * 31, 31), 31, this.f227546c);
    }
}
