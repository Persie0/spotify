package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qr21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f191715a;

    /* JADX INFO: renamed from: b */
    public int f191716b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f191717c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr21(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f191717c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f191715a = obj;
        this.f191716b |= Integer.MIN_VALUE;
        return this.f191717c.emit(null, this);
    }
}
