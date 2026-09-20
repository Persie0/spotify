package p204p;

import com.google.android.gms.cast.CastDevice;
import com.spotify.base.java.logging.Logger;
import com.spotify.connect.castbasic.CastBasicException;

/* JADX INFO: loaded from: classes6.dex */
public final class vbc {

    /* JADX INFO: renamed from: c */
    public static final vbc f239469c = new vbc(null, null);

    /* JADX INFO: renamed from: a */
    public final String f239470a;

    /* JADX INFO: renamed from: b */
    public final obc f239471b;

    public vbc(String str, obc obcVar) {
        this.f239470a = str;
        this.f239471b = obcVar;
    }

    /* JADX INFO: renamed from: a */
    public final obc m85127a() {
        obc obcVar = this.f239471b;
        if (obcVar == null || !obcVar.m27441a()) {
            throw new CastBasicException(1, null, "Session not found or not connected");
        }
        return obcVar;
    }

    /* JADX INFO: renamed from: b */
    public final CastDevice m85128b() {
        obc obcVar = this.f239471b;
        if (obcVar == null) {
            return null;
        }
        ig31.m50501s("Must be called from the main thread.");
        return obcVar.f163608k;
    }

    /* JADX INFO: renamed from: c */
    public final String m85129c() {
        return this.f239470a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m85130d(vbc vbcVar) {
        obc obcVar = this.f239471b;
        return obcVar != null && obcVar == vbcVar.f239471b;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m85131e() {
        obc obcVar = this.f239471b;
        if (obcVar != null) {
            return obcVar.m27441a();
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbc)) {
            return false;
        }
        vbc vbcVar = (vbc) obj;
        return wj50.m88271j(this.f239470a, vbcVar.f239470a) && wj50.m88271j(this.f239471b, vbcVar.f239471b);
    }

    /* JADX INFO: renamed from: f */
    public final void m85132f() {
        try {
            obc obcVarM85127a = m85127a();
            String str = m5j.f140240a;
            ig31.m50501s("Must be called from the main thread.");
            lkf1 lkf1Var = obcVarM85127a.f163606i;
            if (lkf1Var != null) {
                lkf1Var.m59269t(str);
            }
        } catch (CastBasicException e) {
            Logger.m3966b("CastBasic->%s", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m85133g(h3n h3nVar) {
        obc obcVarM85127a = m85127a();
        String str = m5j.f140240a;
        aue0 aue0Var = new aue0(h3nVar);
        ig31.m50501s("Must be called from the main thread.");
        lkf1 lkf1Var = obcVarM85127a.f163606i;
        if (lkf1Var == null || !lkf1Var.m59260k()) {
            return;
        }
        lkf1Var.m59268s(str, aue0Var);
    }

    public final int hashCode() {
        String str = this.f239470a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        obc obcVar = this.f239471b;
        return iHashCode + (obcVar != null ? obcVar.hashCode() : 0);
    }
}
