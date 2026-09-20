package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class mi2 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f143912a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f143913b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pi2 f143914c;

    /* JADX INFO: renamed from: d */
    public int f143915d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi2(pi2 pi2Var, ibk ibkVar) {
        super(ibkVar);
        this.f143914c = pi2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f143913b = obj;
        this.f143915d |= Integer.MIN_VALUE;
        return this.f143914c.m70069c(null, this);
    }
}
