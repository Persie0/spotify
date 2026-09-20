package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class noy extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f156816a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f156817b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ moy f156818c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ noy(gh00 gh00Var, moy moyVar, int i) {
        super(0);
        this.f156816a = i;
        this.f156817b = gh00Var;
        this.f156818c = moyVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f156816a) {
            case 0:
                this.f156817b.invoke(new yny(this.f156818c.f145779b));
                break;
            default:
                this.f156817b.invoke(new nny(this.f156818c.f145779b));
                break;
        }
        return w2a1.f247311a;
    }
}
