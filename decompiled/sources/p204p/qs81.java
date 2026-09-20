package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qs81 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ eh00 f192037a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f192038b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f192039c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f192040d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f192041e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs81(eh00 eh00Var, float f, float f2, float f3, float f4) {
        super(1);
        this.f192037a = eh00Var;
        this.f192038b = f;
        this.f192039c = f2;
        this.f192040d = f3;
        this.f192041e = f4;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        float fFloatValue = ((Number) this.f192037a.invoke()).floatValue();
        return new y350((((long) ((int) wj50.m88249I(this.f192038b, this.f192039c, fFloatValue))) << 32) | (((long) ((int) wj50.m88249I(this.f192040d, this.f192041e, fFloatValue))) & 4294967295L));
    }
}
