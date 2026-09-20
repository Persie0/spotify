package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class o5u extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f162094a;

    /* JADX INFO: renamed from: b */
    public int f162095b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l5u f162096c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5u(l5u l5uVar, fbk fbkVar) {
        super(fbkVar);
        this.f162096c = l5uVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f162094a = obj;
        this.f162095b |= Integer.MIN_VALUE;
        return this.f162096c.emit(null, this);
    }
}
