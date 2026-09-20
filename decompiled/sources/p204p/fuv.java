package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fuv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f73571a;

    /* JADX INFO: renamed from: b */
    public int f73572b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f73573c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fuv(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f73573c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f73571a = obj;
        this.f73572b |= Integer.MIN_VALUE;
        return this.f73573c.emit(null, this);
    }
}
