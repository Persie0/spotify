package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class i871 extends ibk {

    /* JADX INFO: renamed from: a */
    public j871 f99727a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f99728b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ j871 f99729c;

    /* JADX INFO: renamed from: d */
    public int f99730d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i871(j871 j871Var, ibk ibkVar) {
        super(ibkVar);
        this.f99729c = j871Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f99728b = obj;
        this.f99730d |= Integer.MIN_VALUE;
        return this.f99729c.m52695s(this);
    }
}
