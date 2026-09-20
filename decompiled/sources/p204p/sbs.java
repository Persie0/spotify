package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class sbs extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f207569a;

    /* JADX INFO: renamed from: b */
    public int f207570b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hhq f207571c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbs(hhq hhqVar, fbk fbkVar) {
        super(fbkVar);
        this.f207571c = hhqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f207569a = obj;
        this.f207570b |= Integer.MIN_VALUE;
        return this.f207571c.emit(null, this);
    }
}
