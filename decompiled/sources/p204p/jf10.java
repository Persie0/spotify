package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class jf10 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f111787a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2420tm f111788b;

    /* JADX INFO: renamed from: c */
    public int f111789c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf10(C2420tm c2420tm, ibk ibkVar) {
        super(ibkVar);
        this.f111788b = c2420tm;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f111787a = obj;
        this.f111789c |= Integer.MIN_VALUE;
        return C2420tm.m81082b(this.f111788b, this);
    }
}
