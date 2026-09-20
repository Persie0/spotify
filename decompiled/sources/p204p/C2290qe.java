package p204p;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: renamed from: p.qe */
/* JADX INFO: loaded from: classes11.dex */
public final class C2290qe extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f187797a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f187798b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2290qe(Consumer consumer, int i) {
        super(0);
        this.f187797a = i;
        this.f187798b = consumer;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f187797a) {
            case 0:
                this.f187798b.accept(znr.f284549a);
                break;
            case 1:
                this.f187798b.accept(rj6.f199725a);
                break;
            case 2:
                this.f187798b.accept(s4t.f205640a);
                break;
            case 3:
                this.f187798b.accept(k5t.f119578a);
                break;
            case 4:
                this.f187798b.accept(fu10.f73373a);
                break;
            case 5:
                this.f187798b.accept(ior.f104279a);
                break;
            case 6:
                this.f187798b.accept(ior.f104279a);
                break;
            default:
                this.f187798b.accept(lor.f135535a);
                break;
        }
        return w2a1.f247311a;
    }
}
