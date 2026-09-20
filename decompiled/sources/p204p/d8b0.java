package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class d8b0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46418a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f8b0 f46419b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f46420c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d8b0(f8b0 f8b0Var, int i, int i2) {
        super(1);
        this.f46418a = i2;
        this.f46419b = f8b0Var;
        this.f46420c = i;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f46418a) {
            case 0:
                return Boolean.valueOf(f8b0.m41022a(this.f46419b, this.f46420c, ((Number) obj).longValue()));
            default:
                return Boolean.valueOf(f8b0.m41022a(this.f46419b, this.f46420c, ((Number) obj).longValue()));
        }
    }
}
