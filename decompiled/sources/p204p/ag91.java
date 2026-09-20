package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ag91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15318a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kg91 f15319b;

    /* JADX INFO: renamed from: c */
    public int f15320c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag91(kg91 kg91Var, ibk ibkVar) {
        super(ibkVar);
        this.f15319b = kg91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f15318a = obj;
        this.f15320c |= Integer.MIN_VALUE;
        return this.f15319b.m56315e(this);
    }
}
