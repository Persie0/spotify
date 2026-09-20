package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qsw0 {

    /* JADX INFO: renamed from: a */
    public final String f192228a;

    /* JADX INFO: renamed from: b */
    public final String f192229b;

    public qsw0(String str, String str2) {
        this.f192228a = str;
        this.f192229b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsw0)) {
            return false;
        }
        qsw0 qsw0Var = (qsw0) obj;
        return wj50.m88271j(this.f192228a, qsw0Var.f192228a) && wj50.m88271j(this.f192229b, qsw0Var.f192229b);
    }

    public final int hashCode() {
        return this.f192229b.hashCode() + (this.f192228a.hashCode() * 31);
    }
}
