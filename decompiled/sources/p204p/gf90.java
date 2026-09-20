package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gf90 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f79308a;

    /* JADX INFO: renamed from: b */
    public boolean f79309b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f79310c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ jf90 f79311d;

    /* JADX INFO: renamed from: e */
    public int f79312e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf90(jf90 jf90Var, ibk ibkVar) {
        super(ibkVar);
        this.f79311d = jf90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f79310c = obj;
        this.f79312e |= Integer.MIN_VALUE;
        return this.f79311d.m53157b(false, false, this);
    }
}
