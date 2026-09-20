package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t6s0 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f217602a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ete f217603b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f217604c;

    public /* synthetic */ t6s0(float f, ete eteVar, int i) {
        this.f217602a = f;
        this.f217603b = eteVar;
        this.f217604c = i;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        Float fValueOf = Float.valueOf(this.f217602a);
        ete eteVar = this.f217603b;
        jpz0.m54006t((mpz0) obj, new i4s0(((Number) n0e1.m63442s(fValueOf, eteVar)).floatValue(), eteVar, this.f217604c));
        return w2a1.f247311a;
    }
}
