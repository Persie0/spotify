package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class uo2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f232311a;

    /* JADX INFO: renamed from: b */
    public int f232312b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f232313c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo2(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f232313c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f232311a = obj;
        this.f232312b |= Integer.MIN_VALUE;
        return this.f232313c.emit(null, this);
    }
}
