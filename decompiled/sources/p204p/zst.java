package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zst extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f285997a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ att f285998b;

    /* JADX INFO: renamed from: c */
    public int f285999c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zst(att attVar, ibk ibkVar) {
        super(ibkVar);
        this.f285998b = attVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f285997a = obj;
        this.f285999c |= Integer.MIN_VALUE;
        return this.f285998b.m27154a(null, this);
    }
}
