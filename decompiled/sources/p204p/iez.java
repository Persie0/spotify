package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class iez {

    /* JADX INFO: renamed from: c */
    public boolean f101587c;

    /* JADX INFO: renamed from: e */
    public int f101589e;

    /* JADX INFO: renamed from: h */
    public long f101592h;

    /* JADX INFO: renamed from: i */
    public final gez f101593i;

    /* JADX INFO: renamed from: a */
    public hez f101585a = new hez();

    /* JADX INFO: renamed from: b */
    public hez f101586b = new hez();

    /* JADX INFO: renamed from: d */
    public long f101588d = -9223372036854775807L;

    /* JADX INFO: renamed from: f */
    public float f101590f = -1.0f;

    /* JADX INFO: renamed from: g */
    public float f101591g = -1.0f;

    public iez(gez gezVar) {
        this.f101593i = gezVar;
    }

    /* JADX INFO: renamed from: a */
    public final long m50405a() {
        if (!this.f101585a.m47313a()) {
            return -9223372036854775807L;
        }
        hez hezVar = this.f101585a;
        long j = hezVar.f90556e;
        if (j == 0) {
            return 0L;
        }
        return hezVar.f90557f / j;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX INFO: renamed from: b */
    public final void m50406b(long j) {
        if (j == this.f101588d) {
            return;
        }
        this.f101592h++;
        this.f101585a.m47314b(j);
        if (this.f101585a.m47313a()) {
            this.f101587c = false;
        } else if (this.f101588d != -9223372036854775807L) {
            if (this.f101587c) {
                hez hezVar = this.f101586b;
                long j2 = hezVar.f90555d;
                if (j2 == 0 ? false : hezVar.f90558g[(int) ((j2 - 1) % 15)]) {
                    this.f101586b.m47315c();
                    this.f101586b.m47314b(this.f101588d);
                }
            } else {
                this.f101586b.m47315c();
                this.f101586b.m47314b(this.f101588d);
            }
            this.f101587c = true;
            this.f101586b.m47314b(j);
        }
        if (this.f101587c && this.f101586b.m47313a()) {
            hez hezVar2 = this.f101585a;
            this.f101585a = this.f101586b;
            this.f101586b = hezVar2;
            this.f101587c = false;
        }
        this.f101588d = j;
        this.f101589e = this.f101585a.m47313a() ? 0 : this.f101589e + 1;
        m50407c();
    }

    /* JADX INFO: renamed from: c */
    public final void m50407c() {
        float f;
        boolean zM47313a = this.f101585a.m47313a();
        if (zM47313a) {
            hez hezVar = this.f101585a;
            long j = hezVar.f90556e;
            f = (float) (1.0E9d / (j != 0 ? hezVar.f90557f / j : 0L));
        } else {
            f = this.f101590f;
        }
        float f2 = this.f101591g;
        if (f == f2) {
            return;
        }
        if (f != -1.0f && f2 != -1.0f) {
            if (Math.abs(f - f2) < ((!zM47313a || this.f101585a.f90557f < 5000000000L) ? 1.0f : 0.1f)) {
                return;
            }
        } else if (f == -1.0f && this.f101589e < 30) {
            return;
        }
        this.f101591g = f;
        this.f101593i.mo44545c(f);
    }
}
