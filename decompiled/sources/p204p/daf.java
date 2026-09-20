package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class daf implements baf {

    /* JADX INFO: renamed from: a */
    public static final daf f47039a = new daf();

    @Override // p204p.baf
    /* JADX INFO: renamed from: a */
    public final fxh0 mo28581a(float f, fxh0 fxh0Var, boolean z) {
        if (f <= 0.0d) {
            kt40.m57301a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return fxh0Var.mo34315F(new cr70(f, z));
    }

    @Override // p204p.baf
    /* JADX INFO: renamed from: b */
    public final fxh0 mo28582b(ub9 ub9Var, fxh0 fxh0Var) {
        return tfe.m80655m(ub9Var, fxh0Var);
    }
}
