package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class g8p extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77569a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ l8p f77570b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g8p(l8p l8pVar, int i) {
        super(0);
        this.f77569a = i;
        this.f77570b = l8pVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f77569a) {
            case 0:
                return (h6p) this.f77570b.f130914f.get();
            case 1:
                return (p8p) this.f77570b.f130909a.get();
            default:
                return (h7p) this.f77570b.f130911c.get();
        }
    }
}
