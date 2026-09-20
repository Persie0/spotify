package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class p831 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f174855a;

    /* JADX INFO: renamed from: b */
    public int f174856b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f174857c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p831(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f174857c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f174855a = obj;
        this.f174856b |= Integer.MIN_VALUE;
        return this.f174857c.emit(null, this);
    }
}
