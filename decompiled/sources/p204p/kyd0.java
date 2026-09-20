package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kyd0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f127802a;

    /* JADX INFO: renamed from: b */
    public int f127803b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f127804c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyd0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f127804c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f127802a = obj;
        this.f127803b |= Integer.MIN_VALUE;
        return this.f127804c.emit(null, this);
    }
}
