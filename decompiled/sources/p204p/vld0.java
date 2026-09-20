package p204p;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vld0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f242457a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zld0 f242458b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yld0 f242459c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ tld0 f242460d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Collection f242461e;

    public /* synthetic */ vld0(zld0 zld0Var, yld0 yld0Var, tld0 tld0Var, Collection collection, int i) {
        this.f242457a = i;
        this.f242458b = zld0Var;
        this.f242459c = yld0Var;
        this.f242460d = tld0Var;
        this.f242461e = collection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f242457a) {
            case 0:
                this.f242459c.mo53252d(this.f242458b, this.f242460d, this.f242461e);
                break;
            default:
                this.f242459c.mo53252d(this.f242458b, this.f242460d, this.f242461e);
                break;
        }
    }
}
