package p204p;

import android.os.Bundle;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class vln0 implements obm0, y6m0 {

    /* JADX INFO: renamed from: a */
    public final String f242572a;

    /* JADX INFO: renamed from: b */
    public hk4 f242573b;

    /* JADX INFO: renamed from: c */
    public boolean f242574c;

    /* JADX INFO: renamed from: d */
    public boolean f242575d;

    /* JADX INFO: renamed from: e */
    public boolean f242576e;

    /* JADX INFO: renamed from: f */
    public boolean f242577f;

    /* JADX INFO: renamed from: g */
    public gcm0 f242578g;

    /* JADX INFO: renamed from: h */
    public a5a0 f242579h;

    public vln0(String str, hk4 hk4Var) {
        this.f242572a = str;
        this.f242573b = hk4Var;
    }

    @Override // p204p.obm0
    /* JADX INFO: renamed from: a */
    public final void mo46731a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.f242574c = bundle.getBoolean("waitingForFirstFrame");
        this.f242575d = bundle.getBoolean("started");
        this.f242576e = bundle.getBoolean("finished");
        this.f242577f = bundle.getBoolean("dataLoadEventsAllowed");
    }

    @Override // p204p.obm0
    /* JADX INFO: renamed from: b */
    public final void mo46732b(ehg1 ehg1Var) {
        if (this.f242576e) {
            return;
        }
        if (!this.f242575d) {
            this.f242575d = true;
            hk4 hk4Var = this.f242573b;
            if (hk4Var != null) {
                String str = this.f242572a;
                UUID uuidFromString = str != null ? UUID.fromString(str) : null;
                pgm0 pgm0Var = new pgm0(this, 10);
                hk4Var.f92341f = uuidFromString;
                hk4Var.f92340e = pgm0Var;
                hk4Var.m47737e(1, true);
            }
        }
        if (ehg1Var instanceof ybm0) {
            hk4 hk4Var2 = this.f242573b;
            if (hk4Var2 != null) {
                hk4Var2.m47737e(2, false);
                return;
            }
            return;
        }
        if (ehg1Var instanceof xbm0) {
            hk4 hk4Var3 = this.f242573b;
            if (hk4Var3 != null) {
                hk4Var3.m47734a(2);
                return;
            }
            return;
        }
        if (ehg1Var instanceof sbm0) {
            hk4 hk4Var4 = this.f242573b;
            if (hk4Var4 != null) {
                hk4Var4.m47737e(3, false);
                return;
            }
            return;
        }
        if (ehg1Var instanceof rbm0) {
            hk4 hk4Var5 = this.f242573b;
            if (hk4Var5 != null) {
                hk4Var5.m47734a(3);
                return;
            }
            return;
        }
        if (ehg1Var instanceof ubm0) {
            this.f242577f = true;
            hk4 hk4Var6 = this.f242573b;
            if (hk4Var6 != null) {
                hk4Var6.m47737e(4, false);
                return;
            }
            return;
        }
        if (ehg1Var instanceof tbm0) {
            this.f242577f = false;
            boolean z = ((tbm0) ehg1Var).f218906e;
            hk4 hk4Var7 = this.f242573b;
            if (hk4Var7 != null) {
                hk4Var7.f92339d = z;
                hk4Var7.m47734a(4);
            }
            if (z) {
                this.f242574c = true;
                hk4 hk4Var8 = this.f242573b;
                if (hk4Var8 != null) {
                    hk4Var8.m47737e(5, false);
                    return;
                }
                return;
            }
            hk4 hk4Var9 = this.f242573b;
            if (hk4Var9 != null) {
                hk4Var9.m47736c();
            }
            this.f242573b = null;
            this.f242576e = true;
            return;
        }
        if (!(ehg1Var instanceof vbm0)) {
            if (!(ehg1Var instanceof zbm0)) {
                if (!(ehg1Var instanceof wbm0)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            m85975f();
            hk4 hk4Var10 = this.f242573b;
            if (hk4Var10 != null) {
                hk4Var10.m47735b(3);
            }
            this.f242573b = null;
            this.f242576e = true;
            return;
        }
        if (this.f242574c) {
            m85975f();
            hk4 hk4Var11 = this.f242573b;
            if (hk4Var11 != null) {
                hk4Var11.m47734a(5);
            }
            hk4 hk4Var12 = this.f242573b;
            if (hk4Var12 != null) {
                hk4Var12.m47736c();
            }
            this.f242573b = null;
            this.f242576e = true;
        }
    }

    @Override // p204p.y6m0
    /* JADX INFO: renamed from: c */
    public final void mo32278c(z6m0 z6m0Var) {
        hk4 hk4Var;
        if (!this.f242577f || (hk4Var = this.f242573b) == null) {
            return;
        }
        String strM95512a = z6m0Var.m95512a();
        String strM95513b = z6m0Var.m95513b();
        sr4 sr4Var = hk4Var.f92338c;
        if (sr4Var != null) {
            sr4Var.m79014b(strM95512a, strM95513b);
        }
    }

    @Override // p204p.obm0
    /* JADX INFO: renamed from: d */
    public final Bundle mo46733d() {
        Bundle bundle = new Bundle();
        if (this.f242575d && !this.f242576e) {
            hk4 hk4Var = this.f242573b;
            if (hk4Var != null) {
                hk4Var.m47735b(3);
            }
            this.f242576e = true;
        }
        bundle.putBoolean("waitingForFirstFrame", this.f242574c);
        bundle.putBoolean("started", this.f242575d);
        bundle.putBoolean("finished", this.f242576e);
        bundle.putBoolean("dataLoadEventsAllowed", this.f242577f);
        return bundle;
    }

    /* JADX INFO: renamed from: f */
    public final void m85975f() {
        Map map;
        gcm0 gcm0Var = this.f242578g;
        if (gcm0Var == null || (map = gcm0Var.f78622a) == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            hk4 hk4Var = this.f242573b;
            if (hk4Var != null) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                sr4 sr4Var = hk4Var.f92338c;
                if (sr4Var != null) {
                    sr4Var.m79014b(str, str2);
                }
            }
        }
    }

    @Override // p204p.obm0
    /* JADX INFO: renamed from: g */
    public final void mo60823g(ofm0 ofm0Var) {
        this.f242578g = (gcm0) ofm0Var.mo15684j0(gcm0.class).mo31538a();
        this.f242579h = lig1.m59065p(ofm0Var);
    }

    @Override // p204p.m040
    /* JADX INFO: renamed from: h */
    public final String mo32279h() {
        sr4 sr4Var;
        UUID uuid;
        hk4 hk4Var = this.f242573b;
        if (hk4Var == null || (sr4Var = hk4Var.f92338c) == null || (uuid = sr4Var.f213228c) == null) {
            return null;
        }
        return uuid.toString();
    }
}
