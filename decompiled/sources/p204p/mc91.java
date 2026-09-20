package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mc91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f142108a;

    /* JADX INFO: renamed from: b */
    public int f142109b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud71 f142110c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc91(ud71 ud71Var, fbk fbkVar) {
        super(fbkVar);
        this.f142110c = ud71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f142108a = obj;
        this.f142109b |= Integer.MIN_VALUE;
        return this.f142110c.emit(null, this);
    }
}
