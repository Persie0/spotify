package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hg91 extends ibk {

    /* JADX INFO: renamed from: a */
    public int f91094a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f91095b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kg91 f91096c;

    /* JADX INFO: renamed from: d */
    public int f91097d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg91(kg91 kg91Var, ibk ibkVar) {
        super(ibkVar);
        this.f91096c = kg91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f91095b = obj;
        this.f91097d |= Integer.MIN_VALUE;
        return this.f91096c.m56322l(0, this);
    }
}
