package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class onx0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f167395a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rr60 f167396b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ onx0(rr60 rr60Var, int i) {
        super(0);
        this.f167395a = i;
        this.f167396b = rr60Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f167395a) {
            case 0:
                throw new IllegalArgumentException("Cannot generate NavArguments for polymorphic serializer " + this.f167396b + ". Arguments can only be generated from concrete classes or objects.");
            default:
                StringBuilder sb = new StringBuilder("Cannot generate route pattern from polymorphic class ");
                up60 up60VarM87004i = w1h1.m87004i(this.f167396b.getDescriptor());
                throw new IllegalArgumentException(dq60.m36616p(up60VarM87004i != null ? up60VarM87004i.mo29111F() : null, ". Routes can only be generated from concrete classes or objects.", sb));
        }
    }
}
