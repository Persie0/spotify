package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w360 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f247499a;

    /* JADX INFO: renamed from: b */
    public int f247500b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f247501c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w360(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f247501c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f247499a = obj;
        this.f247500b |= Integer.MIN_VALUE;
        return this.f247501c.emit(null, this);
    }
}
