package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class b3i0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23057a;

    /* JADX INFO: renamed from: b */
    public int f23058b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f23059c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3i0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f23059c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f23057a = obj;
        this.f23058b |= Integer.MIN_VALUE;
        return this.f23059c.emit(null, this);
    }
}
