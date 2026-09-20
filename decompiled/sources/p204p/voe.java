package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class voe extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f243460a;

    /* JADX INFO: renamed from: b */
    public int f243461b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f243462c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voe(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f243462c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f243460a = obj;
        this.f243461b |= Integer.MIN_VALUE;
        return this.f243462c.emit(null, this);
    }
}
