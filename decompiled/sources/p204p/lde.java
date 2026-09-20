package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lde extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f132148a;

    /* JADX INFO: renamed from: b */
    public int f132149b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f132150c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lde(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f132150c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f132148a = obj;
        this.f132149b |= Integer.MIN_VALUE;
        return this.f132150c.emit(null, this);
    }
}
