package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zrz extends ibk {

    /* JADX INFO: renamed from: a */
    public String f285787a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f285788b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dsz f285789c;

    /* JADX INFO: renamed from: d */
    public int f285790d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zrz(dsz dszVar, ibk ibkVar) {
        super(ibkVar);
        this.f285789c = dszVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f285788b = obj;
        this.f285790d |= Integer.MIN_VALUE;
        return this.f285789c.m36789a(null, null, this);
    }
}
