package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class n9o0 {

    /* JADX INFO: renamed from: a */
    public final h9o0 f151831a;

    /* JADX INFO: renamed from: b */
    public final String f151832b;

    /* JADX INFO: renamed from: c */
    public final String f151833c;

    /* JADX INFO: renamed from: d */
    public final boolean f151834d;

    /* JADX INFO: renamed from: e */
    public final String f151835e;

    public n9o0(String str, String str2, String str3, h9o0 h9o0Var, boolean z) {
        this.f151831a = h9o0Var;
        this.f151832b = str;
        this.f151833c = str2;
        this.f151834d = z;
        this.f151835e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9o0)) {
            return false;
        }
        n9o0 n9o0Var = (n9o0) obj;
        return wj50.m88271j(this.f151831a, n9o0Var.f151831a) && wj50.m88271j(this.f151832b, n9o0Var.f151832b) && wj50.m88271j(this.f151833c, n9o0Var.f151833c) && this.f151834d == n9o0Var.f151834d && wj50.m88271j(this.f151835e, n9o0Var.f151835e);
    }

    public final int hashCode() {
        return this.f151835e.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b(this.f151831a.hashCode() * 31, 31, this.f151832b), 31, this.f151833c), 31, this.f151834d);
    }
}
