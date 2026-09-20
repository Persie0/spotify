package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class q9x extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f186681a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s9x f186682b;

    /* JADX INFO: renamed from: c */
    public int f186683c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9x(s9x s9xVar, ibk ibkVar) {
        super(ibkVar);
        this.f186682b = s9xVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f186681a = obj;
        this.f186683c |= Integer.MIN_VALUE;
        return this.f186682b.m77599b(null, this);
    }
}
