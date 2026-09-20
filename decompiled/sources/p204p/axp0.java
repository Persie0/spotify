package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class axp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f20944a;

    /* JADX INFO: renamed from: b */
    public int f20945b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pbt f20946c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axp0(pbt pbtVar, fbk fbkVar) {
        super(fbkVar);
        this.f20946c = pbtVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f20944a = obj;
        this.f20945b |= Integer.MIN_VALUE;
        return this.f20946c.emit(null, this);
    }
}
