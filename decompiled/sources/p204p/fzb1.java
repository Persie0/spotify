package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fzb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f74962a;

    /* JADX INFO: renamed from: b */
    public int f74963b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f74964c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzb1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f74964c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f74962a = obj;
        this.f74963b |= Integer.MIN_VALUE;
        return this.f74964c.emit(null, this);
    }
}
