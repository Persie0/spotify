package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class laq0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qlv0 f131390a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ maq0 f131391b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c450 f131392c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f131393d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f131394e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public laq0(qlv0 qlv0Var, maq0 maq0Var, c450 c450Var, long j, long j2) {
        super(0);
        this.f131390a = qlv0Var;
        this.f131391b = maq0Var;
        this.f131392c = c450Var;
        this.f131393d = j;
        this.f131394e = j2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        maq0 maq0Var = this.f131391b;
        this.f131390a.f189932a = maq0Var.getPositionProvider().mo26626a(this.f131392c, this.f131393d, maq0Var.getParentLayoutDirection(), this.f131394e);
        return w2a1.f247311a;
    }
}
