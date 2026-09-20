package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class o1w0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f160870a;

    /* JADX INFO: renamed from: b */
    public int f160871b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v1a f160872c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1w0(v1a v1aVar, fbk fbkVar) {
        super(fbkVar);
        this.f160872c = v1aVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f160870a = obj;
        this.f160871b |= Integer.MIN_VALUE;
        return this.f160872c.emit(null, this);
    }
}
