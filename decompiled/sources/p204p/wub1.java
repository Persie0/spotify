package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wub1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f255132a;

    /* JADX INFO: renamed from: b */
    public int f255133b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f255134c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wub1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f255134c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f255132a = obj;
        this.f255133b |= Integer.MIN_VALUE;
        return this.f255134c.emit(null, this);
    }
}
