package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class k1c0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f118275a;

    /* JADX INFO: renamed from: b */
    public int f118276b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i80 f118277c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1c0(i80 i80Var, fbk fbkVar) {
        super(fbkVar);
        this.f118277c = i80Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f118275a = obj;
        this.f118276b |= Integer.MIN_VALUE;
        return this.f118277c.emit(null, this);
    }
}
