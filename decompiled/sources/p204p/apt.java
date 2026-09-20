package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class apt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18007a;

    /* JADX INFO: renamed from: b */
    public int f18008b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bpt f18009c;

    /* JADX INFO: renamed from: d */
    public bqz0 f18010d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apt(bpt bptVar, ibk ibkVar) {
        super(ibkVar);
        this.f18009c = bptVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f18007a = obj;
        this.f18008b |= Integer.MIN_VALUE;
        return this.f18009c.mo15629a(null, null, this);
    }
}
