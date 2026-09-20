package p204p;

import com.spotify.mobius.functions.Consumer;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class nk6 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f154798a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f154799b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nk6(Consumer consumer, int i) {
        super(2);
        this.f154798a = i;
        this.f154799b = consumer;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f154798a) {
            case 0:
                ((Number) obj2).intValue();
                this.f154799b.accept(new ck6(null, (kyy) obj));
                return w2a1.f247311a;
            case 1:
                axy0 axy0Var = (axy0) obj;
                boolean z = axy0Var instanceof ywy0;
                Consumer consumer = this.f154799b;
                if (z) {
                    String str = ((ywy0) axy0Var).f277078a;
                    consumer.accept(new ck6(str, str.length() == 0 ? kyy.TOP : null));
                } else if (axy0Var instanceof xwy0) {
                    consumer.accept(new ck6("", kyy.TOP));
                } else if (!(axy0Var instanceof zwy0)) {
                    throw new NoWhenBranchMatchedException();
                }
                return w2a1.f247311a;
            default:
                this.f154799b.accept(new ozr0((p0s0) obj, ((Number) obj2).intValue()));
                return w2a1.f247311a;
        }
    }
}
