package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jm80 extends ibk {

    /* JADX INFO: renamed from: a */
    public km80 f113788a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f113789b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ po10 f113790c;

    /* JADX INFO: renamed from: d */
    public int f113791d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm80(po10 po10Var, ibk ibkVar) {
        super(ibkVar);
        this.f113790c = po10Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f113789b = obj;
        this.f113791d |= Integer.MIN_VALUE;
        return this.f113790c.m70462j(null, this);
    }
}
