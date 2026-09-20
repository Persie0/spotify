package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class c5q extends ibk {

    /* JADX INFO: renamed from: a */
    public String f34234a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f34235b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ d5q f34236c;

    /* JADX INFO: renamed from: d */
    public int f34237d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5q(d5q d5qVar, ibk ibkVar) {
        super(ibkVar);
        this.f34236c = d5qVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f34235b = obj;
        this.f34237d |= Integer.MIN_VALUE;
        return this.f34236c.m35032a(null, null, null, this);
    }
}
