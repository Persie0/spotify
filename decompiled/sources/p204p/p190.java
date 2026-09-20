package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class p190 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f173007a;

    /* JADX INFO: renamed from: b */
    public int f173008b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ q190 f173009c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p190(q190 q190Var, fbk fbkVar) {
        super(fbkVar);
        this.f173009c = q190Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f173007a = obj;
        this.f173008b |= Integer.MIN_VALUE;
        return this.f173009c.emit(null, this);
    }
}
