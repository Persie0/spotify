package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class k3r0 implements yqq {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yqq f118960a;

    /* JADX INFO: renamed from: b */
    public boolean f118961b;

    /* JADX INFO: renamed from: c */
    public boolean f118962c;

    /* JADX INFO: renamed from: d */
    public final lsi0 f118963d = new lsi0(false);

    public k3r0(yqq yqqVar) {
        this.f118960a = yqqVar;
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: D */
    public final float mo26962D(long j) {
        return this.f118960a.mo26962D(j);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: L */
    public final long mo35985L(int i) {
        return this.f118960a.mo35985L(i);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: O */
    public final long mo35986O(float f) {
        return this.f118960a.mo35986O(f);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: O0 */
    public final float mo35987O0(int i) {
        return this.f118960a.mo35987O0(i);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: P0 */
    public final float mo35988P0(float f) {
        return this.f118960a.mo35988P0(f);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: W0 */
    public final float mo24617W0() {
        return this.f118960a.mo24617W0();
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: Z0 */
    public final float mo35989Z0(float f) {
        return this.f118960a.mo35989Z0(f);
    }

    /* JADX INFO: renamed from: a */
    public final void m55280a() {
        this.f118962c = true;
        lsi0 lsi0Var = this.f118963d;
        if (lsi0Var.m59836f()) {
            lsi0Var.mo54249c(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m55281b() {
        this.f118961b = true;
        lsi0 lsi0Var = this.f118963d;
        if (lsi0Var.m59836f()) {
            lsi0Var.mo54249c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m55282c(ibk ibkVar) {
        i3r0 i3r0Var;
        if (ibkVar instanceof i3r0) {
            i3r0Var = (i3r0) ibkVar;
            int i = i3r0Var.f98258c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i3r0Var.f98258c = i - Integer.MIN_VALUE;
            } else {
                i3r0Var = new i3r0(this, ibkVar);
            }
        } else {
            i3r0Var = new i3r0(this, ibkVar);
        }
        Object obj = i3r0Var.f98256a;
        int i2 = i3r0Var.f98258c;
        if (i2 == 0) {
            bga.m29073P(obj);
            i3r0Var.f98258c = 1;
            Object objMo54248a = this.f118963d.mo54248a(i3r0Var);
            yuk yukVar = yuk.f276404a;
            if (objMo54248a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        this.f118961b = false;
        this.f118962c = false;
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m55283d(ibk ibkVar) {
        j3r0 j3r0Var;
        if (ibkVar instanceof j3r0) {
            j3r0Var = (j3r0) ibkVar;
            int i = j3r0Var.f108460c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j3r0Var.f108460c = i - Integer.MIN_VALUE;
            } else {
                j3r0Var = new j3r0(this, ibkVar);
            }
        } else {
            j3r0Var = new j3r0(this, ibkVar);
        }
        Object obj = j3r0Var.f108458a;
        int i2 = j3r0Var.f108460c;
        lsi0 lsi0Var = this.f118963d;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (!this.f118961b && !this.f118962c) {
                j3r0Var.f108460c = 1;
                Object objMo54248a = lsi0Var.mo54248a(j3r0Var);
                yuk yukVar = yuk.f276404a;
                if (objMo54248a == yukVar) {
                    return yukVar;
                }
            }
            return Boolean.valueOf(this.f118961b);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(obj);
        lsi0Var.mo54249c(null);
        return Boolean.valueOf(this.f118961b);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: j */
    public final float mo24619j() {
        return this.f118960a.mo24619j();
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: l0 */
    public final int mo35990l0(float f) {
        return this.f118960a.mo35990l0(f);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: l1 */
    public final long mo35991l1(long j) {
        return this.f118960a.mo35991l1(j);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: t0 */
    public final float mo28377t0(long j) {
        return this.f118960a.mo28377t0(j);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: y */
    public final long mo26963y(float f) {
        return this.f118960a.mo26963y(f);
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: z */
    public final long mo35992z(long j) {
        return this.f118960a.mo35992z(j);
    }
}
