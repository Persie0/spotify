package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class bby0 extends hxu implements nfs {

    /* JADX INFO: renamed from: N0 */
    public final gw4 f25681N0;

    public bby0(voi0 voi0Var) {
        super(voi0Var);
        this.f25681N0 = s95.m77551a(1.0f);
    }

    @Override // p204p.hxu
    /* JADX INFO: renamed from: H1 */
    public final Object mo28649H1(fbk fbkVar) {
        Object objM45909c = gw4.m45909c(this.f25681N0, qyg1.m74179I(1.0f), null, null, null, fbkVar, 14);
        return objM45909c == yuk.f276404a ? objM45909c : w2a1.f247311a;
    }

    @Override // p204p.hxu
    /* JADX INFO: renamed from: I1 */
    public final Object mo28650I1(fbk fbkVar) {
        Object objM45909c = gw4.m45909c(this.f25681N0, qyg1.m74179I(0.9f), null, null, null, fbkVar, 14);
        return objM45909c == yuk.f276404a ? objM45909c : w2a1.f247311a;
    }

    @Override // p204p.nfs
    /* JADX INFO: renamed from: v0 */
    public final void mo25073v0(tgj tgjVar) {
        float fFloatValue = ((Number) this.f25681N0.m45912e()).floatValue();
        if (fFloatValue == 1.0f) {
            tgjVar.mo50174s1();
            return;
        }
        long jMo294i1 = tgjVar.mo294i1();
        c06 c06VarMo291d1 = tgjVar.mo291d1();
        long jM31085B = c06VarMo291d1.m31085B();
        c06VarMo291d1.m31107v().mo25287p();
        try {
            c06VarMo291d1.m31086C().m56033p(fFloatValue, fFloatValue, jMo294i1);
            tgjVar.mo50174s1();
        } finally {
            stz0.m79358l(c06VarMo291d1, jM31085B);
        }
    }
}
