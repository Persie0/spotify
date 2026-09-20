package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class k06 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f117903a;

    /* JADX INFO: renamed from: b */
    public int f117904b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f117905c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k06(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f117905c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f117903a = obj;
        this.f117904b |= Integer.MIN_VALUE;
        return this.f117905c.emit(null, this);
    }
}
