package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rqc0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f201799a;

    /* JADX INFO: renamed from: b */
    public int f201800b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i2a0 f201801c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqc0(i2a0 i2a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f201801c = i2a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f201799a = obj;
        this.f201800b |= Integer.MIN_VALUE;
        return this.f201801c.emit(null, this);
    }
}
