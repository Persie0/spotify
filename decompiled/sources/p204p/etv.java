package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class etv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62807a;

    /* JADX INFO: renamed from: b */
    public int f62808b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f62809c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etv(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f62809c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f62807a = obj;
        this.f62808b |= Integer.MIN_VALUE;
        return this.f62809c.emit(null, this);
    }
}
