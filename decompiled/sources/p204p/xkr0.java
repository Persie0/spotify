package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xkr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f262927a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ykr0 f262928b;

    /* JADX INFO: renamed from: c */
    public int f262929c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkr0(ykr0 ykr0Var, ibk ibkVar) {
        super(ibkVar);
        this.f262928b = ykr0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f262927a = obj;
        this.f262929c |= Integer.MIN_VALUE;
        return this.f262928b.m94121f(false, this);
    }
}
