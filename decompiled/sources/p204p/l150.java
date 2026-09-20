package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class l150 implements m150 {

    /* JADX INFO: renamed from: a */
    public final long f128627a;

    /* JADX INFO: renamed from: b */
    public final int f128628b;

    public l150(int i, long j) {
        this.f128627a = j;
        this.f128628b = i;
    }

    @Override // p204p.m150
    public final a150 toInstant() {
        a150 a150Var = a150.f11335c;
        long jM24422a = qvf1.m74024u().m24422a();
        long j = this.f128627a;
        if (j >= jM24422a && j <= qvf1.m74023t().m24422a()) {
            return qvf1.m74018o(this.f128628b, j);
        }
        throw new d150("The parsed date is outside the range representable by Instant (Unix epoch second " + j + ')');
    }
}
