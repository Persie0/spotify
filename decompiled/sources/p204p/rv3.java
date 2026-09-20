package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rv3 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f202987a;

    /* JADX INFO: renamed from: b */
    public int f202988b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f202989c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv3(n03 n03Var, fbk fbkVar) {
        super(fbkVar);
        this.f202989c = n03Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f202987a = obj;
        this.f202988b |= Integer.MIN_VALUE;
        return this.f202989c.emit(null, this);
    }
}
