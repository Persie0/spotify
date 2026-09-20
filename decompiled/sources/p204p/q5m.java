package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class q5m extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f185564a;

    /* JADX INFO: renamed from: b */
    public int f185565b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v1a f185566c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5m(v1a v1aVar, fbk fbkVar) {
        super(fbkVar);
        this.f185566c = v1aVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f185564a = obj;
        this.f185565b |= Integer.MIN_VALUE;
        return this.f185566c.emit(null, this);
    }
}
