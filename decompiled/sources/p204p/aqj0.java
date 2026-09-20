package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class aqj0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18262a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cqj0 f18263b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aqj0(cqj0 cqj0Var, int i) {
        super(1);
        this.f18262a = i;
        this.f18263b = cqj0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f18262a) {
            case 0:
                return ((rjg0) obj).m75642h(this.f18263b.f40904b);
            default:
                return ((rjg0) obj).m75641e(this.f18263b.f40904b);
        }
    }
}
