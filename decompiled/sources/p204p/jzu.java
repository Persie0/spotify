package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jzu {

    /* JADX INFO: renamed from: a */
    public final long f117792a;

    /* JADX INFO: renamed from: b */
    public final long f117793b;

    /* JADX INFO: renamed from: c */
    public final long f117794c;

    /* JADX INFO: renamed from: d */
    public final long f117795d;

    /* JADX INFO: renamed from: e */
    public final long f117796e;

    /* JADX INFO: renamed from: f */
    public final long f117797f;

    /* JADX INFO: renamed from: g */
    public final long f117798g;

    /* JADX INFO: renamed from: h */
    public final long f117799h;

    public jzu(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.f117792a = j;
        this.f117793b = j2;
        this.f117794c = j3;
        this.f117795d = j4;
        this.f117796e = j5;
        this.f117797f = j6;
        this.f117798g = j7;
        this.f117799h = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzu)) {
            return false;
        }
        jzu jzuVar = (jzu) obj;
        long j = jzuVar.f117792a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f117792a, j) && as91.m27074b(this.f117793b, jzuVar.f117793b) && as91.m27074b(this.f117794c, jzuVar.f117794c) && as91.m27074b(this.f117795d, jzuVar.f117795d) && as91.m27074b(this.f117796e, jzuVar.f117796e) && as91.m27074b(this.f117797f, jzuVar.f117797f) && as91.m27074b(this.f117798g, jzuVar.f117798g) && as91.m27074b(this.f117799h, jzuVar.f117799h);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f117799h) + dq60.m36605e(dq60.m36605e(dq60.m36605e(dq60.m36605e(dq60.m36605e(dq60.m36605e(Long.hashCode(this.f117792a) * 31, this.f117793b, 31), this.f117794c, 31), this.f117795d, 31), this.f117796e, 31), this.f117797f, 31), this.f117798g, 31);
    }
}
