package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class oq21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f168058a;

    /* JADX INFO: renamed from: b */
    public int f168059b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f168060c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq21(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f168060c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f168058a = obj;
        this.f168059b |= Integer.MIN_VALUE;
        return this.f168060c.emit(null, this);
    }
}
