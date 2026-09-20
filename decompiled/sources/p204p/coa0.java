package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class coa0 extends ibk {

    /* JADX INFO: renamed from: a */
    public rna0 f40213a;

    /* JADX INFO: renamed from: b */
    public String f40214b;

    /* JADX INFO: renamed from: c */
    public String f40215c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f40216d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ doa0 f40217e;

    /* JADX INFO: renamed from: f */
    public int f40218f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coa0(doa0 doa0Var, ibk ibkVar) {
        super(ibkVar);
        this.f40217e = doa0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f40216d = obj;
        this.f40218f |= Integer.MIN_VALUE;
        return doa0.m36526a(this.f40217e, null, this);
    }
}
