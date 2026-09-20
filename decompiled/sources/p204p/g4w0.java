package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class g4w0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f76541a;

    /* JADX INFO: renamed from: b */
    public int f76542b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f76543c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4w0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f76543c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f76541a = obj;
        this.f76542b |= Integer.MIN_VALUE;
        return this.f76543c.emit(null, this);
    }
}
