package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rar extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f197372a;

    /* JADX INFO: renamed from: b */
    public int f197373b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f197374c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rar(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f197374c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f197372a = obj;
        this.f197373b |= Integer.MIN_VALUE;
        return this.f197374c.emit(null, this);
    }
}
