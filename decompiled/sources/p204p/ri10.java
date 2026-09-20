package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ri10 extends ibk {

    /* JADX INFO: renamed from: a */
    public int f199408a;

    /* JADX INFO: renamed from: b */
    public int f199409b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f199410c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ui10 f199411d;

    /* JADX INFO: renamed from: e */
    public int f199412e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri10(ui10 ui10Var, ibk ibkVar) {
        super(ibkVar);
        this.f199411d = ui10Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f199410c = obj;
        this.f199412e |= Integer.MIN_VALUE;
        Object objM83172b = this.f199411d.m83172b(this);
        return objM83172b == yuk.f276404a ? objM83172b : new s6x0(objM83172b);
    }
}
