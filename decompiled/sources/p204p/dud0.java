package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dud0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f53037a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kud0 f53038b;

    /* JADX INFO: renamed from: c */
    public int f53039c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dud0(kud0 kud0Var, ibk ibkVar) {
        super(ibkVar);
        this.f53038b = kud0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f53037a = obj;
        this.f53039c |= Integer.MIN_VALUE;
        return kud0.m57386a(this.f53038b, this);
    }
}
