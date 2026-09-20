package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bzy extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f32615a;

    /* JADX INFO: renamed from: b */
    public int f32616b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hhq f32617c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzy(hhq hhqVar, fbk fbkVar) {
        super(fbkVar);
        this.f32617c = hhqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f32615a = obj;
        this.f32616b |= Integer.MIN_VALUE;
        return this.f32617c.emit(null, this);
    }
}
