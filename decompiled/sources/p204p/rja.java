package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class rja extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f199781a;

    /* JADX INFO: renamed from: b */
    public int f199782b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f199783c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rja(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f199783c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f199781a = obj;
        this.f199782b |= Integer.MIN_VALUE;
        return this.f199783c.emit(null, this);
    }
}
