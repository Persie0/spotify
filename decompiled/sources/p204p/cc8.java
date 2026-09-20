package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class cc8 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f36338a;

    /* JADX INFO: renamed from: b */
    public int f36339b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f36340c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc8(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f36340c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f36338a = obj;
        this.f36339b |= Integer.MIN_VALUE;
        return this.f36340c.emit(null, this);
    }
}
