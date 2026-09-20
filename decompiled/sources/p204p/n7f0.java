package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class n7f0 {

    /* JADX INFO: renamed from: a */
    public final String f151151a;

    /* JADX INFO: renamed from: b */
    public final String f151152b;

    /* JADX INFO: renamed from: c */
    public final String f151153c;

    public n7f0(String str, String str2, String str3) {
        this.f151151a = str;
        this.f151152b = str2;
        this.f151153c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7f0)) {
            return false;
        }
        n7f0 n7f0Var = (n7f0) obj;
        return wj50.m88271j(this.f151151a, n7f0Var.f151151a) && wj50.m88271j(this.f151152b, n7f0Var.f151152b) && wj50.m88271j(this.f151153c, n7f0Var.f151153c);
    }

    public final int hashCode() {
        return this.f151153c.hashCode() + s571.m77243b(this.f151151a.hashCode() * 31, 31, this.f151152b);
    }
}
