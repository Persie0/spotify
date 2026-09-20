package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qif extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f189006a;

    /* JADX INFO: renamed from: b */
    public int f189007b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f189008c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qif(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f189008c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f189006a = obj;
        this.f189007b |= Integer.MIN_VALUE;
        return this.f189008c.emit(null, this);
    }
}
