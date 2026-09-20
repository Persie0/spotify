package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class tml extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f221747a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uml f221748b;

    /* JADX INFO: renamed from: c */
    public int f221749c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tml(uml umlVar, ibk ibkVar) {
        super(ibkVar);
        this.f221748b = umlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f221747a = obj;
        this.f221749c |= Integer.MIN_VALUE;
        return this.f221748b.m83453a(null, null, this);
    }
}
