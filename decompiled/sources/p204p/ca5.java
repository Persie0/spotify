package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ca5 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f35726a;

    /* JADX INFO: renamed from: b */
    public int f35727b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f35728c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca5(n03 n03Var, fbk fbkVar) {
        super(fbkVar);
        this.f35728c = n03Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f35726a = obj;
        this.f35727b |= Integer.MIN_VALUE;
        return this.f35728c.emit(null, this);
    }
}
