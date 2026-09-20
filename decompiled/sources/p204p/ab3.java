package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ab3 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13977a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ er70 f13978b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ab3(er70 er70Var, int i) {
        super(0);
        this.f13977a = i;
        this.f13978b = er70Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f13977a) {
            case 0:
                return (tl4) this.f13978b.get();
            case 1:
                return (ha4) this.f13978b.get();
            case 2:
                return (udp) this.f13978b.get();
            case 3:
                return Boolean.valueOf(((ki4) this.f13978b.get()).m56472b());
            case 4:
                return Boolean.valueOf(((ki4) this.f13978b.get()).m56472b());
            case 5:
                return (Set) this.f13978b.get();
            default:
                return (n2s0) this.f13978b.get();
        }
    }
}
