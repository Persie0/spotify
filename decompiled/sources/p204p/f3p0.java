package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class f3p0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65563a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g3p0 f65564b;

    /* JADX INFO: renamed from: c */
    public int f65565c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3p0(g3p0 g3p0Var, ibk ibkVar) {
        super(ibkVar);
        this.f65564b = g3p0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f65563a = obj;
        this.f65565c |= Integer.MIN_VALUE;
        Object objM43512c = this.f65564b.m43512c(null, this);
        return objM43512c == yuk.f276404a ? objM43512c : new s6x0(objM43512c);
    }
}
