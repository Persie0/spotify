package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class bo21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29000a;

    /* JADX INFO: renamed from: b */
    public int f29001b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f29002c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo21(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f29002c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f29000a = obj;
        this.f29001b |= Integer.MIN_VALUE;
        return this.f29002c.emit(null, this);
    }
}
