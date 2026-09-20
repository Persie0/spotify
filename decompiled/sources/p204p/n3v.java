package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n3v extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f150132a;

    /* JADX INFO: renamed from: b */
    public int f150133b;

    /* JADX INFO: renamed from: c */
    public niz f150134c;

    /* JADX INFO: renamed from: d */
    public int f150135d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ hhq f150136e;

    /* JADX INFO: renamed from: f */
    public String f150137f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3v(hhq hhqVar, fbk fbkVar) {
        super(fbkVar);
        this.f150136e = hhqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f150132a = obj;
        this.f150133b |= Integer.MIN_VALUE;
        return this.f150136e.emit(null, this);
    }
}
