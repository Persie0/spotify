package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pby extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f175915a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zby f175916b;

    /* JADX INFO: renamed from: c */
    public int f175917c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pby(zby zbyVar, ibk ibkVar) {
        super(ibkVar);
        this.f175916b = zbyVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f175915a = obj;
        this.f175917c |= Integer.MIN_VALUE;
        return this.f175916b.m95884a(null, this);
    }
}
