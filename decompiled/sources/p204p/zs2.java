package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class zs2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f285824a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bt2 f285825b;

    /* JADX INFO: renamed from: c */
    public int f285826c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs2(bt2 bt2Var, ibk ibkVar) {
        super(ibkVar);
        this.f285825b = bt2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f285824a = obj;
        this.f285826c |= Integer.MIN_VALUE;
        return this.f285825b.mo27514a(null, this);
    }
}
