package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class e7a extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f56874a;

    /* JADX INFO: renamed from: b */
    public int f56875b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f56876c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7a(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f56876c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f56874a = obj;
        this.f56875b |= Integer.MIN_VALUE;
        return this.f56876c.emit(null, this);
    }
}
