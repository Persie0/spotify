package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yot extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f274729a;

    /* JADX INFO: renamed from: b */
    public int f274730b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zot f274731c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yot(zot zotVar, ibk ibkVar) {
        super(ibkVar);
        this.f274731c = zotVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f274729a = obj;
        this.f274730b |= Integer.MIN_VALUE;
        return this.f274731c.mo15629a(null, null, this);
    }
}
