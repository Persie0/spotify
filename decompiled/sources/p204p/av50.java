package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class av50 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f20104a;

    /* JADX INFO: renamed from: b */
    public int f20105b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f20106c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av50(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f20106c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f20104a = obj;
        this.f20105b |= Integer.MIN_VALUE;
        return this.f20106c.emit(null, this);
    }
}
