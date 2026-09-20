package p204p;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class iyh extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f106992a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kyh f106993b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iyh(kyh kyhVar, int i) {
        super(1);
        this.f106992a = i;
        this.f106993b = kyhVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f106992a) {
            case 0:
                ((Number) obj).intValue();
                return this.f106993b.f127861i.mo24361d();
            default:
                yyh yyhVar = (yyh) obj;
                Consumer consumer = (Consumer) this.f106993b.f127858f.getValue();
                if (consumer != null) {
                    consumer.accept(new syh(yyhVar.f277510a, yyhVar.f277511b));
                }
                return w2a1.f247311a;
        }
    }
}
