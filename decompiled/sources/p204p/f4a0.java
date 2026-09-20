package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class f4a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65717a;

    /* JADX INFO: renamed from: b */
    public int f65718b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i2a0 f65719c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4a0(i2a0 i2a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f65719c = i2a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f65717a = obj;
        this.f65718b |= Integer.MIN_VALUE;
        return this.f65719c.emit(null, this);
    }
}
