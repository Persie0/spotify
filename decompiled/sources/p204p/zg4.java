package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zg4 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f282474a;

    /* JADX INFO: renamed from: b */
    public int f282475b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f282476c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg4(n03 n03Var, fbk fbkVar) {
        super(fbkVar);
        this.f282476c = n03Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f282474a = obj;
        this.f282475b |= Integer.MIN_VALUE;
        return this.f282476c.emit(null, this);
    }
}
