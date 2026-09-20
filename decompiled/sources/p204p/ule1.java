package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ule1 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f231548a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f231549b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vle1 f231550c;

    /* JADX INFO: renamed from: d */
    public int f231551d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ule1(vle1 vle1Var, ibk ibkVar) {
        super(ibkVar);
        this.f231550c = vle1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f231549b = obj;
        this.f231551d |= Integer.MIN_VALUE;
        return vle1.m85947e(this.f231550c, null, this);
    }
}
