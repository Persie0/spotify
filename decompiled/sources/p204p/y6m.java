package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class y6m extends ibk {

    /* JADX INFO: renamed from: a */
    public String f269875a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f269876b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ abk f269877c;

    /* JADX INFO: renamed from: d */
    public int f269878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6m(abk abkVar, ibk ibkVar) {
        super(ibkVar);
        this.f269877c = abkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f269876b = obj;
        this.f269878d |= Integer.MIN_VALUE;
        return this.f269877c.m25361h(null, this);
    }
}
