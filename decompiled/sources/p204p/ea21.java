package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ea21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57571a;

    /* JADX INFO: renamed from: b */
    public int f57572b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f57573c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea21(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f57573c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f57571a = obj;
        this.f57572b |= Integer.MIN_VALUE;
        return this.f57573c.emit(null, this);
    }
}
