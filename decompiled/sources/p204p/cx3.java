package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class cx3 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f42892a;

    /* JADX INFO: renamed from: b */
    public int f42893b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f42894c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx3(n03 n03Var, fbk fbkVar) {
        super(fbkVar);
        this.f42894c = n03Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f42892a = obj;
        this.f42893b |= Integer.MIN_VALUE;
        return this.f42894c.emit(null, this);
    }
}
