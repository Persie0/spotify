package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class r98 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f196948a;

    /* JADX INFO: renamed from: b */
    public int f196949b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f196950c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r98(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f196950c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f196948a = obj;
        this.f196949b |= Integer.MIN_VALUE;
        return this.f196950c.emit(null, this);
    }
}
