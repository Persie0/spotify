package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class v0s extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f236114a;

    /* JADX INFO: renamed from: b */
    public int f236115b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f236116c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0s(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f236116c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f236114a = obj;
        this.f236115b |= Integer.MIN_VALUE;
        return this.f236116c.emit(null, this);
    }
}
