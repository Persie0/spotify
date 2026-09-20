package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dpt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f51740a;

    /* JADX INFO: renamed from: b */
    public int f51741b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fpt f51742c;

    /* JADX INFO: renamed from: d */
    public bqz0 f51743d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpt(fpt fptVar, ibk ibkVar) {
        super(ibkVar);
        this.f51742c = fptVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f51740a = obj;
        this.f51741b |= Integer.MIN_VALUE;
        return this.f51742c.mo15629a(null, null, this);
    }
}
