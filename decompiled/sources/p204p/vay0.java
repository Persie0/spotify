package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vay0 extends exh0 implements nfs, dp70 {

    /* JADX INFO: renamed from: M0 */
    public final voi0 f239343M0;

    /* JADX INFO: renamed from: N0 */
    public final gw4 f239344N0 = s95.m77551a(1.0f);

    /* JADX INFO: renamed from: O0 */
    public final gw4 f239345O0 = s95.m77551a(1.0f);

    public vay0(voi0 voi0Var) {
        this.f239343M0 = voi0Var;
    }

    @Override // p204p.dp70
    /* JADX INFO: renamed from: i */
    public final n6d0 mo25071i(o6d0 o6d0Var, h6d0 h6d0Var, long j) {
        t5o0 t5o0VarMo39619B = h6d0Var.mo39619B(j);
        return o6d0Var.mo44714T(t5o0VarMo39619B.f217322a, t5o0VarMo39619B.f217323b, nau.f152117a, new y3w0(26, t5o0VarMo39619B, this));
    }

    @Override // p204p.nfs
    /* JADX INFO: renamed from: v0 */
    public final void mo25073v0(tgj tgjVar) {
        float fFloatValue = ((Number) this.f239344N0.m45912e()).floatValue();
        long jMo294i1 = tgjVar.mo294i1();
        c06 c06VarMo291d1 = tgjVar.mo291d1();
        long jM31085B = c06VarMo291d1.m31085B();
        c06VarMo291d1.m31107v().mo25287p();
        try {
            ((kca) c06VarMo291d1.f32694b).m56033p(fFloatValue, fFloatValue, jMo294i1);
            tgjVar.mo50174s1();
        } finally {
            stz0.m79358l(c06VarMo291d1, jM31085B);
        }
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: z1 */
    public final void mo25074z1() {
        x0h1.m89578u(m40262v1(), null, 0, new tay0(this, null, 4), 3);
    }
}
