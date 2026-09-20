package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class emi0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60924a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ imi0 f60925b;

    /* JADX INFO: renamed from: c */
    public int f60926c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emi0(imi0 imi0Var, ibk ibkVar) {
        super(ibkVar);
        this.f60925b = imi0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60924a = obj;
        this.f60926c |= Integer.MIN_VALUE;
        return this.f60925b.m51096b(this);
    }
}
