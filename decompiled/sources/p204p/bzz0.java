package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bzz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f32628a;

    /* JADX INFO: renamed from: b */
    public int f32629b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f32630c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzz0(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f32630c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f32628a = obj;
        this.f32629b |= Integer.MIN_VALUE;
        return this.f32630c.emit(null, this);
    }
}
