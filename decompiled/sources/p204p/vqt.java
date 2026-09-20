package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class vqt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f243997a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xqt f243998b;

    /* JADX INFO: renamed from: c */
    public int f243999c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqt(xqt xqtVar, ibk ibkVar) {
        super(ibkVar);
        this.f243998b = xqtVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f243997a = obj;
        this.f243999c |= Integer.MIN_VALUE;
        return xqt.m91903c(this.f243998b, null, this);
    }
}
