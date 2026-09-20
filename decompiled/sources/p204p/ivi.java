package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ivi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f106224a;

    /* JADX INFO: renamed from: b */
    public int f106225b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f106226c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivi(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f106226c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f106224a = obj;
        this.f106225b |= Integer.MIN_VALUE;
        return this.f106226c.emit(null, this);
    }
}
