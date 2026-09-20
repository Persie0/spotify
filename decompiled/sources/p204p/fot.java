package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fot extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f71627a;

    /* JADX INFO: renamed from: b */
    public int f71628b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mot f71629c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fot(mot motVar, ibk ibkVar) {
        super(ibkVar);
        this.f71629c = motVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f71627a = obj;
        this.f71628b |= Integer.MIN_VALUE;
        return this.f71629c.mo15629a(null, null, this);
    }
}
