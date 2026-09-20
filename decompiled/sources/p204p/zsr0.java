package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zsr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f285990a;

    /* JADX INFO: renamed from: b */
    public int f285991b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f285992c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f285992c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f285990a = obj;
        this.f285991b |= Integer.MIN_VALUE;
        return this.f285992c.emit(null, this);
    }
}
