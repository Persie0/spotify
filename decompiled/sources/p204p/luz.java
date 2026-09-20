package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class luz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f137175a;

    /* JADX INFO: renamed from: b */
    public int f137176b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ muz f137177c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public luz(muz muzVar, fbk fbkVar) {
        super(fbkVar);
        this.f137177c = muzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f137175a = obj;
        this.f137176b |= Integer.MIN_VALUE;
        return this.f137177c.emit(null, this);
    }
}
