package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bsz extends ibk {

    /* JADX INFO: renamed from: a */
    public String f30439a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f30440b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dsz f30441c;

    /* JADX INFO: renamed from: d */
    public int f30442d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsz(dsz dszVar, ibk ibkVar) {
        super(ibkVar);
        this.f30441c = dszVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f30440b = obj;
        this.f30442d |= Integer.MIN_VALUE;
        return this.f30441c.m36790b(null, this, false);
    }
}
