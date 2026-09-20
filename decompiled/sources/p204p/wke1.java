package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wke1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f252221a;

    /* JADX INFO: renamed from: b */
    public int f252222b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aae1 f252223c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wke1(aae1 aae1Var, fbk fbkVar) {
        super(fbkVar);
        this.f252223c = aae1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f252221a = obj;
        this.f252222b |= Integer.MIN_VALUE;
        return this.f252223c.emit(null, this);
    }
}
