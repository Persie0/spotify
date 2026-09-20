package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d470 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f45096a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e470 f45097b;

    /* JADX INFO: renamed from: c */
    public int f45098c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d470(e470 e470Var, ibk ibkVar) {
        super(ibkVar);
        this.f45097b = e470Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f45096a = obj;
        this.f45098c |= Integer.MIN_VALUE;
        return this.f45097b.m37764h(null, this);
    }
}
