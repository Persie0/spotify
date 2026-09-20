package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class p6y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ r6y0 f174518a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f174519b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f174520c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f174521d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f174522e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Boolean f174523f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Integer f174524g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f174525h;

    public p6y0(r6y0 r6y0Var, String str, String str2, String str3, String str4, Boolean bool, Integer num, String str5) {
        this.f174518a = r6y0Var;
        this.f174519b = str;
        this.f174520c = str2;
        this.f174521d = str3;
        this.f174522e = str4;
        this.f174523f = bool;
        this.f174524g = num;
        this.f174525h = str5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f174518a.f196382g.onNext(new d6y0(this.f174523f, this.f174524g, this.f174519b, this.f174520c, this.f174521d, this.f174522e, this.f174525h));
    }
}
