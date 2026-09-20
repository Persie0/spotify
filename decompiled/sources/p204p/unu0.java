package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class unu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f232265a;

    /* JADX INFO: renamed from: b */
    public int f232266b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f232267c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unu0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f232267c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f232265a = obj;
        this.f232266b |= Integer.MIN_VALUE;
        return this.f232267c.emit(null, this);
    }
}
