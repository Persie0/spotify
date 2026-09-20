package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class f6a extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66341a;

    /* JADX INFO: renamed from: b */
    public int f66342b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f66343c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6a(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f66343c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f66341a = obj;
        this.f66342b |= Integer.MIN_VALUE;
        return this.f66343c.emit(null, this);
    }
}
