package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class yha extends ibk {

    /* JADX INFO: renamed from: a */
    public d850 f272793a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f272794b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zha f272795c;

    /* JADX INFO: renamed from: d */
    public int f272796d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yha(zha zhaVar, ibk ibkVar) {
        super(ibkVar);
        this.f272795c = zhaVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f272794b = obj;
        this.f272796d |= Integer.MIN_VALUE;
        return zha.m96120d(this.f272795c, null, null, null, false, false, null, this);
    }
}
