package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ysc extends ibk {

    /* JADX INFO: renamed from: a */
    public String f275739a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f275740b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zsc f275741c;

    /* JADX INFO: renamed from: d */
    public int f275742d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysc(zsc zscVar, ibk ibkVar) {
        super(ibkVar);
        this.f275741c = zscVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f275740b = obj;
        this.f275742d |= Integer.MIN_VALUE;
        return this.f275741c.m96828a(null, null, this);
    }
}
