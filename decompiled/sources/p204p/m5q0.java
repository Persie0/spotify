package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m5q0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f140277a;

    /* JADX INFO: renamed from: b */
    public int f140278b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ndp0 f140279c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5q0(ndp0 ndp0Var, fbk fbkVar) {
        super(fbkVar);
        this.f140279c = ndp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f140277a = obj;
        this.f140278b |= Integer.MIN_VALUE;
        return this.f140279c.emit(null, this);
    }
}
