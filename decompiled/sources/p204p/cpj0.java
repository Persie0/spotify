package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class cpj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f40567a;

    /* JADX INFO: renamed from: b */
    public int f40568b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f40569c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpj0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f40569c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f40567a = obj;
        this.f40568b |= Integer.MIN_VALUE;
        return this.f40569c.emit(null, this);
    }
}
