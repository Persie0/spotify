package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class eie1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f59871a;

    /* JADX INFO: renamed from: b */
    public int f59872b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ di91 f59873c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eie1(di91 di91Var, fbk fbkVar) {
        super(fbkVar);
        this.f59873c = di91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f59871a = obj;
        this.f59872b |= Integer.MIN_VALUE;
        return this.f59873c.emit(null, this);
    }
}
