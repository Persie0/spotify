package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dqw extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f52092a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqw f52093b;

    /* JADX INFO: renamed from: c */
    public int f52094c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqw(kqw kqwVar, ibk ibkVar) {
        super(ibkVar);
        this.f52093b = kqwVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f52092a = obj;
        this.f52094c |= Integer.MIN_VALUE;
        return this.f52093b.m57124b(null, this);
    }
}
