package p204p;

import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class t691 extends l891 implements xls {

    /* JADX INFO: renamed from: b */
    public boolean f217495b;

    /* JADX INFO: renamed from: c */
    public boolean f217496c;

    /* JADX INFO: renamed from: e */
    public mg41 f217498e;

    /* JADX INFO: renamed from: f */
    public final ob31 f217499f;

    /* JADX INFO: renamed from: g */
    public Runnable f217500g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ka91 f217501h;

    /* JADX INFO: renamed from: a */
    public long f217494a = -1;

    /* JADX INFO: renamed from: d */
    public int f217497d = 0;

    public t691(ka91 ka91Var) {
        this.f217501h = ka91Var;
        ob31 ob31Var = new ob31();
        long[] jArr = new long[20];
        ob31Var.f163529b = jArr;
        ob31Var.f163530c = new float[20];
        ob31Var.f163528a = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
        this.f217499f = ob31Var;
    }

    @Override // p204p.l891, p204p.x691
    /* JADX INFO: renamed from: b */
    public final void mo32231b(z691 z691Var) {
        this.f217496c = true;
    }

    @Override // p204p.xls
    /* JADX INFO: renamed from: h */
    public final void mo37204h(float f) {
        ka91 ka91Var = this.f217501h;
        long jMax = Math.max(-1L, Math.min(ka91Var.f279793W0 + 1, Math.round(f)));
        ka91Var.mo55878K(jMax, this.f217494a);
        this.f217494a = jMax;
    }

    /* JADX INFO: renamed from: i */
    public final void m80153i() {
        if (this.f217495b) {
            m80154j();
            this.f217498e.m61688a(this.f217501h.f279793W0 + 1);
        } else {
            this.f217497d = 1;
            this.f217500g = null;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m80154j() {
        int i;
        if (this.f217498e != null) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f = this.f217494a;
        ob31 ob31Var = this.f217499f;
        int i2 = ob31Var.f163528a;
        float[] fArr = (float[]) ob31Var.f163530c;
        long[] jArr = (long[]) ob31Var.f163529b;
        char c = 20;
        int i3 = (i2 + 1) % 20;
        ob31Var.f163528a = i3;
        jArr[i3] = jCurrentAnimationTimeMillis;
        fArr[i3] = f;
        vi5 vi5Var = new vi5(4, false);
        float fSqrt = 0.0f;
        vi5Var.f241617b = 0.0f;
        this.f217498e = new mg41(vi5Var);
        ng41 ng41Var = new ng41();
        ng41Var.m64377a();
        ng41Var.m64378b(200.0f);
        mg41 mg41Var = this.f217498e;
        mg41Var.f143328m = ng41Var;
        mg41Var.f143317b = this.f217494a;
        mg41Var.f143318c = true;
        ArrayList arrayList = mg41Var.f143327l;
        if (mg41Var.f143321f) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        mg41 mg41Var2 = this.f217498e;
        int i4 = ob31Var.f163528a;
        long j = Long.MIN_VALUE;
        if (i4 != 0 || jArr[i4] != Long.MIN_VALUE) {
            long j2 = jArr[i4];
            int i5 = 0;
            long j3 = j2;
            while (true) {
                long j4 = jArr[i4];
                if (j4 == j) {
                    break;
                }
                float f2 = j2 - j4;
                float fAbs = Math.abs(j4 - j3);
                if (f2 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                if (i4 == 0) {
                    i4 = 20;
                }
                i4--;
                i5++;
                if (i5 >= 20) {
                    break;
                }
                j3 = j4;
                j = Long.MIN_VALUE;
            }
            if (i5 >= 2) {
                float f3 = 1000.0f;
                if (i5 == 2) {
                    int i6 = ob31Var.f163528a;
                    int i7 = i6 == 0 ? 19 : i6 - 1;
                    float f4 = jArr[i6] - jArr[i7];
                    if (f4 != 0.0f) {
                        fSqrt = ((fArr[i6] - fArr[i7]) / f4) * 1000.0f;
                    }
                } else {
                    int i8 = ob31Var.f163528a;
                    int i9 = ((i8 - i5) + 21) % 20;
                    int i10 = (i8 + 21) % 20;
                    long j5 = jArr[i9];
                    float f5 = fArr[i9];
                    int i11 = i9 + 1;
                    int i12 = i11 % 20;
                    float f6 = 0.0f;
                    while (i12 != i10) {
                        long j6 = jArr[i12];
                        char c2 = c;
                        float f7 = f3;
                        float f8 = j6 - j5;
                        if (f8 == fSqrt) {
                            i = i11;
                        } else {
                            float f9 = fArr[i12];
                            int i13 = i11;
                            float f10 = (f9 - f5) / f8;
                            float fAbs2 = (Math.abs(f10) * (f10 - ((float) (Math.sqrt(2.0f * Math.abs(f6)) * ((double) Math.signum(f6)))))) + f6;
                            i = i13;
                            if (i12 == i) {
                                fAbs2 *= 0.5f;
                            }
                            f6 = fAbs2;
                            f5 = f9;
                            j5 = j6;
                        }
                        i12 = (i12 + 1) % 20;
                        i11 = i;
                        c = c2;
                        f3 = f7;
                        fSqrt = 0.0f;
                    }
                    fSqrt = ((float) (Math.sqrt(Math.abs(f6) * 2.0f) * ((double) Math.signum(f6)))) * f3;
                }
            }
        }
        mg41Var2.f143316a = fSqrt;
        mg41 mg41Var3 = this.f217498e;
        mg41Var3.f143322g = this.f217501h.f279793W0 + 1;
        mg41Var3.f143323h = -1.0f;
        mg41Var3.f143325j = 4.0f;
        wls wlsVar = new wls() { // from class: p.s691
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // p204p.wls
            /* JADX INFO: renamed from: a */
            public final void mo40228a(mg41 mg41Var4, boolean z, float f11) {
                t691 t691Var = this.f206033a;
                ka91 ka91Var = t691Var.f217501h;
                if (z) {
                    return;
                }
                mjr0 mjr0Var = mjr0.f144317c;
                if (f11 >= 1.0f) {
                    ka91Var.m95484D(ka91Var, mjr0Var, false);
                    return;
                }
                long j7 = ka91Var.f279793W0;
                z691 z691VarM55888V = ka91Var.m55888V(0);
                z691 z691Var = z691VarM55888V.f279787Q0;
                z691VarM55888V.f279787Q0 = null;
                ka91Var.mo55878K(-1L, t691Var.f217494a);
                ka91Var.mo55878K(j7, -1L);
                t691Var.f217494a = j7;
                Runnable runnable = t691Var.f217500g;
                if (runnable != null) {
                    runnable.run();
                }
                ka91Var.f279789S0.clear();
                if (z691Var != null) {
                    z691Var.m95484D(z691Var, mjr0Var, true);
                }
            }
        };
        ArrayList arrayList2 = mg41Var3.f143326k;
        if (arrayList2.contains(wlsVar)) {
            return;
        }
        arrayList2.add(wlsVar);
    }

    /* JADX INFO: renamed from: k */
    public final void m80155k() {
        ka91 ka91Var = this.f217501h;
        long j = ka91Var.f279793W0 == 0 ? 1L : 0L;
        ka91Var.mo55878K(j, this.f217494a);
        this.f217494a = j;
    }

    /* JADX INFO: renamed from: l */
    public final void m80156l() {
        this.f217495b = true;
        int i = this.f217497d;
        if (i == 1) {
            this.f217497d = 0;
            m80153i();
        } else if (i == 2) {
            this.f217497d = 0;
            this.f217500g = this.f217500g;
            m80154j();
            this.f217498e.m61688a(0.0f);
        }
    }
}
