package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class b6c1 {

    /* JADX INFO: renamed from: a */
    public final qas f23935a;

    /* JADX INFO: renamed from: b */
    public final s3l0 f23936b;

    public b6c1(qas qasVar, s3l0 s3l0Var) {
        this.f23935a = qasVar;
        this.f23936b = s3l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6c1)) {
            return false;
        }
        b6c1 b6c1Var = (b6c1) obj;
        return wj50.m88271j(this.f23935a, b6c1Var.f23935a) && wj50.m88271j(this.f23936b, b6c1Var.f23936b);
    }

    public final int hashCode() {
        qas qasVar = this.f23935a;
        int iHashCode = (qasVar == null ? 0 : qasVar.hashCode()) * 31;
        s3l0 s3l0Var = this.f23936b;
        return iHashCode + (s3l0Var != null ? s3l0Var.hashCode() : 0);
    }
}
