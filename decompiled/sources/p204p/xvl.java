package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xvl extends ibk {

    /* JADX INFO: renamed from: a */
    public int f266419a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f266420b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bwl f266421c;

    /* JADX INFO: renamed from: d */
    public int f266422d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvl(bwl bwlVar, ibk ibkVar) {
        super(ibkVar);
        this.f266421c = bwlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f266420b = obj;
        this.f266422d |= Integer.MIN_VALUE;
        return this.f266421c.m30695a(0, this);
    }
}
