package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class tqv extends ibk {

    /* JADX INFO: renamed from: a */
    public z650 f222894a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f222895b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uqv f222896c;

    /* JADX INFO: renamed from: d */
    public int f222897d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqv(uqv uqvVar, ibk ibkVar) {
        super(ibkVar);
        this.f222896c = uqvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f222895b = obj;
        this.f222897d |= Integer.MIN_VALUE;
        return this.f222896c.m83820f(null, this);
    }
}
