package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class t8m0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f218109a;

    /* JADX INFO: renamed from: b */
    public int f218110b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7m0 f218111c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8m0(i7m0 i7m0Var, fbk fbkVar) {
        super(fbkVar);
        this.f218111c = i7m0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f218109a = obj;
        this.f218110b |= Integer.MIN_VALUE;
        return this.f218111c.emit(null, this);
    }
}
