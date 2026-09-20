package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes10.dex */
public final class jd5 implements obm0 {

    /* JADX INFO: renamed from: a */
    public final pd5 f111236a;

    /* JADX INFO: renamed from: b */
    public boolean f111237b;

    /* JADX INFO: renamed from: c */
    public boolean f111238c;

    public jd5(pd5 pd5Var) {
        this.f111236a = pd5Var;
    }

    @Override // p204p.obm0
    /* JADX INFO: renamed from: a */
    public final void mo46731a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.f111237b = bundle.getBoolean("waitingForSuccessfulFrame");
        this.f111238c = bundle.getBoolean("finished");
    }

    @Override // p204p.obm0
    /* JADX INFO: renamed from: b */
    public final void mo46732b(ehg1 ehg1Var) {
        if (this.f111238c) {
            return;
        }
        if (ehg1Var instanceof ubm0) {
            this.f111237b = false;
            return;
        }
        boolean z = ehg1Var instanceof tbm0;
        pd5 pd5Var = this.f111236a;
        if (z) {
            if (((tbm0) ehg1Var).f218906e) {
                this.f111237b = true;
                return;
            } else {
                pd5Var.mo66741a();
                this.f111238c = true;
                return;
            }
        }
        if (!(ehg1Var instanceof vbm0)) {
            if (ehg1Var instanceof zbm0) {
                this.f111237b = false;
                this.f111238c = true;
                return;
            }
            return;
        }
        if (this.f111237b) {
            pd5Var.mo66741a();
            this.f111237b = false;
            this.f111238c = true;
        }
    }

    @Override // p204p.obm0
    /* JADX INFO: renamed from: d */
    public final Bundle mo46733d() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("waitingForSuccessfulFrame", this.f111237b);
        bundle.putBoolean("finished", this.f111238c);
        return bundle;
    }
}
