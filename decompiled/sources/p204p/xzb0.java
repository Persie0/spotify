package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xzb0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f267570a;

    /* JADX INFO: renamed from: b */
    public int f267571b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i2a0 f267572c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzb0(i2a0 i2a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f267572c = i2a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f267570a = obj;
        this.f267571b |= Integer.MIN_VALUE;
        return this.f267572c.emit(null, this);
    }
}
