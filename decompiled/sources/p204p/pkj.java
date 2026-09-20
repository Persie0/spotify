package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pkj extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f178471a;

    /* JADX INFO: renamed from: b */
    public int f178472b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qkj f178473c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkj(qkj qkjVar, fbk fbkVar) {
        super(fbkVar);
        this.f178473c = qkjVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f178471a = obj;
        this.f178472b |= Integer.MIN_VALUE;
        return this.f178473c.emit(null, this);
    }
}
