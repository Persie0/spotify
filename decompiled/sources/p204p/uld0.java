package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class uld0 {

    /* JADX INFO: renamed from: a */
    public final Bundle f231530a;

    /* JADX INFO: renamed from: b */
    public omd0 f231531b;

    public uld0(omd0 omd0Var, boolean z) {
        if (omd0Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.f231530a = bundle;
        this.f231531b = omd0Var;
        bundle.putBundle("selector", omd0Var.f167018a);
        bundle.putBoolean("activeScan", z);
    }

    /* JADX INFO: renamed from: a */
    public final void m83361a() {
        if (this.f231531b == null) {
            Bundle bundle = this.f231530a.getBundle("selector");
            omd0 omd0Var = null;
            if (bundle != null) {
                omd0Var = new omd0(bundle, null);
            } else {
                omd0 omd0Var2 = omd0.f167017c;
            }
            this.f231531b = omd0Var;
            if (omd0Var == null) {
                this.f231531b = omd0.f167017c;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m83362b() {
        return this.f231530a.getBoolean("activeScan");
    }

    /* JADX INFO: renamed from: c */
    public final boolean m83363c() {
        m83361a();
        omd0 omd0Var = this.f231531b;
        omd0Var.m67344a();
        return !omd0Var.f167019b.contains(null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uld0) {
            uld0 uld0Var = (uld0) obj;
            m83361a();
            omd0 omd0Var = this.f231531b;
            uld0Var.m83361a();
            if (omd0Var.equals(uld0Var.f231531b) && m83362b() == uld0Var.m83362b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        m83361a();
        return (this.f231531b.hashCode() ^ (m83362b() ? 1 : 0)) == true ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        m83361a();
        sb.append(this.f231531b);
        sb.append(", activeScan=");
        sb.append(m83362b());
        sb.append(", isValid=");
        sb.append(m83363c());
        sb.append(" }");
        return sb.toString();
    }

    public uld0(Bundle bundle) {
        this.f231530a = bundle;
    }
}
