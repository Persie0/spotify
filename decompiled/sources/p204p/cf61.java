package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cf61 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f37277a;

    /* JADX INFO: renamed from: b */
    public int f37278b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b9s f37279c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf61(b9s b9sVar, fbk fbkVar) {
        super(fbkVar);
        this.f37279c = b9sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f37277a = obj;
        this.f37278b |= Integer.MIN_VALUE;
        return this.f37279c.emit(null, this);
    }
}
