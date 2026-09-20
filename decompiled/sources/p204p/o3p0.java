package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class o3p0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f161423a;

    /* JADX INFO: renamed from: b */
    public int f161424b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f161425c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3p0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f161425c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f161423a = obj;
        this.f161424b |= Integer.MIN_VALUE;
        return this.f161425c.emit(null, this);
    }
}
