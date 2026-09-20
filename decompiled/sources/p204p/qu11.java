package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qu11 {

    /* JADX INFO: renamed from: a */
    public final String f192544a;

    /* JADX INFO: renamed from: b */
    public final String f192545b;

    public qu11(String str, String str2) {
        this.f192544a = str;
        this.f192545b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m73861a() {
        return this.f192545b;
    }

    /* JADX INFO: renamed from: b */
    public final String m73862b() {
        return this.f192544a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu11)) {
            return false;
        }
        qu11 qu11Var = (qu11) obj;
        return wj50.m88271j(this.f192544a, qu11Var.f192544a) && wj50.m88271j(this.f192545b, qu11Var.f192545b);
    }

    public final int hashCode() {
        return this.f192545b.hashCode() + (this.f192544a.hashCode() * 31);
    }
}
