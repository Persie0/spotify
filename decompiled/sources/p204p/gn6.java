package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gn6 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f81576a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jn6 f81577b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ h2l f81578c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gn6(jn6 jn6Var, h2l h2lVar, int i) {
        super(0);
        this.f81576a = i;
        this.f81577b = jn6Var;
        this.f81578c = h2lVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f81576a) {
            case 0:
                this.f81577b.f114023b.add(this.f81578c);
                break;
            default:
                this.f81577b.f114022a.mo53810d(this.f81578c);
                break;
        }
        return w2a1.f247311a;
    }
}
