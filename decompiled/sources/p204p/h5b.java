package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class h5b extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f87795a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j5b f87796b;

    /* JADX INFO: renamed from: c */
    public int f87797c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5b(j5b j5bVar, ibk ibkVar) {
        super(ibkVar);
        this.f87796b = j5bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f87795a = obj;
        this.f87797c |= Integer.MIN_VALUE;
        return this.f87796b.m52455c(this);
    }
}
