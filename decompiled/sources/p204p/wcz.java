package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wcz extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f250148a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f250149b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f250150c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wcz(boolean z, boolean z2, boolean z3) {
        super(1);
        this.f250148a = z;
        this.f250149b = z2;
        this.f250150c = z3;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        fdz fdzVar = (fdz) obj;
        String str = fdzVar.f68619b;
        int iOrdinal = fdzVar.f68620c.ordinal();
        boolean z = true;
        if (iOrdinal != 3) {
            if (iOrdinal == 7) {
                z = this.f250150c;
            } else if (iOrdinal != 9) {
                z = false;
            }
        } else if (!this.f250148a && !this.f250149b) {
            z = false;
        }
        if (z) {
            return str;
        }
        return null;
    }
}
