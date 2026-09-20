package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class oia0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f165746a;

    /* JADX INFO: renamed from: b */
    public int f165747b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pia0 f165748c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oia0(pia0 pia0Var, ibk ibkVar) {
        super(ibkVar);
        this.f165748c = pia0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f165746a = obj;
        this.f165747b |= Integer.MIN_VALUE;
        return this.f165748c.mo15629a(null, null, this);
    }
}
