package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ht31 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f94916a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ it31 f94917b;

    /* JADX INFO: renamed from: c */
    public int f94918c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht31(it31 it31Var, ibk ibkVar) {
        super(ibkVar);
        this.f94917b = it31Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f94916a = obj;
        this.f94918c |= Integer.MIN_VALUE;
        Object objM51601d = this.f94917b.m51601d(null, this);
        return objM51601d == yuk.f276404a ? objM51601d : new s6x0(objM51601d);
    }
}
