package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ath extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f19680a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jth f19681b;

    /* JADX INFO: renamed from: c */
    public int f19682c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ath(jth jthVar, ibk ibkVar) {
        super(ibkVar);
        this.f19681b = jthVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f19680a = obj;
        this.f19682c |= Integer.MIN_VALUE;
        return jth.m54286a(this.f19681b, null, this);
    }
}
