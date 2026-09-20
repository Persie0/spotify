package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sv80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f214359a;

    /* JADX INFO: renamed from: b */
    public int f214360b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f214361c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv80(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f214361c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f214359a = obj;
        this.f214360b |= Integer.MIN_VALUE;
        return this.f214361c.emit(null, this);
    }
}
