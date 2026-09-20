package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ox70 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f170903a;

    /* JADX INFO: renamed from: b */
    public int f170904b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f170905c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox70(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f170905c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f170903a = obj;
        this.f170904b |= Integer.MIN_VALUE;
        return this.f170905c.emit(null, this);
    }
}
