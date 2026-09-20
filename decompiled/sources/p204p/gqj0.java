package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class gqj0 extends mmq {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f83485c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gqj0(jd21 jd21Var, int i) {
        super(jd21Var);
        this.f83485c = i;
    }

    @Override // p204p.lmq, p204p.gd70
    /* JADX INFO: renamed from: D0 */
    public final boolean mo36064D0() {
        switch (this.f83485c) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // p204p.lmq
    /* JADX INFO: renamed from: N0 */
    public final lmq mo45438N0(jd21 jd21Var) {
        switch (this.f83485c) {
            case 0:
                return new gqj0(jd21Var, 0);
            default:
                return new gqj0(jd21Var, 1);
        }
    }
}
