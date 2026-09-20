package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hog extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f93533a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f93534b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a89 f93535c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hog(gh00 gh00Var, a89 a89Var, int i) {
        super(0);
        this.f93533a = i;
        this.f93534b = gh00Var;
        this.f93535c = a89Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f93533a) {
            case 0:
                this.f93534b.invoke(new rte1(this.f93535c.f13227d));
                break;
            case 1:
                this.f93534b.invoke(new gi70(this.f93535c.f13227d));
                break;
            case 2:
                this.f93534b.invoke(new rte1(this.f93535c.f13227d));
                break;
            default:
                this.f93534b.invoke(new hv21(this.f93535c.f13227d));
                break;
        }
        return w2a1.f247311a;
    }
}
