package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class d0e0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43856a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xre f43857b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0e0(xre xreVar, int i) {
        super(0);
        this.f43856a = i;
        this.f43857b = xreVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f43856a) {
            case 0:
                return Long.valueOf(this.f43857b != null ? System.currentTimeMillis() : 0L);
            default:
                return dq60.m36607g((wy3) this.f43857b);
        }
    }
}
