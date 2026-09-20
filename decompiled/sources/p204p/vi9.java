package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vi9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f241646a;

    /* JADX INFO: renamed from: b */
    public int f241647b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f241648c;

    /* JADX INFO: renamed from: d */
    public int f241649d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi9(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f241648c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f241646a = obj;
        this.f241647b |= Integer.MIN_VALUE;
        return this.f241648c.emit(null, this);
    }
}
