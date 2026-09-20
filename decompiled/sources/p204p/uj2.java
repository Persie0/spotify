package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class uj2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f230865a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ck2 f230866b;

    /* JADX INFO: renamed from: c */
    public int f230867c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj2(ck2 ck2Var, ibk ibkVar) {
        super(ibkVar);
        this.f230866b = ck2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f230865a = obj;
        this.f230867c |= Integer.MIN_VALUE;
        return this.f230866b.m33053J(this);
    }
}
