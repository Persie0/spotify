package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class n8x extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f151650a;

    /* JADX INFO: renamed from: b */
    public int f151651b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o8x f151652c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8x(o8x o8xVar, fbk fbkVar) {
        super(fbkVar);
        this.f151652c = o8xVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f151650a = obj;
        this.f151651b |= Integer.MIN_VALUE;
        return this.f151652c.emit(null, this);
    }
}
