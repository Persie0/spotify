package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ua70 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f228393a;

    /* JADX INFO: renamed from: b */
    public int f228394b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wk8 f228395c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua70(wk8 wk8Var, fbk fbkVar) {
        super(fbkVar);
        this.f228395c = wk8Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f228393a = obj;
        this.f228394b |= Integer.MIN_VALUE;
        return this.f228395c.emit(null, this);
    }
}
