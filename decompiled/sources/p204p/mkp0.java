package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mkp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f144623a;

    /* JADX INFO: renamed from: b */
    public hts0 f144624b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f144625c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ okp0 f144626d;

    /* JADX INFO: renamed from: e */
    public int f144627e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkp0(okp0 okp0Var, ibk ibkVar) {
        super(ibkVar);
        this.f144626d = okp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f144625c = obj;
        this.f144627e |= Integer.MIN_VALUE;
        return this.f144626d.m67258c(null, this);
    }
}
