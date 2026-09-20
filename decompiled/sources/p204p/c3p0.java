package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c3p0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33724a;

    /* JADX INFO: renamed from: b */
    public int f33725b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f33726c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3p0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f33726c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f33724a = obj;
        this.f33725b |= Integer.MIN_VALUE;
        return this.f33726c.emit(null, this);
    }
}
