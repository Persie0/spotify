package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class k1t extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f118421a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o1t f118422b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1t(o1t o1tVar, int i) {
        super(2);
        this.f118421a = i;
        this.f118422b = o1tVar;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f118421a) {
            case 0:
                return (dut) this.f118422b.f160843b.get();
            default:
                return (dut) this.f118422b.f160845d.get();
        }
    }
}
