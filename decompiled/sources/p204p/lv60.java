package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class lv60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f137235a;

    /* JADX INFO: renamed from: b */
    public int f137236b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f137237c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv60(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f137237c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f137235a = obj;
        this.f137236b |= Integer.MIN_VALUE;
        return this.f137237c.emit(null, this);
    }
}
