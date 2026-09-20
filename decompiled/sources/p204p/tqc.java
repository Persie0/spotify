package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tqc extends ibk {

    /* JADX INFO: renamed from: a */
    public String f222785a;

    /* JADX INFO: renamed from: b */
    public String f222786b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f222787c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ uqc f222788d;

    /* JADX INFO: renamed from: e */
    public int f222789e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqc(uqc uqcVar, ibk ibkVar) {
        super(ibkVar);
        this.f222788d = uqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f222787c = obj;
        this.f222789e |= Integer.MIN_VALUE;
        return this.f222788d.m83761a(null, null, null, this);
    }
}
