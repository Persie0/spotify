package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fed extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68742a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ged f68743b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fed(ged gedVar, int i) {
        super(0);
        this.f68742a = i;
        this.f68743b = gedVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f68742a) {
            case 0:
                return new aeg0(new geg0(this.f68743b.f79094i));
            default:
                return this.f68743b.f79090e.create();
        }
    }
}
