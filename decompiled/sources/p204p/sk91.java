package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class sk91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f210063a;

    /* JADX INFO: renamed from: b */
    public int f210064b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f210065c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk91(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f210065c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f210063a = obj;
        this.f210064b |= Integer.MIN_VALUE;
        return this.f210065c.emit(null, this);
    }
}
