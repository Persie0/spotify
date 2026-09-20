package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class opa {

    /* JADX INFO: renamed from: a */
    public int f167824a;

    /* JADX INFO: renamed from: a */
    public final void m67518a(int i) {
        this.f167824a = i | this.f167824a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m67519d(int i) {
        return (this.f167824a & i) == i;
    }
}
