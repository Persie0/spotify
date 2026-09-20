package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ayk extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f21260a;

    /* JADX INFO: renamed from: b */
    public int f21261b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ byk f21262c;

    /* JADX INFO: renamed from: d */
    public bqz0 f21263d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayk(byk bykVar, ibk ibkVar) {
        super(ibkVar);
        this.f21262c = bykVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f21260a = obj;
        this.f21261b |= Integer.MIN_VALUE;
        return this.f21262c.mo15629a(null, null, this);
    }
}
