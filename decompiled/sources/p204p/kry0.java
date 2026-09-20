package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kry0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f125749a;

    /* JADX INFO: renamed from: b */
    public int f125750b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lry0 f125751c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kry0(lry0 lry0Var, ibk ibkVar) {
        super(ibkVar);
        this.f125751c = lry0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f125749a = obj;
        this.f125750b |= Integer.MIN_VALUE;
        return this.f125751c.mo15629a(null, null, this);
    }
}
