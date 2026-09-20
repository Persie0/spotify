package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fyd1 extends ibk {

    /* JADX INFO: renamed from: a */
    public p2x0 f74709a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f74710b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eyi f74711c;

    /* JADX INFO: renamed from: d */
    public int f74712d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyd1(eyi eyiVar, fbk fbkVar) {
        super(fbkVar);
        this.f74711c = eyiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f74710b = obj;
        this.f74712d |= Integer.MIN_VALUE;
        return this.f74711c.m40320f(null, this);
    }
}
