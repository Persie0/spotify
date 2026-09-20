package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zr11 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f285521a;

    /* JADX INFO: renamed from: b */
    public int f285522b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f285523c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr11(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f285523c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f285521a = obj;
        this.f285522b |= Integer.MIN_VALUE;
        return this.f285523c.emit(null, this);
    }
}
