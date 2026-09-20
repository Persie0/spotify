package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class z1q extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f278397a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p36 f278398b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1q(p36 p36Var, int i) {
        super(2);
        this.f278397a = i;
        this.f278398b = p36Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f278397a) {
            case 0:
                ((gh00) this.f278398b.f173563d).invoke(new zzv0(((Number) obj).intValue(), (String) obj2));
                break;
            default:
                ((gh00) this.f278398b.f173563d).invoke(new yzv0(((Number) obj).intValue(), (String) obj2));
                break;
        }
        return w2a1.f247311a;
    }
}
