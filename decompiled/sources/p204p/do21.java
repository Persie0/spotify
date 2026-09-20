package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class do21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f50925a;

    /* JADX INFO: renamed from: b */
    public int f50926b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f50927c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public do21(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f50927c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f50925a = obj;
        this.f50926b |= Integer.MIN_VALUE;
        return this.f50927c.emit(null, this);
    }
}
