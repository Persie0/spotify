package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qxx extends ibk {

    /* JADX INFO: renamed from: a */
    public String f193758a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f193759b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wxx f193760c;

    /* JADX INFO: renamed from: d */
    public int f193761d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxx(wxx wxxVar, ibk ibkVar) {
        super(ibkVar);
        this.f193760c = wxxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f193759b = obj;
        this.f193761d |= Integer.MIN_VALUE;
        return wxx.m89329a(this.f193760c, null, this);
    }
}
