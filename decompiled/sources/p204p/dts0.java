package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dts0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f52898a;

    /* JADX INFO: renamed from: b */
    public int f52899b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z0s0 f52900c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dts0(z0s0 z0s0Var, fbk fbkVar) {
        super(fbkVar);
        this.f52900c = z0s0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f52898a = obj;
        this.f52899b |= Integer.MIN_VALUE;
        return this.f52900c.emit(null, this);
    }
}
