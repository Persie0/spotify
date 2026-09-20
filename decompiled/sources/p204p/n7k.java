package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n7k extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f151180a;

    /* JADX INFO: renamed from: b */
    public int f151181b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eyi f151182c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7k(eyi eyiVar, fbk fbkVar) {
        super(fbkVar);
        this.f151182c = eyiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f151180a = obj;
        this.f151181b |= Integer.MIN_VALUE;
        return this.f151182c.emit(null, this);
    }
}
