package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class nip0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f154298a;

    /* JADX INFO: renamed from: b */
    public int f154299b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f154300c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nip0(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f154300c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f154298a = obj;
        this.f154299b |= Integer.MIN_VALUE;
        return this.f154300c.emit(null, this);
    }
}
