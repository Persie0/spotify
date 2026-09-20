package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fxd0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f74346a;

    /* JADX INFO: renamed from: b */
    public int f74347b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f74348c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxd0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f74348c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f74346a = obj;
        this.f74347b |= Integer.MIN_VALUE;
        return this.f74348c.emit(null, this);
    }
}
