package p204p;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class esv0 extends zld0 implements csv0 {

    /* JADX INFO: renamed from: f */
    public final String f62499f;

    /* JADX INFO: renamed from: g */
    public final cmd0 f62500g;

    /* JADX INFO: renamed from: h */
    public boolean f62501h;

    /* JADX INFO: renamed from: j */
    public int f62503j;

    /* JADX INFO: renamed from: k */
    public bsv0 f62504k;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ gsv0 f62506m;

    /* JADX INFO: renamed from: i */
    public int f62502i = -1;

    /* JADX INFO: renamed from: l */
    public int f62505l = -1;

    public esv0(gsv0 gsv0Var, String str, cmd0 cmd0Var) {
        this.f62506m = gsv0Var;
        this.f62499f = str;
        this.f62500g = cmd0Var;
    }

    @Override // p204p.csv0
    /* JADX INFO: renamed from: a */
    public final int mo33781a() {
        return this.f62505l;
    }

    @Override // p204p.csv0
    /* JADX INFO: renamed from: b */
    public final void mo33782b() {
        bsv0 bsv0Var = this.f62504k;
        if (bsv0Var != null) {
            int i = this.f62505l;
            int i2 = bsv0Var.f30404d;
            bsv0Var.f30404d = i2 + 1;
            bsv0Var.m30446b(4, i2, i, null, null);
            this.f62504k = null;
            this.f62505l = 0;
        }
    }

    @Override // p204p.csv0
    /* JADX INFO: renamed from: c */
    public final void mo33783c(bsv0 bsv0Var) {
        dsv0 dsv0Var = new dsv0();
        this.f62504k = bsv0Var;
        int i = bsv0Var.f30405e;
        bsv0Var.f30405e = i + 1;
        int i2 = bsv0Var.f30404d;
        bsv0Var.f30404d = i2 + 1;
        Bundle bundleM36606f = dq60.m36606f("memberRouteId", this.f62499f);
        bundleM36606f.putParcelable("routeControllerOptions", this.f62500g.f39652a);
        bsv0Var.m30446b(11, i2, i, null, bundleM36606f);
        bsv0Var.f30408h.put(i2, dsv0Var);
        this.f62505l = i;
        if (this.f62501h) {
            bsv0Var.m30445a(i);
            int i3 = this.f62502i;
            if (i3 >= 0) {
                bsv0Var.m30447c(this.f62505l, i3);
                this.f62502i = -1;
            }
            int i4 = this.f62503j;
            if (i4 != 0) {
                bsv0Var.m30448d(this.f62505l, i4);
                this.f62503j = 0;
            }
        }
    }

    @Override // p204p.amd0
    /* JADX INFO: renamed from: d */
    public final boolean mo26391d(Intent intent, smd0 smd0Var) {
        bsv0 bsv0Var = this.f62504k;
        if (bsv0Var != null) {
            int i = this.f62505l;
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
        gsv0 gsv0Var = this.f62506m;
        gsv0Var.f84025X.remove(this);
        mo33782b();
        gsv0Var.m45667m();
    }

    @Override // p204p.amd0
    /* JADX INFO: renamed from: f */
    public final void mo26393f() {
        this.f62501h = true;
        bsv0 bsv0Var = this.f62504k;
        if (bsv0Var != null) {
            bsv0Var.m30445a(this.f62505l);
        }
    }

    @Override // p204p.amd0
    /* JADX INFO: renamed from: g */
    public final void mo26394g(int i) {
        bsv0 bsv0Var = this.f62504k;
        if (bsv0Var != null) {
            bsv0Var.m30447c(this.f62505l, i);
        } else {
            this.f62502i = i;
            this.f62503j = 0;
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
        this.f62501h = false;
        bsv0 bsv0Var = this.f62504k;
        if (bsv0Var != null) {
            int i2 = this.f62505l;
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
        bsv0 bsv0Var = this.f62504k;
        if (bsv0Var != null) {
            bsv0Var.m30448d(this.f62505l, i);
        } else {
            this.f62503j += i;
        }
    }

    @Override // p204p.zld0
    /* JADX INFO: renamed from: l */
    public final void mo39918l(String str) {
        bsv0 bsv0Var = this.f62504k;
        if (bsv0Var != null) {
            int i = this.f62505l;
            bsv0Var.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = bsv0Var.f30404d;
            bsv0Var.f30404d = i2 + 1;
            bsv0Var.m30446b(12, i2, i, null, bundle);
        }
    }

    @Override // p204p.zld0
    /* JADX INFO: renamed from: m */
    public final void mo39919m(String str) {
        bsv0 bsv0Var = this.f62504k;
        if (bsv0Var != null) {
            int i = this.f62505l;
            bsv0Var.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i2 = bsv0Var.f30404d;
            bsv0Var.f30404d = i2 + 1;
            bsv0Var.m30446b(13, i2, i, null, bundle);
        }
    }

    @Override // p204p.zld0
    /* JADX INFO: renamed from: n */
    public final void mo39920n(List list) {
        bsv0 bsv0Var = this.f62504k;
        if (bsv0Var != null) {
            int i = this.f62505l;
            bsv0Var.getClass();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i2 = bsv0Var.f30404d;
            bsv0Var.f30404d = i2 + 1;
            bsv0Var.m30446b(14, i2, i, null, bundle);
        }
    }
}
