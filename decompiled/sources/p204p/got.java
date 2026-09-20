package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class got extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f83011a;

    /* JADX INFO: renamed from: b */
    public int f83012b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ not f83013c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public got(not notVar, ibk ibkVar) {
        super(ibkVar);
        this.f83013c = notVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f83011a = obj;
        this.f83012b |= Integer.MIN_VALUE;
        return this.f83013c.mo15629a(null, null, this);
    }
}
