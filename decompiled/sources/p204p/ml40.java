package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ml40 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f144752a;

    /* JADX INFO: renamed from: b */
    public int f144753b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f144754c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml40(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f144754c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f144752a = obj;
        this.f144753b |= Integer.MIN_VALUE;
        return this.f144754c.emit(null, this);
    }
}
