package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class e7i extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f56939a;

    /* JADX INFO: renamed from: b */
    public int f56940b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f56941c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7i(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f56941c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f56939a = obj;
        this.f56940b |= Integer.MIN_VALUE;
        return this.f56941c.emit(null, this);
    }
}
