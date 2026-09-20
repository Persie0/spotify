package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xsk extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f265601a;

    /* JADX INFO: renamed from: b */
    public int f265602b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f265603c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsk(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f265603c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f265601a = obj;
        this.f265602b |= Integer.MIN_VALUE;
        return this.f265603c.emit(null, this);
    }
}
