package p204p;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class m281 extends blc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f139281a;

    /* JADX INFO: renamed from: b */
    public boolean f139282b;

    /* JADX INFO: renamed from: c */
    public int f139283c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f139284d;

    public m281(gd30 gd30Var) {
        this.f139281a = 1;
        this.f139284d = gd30Var;
        this.f139282b = false;
        this.f139283c = 0;
    }

    @Override // p204p.blc1, p204p.alc1
    /* JADX INFO: renamed from: a */
    public void mo26286a(View view) {
        switch (this.f139281a) {
            case 0:
                this.f139282b = true;
                break;
        }
    }

    @Override // p204p.alc1
    /* JADX INFO: renamed from: d */
    public final void mo26287d(View view) {
        switch (this.f139281a) {
            case 0:
                if (!this.f139282b) {
                    ((n281) this.f139284d).f149687a.setVisibility(this.f139283c);
                }
                break;
            default:
                int i = this.f139283c + 1;
                this.f139283c = i;
                gd30 gd30Var = (gd30) this.f139284d;
                if (i == ((ArrayList) gd30Var.f78719c).size()) {
                    alc1 alc1Var = (alc1) gd30Var.f78721e;
                    if (alc1Var != null) {
                        alc1Var.mo26287d(null);
                    }
                    this.f139283c = 0;
                    this.f139282b = false;
                    gd30Var.f78718b = false;
                }
                break;
        }
    }

    @Override // p204p.blc1, p204p.alc1
    /* JADX INFO: renamed from: e */
    public final void mo26288e() {
        switch (this.f139281a) {
            case 0:
                ((n281) this.f139284d).f149687a.setVisibility(0);
                break;
            default:
                if (!this.f139282b) {
                    this.f139282b = true;
                    alc1 alc1Var = (alc1) ((gd30) this.f139284d).f78721e;
                    if (alc1Var != null) {
                        alc1Var.mo26288e();
                    }
                    break;
                }
                break;
        }
    }

    public m281(n281 n281Var, int i) {
        this.f139281a = 0;
        this.f139284d = n281Var;
        this.f139283c = i;
        this.f139282b = false;
    }
}
