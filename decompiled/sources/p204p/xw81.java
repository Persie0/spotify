package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class xw81 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f266615a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yw81 f266616b;

    /* JADX INFO: renamed from: c */
    public int f266617c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw81(yw81 yw81Var, ibk ibkVar) {
        super(ibkVar);
        this.f266616b = yw81Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f266615a = obj;
        this.f266617c |= Integer.MIN_VALUE;
        return this.f266616b.m94786e(null, this);
    }
}
