package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ert extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62201a;

    /* JADX INFO: renamed from: b */
    public int f62202b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ frt f62203c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ert(frt frtVar, ibk ibkVar) {
        super(ibkVar);
        this.f62203c = frtVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f62201a = obj;
        this.f62202b |= Integer.MIN_VALUE;
        return this.f62203c.mo15629a(null, null, this);
    }
}
