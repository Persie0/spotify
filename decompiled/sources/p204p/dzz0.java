package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dzz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f54802a;

    /* JADX INFO: renamed from: b */
    public int f54803b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f54804c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzz0(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f54804c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f54802a = obj;
        this.f54803b |= Integer.MIN_VALUE;
        return this.f54804c.emit(null, this);
    }
}
