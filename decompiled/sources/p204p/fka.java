package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class fka extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f70512a;

    /* JADX INFO: renamed from: b */
    public int f70513b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f70514c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fka(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f70514c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f70512a = obj;
        this.f70513b |= Integer.MIN_VALUE;
        return this.f70514c.emit(null, this);
    }
}
