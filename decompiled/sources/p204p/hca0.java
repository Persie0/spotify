package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hca0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89739a;

    /* JADX INFO: renamed from: b */
    public int f89740b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i2a0 f89741c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hca0(i2a0 i2a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f89741c = i2a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f89739a = obj;
        this.f89740b |= Integer.MIN_VALUE;
        return this.f89741c.emit(null, this);
    }
}
