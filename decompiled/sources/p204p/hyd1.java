package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hyd1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f96571a;

    /* JADX INFO: renamed from: b */
    public int f96572b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ di91 f96573c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hyd1(di91 di91Var, fbk fbkVar) {
        super(fbkVar);
        this.f96573c = di91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f96571a = obj;
        this.f96572b |= Integer.MIN_VALUE;
        return this.f96573c.emit(null, this);
    }
}
