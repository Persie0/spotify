package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ukr extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f231351a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vkr f231352b;

    /* JADX INFO: renamed from: c */
    public int f231353c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ukr(vkr vkrVar, ibk ibkVar) {
        super(ibkVar);
        this.f231352b = vkrVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f231351a = obj;
        this.f231353c |= Integer.MIN_VALUE;
        return this.f231352b.m85917b(null, this);
    }
}
