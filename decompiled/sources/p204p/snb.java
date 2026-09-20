package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class snb extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f210871a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ unb f210872b;

    /* JADX INFO: renamed from: c */
    public int f210873c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public snb(unb unbVar, ibk ibkVar) {
        super(ibkVar);
        this.f210872b = unbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f210871a = obj;
        this.f210873c |= Integer.MIN_VALUE;
        return this.f210872b.m83540c(null, null, null, this);
    }
}
