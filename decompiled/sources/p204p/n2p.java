package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class n2p extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f149805a;

    /* JADX INFO: renamed from: b */
    public int f149806b;

    /* JADX INFO: renamed from: c */
    public niz f149807c;

    /* JADX INFO: renamed from: d */
    public int f149808d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ nc6 f149809e;

    /* JADX INFO: renamed from: f */
    public int f149810f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2p(nc6 nc6Var, fbk fbkVar) {
        super(fbkVar);
        this.f149809e = nc6Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f149805a = obj;
        this.f149806b |= Integer.MIN_VALUE;
        return this.f149809e.emit(null, this);
    }
}
