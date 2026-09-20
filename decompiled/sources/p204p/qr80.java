package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qr80 implements sr80 {

    /* JADX INFO: renamed from: a */
    public final b450 f191761a;

    /* JADX INFO: renamed from: b */
    public final yk91 f191762b;

    public qr80(b450 b450Var, yk91 yk91Var) {
        this.f191761a = b450Var;
        this.f191762b = yk91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr80)) {
            return false;
        }
        qr80 qr80Var = (qr80) obj;
        return wj50.m88271j(this.f191761a, qr80Var.f191761a) && wj50.m88271j(this.f191762b, qr80Var.f191762b);
    }

    public final int hashCode() {
        return this.f191762b.hashCode() + (this.f191761a.hashCode() * 31);
    }
}
