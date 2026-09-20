package p204p;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class czy0 {

    /* JADX INFO: renamed from: a */
    public final RecyclerView f43660a;

    /* JADX INFO: renamed from: b */
    public final Object f43661b;

    /* JADX INFO: renamed from: c */
    public int f43662c;

    /* JADX INFO: renamed from: d */
    public long f43663d;

    /* JADX INFO: renamed from: e */
    public int f43664e;

    /* JADX INFO: renamed from: f */
    public int f43665f;

    /* JADX INFO: renamed from: g */
    public bzy0 f43666g;

    /* JADX INFO: renamed from: h */
    public hjv0 f43667h;

    /* JADX INFO: renamed from: i */
    public final C2262pn f43668i = new C2262pn(this, 5);

    public czy0(RecyclerView recyclerView, gh00 gh00Var) {
        this.f43660a = recyclerView;
        this.f43661b = gh00Var;
    }

    /* JADX INFO: renamed from: a */
    public static final void m34476a(czy0 czy0Var) {
        czy0Var.f43664e++;
        bzy0 bzy0Var = czy0Var.f43666g;
        if (bzy0Var != null) {
            bzy0Var.f32622e = true;
            bzy0Var.f32623f = false;
            czy0Var.f43660a.invalidate();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m34477b(int i, long j, w2z0 w2z0Var, boolean z, eh00 eh00Var) {
        if (w2z0Var != null && i == this.f43662c && j == this.f43663d) {
            int i2 = w2z0Var.f247446a;
            boolean z2 = (z && this.f43664e == this.f43665f) ? false : true;
            boolean z3 = z2;
            this.f43666g = new bzy0(i, j, i2, eh00Var, z2);
            if (z3) {
                this.f43660a.invalidate();
            }
        }
    }
}
