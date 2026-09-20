package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tiz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f220767a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ viz f220768b;

    /* JADX INFO: renamed from: c */
    public int f220769c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tiz(viz vizVar, ibk ibkVar) {
        super(ibkVar);
        this.f220768b = vizVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f220767a = obj;
        this.f220769c |= Integer.MIN_VALUE;
        return this.f220768b.m85674d(null, null, null, this);
    }
}
