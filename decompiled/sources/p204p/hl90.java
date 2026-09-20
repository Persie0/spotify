package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hl90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f92652a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rb5 f92653b;

    /* JADX INFO: renamed from: c */
    public int f92654c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl90(rb5 rb5Var, ibk ibkVar) {
        super(ibkVar);
        this.f92653b = rb5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f92652a = obj;
        this.f92654c |= Integer.MIN_VALUE;
        return this.f92653b.m75153u(0, this);
    }
}
