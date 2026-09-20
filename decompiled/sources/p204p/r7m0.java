package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class r7m0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f196608a;

    /* JADX INFO: renamed from: b */
    public int f196609b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7m0 f196610c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7m0(i7m0 i7m0Var, fbk fbkVar) {
        super(fbkVar);
        this.f196610c = i7m0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f196608a = obj;
        this.f196609b |= Integer.MIN_VALUE;
        return this.f196610c.emit(null, this);
    }
}
