package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class cho extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f38049a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dho f38050b;

    /* JADX INFO: renamed from: c */
    public int f38051c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cho(dho dhoVar, ibk ibkVar) {
        super(ibkVar);
        this.f38050b = dhoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f38049a = obj;
        this.f38051c |= Integer.MIN_VALUE;
        return dho.m36055c(this.f38050b, null, this);
    }
}
