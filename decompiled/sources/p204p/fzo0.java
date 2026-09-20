package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class fzo0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ozo0 f75136a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f75137b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f75138c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f75139d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ List f75140e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f75141f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Long f75142g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Long f75143h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f75144i;

    public fzo0(ozo0 ozo0Var, List list, List list2, List list3, List list4, int i, Long l, Long l2, long j) {
        this.f75136a = ozo0Var;
        this.f75137b = list;
        this.f75138c = list2;
        this.f75139d = list3;
        this.f75140e = list4;
        this.f75141f = i;
        this.f75142g = l;
        this.f75143h = l2;
        this.f75144i = j;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        this.f75136a.mo37789r(new nbc0(this.f75137b, this.f75138c, this.f75139d, this.f75140e, this.f75141f, this.f75142g, this.f75143h), this.f75144i);
    }
}
