package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class tl60 extends AbstractC1887g7 {

    /* JADX INFO: renamed from: f */
    public final yk60 f221347f;

    public tl60(fk60 fk60Var, yk60 yk60Var, String str) {
        super(str, fk60Var);
        this.f221347f = yk60Var;
        this.f77146a.add("primitive");
    }

    @Override // p204p.AbstractC1887g7
    /* JADX INFO: renamed from: G */
    public final yk60 mo29809G() {
        return this.f221347f;
    }

    @Override // p204p.AbstractC1887g7
    /* JADX INFO: renamed from: e */
    public final yk60 mo29815e(String str) {
        if (str == "primitive") {
            return this.f221347f;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: p */
    public final int mo29816p(ktz0 ktz0Var) {
        return 0;
    }
}
