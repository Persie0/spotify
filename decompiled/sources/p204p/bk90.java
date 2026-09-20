package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class bk90 {

    /* JADX INFO: renamed from: a */
    public final dqk0 f27868a;

    /* JADX INFO: renamed from: b */
    public boolean f27869b;

    /* JADX INFO: renamed from: c */
    public int f27870c = -1;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ck90 f27871d;

    public bk90(ck90 ck90Var, dqk0 dqk0Var) {
        this.f27871d = ck90Var;
        this.f27868a = dqk0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m29651a(boolean z) {
        if (z == this.f27869b) {
            return;
        }
        this.f27869b = z;
        int i = z ? 1 : -1;
        ck90 ck90Var = this.f27871d;
        int i2 = ck90Var.f38882c;
        ck90Var.f38882c = i + i2;
        if (!ck90Var.f38883d) {
            ck90Var.f38883d = true;
            while (true) {
                try {
                    int i3 = ck90Var.f38882c;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        ck90Var.mo15625h();
                    } else if (z3) {
                        ck90Var.mo15626i();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    ck90Var.f38883d = false;
                    throw th;
                }
            }
            ck90Var.f38883d = false;
        }
        if (this.f27869b) {
            ck90Var.m33097d(this);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean mo26204c(hc80 hc80Var) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo26205d();

    /* JADX INFO: renamed from: b */
    public void mo26203b() {
    }
}
