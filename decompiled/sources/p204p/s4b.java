package p204p;

import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes3.dex */
public final class s4b {

    /* JADX INFO: renamed from: a */
    public final e3b f205532a;

    /* JADX INFO: renamed from: b */
    public final w2b f205533b;

    /* JADX INFO: renamed from: c */
    public final sjo f205534c;

    /* JADX INFO: renamed from: d */
    public final String f205535d;

    /* JADX INFO: renamed from: e */
    public final byte[] f205536e;

    /* JADX INFO: renamed from: f */
    public final r4b f205537f;

    /* JADX INFO: renamed from: g */
    public long f205538g;

    /* JADX INFO: renamed from: h */
    public long f205539h;

    /* JADX INFO: renamed from: i */
    public long f205540i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f205541j;

    public s4b(e3b e3bVar, sjo sjoVar, byte[] bArr, r4b r4bVar) {
        this.f205532a = e3bVar;
        this.f205533b = e3bVar.f55722a;
        this.f205534c = sjoVar;
        this.f205536e = bArr == null ? new byte[131072] : bArr;
        this.f205537f = r4bVar;
        this.f205535d = e3bVar.f55726e.mo60230c(sjoVar);
        this.f205538g = sjoVar.f209890f;
    }

    /* JADX INFO: renamed from: a */
    public final void m77190a() throws Exception {
        long jMo28175u;
        long j;
        long j2;
        if (this.f205541j) {
            throw new InterruptedIOException();
        }
        w2b w2bVar = this.f205533b;
        String str = this.f205535d;
        sjo sjoVar = this.f205534c;
        ob21 ob21Var = (ob21) w2bVar;
        this.f205540i = ob21Var.m66592g(sjoVar.f209890f, str, sjoVar.f209891g);
        long j3 = sjoVar.f209891g;
        long j4 = -1;
        if (j3 != -1) {
            this.f205539h = sjoVar.f209890f + j3;
        } else {
            long jM56929a = kmj.m56929a(ob21Var.m66594i(this.f205535d));
            if (jM56929a == -1) {
                jM56929a = -1;
            }
            this.f205539h = jM56929a;
        }
        r4b r4bVar = this.f205537f;
        if (r4bVar != null) {
            long j5 = this.f205539h;
            r4bVar.mo43540a(j5 == -1 ? -1L : j5 - this.f205534c.f209890f, this.f205540i, 0L);
        }
        while (true) {
            long j6 = this.f205539h;
            if (j6 != j4 && this.f205538g >= j6) {
                return;
            }
            if (this.f205541j) {
                throw new InterruptedIOException();
            }
            long j7 = this.f205539h;
            ob21 ob21Var2 = ob21Var;
            long jM66593h = ob21Var2.m66593h(this.f205538g, this.f205535d, j7 == j4 ? Long.MAX_VALUE : j7 - this.f205538g);
            if (jM66593h > 0) {
                this.f205538g += jM66593h;
                j = j4;
            } else {
                long j8 = -jM66593h;
                if (j8 == Long.MAX_VALUE) {
                    j8 = j4;
                }
                long j9 = this.f205538g;
                e3b e3bVar = this.f205532a;
                boolean z = true;
                int i = 0;
                boolean z2 = j9 + j8 == this.f205539h || j8 == j4;
                if (j8 != j4) {
                    rjo rjoVarM78348a = sjoVar.m78348a();
                    rjoVarM78348a.f199871f = j9;
                    rjoVarM78348a.f199872g = j8;
                    try {
                        jMo28175u = e3bVar.mo28175u(rjoVarM78348a.m75643a());
                    } catch (Exception unused) {
                        mag1.m61306p(e3bVar);
                        jMo28175u = j4;
                        z = false;
                    }
                } else {
                    jMo28175u = j4;
                    z = false;
                }
                if (!z) {
                    if (this.f205541j) {
                        throw new InterruptedIOException();
                    }
                    rjo rjoVarM78348a2 = sjoVar.m78348a();
                    rjoVarM78348a2.f199871f = j9;
                    rjoVarM78348a2.f199872g = j4;
                    try {
                        jMo28175u = e3bVar.mo28175u(rjoVarM78348a2.m75643a());
                    } catch (Exception e) {
                        mag1.m61306p(e3bVar);
                        throw e;
                    }
                }
                if (z2 && jMo28175u != j4) {
                    long j10 = jMo28175u + j9;
                    try {
                        if (this.f205539h != j10) {
                            this.f205539h = j10;
                            r4b r4bVar2 = this.f205537f;
                            if (r4bVar2 != null) {
                                r4bVar2.mo43540a(j10 == j4 ? j4 : j10 - this.f205534c.f209890f, this.f205540i, 0L);
                            }
                        }
                    } catch (Exception e2) {
                        mag1.m61306p(e3bVar);
                        throw e2;
                    }
                }
                int i2 = 0;
                int i3 = 0;
                while (i2 != -1) {
                    if (this.f205541j) {
                        throw new InterruptedIOException();
                    }
                    byte[] bArr = this.f205536e;
                    i2 = e3bVar.read(bArr, i, bArr.length);
                    if (i2 != -1) {
                        long j11 = i2;
                        long j12 = j4;
                        long j13 = this.f205540i + j11;
                        this.f205540i = j13;
                        r4b r4bVar3 = this.f205537f;
                        if (r4bVar3 != null) {
                            long j14 = this.f205539h;
                            if (j14 == j12) {
                                j2 = j12;
                            } else {
                                j2 = j14 - this.f205534c.f209890f;
                                r4bVar3 = r4bVar3;
                            }
                            r4bVar3.mo43540a(j2, j13, j11);
                        }
                        i3 += i2;
                        j4 = j12;
                        i = 0;
                    }
                }
                j = j4;
                if (z2) {
                    long j15 = ((long) i3) + j9;
                    if (this.f205539h != j15) {
                        this.f205539h = j15;
                        r4b r4bVar4 = this.f205537f;
                        if (r4bVar4 != null) {
                            r4bVar4.mo43540a(j15 == j ? j : j15 - this.f205534c.f209890f, this.f205540i, 0L);
                        }
                    }
                }
                e3bVar.close();
                this.f205538g = j9 + ((long) i3);
            }
            ob21Var = ob21Var2;
            j4 = j;
        }
    }
}
