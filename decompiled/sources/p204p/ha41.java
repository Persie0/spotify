package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ha41 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89121a;

    /* JADX INFO: renamed from: b */
    public int f89122b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pbt f89123c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha41(pbt pbtVar, fbk fbkVar) {
        super(fbkVar);
        this.f89123c = pbtVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f89121a = obj;
        this.f89122b |= Integer.MIN_VALUE;
        return this.f89123c.emit(null, this);
    }
}
