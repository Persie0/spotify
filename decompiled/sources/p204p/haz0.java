package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class haz0 {

    /* JADX INFO: renamed from: a */
    public final String f89337a;

    /* JADX INFO: renamed from: b */
    public final String f89338b;

    /* JADX INFO: renamed from: c */
    public final faz0 f89339c;

    public haz0(String str, String str2, faz0 faz0Var) {
        this.f89337a = str;
        this.f89338b = str2;
        this.f89339c = faz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof haz0)) {
            return false;
        }
        haz0 haz0Var = (haz0) obj;
        return wj50.m88271j(this.f89337a, haz0Var.f89337a) && wj50.m88271j(this.f89338b, haz0Var.f89338b) && wj50.m88271j(this.f89339c, haz0Var.f89339c);
    }

    public final int hashCode() {
        String str = this.f89337a;
        return this.f89339c.hashCode() + s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f89338b);
    }
}
