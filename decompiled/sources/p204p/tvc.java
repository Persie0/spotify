package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tvc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f224116a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uvc f224117b;

    /* JADX INFO: renamed from: c */
    public int f224118c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tvc(uvc uvcVar, ibk ibkVar) {
        super(ibkVar);
        this.f224117b = uvcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f224116a = obj;
        this.f224118c |= Integer.MIN_VALUE;
        return this.f224117b.m84053a(null, this);
    }
}
