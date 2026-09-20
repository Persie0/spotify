package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ba21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f25073a;

    /* JADX INFO: renamed from: b */
    public int f25074b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f25075c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba21(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f25075c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f25073a = obj;
        this.f25074b |= Integer.MIN_VALUE;
        return this.f25075c.emit(null, this);
    }
}
