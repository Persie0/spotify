package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ukk extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f231303a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ogo f231304b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ukk(ogo ogoVar, int i) {
        super(1);
        this.f231303a = i;
        this.f231304b = ogoVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f231303a) {
            case 0:
                return new tkk(this.f231304b, 0);
            default:
                return new tkk(this.f231304b, 1);
        }
    }
}
