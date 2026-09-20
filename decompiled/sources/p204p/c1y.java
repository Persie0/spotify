package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c1y extends ibk {

    /* JADX INFO: renamed from: a */
    public d1y f33216a;

    /* JADX INFO: renamed from: b */
    public ed01 f33217b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f33218c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ d1y f33219d;

    /* JADX INFO: renamed from: e */
    public int f33220e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1y(d1y d1yVar, ibk ibkVar) {
        super(ibkVar);
        this.f33219d = d1yVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f33218c = obj;
        this.f33220e |= Integer.MIN_VALUE;
        return d1y.m34673b(this.f33219d, null, null, null, this);
    }
}
