package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class up61 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f232584a;

    /* JADX INFO: renamed from: b */
    public int f232585b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f232586c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up61(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f232586c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f232584a = obj;
        this.f232585b |= Integer.MIN_VALUE;
        return this.f232586c.emit(null, this);
    }
}
