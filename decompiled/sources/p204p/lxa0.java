package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lxa0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f137767a;

    /* JADX INFO: renamed from: b */
    public int f137768b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i2a0 f137769c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxa0(i2a0 i2a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f137769c = i2a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f137767a = obj;
        this.f137768b |= Integer.MIN_VALUE;
        return this.f137769c.emit(null, this);
    }
}
