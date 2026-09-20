package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class y4j extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f269154a;

    /* JADX INFO: renamed from: b */
    public int f269155b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v1a f269156c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4j(v1a v1aVar, fbk fbkVar) {
        super(fbkVar);
        this.f269156c = v1aVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f269154a = obj;
        this.f269155b |= Integer.MIN_VALUE;
        return this.f269156c.emit(null, this);
    }
}
