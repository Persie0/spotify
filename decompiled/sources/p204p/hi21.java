package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class hi21 extends hp70 {

    /* JADX INFO: renamed from: M0 */
    public n05 f91671M0;

    /* JADX INFO: renamed from: P0 */
    public boolean f91674P0;

    /* JADX INFO: renamed from: N0 */
    public long f91672N0 = c05.f32683a;

    /* JADX INFO: renamed from: O0 */
    public long f91673O0 = e8j.m38111b(0, 0, 0, 0, 15);

    /* JADX INFO: renamed from: Q0 */
    public final yum0 f91675Q0 = sam.m77645B(null);

    public hi21(n05 n05Var) {
        this.f91671M0 = n05Var;
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: B1 */
    public final void mo25065B1() {
        this.f91675Q0.setValue(null);
    }

    @Override // p204p.dp70
    /* JADX INFO: renamed from: i */
    public final n6d0 mo25071i(o6d0 o6d0Var, h6d0 h6d0Var, long j) {
        t5o0 t5o0VarMo39619B;
        char c;
        long j2;
        fi21 fi21Var;
        long jM38113d;
        fi21 fi21Var2;
        if (o6d0Var.mo34819a0()) {
            this.f91673O0 = j;
            this.f91674P0 = true;
            t5o0VarMo39619B = h6d0Var.mo39619B(j);
        } else {
            t5o0VarMo39619B = h6d0Var.mo39619B(this.f91674P0 ? this.f91673O0 : j);
        }
        t5o0 t5o0Var = t5o0VarMo39619B;
        long j3 = (((long) t5o0Var.f217323b) & 4294967295L) | (((long) t5o0Var.f217322a) << 32);
        if (o6d0Var.mo34819a0()) {
            this.f91672N0 = j3;
            c = ' ';
            jM38113d = j3;
            j3 = jM38113d;
            j2 = 4294967295L;
        } else {
            long j4 = !g450.m43520b(this.f91672N0, c05.f32683a) ? this.f91672N0 : j3;
            yum0 yum0Var = this.f91675Q0;
            fi21 fi21Var3 = (fi21) yum0Var.getValue();
            if (fi21Var3 != null) {
                gw4 gw4Var = fi21Var3.f69759a;
                c = ' ';
                boolean z = (g450.m43520b(j4, ((g450) gw4Var.m45912e()).f76347a) || gw4Var.m45913f()) ? false : true;
                j2 = 4294967295L;
                if (!g450.m43520b(j4, ((g450) gw4Var.f84910e.getValue()).f76347a) || z) {
                    fi21Var3.f69760b = ((g450) gw4Var.m45912e()).f76347a;
                    fi21Var2 = fi21Var3;
                    x0h1.m89578u(m40262v1(), null, 0, new u37(fi21Var2, j4, this, (fbk) null), 3);
                } else {
                    fi21Var2 = fi21Var3;
                }
                fi21Var = fi21Var2;
            } else {
                c = ' ';
                j2 = 4294967295L;
                long j5 = 1;
                fi21Var = new fi21(new gw4(new g450(j4), geg1.f79127h, new g450((j5 & 4294967295L) | (j5 << 32)), 8), j4);
            }
            yum0Var.setValue(fi21Var);
            jM38113d = e8j.m38113d(j, ((g450) fi21Var.f69759a.m45912e()).f76347a);
        }
        int i = (int) (jM38113d >> c);
        int i2 = (int) (jM38113d & j2);
        return o6d0Var.mo44714T(i, i2, nau.f152117a, new gi21(this, j3, i, i2, o6d0Var, t5o0Var));
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: z1 */
    public final void mo25074z1() {
        this.f91672N0 = c05.f32683a;
        this.f91674P0 = false;
    }
}
