package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class qz4 implements l630 {

    /* JADX INFO: renamed from: a */
    public final rz4 f194108a;

    /* JADX INFO: renamed from: b */
    public final String f194109b;

    /* JADX INFO: renamed from: c */
    public final b250 f194110c;

    public qz4(rz4 rz4Var, String str, b250 b250Var) {
        this.f194108a = rz4Var;
        this.f194109b = str;
        this.f194110c = b250Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz4)) {
            return false;
        }
        qz4 qz4Var = (qz4) obj;
        return wj50.m88271j(this.f194108a, qz4Var.f194108a) && wj50.m88271j(this.f194109b, qz4Var.f194109b) && wj50.m88271j(this.f194110c, qz4Var.f194110c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f194109b;
    }

    public final int hashCode() {
        return this.f194110c.hashCode() + s571.m77243b(this.f194108a.hashCode() * 31, 31, this.f194109b);
    }
}
