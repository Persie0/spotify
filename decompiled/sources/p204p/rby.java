package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rby extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f197673a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zby f197674b;

    /* JADX INFO: renamed from: c */
    public int f197675c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rby(zby zbyVar, ibk ibkVar) {
        super(ibkVar);
        this.f197674b = zbyVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f197673a = obj;
        this.f197675c |= Integer.MIN_VALUE;
        return this.f197674b.m95885b(null, this, false);
    }
}
