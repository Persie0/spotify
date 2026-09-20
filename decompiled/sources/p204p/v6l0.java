package p204p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v6l0 {

    /* JADX INFO: renamed from: a */
    public final zv41 f237919a;

    /* JADX INFO: renamed from: b */
    public final zv41 f237920b;

    /* JADX INFO: renamed from: c */
    public boolean f237921c;

    public v6l0(boolean z) {
        zv41 zv41VarM52819d = jag1.m52819d(Boolean.valueOf(z));
        this.f237919a = zv41VarM52819d;
        this.f237920b = zv41VarM52819d;
        this.f237921c = z;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo30277c();

    /* JADX INFO: renamed from: d */
    public final void m84813d(boolean z) {
        this.f237921c = z;
        fr0.m42476t(z, this.f237919a, null);
    }
}
