package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dw51 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f53608a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f53609b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ew51 f53610c;

    /* JADX INFO: renamed from: d */
    public int f53611d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw51(ew51 ew51Var, ibk ibkVar) {
        super(ibkVar);
        this.f53610c = ew51Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f53609b = obj;
        this.f53611d |= Integer.MIN_VALUE;
        return this.f53610c.m40137f(null, this);
    }
}
