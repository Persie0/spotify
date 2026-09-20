package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n2b0 extends exh0 implements nfs {

    /* JADX INFO: renamed from: M0 */
    public final voi0 f149730M0;

    /* JADX INFO: renamed from: N0 */
    public final gw4 f149731N0 = s95.m77551a(1.0f);

    public n2b0(voi0 voi0Var) {
        this.f149730M0 = voi0Var;
    }

    @Override // p204p.nfs
    /* JADX INFO: renamed from: v0 */
    public final void mo25073v0(tgj tgjVar) {
        float fFloatValue = ((Number) this.f149731N0.m45912e()).floatValue();
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
        x0h1.m89578u(m40262v1(), null, 0, new xoa0(this, null, 5), 3);
    }
}
