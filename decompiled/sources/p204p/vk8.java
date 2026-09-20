package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vk8 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f242163a;

    /* JADX INFO: renamed from: b */
    public int f242164b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wk8 f242165c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk8(wk8 wk8Var, fbk fbkVar) {
        super(fbkVar);
        this.f242165c = wk8Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f242163a = obj;
        this.f242164b |= Integer.MIN_VALUE;
        return this.f242165c.emit(null, this);
    }
}
