package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qr6 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f191744a;

    /* JADX INFO: renamed from: b */
    public int f191745b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f191746c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr6(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f191746c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f191744a = obj;
        this.f191745b |= Integer.MIN_VALUE;
        return this.f191746c.emit(null, this);
    }
}
