package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class m0a0 {

    /* JADX INFO: renamed from: a */
    public final int f138607a;

    /* JADX INFO: renamed from: b */
    public final int f138608b;

    /* JADX INFO: renamed from: c */
    public final int f138609c;

    /* JADX INFO: renamed from: d */
    public final int f138610d;

    /* JADX INFO: renamed from: e */
    public final boolean f138611e;

    public m0a0(boolean z, int i, int i2, int i3, int i4) {
        this.f138607a = i;
        this.f138608b = i2;
        this.f138609c = i3;
        this.f138610d = i4;
        this.f138611e = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m60451a(int i) {
        if (i == 1) {
            if (this.f138607a - this.f138608b <= 1) {
                return false;
            }
        } else if (this.f138609c - this.f138610d <= 1) {
            return false;
        }
        return true;
    }
}
