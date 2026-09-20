package p204p;

import androidx.compose.p002ui.input.pointer.CancelTimeoutCancellationException;
import androidx.compose.p002ui.input.pointer.PointerEventTimeoutCancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class sb61 implements yqq, fbk {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ub61 f207366a;

    /* JADX INFO: renamed from: b */
    public final hqb f207367b;

    /* JADX INFO: renamed from: c */
    public hqb f207368c;

    /* JADX INFO: renamed from: d */
    public f6q0 f207369d = f6q0.f66486b;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ub61 f207370e;

    public sb61(ub61 ub61Var, hqb hqbVar) {
        this.f207370e = ub61Var;
        this.f207366a = ub61Var;
        this.f207367b = hqbVar;
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: D */
    public final float mo26962D(long j) {
        return this.f207366a.mo26962D(j);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: L */
    public final long mo35985L(int i) {
        return this.f207366a.mo35985L(i);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: O */
    public final long mo35986O(float f) {
        return this.f207366a.mo35986O(f);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: O0 */
    public final float mo35987O0(int i) {
        return this.f207366a.mo35987O0(i);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: P0 */
    public final float mo35988P0(float f) {
        return f / this.f207366a.mo24619j();
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: W0 */
    public final float mo24617W0() {
        return this.f207366a.mo24617W0();
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: Z0 */
    public final float mo35989Z0(float f) {
        return this.f207366a.mo24619j() * f;
    }

    /* JADX INFO: renamed from: a */
    public final Object m77709a(f6q0 f6q0Var, fbk fbkVar) {
        hqb hqbVar = new hqb(1, seg1.m77914f(fbkVar));
        hqbVar.m48222q();
        this.f207369d = f6q0Var;
        this.f207368c = hqbVar;
        return hqbVar.m48221p();
    }

    /* JADX INFO: renamed from: b */
    public final long m77710b() {
        ub61 ub61Var = this.f207370e;
        ub61Var.getClass();
        long jMo35991l1 = ub61Var.mo35991l1(wjg1.m88319I(ub61Var).f135668Z0.mo51232e());
        long j = ub61Var.f228647W0;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo35991l1 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo35991l1 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    /* JADX INFO: renamed from: c */
    public final pec1 m77711c() {
        ub61 ub61Var = this.f207370e;
        ub61Var.getClass();
        return wjg1.m88319I(ub61Var).f135668Z0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m77712d(long j, th00 th00Var, ly8 ly8Var) {
        qb61 qb61Var;
        di41 di41VarM89578u;
        Throwable th;
        hqb hqbVar;
        if (ly8Var instanceof qb61) {
            qb61Var = (qb61) ly8Var;
            int i = qb61Var.f187024d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qb61Var.f187024d = i - Integer.MIN_VALUE;
            } else {
                qb61Var = new qb61(this, ly8Var);
            }
        } else {
            qb61Var = new qb61(this, ly8Var);
        }
        Object objInvoke = qb61Var.f187022b;
        int i2 = qb61Var.f187024d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            di41VarM89578u = qb61Var.f187021a;
            try {
                bga.m29073P(objInvoke);
                di41VarM89578u.mo26601e(CancelTimeoutCancellationException.f500a);
                return objInvoke;
            } catch (Throwable th2) {
                th = th2;
                di41VarM89578u.mo26601e(CancelTimeoutCancellationException.f500a);
                throw th;
            }
        }
        bga.m29073P(objInvoke);
        if (j <= 0 && (hqbVar = this.f207368c) != null) {
            hqbVar.resumeWith(new c6x0(new PointerEventTimeoutCancellationException(j)));
        }
        di41VarM89578u = x0h1.m89578u(this.f207370e.m40262v1(), null, 0, new gu4(j, this, (fbk) null, 12), 3);
        try {
            qb61Var.f187021a = di41VarM89578u;
            qb61Var.f187024d = 1;
            objInvoke = th00Var.invoke(this, qb61Var);
            Object obj = yuk.f276404a;
            if (objInvoke == obj) {
                return obj;
            }
            di41VarM89578u.mo26601e(CancelTimeoutCancellationException.f500a);
            return objInvoke;
        } catch (Throwable th3) {
            th = th3;
            di41VarM89578u.mo26601e(CancelTimeoutCancellationException.f500a);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m77713e(long j, th00 th00Var, ly8 ly8Var) {
        rb61 rb61Var;
        if (ly8Var instanceof rb61) {
            rb61Var = (rb61) ly8Var;
            int i = rb61Var.f197515c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rb61Var.f197515c = i - Integer.MIN_VALUE;
            } else {
                rb61Var = new rb61(this, ly8Var);
            }
        } else {
            rb61Var = new rb61(this, ly8Var);
        }
        Object obj = rb61Var.f197513a;
        int i2 = rb61Var.f197515c;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
                return obj;
            }
            bga.m29073P(obj);
            rb61Var.f197515c = 1;
            Object objM77712d = m77712d(j, th00Var, rb61Var);
            Object obj2 = yuk.f276404a;
            return objM77712d == obj2 ? obj2 : objM77712d;
        } catch (PointerEventTimeoutCancellationException unused) {
            return null;
        }
    }

    @Override // p204p.fbk
    public final juk getContext() {
        return dau.f47107a;
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: j */
    public final float mo24619j() {
        return this.f207366a.mo24619j();
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: l0 */
    public final int mo35990l0(float f) {
        return this.f207366a.mo35990l0(f);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: l1 */
    public final long mo35991l1(long j) {
        return this.f207366a.mo35991l1(j);
    }

    @Override // p204p.fbk
    public final void resumeWith(Object obj) {
        ub61 ub61Var = this.f207370e;
        synchronized (ub61Var.f228644T0) {
            ub61Var.f228643S0.m73564k(this);
        }
        this.f207367b.resumeWith(obj);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: t0 */
    public final float mo28377t0(long j) {
        return this.f207366a.mo28377t0(j);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: y */
    public final long mo26963y(float f) {
        return this.f207366a.mo26963y(f);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: z */
    public final long mo35992z(long j) {
        return this.f207366a.mo35992z(j);
    }
}
