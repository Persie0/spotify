package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class re21 extends ibk {

    /* JADX INFO: renamed from: a */
    public int f198256a;

    /* JADX INFO: renamed from: b */
    public lsi0 f198257b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f198258c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ue21 f198259d;

    /* JADX INFO: renamed from: e */
    public int f198260e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re21(ue21 ue21Var, ibk ibkVar) {
        super(ibkVar);
        this.f198259d = ue21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f198258c = obj;
        this.f198260e |= Integer.MIN_VALUE;
        return this.f198259d.m82875b(0, this);
    }
}
