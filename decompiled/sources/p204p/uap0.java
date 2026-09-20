package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class uap0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f228525a;

    /* JADX INFO: renamed from: b */
    public int f228526b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f228527c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uap0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f228527c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f228525a = obj;
        this.f228526b |= Integer.MIN_VALUE;
        return this.f228527c.emit(null, this);
    }
}
