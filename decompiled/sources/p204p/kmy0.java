package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kmy0 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f124240a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nmy0 f124241b;

    public /* synthetic */ kmy0(nmy0 nmy0Var, int i) {
        this.f124240a = i;
        this.f124241b = nmy0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f124240a) {
            case 0:
                return Boolean.valueOf(this.f124241b.f63766L0);
            default:
                pqz pqzVar = this.f124241b.f156288n1;
                if (!pqzVar.f63770a.f63766L0) {
                    return null;
                }
                kqz kqzVarM70695L1 = pqzVar.m70695L1();
                if (!kqzVarM70695L1.m57128a()) {
                    return null;
                }
                if (kqzVarM70695L1.m57129b()) {
                    return pqzVar.m70694K1(null);
                }
                pqz pqzVarM76202h = ((rpz) ((oz3) wjg1.m88320J(pqzVar)).getFocusOwner()).m76202h();
                if (pqzVarM76202h != null) {
                    return pqzVarM76202h.m70694K1(wjg1.m88317G(pqzVar));
                }
                return null;
        }
    }
}
