package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kpt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f125120a;

    /* JADX INFO: renamed from: b */
    public int f125121b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lpt f125122c;

    /* JADX INFO: renamed from: d */
    public bqz0 f125123d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpt(lpt lptVar, ibk ibkVar) {
        super(ibkVar);
        this.f125122c = lptVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f125120a = obj;
        this.f125121b |= Integer.MIN_VALUE;
        return this.f125122c.mo15629a(null, null, this);
    }
}
