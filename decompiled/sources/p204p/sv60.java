package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class sv60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f214346a;

    /* JADX INFO: renamed from: b */
    public int f214347b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f214348c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv60(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f214348c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f214346a = obj;
        this.f214347b |= Integer.MIN_VALUE;
        return this.f214348c.emit(null, this);
    }
}
