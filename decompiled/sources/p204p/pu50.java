package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pu50 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f181368a;

    /* JADX INFO: renamed from: b */
    public int f181369b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f181370c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu50(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f181370c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f181368a = obj;
        this.f181369b |= Integer.MIN_VALUE;
        return this.f181370c.emit(null, this);
    }
}
