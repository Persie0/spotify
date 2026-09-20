package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class r9l implements vfj0 {

    /* JADX INFO: renamed from: a */
    public final qs3 f197071a;

    /* JADX INFO: renamed from: b */
    public int f197072b = 1;

    /* JADX INFO: renamed from: c */
    public float f197073c;

    public r9l(qs3 qs3Var) {
        this.f197071a = qs3Var;
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: P */
    public final long mo25861P(int i, long j) {
        if (this.f197072b != 2) {
            return 0L;
        }
        m75077a(j);
        return j;
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: S0 */
    public final Object mo25862S0(long j, long j2, fbk fbkVar) {
        this.f197072b = 1;
        this.f197073c = 0.0f;
        return new m5b1(0L);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    /* JADX INFO: renamed from: a */
    public final long m75077a(long j) {
        float fIntBitsToFloat;
        int i;
        if (this.f197073c > 0.0f) {
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i2) > 0.0f) {
                fIntBitsToFloat = Float.intBitsToFloat(i2) - this.f197073c;
                if (fIntBitsToFloat < 0.0f) {
                    fIntBitsToFloat = 0.0f;
                }
            } else if (this.f197073c < 0.0f) {
                i = (int) (j & 4294967295L);
                if (Float.intBitsToFloat(i) < 0.0f) {
                    fIntBitsToFloat = Float.intBitsToFloat(i) - this.f197073c;
                    if (fIntBitsToFloat > 0.0f) {
                        fIntBitsToFloat = 0.0f;
                    }
                } else {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
                }
            } else {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
            }
        } else if (this.f197073c < 0.0f) {
            i = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i) < 0.0f) {
                fIntBitsToFloat = Float.intBitsToFloat(i) - this.f197073c;
                if (fIntBitsToFloat > 0.0f) {
                    fIntBitsToFloat = 0.0f;
                }
            } else {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
            }
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        float fM73663b = this.f197071a.m73663b(fIntBitsToFloat);
        this.f197073c -= Float.intBitsToFloat((int) (j & 4294967295L)) - fM73663b;
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fM73663b)) & 4294967295L);
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: k0 */
    public final long mo25863k0(int i, long j, long j2) {
        if (this.f197072b != 3) {
            if (Float.intBitsToFloat((int) (j & 4294967295L)) != 0.0f) {
                this.f197072b = 3;
                return 0L;
            }
            if (Float.intBitsToFloat((int) (j2 & 4294967295L)) != 0.0f) {
                this.f197072b = 2;
                return m75077a(j2);
            }
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.vfj0
    /* JADX INFO: renamed from: m0 */
    public final Object mo25864m0(long j, fbk fbkVar) {
        q9l q9lVar;
        if (fbkVar instanceof q9l) {
            q9lVar = (q9l) fbkVar;
            int i = q9lVar.f186618d;
            if ((i & Integer.MIN_VALUE) != 0) {
                q9lVar.f186618d = i - Integer.MIN_VALUE;
            } else {
                q9lVar = new q9l(this, (ibk) fbkVar);
            }
        } else {
            q9lVar = new q9l(this, (ibk) fbkVar);
        }
        Object obj = q9lVar.f186616b;
        int i2 = q9lVar.f186618d;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (this.f197072b == 2) {
                float fM60855e = m5b1.m60855e(j);
                q9lVar.f186615a = j;
                q9lVar.f186618d = 1;
                Object objM73670i = this.f197071a.m73670i(fM60855e, q9lVar);
                yuk yukVar = yuk.f276404a;
                if (objM73670i == yukVar) {
                    return yukVar;
                }
            } else {
                j = 0;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = q9lVar.f186615a;
            bga.m29073P(obj);
        }
        return new m5b1(j);
    }
}
