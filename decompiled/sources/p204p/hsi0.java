package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hsi0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f94749a;

    /* JADX INFO: renamed from: b */
    public int f94750b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f94751c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsi0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f94751c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f94749a = obj;
        this.f94750b |= Integer.MIN_VALUE;
        return this.f94751c.emit(null, this);
    }
}
