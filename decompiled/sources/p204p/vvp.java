package p204p;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class vvp implements s4l0 {

    /* JADX INFO: renamed from: X */
    public long f245262X;

    /* JADX INFO: renamed from: Y */
    public long f245263Y;

    /* JADX INFO: renamed from: a */
    public final r4l0 f245264a;

    /* JADX INFO: renamed from: b */
    public final long f245265b;

    /* JADX INFO: renamed from: c */
    public final long f245266c;

    /* JADX INFO: renamed from: d */
    public final oi51 f245267d;

    /* JADX INFO: renamed from: e */
    public int f245268e;

    /* JADX INFO: renamed from: f */
    public long f245269f;

    /* JADX INFO: renamed from: g */
    public long f245270g;

    /* JADX INFO: renamed from: h */
    public long f245271h;

    /* JADX INFO: renamed from: i */
    public long f245272i;

    /* JADX INFO: renamed from: t */
    public long f245273t;

    public vvp(oi51 oi51Var, long j, long j2, long j3, long j4, boolean z) {
        c95.m31843i(j >= 0 && j2 > j);
        this.f245267d = oi51Var;
        this.f245265b = j;
        this.f245266c = j2;
        if (j3 == j2 - j || z) {
            this.f245269f = j4;
            this.f245268e = 4;
        } else {
            this.f245268e = 0;
        }
        this.f245264a = new r4l0();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d0  */
    @Override // p204p.s4l0
    /* JADX INFO: renamed from: c */
    public final long mo50590c(d5y d5yVar) throws IOException {
        long j;
        long j2;
        long jM46319k;
        int i = this.f245268e;
        long j3 = this.f245266c;
        r4l0 r4l0Var = this.f245264a;
        if (i == 0) {
            long position = d5yVar.getPosition();
            this.f245270g = position;
            this.f245268e = 1;
            long j4 = j3 - 65307;
            if (j4 > position) {
                return j4;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.f245272i == this.f245273t) {
                    jM46319k = -1;
                    j2 = -1;
                } else {
                    long position2 = d5yVar.getPosition();
                    if (r4l0Var.m74761d(d5yVar, this.f245273t)) {
                        r4l0Var.m74758a(d5yVar, false);
                        d5yVar.mo35037g();
                        long j5 = this.f245271h;
                        long j6 = r4l0Var.f195800b;
                        long j7 = j5 - j6;
                        j = 2;
                        int i2 = r4l0Var.f195802d + r4l0Var.f195803e;
                        if (0 > j7 || j7 >= 72000) {
                            if (j7 < 0) {
                                this.f245273t = position2;
                                this.f245263Y = j6;
                            } else {
                                this.f245272i = d5yVar.getPosition() + ((long) i2);
                                this.f245262X = r4l0Var.f195800b;
                            }
                            long j8 = this.f245273t;
                            long j9 = this.f245272i;
                            if (j8 - j9 < 100000) {
                                this.f245273t = j9;
                                j2 = -1;
                                jM46319k = j9;
                            } else {
                                long position3 = d5yVar.getPosition() - (((long) i2) * (j7 <= 0 ? 2L : 1L));
                                long j10 = this.f245273t;
                                long j11 = this.f245272i;
                                j2 = -1;
                                jM46319k = h0b1.m46319k((((j10 - j11) * j7) / (this.f245263Y - this.f245262X)) + position3, j11, j10 - 1);
                            }
                        } else {
                            jM46319k = -1;
                            j2 = -1;
                        }
                    } else {
                        jM46319k = this.f245272i;
                        if (jM46319k == position2) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j2 = -1;
                    }
                    if (jM46319k != j2) {
                        return jM46319k;
                    }
                    this.f245268e = 3;
                }
                j = 2;
                if (jM46319k != j2) {
                    return jM46319k;
                }
                this.f245268e = 3;
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j = 2;
            }
            while (true) {
                r4l0Var.m74760c(d5yVar);
                r4l0Var.m74758a(d5yVar, false);
                if (r4l0Var.f195800b > this.f245271h) {
                    d5yVar.mo35037g();
                    this.f245268e = 4;
                    return -(this.f245262X + j);
                }
                d5yVar.mo35044v(r4l0Var.f195802d + r4l0Var.f195803e);
                this.f245272i = d5yVar.getPosition();
                this.f245262X = r4l0Var.f195800b;
            }
        }
        r4l0Var.m74759b();
        if (!r4l0Var.m74761d(d5yVar, -1L)) {
            throw new EOFException();
        }
        r4l0Var.m74758a(d5yVar, false);
        d5yVar.mo35044v(r4l0Var.f195802d + r4l0Var.f195803e);
        long j12 = r4l0Var.f195800b;
        while ((r4l0Var.f195799a & 4) != 4 && r4l0Var.m74761d(d5yVar, -1L) && d5yVar.getPosition() < j3 && r4l0Var.m74758a(d5yVar, true) && ysj0.m94511z(d5yVar, r4l0Var.f195802d + r4l0Var.f195803e)) {
            j12 = r4l0Var.f195800b;
        }
        this.f245269f = j12;
        this.f245268e = 4;
        return this.f245270g;
    }

    @Override // p204p.s4l0
    /* JADX INFO: renamed from: g */
    public final ddz0 mo50591g() {
        if (this.f245269f != 0) {
            return new uvp(this);
        }
        return null;
    }

    @Override // p204p.s4l0
    /* JADX INFO: renamed from: h */
    public final void mo50592h(long j) {
        this.f245271h = h0b1.m46319k(j, 0L, this.f245269f - 1);
        this.f245268e = 2;
        this.f245272i = this.f245265b;
        this.f245273t = this.f245266c;
        this.f245262X = 0L;
        this.f245263Y = this.f245269f;
    }
}
