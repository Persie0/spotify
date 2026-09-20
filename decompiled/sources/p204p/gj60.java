package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gj60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f80377a;

    /* JADX INFO: renamed from: b */
    public int f80378b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f80379c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj60(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f80379c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f80377a = obj;
        this.f80378b |= Integer.MIN_VALUE;
        return this.f80379c.emit(null, this);
    }
}
