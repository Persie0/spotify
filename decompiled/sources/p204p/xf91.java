package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xf91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f260873a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kg91 f260874b;

    /* JADX INFO: renamed from: c */
    public int f260875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf91(kg91 kg91Var, ibk ibkVar) {
        super(ibkVar);
        this.f260874b = kg91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f260873a = obj;
        this.f260875c |= Integer.MIN_VALUE;
        return this.f260874b.m56313b(this);
    }
}
