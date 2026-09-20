package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n831 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f151334a;

    /* JADX INFO: renamed from: b */
    public int f151335b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f151336c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n831(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f151336c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f151334a = obj;
        this.f151335b |= Integer.MIN_VALUE;
        return this.f151336c.emit(null, this);
    }
}
