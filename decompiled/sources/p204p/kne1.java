package p204p;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes11.dex */
public final class kne1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f124398a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tw90 f124399b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kne1(tw90 tw90Var, int i) {
        super(0);
        this.f124398a = i;
        this.f124399b = tw90Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f124398a) {
            case 0:
                tw90 tw90Var = this.f124399b;
                ((sfa0) ((vv91) tw90Var.f224387g)).m78000H(dme1.f50506d);
                Consumer consumer = (Consumer) tw90Var.f224388h;
                if (consumer != null) {
                    consumer.accept(pme1.f179025a);
                }
                break;
            default:
                tw90 tw90Var2 = this.f124399b;
                ((sfa0) ((vv91) tw90Var2.f224387g)).m78000H(dme1.f50506d);
                Consumer consumer2 = (Consumer) tw90Var2.f224388h;
                if (consumer2 != null) {
                    consumer2.accept(rme1.f200529a);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
