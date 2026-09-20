package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class h470 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f87456a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j470 f87457b;

    /* JADX INFO: renamed from: c */
    public int f87458c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h470(j470 j470Var, ibk ibkVar) {
        super(ibkVar);
        this.f87457b = j470Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f87456a = obj;
        this.f87458c |= Integer.MIN_VALUE;
        return this.f87457b.m52329c(null, this);
    }
}
