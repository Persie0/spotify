package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class epj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public int f61655a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f61656b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gpj0 f61657c;

    /* JADX INFO: renamed from: d */
    public int f61658d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epj0(gpj0 gpj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f61657c = gpj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f61656b = obj;
        this.f61658d |= Integer.MIN_VALUE;
        return this.f61657c.m45374a(0, this);
    }
}
