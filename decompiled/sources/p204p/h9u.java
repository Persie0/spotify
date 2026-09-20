package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h9u extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89036a;

    /* JADX INFO: renamed from: b */
    public int f89037b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hhq f89038c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9u(hhq hhqVar, fbk fbkVar) {
        super(fbkVar);
        this.f89038c = hhqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f89036a = obj;
        this.f89037b |= Integer.MIN_VALUE;
        return this.f89038c.emit(null, this);
    }
}
