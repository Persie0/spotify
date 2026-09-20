package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vve extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f245218a;

    /* JADX INFO: renamed from: b */
    public int f245219b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f245220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vve(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f245220c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f245218a = obj;
        this.f245219b |= Integer.MIN_VALUE;
        return this.f245220c.emit(null, this);
    }
}
