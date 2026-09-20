package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class n7d extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f151134a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p7d f151135b;

    /* JADX INFO: renamed from: c */
    public int f151136c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7d(p7d p7dVar, ibk ibkVar) {
        super(ibkVar);
        this.f151135b = p7dVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f151134a = obj;
        this.f151136c |= Integer.MIN_VALUE;
        return p7d.m69253a(this.f151135b, null, this);
    }
}
