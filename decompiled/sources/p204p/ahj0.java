package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ahj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f15703a;

    /* JADX INFO: renamed from: b */
    public String f15704b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15705c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ chj0 f15706d;

    /* JADX INFO: renamed from: e */
    public int f15707e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahj0(chj0 chj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f15706d = chj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f15705c = obj;
        this.f15707e |= Integer.MIN_VALUE;
        return this.f15706d.m32795b(null, this);
    }
}
