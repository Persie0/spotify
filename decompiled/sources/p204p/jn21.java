package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jn21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f113992a;

    /* JADX INFO: renamed from: b */
    public int f113993b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f113994c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn21(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f113994c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f113992a = obj;
        this.f113993b |= Integer.MIN_VALUE;
        return this.f113994c.emit(null, this);
    }
}
