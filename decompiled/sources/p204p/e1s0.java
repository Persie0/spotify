package p204p;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final class e1s0 extends qe70 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55247a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f55248b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1s0(Consumer consumer, int i) {
        super(3);
        this.f55247a = i;
        this.f55248b = consumer;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        switch (this.f55247a) {
            case 0:
                ((Number) obj2).intValue();
                this.f55248b.accept(new rzr0((p0s0) obj, (d850) obj3));
                break;
            case 1:
                ((Number) obj2).intValue();
                this.f55248b.accept(new rzr0((p0s0) obj, (d850) obj3));
                break;
            default:
                ((Number) obj2).intValue();
                this.f55248b.accept(new szr0((p0s0) obj, (d850) obj3));
                break;
        }
        return w2a1.f247311a;
    }
}
