package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dib extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49298a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f49299b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fgu f49300c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dib(gh00 gh00Var, fgu fguVar, int i) {
        super(0);
        this.f49298a = i;
        this.f49299b = gh00Var;
        this.f49300c = fguVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f49298a) {
            case 0:
                this.f49299b.invoke("information_incorrect");
                this.f49300c.m41614a();
                break;
            default:
                this.f49299b.invoke("artist_image_problem");
                this.f49300c.m41614a();
                break;
        }
        return w2a1.f247311a;
    }
}
