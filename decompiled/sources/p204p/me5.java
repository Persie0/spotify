package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class me5 extends ibk {

    /* JADX INFO: renamed from: a */
    public lyp0 f142613a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f142614b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ne5 f142615c;

    /* JADX INFO: renamed from: d */
    public int f142616d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(ne5 ne5Var, ibk ibkVar) {
        super(ibkVar);
        this.f142615c = ne5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f142614b = obj;
        this.f142616d |= Integer.MIN_VALUE;
        return this.f142615c.m64236a(null, this);
    }
}
