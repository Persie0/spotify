package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vix implements k890, v8j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f241803a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f241804b;

    public /* synthetic */ vix(boolean z, int i) {
        this.f241803a = i;
        this.f241804b = z;
    }

    @Override // p204p.v8j
    public void accept(Object obj) {
        switch (this.f241803a) {
            case 3:
                ((pdp0) obj).mo43845L(this.f241804b);
                break;
            case 4:
                ((pdp0) obj).mo43867X(this.f241804b);
                break;
            default:
                ((pdp0) obj).mo43897m0(this.f241804b);
                break;
        }
    }

    @Override // p204p.k890
    public void invoke(Object obj) {
        switch (this.f241803a) {
            case 0:
                ((d7p0) obj).mo35207I(this.f241804b);
                break;
            case 1:
                ((d7p0) obj).mo35215i(this.f241804b);
                break;
            default:
                ((d7p0) obj).mo35207I(this.f241804b);
                break;
        }
    }
}
