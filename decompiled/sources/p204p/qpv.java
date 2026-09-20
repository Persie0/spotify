package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qpv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f191384a;

    /* JADX INFO: renamed from: b */
    public int f191385b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f191386c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpv(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f191386c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f191384a = obj;
        this.f191385b |= Integer.MIN_VALUE;
        return this.f191386c.emit(null, this);
    }
}
