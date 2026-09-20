package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xar extends ibk {

    /* JADX INFO: renamed from: a */
    public qe70 f259740a;

    /* JADX INFO: renamed from: b */
    public lsi0 f259741b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f259742c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ yar f259743d;

    /* JADX INFO: renamed from: e */
    public int f259744e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xar(yar yarVar, ibk ibkVar) {
        super(ibkVar);
        this.f259743d = yarVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f259742c = obj;
        this.f259744e |= Integer.MIN_VALUE;
        return this.f259743d.m93217d(null, this);
    }
}
