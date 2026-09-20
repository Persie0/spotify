package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ojy0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f166177a;

    /* JADX INFO: renamed from: b */
    public int f166178b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f166179c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojy0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f166179c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f166177a = obj;
        this.f166178b |= Integer.MIN_VALUE;
        return this.f166179c.emit(null, this);
    }
}
