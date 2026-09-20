package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class y9u0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f270654a;

    /* JADX INFO: renamed from: b */
    public String f270655b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f270656c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bau0 f270657d;

    /* JADX INFO: renamed from: e */
    public int f270658e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9u0(bau0 bau0Var, ibk ibkVar) {
        super(ibkVar);
        this.f270657d = bau0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f270656c = obj;
        this.f270658e |= Integer.MIN_VALUE;
        return this.f270657d.m28593a(null, this);
    }
}
