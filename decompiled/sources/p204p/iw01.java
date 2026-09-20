package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class iw01 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f106315a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jw01 f106316b;

    /* JADX INFO: renamed from: c */
    public int f106317c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw01(jw01 jw01Var, ibk ibkVar) {
        super(ibkVar);
        this.f106316b = jw01Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f106315a = obj;
        this.f106317c |= Integer.MIN_VALUE;
        return this.f106316b.m54396b(this);
    }
}
