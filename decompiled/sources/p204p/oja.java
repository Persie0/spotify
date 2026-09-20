package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class oja extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f166021a;

    /* JADX INFO: renamed from: b */
    public int f166022b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f166023c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oja(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f166023c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f166021a = obj;
        this.f166022b |= Integer.MIN_VALUE;
        return this.f166023c.emit(null, this);
    }
}
