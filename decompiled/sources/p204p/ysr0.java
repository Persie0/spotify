package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ysr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f275866a;

    /* JADX INFO: renamed from: b */
    public int f275867b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f275868c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f275868c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f275866a = obj;
        this.f275867b |= Integer.MIN_VALUE;
        return this.f275868c.emit(null, this);
    }
}
