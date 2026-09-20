package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class pqw extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f180437a;

    /* JADX INFO: renamed from: b */
    public int f180438b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f180439c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqw(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f180439c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f180437a = obj;
        this.f180438b |= Integer.MIN_VALUE;
        return this.f180439c.emit(null, this);
    }
}
