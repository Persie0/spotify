package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lzs extends ibk {

    /* JADX INFO: renamed from: a */
    public bqz0 f138421a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f138422b;

    /* JADX INFO: renamed from: c */
    public int f138423c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ mzs f138424d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzs(mzs mzsVar, ibk ibkVar) {
        super(ibkVar);
        this.f138424d = mzsVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f138422b = obj;
        this.f138423c |= Integer.MIN_VALUE;
        return this.f138424d.mo15629a(null, null, this);
    }
}
