package p204p;

import com.spotify.mobius.functions.Consumer;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class a541 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12428a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f12429b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a541(Consumer consumer, int i) {
        super(1);
        this.f12428a = i;
        this.f12429b = consumer;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f12428a) {
            case 0:
                y441 y441Var = (y441) obj;
                boolean z = y441Var instanceof x441;
                Consumer consumer = this.f12429b;
                if (z) {
                    consumer.accept(new x141(((x441) y441Var).f257986a));
                } else {
                    if (!(y441Var instanceof w441)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    consumer.accept(new x141(((w441) y441Var).f247704a));
                }
                return w2a1.f247311a;
            default:
                this.f12429b.accept(new pzr0((p0s0) obj));
                return w2a1.f247311a;
        }
    }
}
