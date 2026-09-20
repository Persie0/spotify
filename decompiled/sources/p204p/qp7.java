package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qp7 {

    /* JADX INFO: renamed from: a */
    public final String f191175a;

    /* JADX INFO: renamed from: b */
    public final String f191176b;

    /* JADX INFO: renamed from: c */
    public final String f191177c;

    public qp7(String str, String str2, String str3) {
        this.f191175a = str;
        this.f191176b = str2;
        this.f191177c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp7)) {
            return false;
        }
        qp7 qp7Var = (qp7) obj;
        return wj50.m88271j(this.f191175a, qp7Var.f191175a) && wj50.m88271j(this.f191176b, qp7Var.f191176b) && wj50.m88271j(this.f191177c, qp7Var.f191177c);
    }

    public final int hashCode() {
        return this.f191177c.hashCode() + s571.m77243b(this.f191175a.hashCode() * 31, 31, this.f191176b);
    }
}
