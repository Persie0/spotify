package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xke1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f262358a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zke1 f262359b;

    /* JADX INFO: renamed from: c */
    public int f262360c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xke1(zke1 zke1Var, ibk ibkVar) {
        super(ibkVar);
        this.f262359b = zke1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f262358a = obj;
        this.f262360c |= Integer.MIN_VALUE;
        return zke1.m96321a(this.f262359b, this);
    }
}
