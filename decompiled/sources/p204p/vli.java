package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vli extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f242528a;

    /* JADX INFO: renamed from: b */
    public int f242529b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f242530c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vli(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f242530c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f242528a = obj;
        this.f242529b |= Integer.MIN_VALUE;
        return this.f242530c.emit(null, this);
    }
}
