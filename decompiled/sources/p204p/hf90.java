package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hf90 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f90644a;

    /* JADX INFO: renamed from: b */
    public jf90 f90645b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f90646c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ jf90 f90647d;

    /* JADX INFO: renamed from: e */
    public int f90648e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf90(jf90 jf90Var, ibk ibkVar) {
        super(ibkVar);
        this.f90647d = jf90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f90646c = obj;
        this.f90648e |= Integer.MIN_VALUE;
        return this.f90647d.m53158c(false, this);
    }
}
