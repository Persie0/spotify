package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class j391 {

    /* JADX INFO: renamed from: a */
    public final long f108321a;

    /* JADX INFO: renamed from: b */
    public final long f108322b;

    /* JADX INFO: renamed from: c */
    public final String f108323c;

    public j391(long j, String str, long j2) {
        this.f108321a = j;
        this.f108322b = j2;
        this.f108323c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j391)) {
            return false;
        }
        j391 j391Var = (j391) obj;
        return this.f108321a == j391Var.f108321a && this.f108322b == j391Var.f108322b && wj50.m88271j(this.f108323c, j391Var.f108323c);
    }

    public final int hashCode() {
        return this.f108323c.hashCode() + dq60.m36605e(Long.hashCode(this.f108321a) * 31, this.f108322b, 31);
    }
}
