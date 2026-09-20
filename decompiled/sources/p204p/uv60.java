package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class uv60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f234377a;

    /* JADX INFO: renamed from: b */
    public int f234378b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f234379c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv60(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f234379c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f234377a = obj;
        this.f234378b |= Integer.MIN_VALUE;
        return this.f234379c.emit(null, this);
    }
}
