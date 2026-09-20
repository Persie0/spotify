package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class u3p extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f226416a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v3p f226417b;

    /* JADX INFO: renamed from: c */
    public int f226418c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3p(v3p v3pVar, ibk ibkVar) {
        super(ibkVar);
        this.f226417b = v3pVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f226416a = obj;
        this.f226418c |= Integer.MIN_VALUE;
        return this.f226417b.mo66545a(this);
    }
}
