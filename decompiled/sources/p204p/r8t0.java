package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class r8t0 extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f196835a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f196836b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ub90 f196837c;

    /* JADX INFO: renamed from: d */
    public int f196838d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8t0(ub90 ub90Var, fbk fbkVar) {
        super(fbkVar);
        this.f196837c = ub90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f196836b = obj;
        this.f196838d |= Integer.MIN_VALUE;
        return this.f196837c.emit(null, this);
    }
}
