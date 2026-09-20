package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sm11 extends ibk {

    /* JADX INFO: renamed from: a */
    public um11 f210539a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f210540b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ um11 f210541c;

    /* JADX INFO: renamed from: d */
    public int f210542d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm11(um11 um11Var, ibk ibkVar) {
        super(ibkVar);
        this.f210541c = um11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f210540b = obj;
        this.f210542d |= Integer.MIN_VALUE;
        return this.f210541c.setValue((Boolean) null, false, (d850) null, (fbk) this);
    }
}
