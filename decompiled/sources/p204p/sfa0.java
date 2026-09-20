package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class sfa0 extends c7a1 implements b7a1, vv91 {
    /* JADX INFO: renamed from: H */
    public final void m78000H(zam0 zam0Var) {
        if (wj50.m88271j(zam0Var.path(), this.f287909X.f277727a.path())) {
            return;
        }
        int iM38547C = edb.m38547C(this.f287920i);
        if (iM38547C == 0 || iM38547C == 1) {
            m97276C(zam0Var, this.f287909X.f277728b);
        } else {
            if (iM38547C != 2) {
                return;
            }
            m97276C(zam0Var, this.f287909X.f277728b);
            m97282w();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m78001I(zam0 zam0Var, fnm0 fnm0Var) {
        if (wj50.m88271j(zam0Var.path(), this.f287909X.f277727a.path()) && fnm0Var.equals(this.f287909X.f277728b)) {
            return;
        }
        int iM38547C = edb.m38547C(this.f287920i);
        if (iM38547C == 0 || iM38547C == 1) {
            m97276C(zam0Var, fnm0Var);
        } else {
            if (iM38547C != 2) {
                return;
            }
            m97276C(zam0Var, fnm0Var);
            m97282w();
        }
    }

    @Override // p204p.c7a1, p204p.b7a1
    /* JADX INFO: renamed from: b */
    public final void mo28370b(Bundle bundle) {
        super.mo28370b(bundle);
        String string = bundle.getString("PBL:PageId");
        if (string == null || string.equals(this.f287909X.f277727a.path())) {
            return;
        }
        this.f287909X = yz8.m94971a(this.f287909X, new gbu0(string), null, 6);
    }

    @Override // p204p.c7a1, p204p.b7a1
    /* JADX INFO: renamed from: f */
    public final Bundle mo28371f() {
        Bundle bundleMo28371f = super.mo28371f();
        if (bundleMo28371f == null) {
            return null;
        }
        bundleMo28371f.putString("PBL:PageId", this.f287909X.f277727a.path());
        return bundleMo28371f;
    }
}
