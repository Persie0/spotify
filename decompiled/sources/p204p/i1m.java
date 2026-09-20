package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class i1m {

    /* JADX INFO: renamed from: a */
    public final String f97545a;

    /* JADX INFO: renamed from: b */
    public final String f97546b;

    /* JADX INFO: renamed from: c */
    public final String f97547c;

    /* JADX INFO: renamed from: d */
    public final String f97548d;

    /* JADX INFO: renamed from: e */
    public final String f97549e;

    public i1m(String str, String str2, String str3, String str4, String str5) {
        this.f97545a = str;
        this.f97546b = str2;
        this.f97547c = str3;
        this.f97548d = str4;
        this.f97549e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1m)) {
            return false;
        }
        i1m i1mVar = (i1m) obj;
        return wj50.m88271j(this.f97545a, i1mVar.f97545a) && wj50.m88271j(this.f97546b, i1mVar.f97546b) && wj50.m88271j(this.f97547c, i1mVar.f97547c) && wj50.m88271j(this.f97548d, i1mVar.f97548d) && wj50.m88271j(this.f97549e, i1mVar.f97549e);
    }

    public final int hashCode() {
        return this.f97549e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f97545a.hashCode() * 31, 31, this.f97546b), 31, this.f97547c), 31, this.f97548d);
    }
}
