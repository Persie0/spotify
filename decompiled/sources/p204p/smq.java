package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class smq extends xlq implements osh, eqk0 {

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ int f210700O0;

    /* JADX INFO: renamed from: P0 */
    public final voi0 f210701P0;

    /* JADX INFO: renamed from: Q0 */
    public final boolean f210702Q0;

    /* JADX INFO: renamed from: R0 */
    public final float f210703R0;

    /* JADX INFO: renamed from: S0 */
    public final q8f f210704S0;

    /* JADX INFO: renamed from: T0 */
    public no4 f210705T0;

    public smq(voi0 voi0Var, boolean z, float f, q8f q8fVar) {
        this.f210700O0 = 0;
        this.f210701P0 = voi0Var;
        this.f210702Q0 = z;
        this.f210703R0 = f;
        this.f210704S0 = q8fVar;
    }

    @Override // p204p.eqk0
    /* JADX INFO: renamed from: j0 */
    public final void mo25072j0() {
        switch (this.f210700O0) {
            case 0:
                frz0.m42532q(this, new qmq(this, 0));
                break;
            default:
                frz0.m42532q(this, new pmq(this, 1));
                break;
        }
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: z1 */
    public final void mo25074z1() {
        switch (this.f210700O0) {
            case 0:
                frz0.m42532q(this, new qmq(this, 0));
                break;
            default:
                frz0.m42532q(this, new pmq(this, 1));
                break;
        }
    }

    public smq(voi0 voi0Var, boolean z, q8f q8fVar) {
        this.f210700O0 = 1;
        this.f210701P0 = voi0Var;
        this.f210702Q0 = z;
        this.f210703R0 = Float.NaN;
        this.f210704S0 = q8fVar;
    }
}
