package p204p;

/* JADX INFO: renamed from: p.a7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1657a7 extends ibk {

    /* JADX INFO: renamed from: a */
    public izx0 f12906a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f12907b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nzx0 f12908c;

    /* JADX INFO: renamed from: d */
    public int f12909d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1657a7(nzx0 nzx0Var, fbk fbkVar) {
        super(fbkVar);
        this.f12908c = nzx0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f12907b = obj;
        this.f12909d |= Integer.MIN_VALUE;
        return this.f12908c.collect(null, this);
    }
}
