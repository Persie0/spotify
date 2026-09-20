package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xw91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f266620a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bx91 f266621b;

    /* JADX INFO: renamed from: c */
    public int f266622c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw91(bx91 bx91Var, ibk ibkVar) {
        super(ibkVar);
        this.f266621b = bx91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f266620a = obj;
        this.f266622c |= Integer.MIN_VALUE;
        return this.f266621b.m30765a(null, this);
    }
}
