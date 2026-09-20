package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class chi0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f38024a;

    /* JADX INFO: renamed from: b */
    public int f38025b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f38026c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chi0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f38026c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f38024a = obj;
        this.f38025b |= Integer.MIN_VALUE;
        return this.f38026c.emit(null, this);
    }
}
