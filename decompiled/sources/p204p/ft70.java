package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ft70 {

    /* JADX INFO: renamed from: a */
    public vum0 f73127a;

    /* JADX INFO: renamed from: b */
    public vum0 f73128b;

    /* JADX INFO: renamed from: b */
    public static fxh0 m42580b(ft70 ft70Var, fxh0 fxh0Var, im91 im91Var, w9z w9zVar, int i) {
        w9z w9zVarM53286y = im91Var;
        if ((i & 1) != 0) {
            w9zVarM53286y = jg31.m53286y(0.0f, 400.0f, null, 5);
        }
        if ((i & 2) != 0) {
            long j = 1;
            w9zVar = jg31.m53286y(0.0f, 400.0f, new y350((j & 4294967295L) | (j << 32)), 1);
        }
        return ft70Var.m42582a(fxh0Var, w9zVarM53286y, w9zVar, jg31.m53286y(0.0f, 400.0f, null, 5));
    }

    /* JADX INFO: renamed from: a */
    public final fxh0 m42582a(fxh0 fxh0Var, w9z w9zVar, w9z w9zVar2, pg41 pg41Var) {
        return (w9zVar == null && w9zVar2 == null && pg41Var == null) ? fxh0Var : fxh0Var.mo34315F(new nu70(w9zVar, w9zVar2, pg41Var));
    }

    /* JADX INFO: renamed from: c */
    public final fxh0 m42583c(float f, fxh0 fxh0Var) {
        return fxh0Var.mo34315F(new lwm0(f, this.f73127a));
    }
}
