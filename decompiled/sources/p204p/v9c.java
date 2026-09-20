package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class v9c extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f238905a;

    /* JADX INFO: renamed from: b */
    public boolean f238906b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f238907c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ w9c f238908d;

    /* JADX INFO: renamed from: e */
    public int f238909e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9c(w9c w9cVar, ibk ibkVar) {
        super(ibkVar);
        this.f238908d = w9cVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f238907c = obj;
        this.f238909e |= Integer.MIN_VALUE;
        return w9c.m87494c(this.f238908d, null, null, false, false, null, null, false, null, this);
    }
}
