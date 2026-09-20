package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ti10 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f220529a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ui10 f220530b;

    /* JADX INFO: renamed from: c */
    public int f220531c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti10(ui10 ui10Var, ibk ibkVar) {
        super(ibkVar);
        this.f220530b = ui10Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f220529a = obj;
        this.f220531c |= Integer.MIN_VALUE;
        Object objM83174d = this.f220530b.m83174d(this);
        return objM83174d == yuk.f276404a ? objM83174d : new s6x0(objM83174d);
    }
}
