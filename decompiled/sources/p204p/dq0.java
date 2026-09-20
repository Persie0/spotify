package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dq0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f51777a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hq0 f51778b;

    /* JADX INFO: renamed from: c */
    public int f51779c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq0(hq0 hq0Var, ibk ibkVar) {
        super(ibkVar);
        this.f51778b = hq0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f51777a = obj;
        this.f51779c |= Integer.MIN_VALUE;
        return hq0.m48190a(this.f51778b, null, this);
    }
}
