package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jc80 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f111013a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kc80 f111014b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zam0 f111015c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jc80(kc80 kc80Var, zam0 zam0Var, int i) {
        super(0);
        this.f111013a = i;
        this.f111014b = kc80Var;
        this.f111015c = zam0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f111013a) {
            case 0:
                this.f111014b.f121402a.m65211a(this.f111015c, false);
                break;
            default:
                this.f111014b.f121402a.m65211a(this.f111015c, true);
                break;
        }
        return w2a1.f247311a;
    }
}
