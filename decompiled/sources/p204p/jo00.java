package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jo00 {

    /* JADX INFO: renamed from: a */
    public final String f114258a;

    /* JADX INFO: renamed from: b */
    public final int f114259b;

    /* JADX INFO: renamed from: c */
    public final int f114260c;

    /* JADX INFO: renamed from: d */
    public final wn00 f114261d;

    /* JADX INFO: renamed from: e */
    public final boolean f114262e;

    public jo00(String str, int i, int i2, wn00 wn00Var, boolean z) {
        this.f114258a = str;
        this.f114259b = i;
        this.f114260c = i2;
        this.f114261d = wn00Var;
        this.f114262e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo00)) {
            return false;
        }
        jo00 jo00Var = (jo00) obj;
        return wj50.m88271j(this.f114258a, jo00Var.f114258a) && this.f114259b == jo00Var.f114259b && this.f114260c == jo00Var.f114260c && wj50.m88271j(this.f114261d, jo00Var.f114261d) && this.f114262e == jo00Var.f114262e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f114262e) + ((this.f114261d.hashCode() + mt60.m62800g(this.f114260c, mt60.m62800g(this.f114259b, this.f114258a.hashCode() * 31, 31), 31)) * 31);
    }
}
