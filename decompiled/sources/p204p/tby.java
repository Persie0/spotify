package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tby extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f218968a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zby f218969b;

    /* JADX INFO: renamed from: c */
    public int f218970c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tby(zby zbyVar, ibk ibkVar) {
        super(ibkVar);
        this.f218969b = zbyVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f218968a = obj;
        this.f218970c |= Integer.MIN_VALUE;
        return this.f218969b.m95887e(null, this);
    }
}
