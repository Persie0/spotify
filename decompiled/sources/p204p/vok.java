package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vok extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f243490a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bpk f243491b;

    /* JADX INFO: renamed from: c */
    public int f243492c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vok(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f243491b = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f243490a = obj;
        this.f243492c |= Integer.MIN_VALUE;
        return this.f243491b.m30130E(this);
    }
}
