package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wpi0 implements fmu0 {

    /* JADX INFO: renamed from: a */
    public final zv41 f253772a;

    public wpi0(Object obj) {
        this.f253772a = jag1.m52819d(obj);
    }

    @Override // p204p.fmu0
    /* JADX INFO: renamed from: a */
    public final fiz mo26211a() {
        return this.f253772a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.fmu0
    /* JADX INFO: renamed from: b */
    public final Object mo26212b(th00 th00Var, fbk fbkVar) {
        vpi0 vpi0Var;
        if (fbkVar instanceof vpi0) {
            vpi0Var = (vpi0) fbkVar;
            int i = vpi0Var.f243699c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vpi0Var.f243699c = i - Integer.MIN_VALUE;
            } else {
                vpi0Var = new vpi0(this, fbkVar);
            }
        } else {
            vpi0Var = new vpi0(this, fbkVar);
        }
        Object obj = vpi0Var.f243697a;
        int i2 = vpi0Var.f243699c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw edb.m38575x(obj);
        }
        bga.m29073P(obj);
        pw00 pw00Var = new pw00(1, th00Var);
        vpi0Var.f243699c = 1;
        this.f253772a.collect(pw00Var, vpi0Var);
        return yuk.f276404a;
    }

    /* JADX INFO: renamed from: c */
    public final void m88718c(Object obj) {
        this.f253772a.m97090l(obj);
    }

    @Override // p204p.fmu0
    public final Object getValue() {
        return this.f253772a.getValue();
    }
}
