package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class enz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61256a;

    /* JADX INFO: renamed from: b */
    public int f61257b;

    /* JADX INFO: renamed from: c */
    public niz f61258c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ fnz f61259d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enz(fnz fnzVar, fbk fbkVar) {
        super(fbkVar);
        this.f61259d = fnzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f61256a = obj;
        this.f61257b |= Integer.MIN_VALUE;
        return this.f61259d.emit(null, this);
    }
}
