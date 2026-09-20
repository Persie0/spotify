package p204p;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class fsv0 extends amd0 implements csv0 {

    /* JADX INFO: renamed from: a */
    public final String f72988a;

    /* JADX INFO: renamed from: b */
    public final String f72989b;

    /* JADX INFO: renamed from: c */
    public final cmd0 f72990c;

    /* JADX INFO: renamed from: d */
    public boolean f72991d;

    /* JADX INFO: renamed from: e */
    public int f72992e = -1;

    /* JADX INFO: renamed from: f */
    public int f72993f;

    /* JADX INFO: renamed from: g */
    public bsv0 f72994g;

    /* JADX INFO: renamed from: h */
    public int f72995h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ gsv0 f72996i;

    public fsv0(gsv0 gsv0Var, String str, String str2, cmd0 cmd0Var) {
        this.f72996i = gsv0Var;
        this.f72988a = str;
        this.f72989b = str2;
        this.f72990c = cmd0Var;
    }

    @Override // p204p.csv0
    /* JADX INFO: renamed from: a */
    public final int mo33781a() {
        return this.f72995h;
    }

    @Override // p204p.csv0
    /* JADX INFO: renamed from: b */
    public final void mo33782b() {
        bsv0 bsv0Var = this.f72994g;
        if (bsv0Var != null) {
            int i = this.f72995h;
            int i2 = bsv0Var.f30404d;
            bsv0Var.f30404d = i2 + 1;
            bsv0Var.m30446b(4, i2, i, null, null);
            this.f72994g = null;
            this.f72995h = 0;
        }
    }

    @Override // p204p.csv0
    /* JADX INFO: renamed from: c */
    public final void mo33783c(bsv0 bsv0Var) {
        this.f72994g = bsv0Var;
        int i = bsv0Var.f30405e;
        bsv0Var.f30405e = i + 1;
        Bundle bundleM93449h = ydj.m93449h("routeId", this.f72988a, "routeGroupId", this.f72989b);
        bundleM93449h.putParcelable("routeControllerOptions", this.f72990c.f39652a);
        int i2 = bsv0Var.f30404d;
        bsv0Var.f30404d = i2 + 1;
        bsv0Var.m30446b(3, i2, i, null, bundleM93449h);
        this.f72995h = i;
        if (this.f72991d) {
            bsv0Var.m30445a(i);
            int i3 = this.f72992e;
            if (i3 >= 0) {
                bsv0Var.m30447c(this.f72995h, i3);
                this.f72992e = -1;
            }
            int i4 = this.f72993f;
            if (i4 != 0) {
                bsv0Var.m30448d(this.f72995h, i4);
                this.f72993f = 0;
            }
        }
    }

    @Override // p204p.amd0
    /* JADX INFO: renamed from: d */
    public final boolean mo26391d(Intent intent, smd0 smd0Var) {
        bsv0 bsv0Var = this.f72994g;
        if (bsv0Var != null) {
            int i = this.f72995h;
            int i2 = bsv0Var.f30404d;
            bsv0Var.f30404d = i2 + 1;
            if (bsv0Var.m30446b(9, i2, i, intent, null)) {
                if (smd0Var != null) {
                    bsv0Var.f30408h.put(i2, smd0Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p204p.amd0
    /* JADX INFO: renamed from: e */
    public final void mo26392e() {
        gsv0 gsv0Var = this.f72996i;
        gsv0Var.f84025X.remove(this);
        mo33782b();
        gsv0Var.m45667m();
    }

    @Override // p204p.amd0
    /* JADX INFO: renamed from: f */
    public final void mo26393f() {
        this.f72991d = true;
        bsv0 bsv0Var = this.f72994g;
        if (bsv0Var != null) {
            bsv0Var.m30445a(this.f72995h);
        }
    }

    @Override // p204p.amd0
    /* JADX INFO: renamed from: g */
    public final void mo26394g(int i) {
        bsv0 bsv0Var = this.f72994g;
        if (bsv0Var != null) {
            bsv0Var.m30447c(this.f72995h, i);
        } else {
            this.f72992e = i;
            this.f72993f = 0;
        }
    }

    @Override // p204p.amd0
    /* JADX INFO: renamed from: h */
    public final void mo26395h() {
        mo26396i(0);
    }

    @Override // p204p.amd0
    /* JADX INFO: renamed from: i */
    public final void mo26396i(int i) {
        this.f72991d = false;
        bsv0 bsv0Var = this.f72994g;
        if (bsv0Var != null) {
            int i2 = this.f72995h;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i);
            int i3 = bsv0Var.f30404d;
            bsv0Var.f30404d = i3 + 1;
            bsv0Var.m30446b(6, i3, i2, null, bundle);
        }
    }

    @Override // p204p.amd0
    /* JADX INFO: renamed from: j */
    public final void mo26397j(int i) {
        bsv0 bsv0Var = this.f72994g;
        if (bsv0Var != null) {
            bsv0Var.m30448d(this.f72995h, i);
        } else {
            this.f72993f += i;
        }
    }
}
