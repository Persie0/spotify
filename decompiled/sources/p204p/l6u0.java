package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class l6u0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f130482a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f130483b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f130484c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6u0(long j, int i, String str) {
        super(1);
        this.f130482a = i;
        this.f130483b = j;
        this.f130484c = str;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) throws Exception {
        ezx0 ezx0VarMo63454G1 = ((yyx0) obj).mo63454G1("\n            UPDATE RateLimitedEvents\n            SET count = ?,\n            timestamp = ?\n            WHERE eventName = ?\n        ");
        try {
            ezx0VarMo63454G1.mo24846u(1, this.f130482a);
            ezx0VarMo63454G1.mo24846u(2, this.f130483b);
            ezx0VarMo63454G1.mo24842R(3, this.f130484c);
            ezx0VarMo63454G1.mo24841E1();
            return w2a1.f247311a;
        } finally {
            ezx0VarMo63454G1.close();
        }
    }
}
