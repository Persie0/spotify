package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b4y0 extends ibk {

    /* JADX INFO: renamed from: a */
    public lc10 f23431a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f23432b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ei1 f23433c;

    /* JADX INFO: renamed from: d */
    public int f23434d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4y0(ei1 ei1Var, fbk fbkVar) {
        super(fbkVar);
        this.f23433c = ei1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f23432b = obj;
        this.f23434d |= Integer.MIN_VALUE;
        return this.f23433c.m39054a(null, this);
    }
}
