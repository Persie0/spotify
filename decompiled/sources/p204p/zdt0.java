package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zdt0 extends ibk {

    /* JADX INFO: renamed from: a */
    public eh00 f281796a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f281797b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ owp f281798c;

    /* JADX INFO: renamed from: d */
    public int f281799d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdt0(owp owpVar, ibk ibkVar) {
        super(ibkVar);
        this.f281798c = owpVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f281797b = obj;
        this.f281799d |= Integer.MIN_VALUE;
        return this.f281798c.m68182i(null, null, null, null, null, this);
    }
}
