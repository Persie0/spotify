package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s5p0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f205881a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f205882b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v5p0 f205883c;

    /* JADX INFO: renamed from: d */
    public int f205884d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5p0(v5p0 v5p0Var, ibk ibkVar) {
        super(ibkVar);
        this.f205883c = v5p0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f205882b = obj;
        this.f205884d |= Integer.MIN_VALUE;
        return v5p0.m84741i(this.f205883c, this);
    }
}
