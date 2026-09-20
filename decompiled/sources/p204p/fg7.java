package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fg7 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69237a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gxf f69238b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fg7(gxf gxfVar, int i) {
        super(1);
        this.f69237a = i;
        this.f69238b = gxfVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        uzq uzqVar;
        wzq wzqVar;
        switch (this.f69237a) {
            case 0:
                d850 d850Var = (d850) obj;
                int iOrdinal = ((viy0) this.f69238b.f85280e).ordinal();
                if (iOrdinal == 21) {
                    uzqVar = uzq.f235617a;
                } else {
                    if (iOrdinal != 22) {
                        throw new IllegalStateException("Facebook flow started from unexpected screen");
                    }
                    uzqVar = uzq.f235618b;
                }
                return new vzq(uzqVar, d850Var);
            default:
                d850 d850Var2 = (d850) obj;
                int iOrdinal2 = ((viy0) this.f69238b.f85280e).ordinal();
                if (iOrdinal2 == 21) {
                    wzqVar = wzq.f256661a;
                } else {
                    if (iOrdinal2 != 22) {
                        throw new IllegalStateException("Google flow started from unexpected screen");
                    }
                    wzqVar = wzq.f256662b;
                }
                return new xzq(wzqVar, d850Var2);
        }
    }
}
