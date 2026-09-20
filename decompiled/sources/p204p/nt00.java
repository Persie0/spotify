package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nt00 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f157943a;

    /* JADX INFO: renamed from: b */
    public int f157944b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lt00 f157945c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt00(lt00 lt00Var, fbk fbkVar) {
        super(fbkVar);
        this.f157945c = lt00Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f157943a = obj;
        this.f157944b |= Integer.MIN_VALUE;
        return this.f157945c.emit(null, this);
    }
}
