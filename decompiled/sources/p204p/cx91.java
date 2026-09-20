package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cx91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f42956a;

    /* JADX INFO: renamed from: b */
    public int f42957b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f42958c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx91(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f42958c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f42956a = obj;
        this.f42957b |= Integer.MIN_VALUE;
        return this.f42958c.emit(null, this);
    }
}
