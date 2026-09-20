package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rn2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f200701a;

    /* JADX INFO: renamed from: b */
    public int f200702b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sn2 f200703c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn2(sn2 sn2Var, fbk fbkVar) {
        super(fbkVar);
        this.f200703c = sn2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f200701a = obj;
        this.f200702b |= Integer.MIN_VALUE;
        return this.f200703c.emit(null, this);
    }
}
