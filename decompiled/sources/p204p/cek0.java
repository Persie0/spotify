package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cek0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f37148a;

    /* JADX INFO: renamed from: b */
    public int f37149b;

    /* JADX INFO: renamed from: c */
    public Object f37150c;

    /* JADX INFO: renamed from: d */
    public niz f37151d;

    /* JADX INFO: renamed from: e */
    public int f37152e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ dek0 f37153f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cek0(dek0 dek0Var, fbk fbkVar) {
        super(fbkVar);
        this.f37153f = dek0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f37148a = obj;
        this.f37149b |= Integer.MIN_VALUE;
        return this.f37153f.emit(null, this);
    }
}
