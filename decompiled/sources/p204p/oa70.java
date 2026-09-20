package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class oa70 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f163247a;

    /* JADX INFO: renamed from: b */
    public int f163248b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f163249c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa70(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f163249c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f163247a = obj;
        this.f163248b |= Integer.MIN_VALUE;
        return this.f163249c.emit(null, this);
    }
}
