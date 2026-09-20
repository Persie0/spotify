package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ynu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f274506a;

    /* JADX INFO: renamed from: b */
    public int f274507b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f274508c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ynu0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f274508c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f274506a = obj;
        this.f274507b |= Integer.MIN_VALUE;
        return this.f274508c.emit(null, this);
    }
}
