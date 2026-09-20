package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wnu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f253299a;

    /* JADX INFO: renamed from: b */
    public int f253300b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f253301c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnu0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f253301c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f253299a = obj;
        this.f253300b |= Integer.MIN_VALUE;
        return this.f253301c.emit(null, this);
    }
}
