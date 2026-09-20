package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class il40 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f103283a;

    /* JADX INFO: renamed from: b */
    public int f103284b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f103285c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il40(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f103285c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f103283a = obj;
        this.f103284b |= Integer.MIN_VALUE;
        return this.f103285c.emit(null, this);
    }
}
