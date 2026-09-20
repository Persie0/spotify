package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class sw81 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f214622a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tw81 f214623b;

    /* JADX INFO: renamed from: c */
    public int f214624c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw81(tw81 tw81Var, ibk ibkVar) {
        super(ibkVar);
        this.f214623b = tw81Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f214622a = obj;
        this.f214624c |= Integer.MIN_VALUE;
        return this.f214623b.m81662b(null, null, this);
    }
}
