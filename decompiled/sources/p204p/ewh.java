package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ewh extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63549a;

    /* JADX INFO: renamed from: b */
    public int f63550b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fwh f63551c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ewh(fwh fwhVar, ibk ibkVar) {
        super(ibkVar);
        this.f63551c = fwhVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f63549a = obj;
        this.f63550b |= Integer.MIN_VALUE;
        return this.f63551c.mo15629a(null, null, this);
    }
}
