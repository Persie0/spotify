package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vyd0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f246068a;

    /* JADX INFO: renamed from: b */
    public int f246069b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f246070c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyd0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f246070c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f246068a = obj;
        this.f246069b |= Integer.MIN_VALUE;
        return this.f246070c.emit(null, this);
    }
}
