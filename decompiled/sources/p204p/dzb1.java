package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dzb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f54612a;

    /* JADX INFO: renamed from: b */
    public int f54613b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f54614c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzb1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f54614c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f54612a = obj;
        this.f54613b |= Integer.MIN_VALUE;
        return this.f54614c.emit(null, this);
    }
}
