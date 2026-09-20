package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zx71 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f287234a;

    /* JADX INFO: renamed from: b */
    public int f287235b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f287236c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx71(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f287236c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f287234a = obj;
        this.f287235b |= Integer.MIN_VALUE;
        return this.f287236c.emit(null, this);
    }
}
