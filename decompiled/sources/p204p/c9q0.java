package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class c9q0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f35614a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e9q0 f35615b;

    /* JADX INFO: renamed from: c */
    public int f35616c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9q0(e9q0 e9q0Var, ibk ibkVar) {
        super(ibkVar);
        this.f35615b = e9q0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f35614a = obj;
        this.f35616c |= Integer.MIN_VALUE;
        return this.f35615b.m38252a(this);
    }
}
