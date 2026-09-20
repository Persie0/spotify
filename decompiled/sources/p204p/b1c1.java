package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class b1c1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f22291a;

    /* JADX INFO: renamed from: b */
    public int f22292b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f22293c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1c1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f22293c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f22291a = obj;
        this.f22292b |= Integer.MIN_VALUE;
        return this.f22293c.emit(null, this);
    }
}
