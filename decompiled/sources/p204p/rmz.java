package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class rmz implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fiz f200659a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f200660b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f200661c;

    public rmz(yab yabVar, String str, boolean z) {
        this.f200659a = yabVar;
        this.f200660b = str;
        this.f200661c = z;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        Object objCollect = this.f200659a.collect(new qmz(nizVar, this.f200660b, this.f200661c), fbkVar);
        return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
    }
}
