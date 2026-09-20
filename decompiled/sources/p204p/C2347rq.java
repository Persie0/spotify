package p204p;

/* JADX INFO: renamed from: p.rq */
/* JADX INFO: loaded from: classes4.dex */
public final class C2347rq {

    /* JADX INFO: renamed from: a */
    public final String f201671a;

    /* JADX INFO: renamed from: b */
    public final String f201672b;

    /* JADX INFO: renamed from: c */
    public final boolean f201673c;

    public C2347rq(String str, String str2, boolean z) {
        this.f201671a = str;
        this.f201672b = str2;
        this.f201673c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2347rq)) {
            return false;
        }
        C2347rq c2347rq = (C2347rq) obj;
        return wj50.m88271j(this.f201671a, c2347rq.f201671a) && wj50.m88271j(this.f201672b, c2347rq.f201672b) && this.f201673c == c2347rq.f201673c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f201673c) + s571.m77243b(this.f201671a.hashCode() * 31, 31, this.f201672b);
    }
}
