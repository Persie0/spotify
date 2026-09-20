package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class elx extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60766a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ flx f60767b;

    /* JADX INFO: renamed from: c */
    public int f60768c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elx(flx flxVar, ibk ibkVar) {
        super(ibkVar);
        this.f60767b = flxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60766a = obj;
        this.f60768c |= Integer.MIN_VALUE;
        return this.f60767b.m42037a(this);
    }
}
