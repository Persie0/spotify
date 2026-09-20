package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class loe1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f135418a;

    /* JADX INFO: renamed from: b */
    public int f135419b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v1a f135420c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public loe1(v1a v1aVar, fbk fbkVar) {
        super(fbkVar);
        this.f135420c = v1aVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f135418a = obj;
        this.f135419b |= Integer.MIN_VALUE;
        return this.f135420c.emit(null, this);
    }
}
