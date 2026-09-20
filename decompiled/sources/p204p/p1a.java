package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class p1a extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f173011a;

    /* JADX INFO: renamed from: b */
    public int f173012b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ q1a f173013c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1a(q1a q1aVar, fbk fbkVar) {
        super(fbkVar);
        this.f173013c = q1aVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f173011a = obj;
        this.f173012b |= Integer.MIN_VALUE;
        return this.f173013c.emit(null, this);
    }
}
