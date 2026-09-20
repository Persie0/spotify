package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class h7i extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f88463a;

    /* JADX INFO: renamed from: b */
    public int f88464b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f88465c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7i(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f88465c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f88463a = obj;
        this.f88464b |= Integer.MIN_VALUE;
        return this.f88465c.emit(null, this);
    }
}
