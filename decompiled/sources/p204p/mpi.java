package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class mpi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f146028a;

    /* JADX INFO: renamed from: b */
    public int f146029b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f146030c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpi(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f146030c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f146028a = obj;
        this.f146029b |= Integer.MIN_VALUE;
        return this.f146030c.emit(null, this);
    }
}
