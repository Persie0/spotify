package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vnu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f243250a;

    /* JADX INFO: renamed from: b */
    public int f243251b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f243252c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnu0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f243252c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f243250a = obj;
        this.f243251b |= Integer.MIN_VALUE;
        return this.f243252c.emit(null, this);
    }
}
