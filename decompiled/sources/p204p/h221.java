package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class h221 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f86855a;

    /* JADX INFO: renamed from: b */
    public int f86856b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f86857c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h221(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f86857c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f86855a = obj;
        this.f86856b |= Integer.MIN_VALUE;
        return this.f86857c.emit(null, this);
    }
}
