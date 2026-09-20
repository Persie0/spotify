package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class q2j extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f184651a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r2j f184652b;

    /* JADX INFO: renamed from: c */
    public int f184653c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2j(r2j r2jVar, ibk ibkVar) {
        super(ibkVar);
        this.f184652b = r2jVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f184651a = obj;
        this.f184653c |= Integer.MIN_VALUE;
        return this.f184652b.m74554a(null, this);
    }
}
