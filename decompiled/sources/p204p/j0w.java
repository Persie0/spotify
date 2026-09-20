package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class j0w extends ibk {

    /* JADX INFO: renamed from: a */
    public s50 f107567a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f107568b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vme f107569c;

    /* JADX INFO: renamed from: d */
    public int f107570d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0w(vme vmeVar, ibk ibkVar) {
        super(ibkVar);
        this.f107569c = vmeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f107568b = obj;
        this.f107570d |= Integer.MIN_VALUE;
        return this.f107569c.mo33757a(null, this);
    }
}
