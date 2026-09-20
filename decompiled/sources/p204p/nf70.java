package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nf70 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f153261a;

    /* JADX INFO: renamed from: b */
    public int f153262b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f153263c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf70(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f153263c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f153261a = obj;
        this.f153262b |= Integer.MIN_VALUE;
        return this.f153263c.emit(null, this);
    }
}
