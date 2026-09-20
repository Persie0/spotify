package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class d0i extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43898a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mx4 f43899b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0i(mx4 mx4Var, int i) {
        super(2);
        this.f43898a = i;
        this.f43899b = mx4Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f43898a) {
            case 0:
                return new n6f(this.f43899b.f147947c);
            case 1:
                return new n6f(this.f43899b.f147945a);
            default:
                return new n6f(this.f43899b.f147946b);
        }
    }
}
