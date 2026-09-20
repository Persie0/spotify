package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class d9w extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f46919a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f46920b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ y6s0 f46921c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9w(boolean z, float f, y6s0 y6s0Var) {
        super(0);
        this.f46919a = z;
        this.f46920b = f;
        this.f46921c = y6s0Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    @Override // p204p.eh00
    public final Object invoke() {
        boolean z;
        if (this.f46919a) {
            z = true;
        } else {
            float f = this.f46920b;
            if (f <= 0.0f || (f >= 1.0d && this.f46921c.mo87307f())) {
                z = false;
            } else {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
