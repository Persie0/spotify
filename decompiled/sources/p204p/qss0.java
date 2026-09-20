package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qss0 {

    /* JADX INFO: renamed from: a */
    public final String f192177a;

    /* JADX INFO: renamed from: b */
    public final String f192178b;

    public qss0(String str, String str2) {
        this.f192177a = str;
        this.f192178b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qss0)) {
            return false;
        }
        qss0 qss0Var = (qss0) obj;
        return wj50.m88271j(this.f192177a, qss0Var.f192177a) && wj50.m88271j(this.f192178b, qss0Var.f192178b);
    }

    public final int hashCode() {
        return this.f192178b.hashCode() + (this.f192177a.hashCode() * 31);
    }
}
