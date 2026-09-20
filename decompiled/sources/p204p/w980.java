package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w980 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f249112a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ y980 f249113b;

    /* JADX INFO: renamed from: c */
    public int f249114c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w980(y980 y980Var, ibk ibkVar) {
        super(ibkVar);
        this.f249113b = y980Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f249112a = obj;
        this.f249114c |= Integer.MIN_VALUE;
        return y980.m93149a(this.f249113b, this);
    }
}
