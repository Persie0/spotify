package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class uqt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f233106a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xqt f233107b;

    /* JADX INFO: renamed from: c */
    public int f233108c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqt(xqt xqtVar, ibk ibkVar) {
        super(ibkVar);
        this.f233107b = xqtVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f233106a = obj;
        this.f233108c |= Integer.MIN_VALUE;
        return xqt.m91902b(this.f233107b, this);
    }
}
