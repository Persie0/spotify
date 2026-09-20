package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class v9c1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f238912a;

    /* JADX INFO: renamed from: b */
    public int f238913b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f238914c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9c1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f238914c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f238912a = obj;
        this.f238913b |= Integer.MIN_VALUE;
        return this.f238914c.emit(null, this);
    }
}
