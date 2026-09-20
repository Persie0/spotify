package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pws extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f182105a;

    /* JADX INFO: renamed from: b */
    public int f182106b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qws f182107c;

    /* JADX INFO: renamed from: d */
    public bqz0 f182108d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pws(qws qwsVar, ibk ibkVar) {
        super(ibkVar);
        this.f182107c = qwsVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f182105a = obj;
        this.f182106b |= Integer.MIN_VALUE;
        return this.f182107c.mo15629a(null, null, this);
    }
}
