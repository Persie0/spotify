package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tcm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f219111a;

    /* JADX INFO: renamed from: b */
    public int f219112b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f219113c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tcm0(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f219113c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f219111a = obj;
        this.f219112b |= Integer.MIN_VALUE;
        return this.f219113c.emit(null, this);
    }
}
