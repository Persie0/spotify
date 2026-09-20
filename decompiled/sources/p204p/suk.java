package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class suk extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f214139a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tuk f214140b;

    /* JADX INFO: renamed from: c */
    public int f214141c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public suk(tuk tukVar, ibk ibkVar) {
        super(ibkVar);
        this.f214140b = tukVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f214139a = obj;
        this.f214141c |= Integer.MIN_VALUE;
        this.f214140b.m81589o(this);
        return w2a1.f247311a;
    }
}
