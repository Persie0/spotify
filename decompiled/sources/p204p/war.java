package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class war extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f249584a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yar f249585b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ war(yar yarVar, int i) {
        super(0);
        this.f249584a = i;
        this.f249585b = yarVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f249584a) {
            case 0:
                yar yarVar = this.f249585b;
                yarVar.f270972d = null;
                yarVar.f270973e.clear();
                break;
            default:
                this.f249585b.f270973e.clear();
                break;
        }
        return w2a1.f247311a;
    }
}
