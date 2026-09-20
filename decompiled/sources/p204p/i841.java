package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i841 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f99692a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pa9 f99693b;

    public i841(float f, pa9 pa9Var) {
        this.f99692a = f;
        this.f99693b = pa9Var;
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        float fAbs = 1 - Math.abs(((Number) obj).intValue() / this.f99692a);
        pa9 pa9Var = this.f99693b;
        if (fAbs < 0.33f) {
            pa9Var.m69441f();
        } else {
            pa9Var.m69447l();
        }
        return w2a1.f247311a;
    }
}
