package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class d5b0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f45387a;

    /* JADX INFO: renamed from: b */
    public int f45388b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i2a0 f45389c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5b0(i2a0 i2a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f45389c = i2a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f45387a = obj;
        this.f45388b |= Integer.MIN_VALUE;
        return this.f45389c.emit(null, this);
    }
}
