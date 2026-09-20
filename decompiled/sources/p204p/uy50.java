package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class uy50 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f235157a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f235158b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vy50 f235159c;

    /* JADX INFO: renamed from: d */
    public int f235160d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy50(vy50 vy50Var, fbk fbkVar) {
        super(fbkVar);
        this.f235159c = vy50Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f235158b = obj;
        this.f235160d |= Integer.MIN_VALUE;
        return this.f235159c.m86704b(null, false, this);
    }
}
