package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class yo41 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f274556a;

    /* JADX INFO: renamed from: b */
    public int f274557b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f274558c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo41(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f274558c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f274556a = obj;
        this.f274557b |= Integer.MIN_VALUE;
        return this.f274558c.emit(null, this);
    }
}
