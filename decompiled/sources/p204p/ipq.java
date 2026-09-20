package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ipq extends ibk {

    /* JADX INFO: renamed from: a */
    public vhe0 f104540a;

    /* JADX INFO: renamed from: b */
    public hz80 f104541b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f104542c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ s93 f104543d;

    /* JADX INFO: renamed from: e */
    public int f104544e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipq(s93 s93Var, ibk ibkVar) {
        super(ibkVar);
        this.f104543d = s93Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f104542c = obj;
        this.f104544e |= Integer.MIN_VALUE;
        return this.f104543d.mo28141b(null, null, this);
    }
}
