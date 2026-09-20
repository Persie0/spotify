package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class nau0 extends ibk {

    /* JADX INFO: renamed from: a */
    public vau0 f152118a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f152119b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wau0 f152120c;

    /* JADX INFO: renamed from: d */
    public int f152121d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nau0(wau0 wau0Var, ibk ibkVar) {
        super(ibkVar);
        this.f152120c = wau0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f152119b = obj;
        this.f152121d |= Integer.MIN_VALUE;
        return this.f152120c.m87615c(null, false, null, this);
    }
}
