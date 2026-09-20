package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class w860 implements c960 {

    /* JADX INFO: renamed from: a */
    public final String f248860a;

    /* JADX INFO: renamed from: b */
    public final lc8 f248861b;

    public w860(String str, lc8 lc8Var) {
        this.f248860a = str;
        this.f248861b = lc8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w860)) {
            return false;
        }
        w860 w860Var = (w860) obj;
        return wj50.m88271j(this.f248860a, w860Var.f248860a) && wj50.m88271j(this.f248861b, w860Var.f248861b);
    }

    public final int hashCode() {
        return this.f248861b.hashCode() + (this.f248860a.hashCode() * 31);
    }
}
