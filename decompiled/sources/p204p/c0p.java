package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class c0p extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f32836a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f32837b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ h0p f32838c;

    /* JADX INFO: renamed from: d */
    public int f32839d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0p(h0p h0pVar, ibk ibkVar) {
        super(ibkVar);
        this.f32838c = h0pVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f32837b = obj;
        this.f32839d |= Integer.MIN_VALUE;
        return this.f32838c.m46365c(null, this, false);
    }
}
