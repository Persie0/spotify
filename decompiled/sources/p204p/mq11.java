package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mq11 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f146139a;

    /* JADX INFO: renamed from: b */
    public int f146140b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f146141c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq11(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f146141c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f146139a = obj;
        this.f146140b |= Integer.MIN_VALUE;
        return this.f146141c.emit(null, this);
    }
}
