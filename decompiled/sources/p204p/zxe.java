package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zxe extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f287294a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ aye f287295b;

    /* JADX INFO: renamed from: c */
    public int f287296c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxe(aye ayeVar, ibk ibkVar) {
        super(ibkVar);
        this.f287295b = ayeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f287294a = obj;
        this.f287296c |= Integer.MIN_VALUE;
        return this.f287295b.m27515b(this);
    }
}
