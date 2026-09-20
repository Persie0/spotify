package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xfx0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f261113a;

    /* JADX INFO: renamed from: b */
    public int f261114b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wk8 f261115c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfx0(wk8 wk8Var, fbk fbkVar) {
        super(fbkVar);
        this.f261115c = wk8Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f261113a = obj;
        this.f261114b |= Integer.MIN_VALUE;
        return this.f261115c.emit(null, this);
    }
}
