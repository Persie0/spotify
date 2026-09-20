package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class do2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f50919a;

    /* JADX INFO: renamed from: b */
    public int f50920b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f50921c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public do2(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f50921c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f50919a = obj;
        this.f50920b |= Integer.MIN_VALUE;
        return this.f50921c.emit(null, this);
    }
}
