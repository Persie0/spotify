package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jm11 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f113731a;

    /* JADX INFO: renamed from: b */
    public int f113732b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f113733c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm11(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f113733c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f113731a = obj;
        this.f113732b |= Integer.MIN_VALUE;
        return this.f113733c.emit(null, this);
    }
}
