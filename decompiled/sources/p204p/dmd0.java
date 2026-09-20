package p204p;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class dmd0 extends emd0 {

    /* JADX INFO: renamed from: L0 */
    public final uaq f50490L0;

    /* JADX INFO: renamed from: M0 */
    public final x3p f50491M0;

    /* JADX INFO: renamed from: N0 */
    public final LinkedHashSet f50492N0;

    /* JADX INFO: renamed from: X */
    public final gfz f50493X;

    /* JADX INFO: renamed from: Y */
    public final xpp f50494Y;

    /* JADX INFO: renamed from: Z */
    public final wsi f50495Z;

    /* JADX INFO: renamed from: i */
    public final li80 f50496i;

    /* JADX INFO: renamed from: t */
    public final he90 f50497t;

    public dmd0(Context context, li80 li80Var, he90 he90Var, gfz gfzVar, xpp xppVar, wsi wsiVar, uaq uaqVar, x3p x3pVar) {
        super(context, null);
        this.f50496i = li80Var;
        this.f50497t = he90Var;
        this.f50493X = gfzVar;
        this.f50494Y = xppVar;
        this.f50495Z = wsiVar;
        this.f50490L0 = uaqVar;
        this.f50491M0 = x3pVar;
        this.f50492N0 = new LinkedHashSet();
        xppVar.f264700a = this;
        zv41 zv41Var = xppVar.f264701b;
        Boolean bool = Boolean.TRUE;
        zv41Var.getClass();
        zv41Var.m97091m(null, bool);
    }

    /* JADX INFO: renamed from: i */
    public static tld0 m36409i(fmd0 fmd0Var, String str) {
        Object next;
        Iterator it = ((List) fmd0Var.f71031d).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (wj50.m88271j(((tld0) next).m81050g(), str)) {
                return (tld0) next;
            }
        }
        next = null;
        return (tld0) next;
    }

    @Override // p204p.emd0
    /* JADX INFO: renamed from: a */
    public final zld0 mo36410a(String str) {
        List list;
        Object next;
        Object gi51Var;
        Object di51Var;
        Bundle bundleM81047d;
        ybc ybcVar;
        int i = Build.VERSION.SDK_INT;
        uaq uaqVar = this.f50490L0;
        if (i < 36) {
            uaqVar.getClass();
            di51Var = new fi51(str, 1, ei51.OS_VERSION);
        } else if (((kzl0) uaqVar.f228528a).m57762c()) {
            fmd0 fmd0VarM91718a = uaqVar.f228530c.m91718a();
            if (fmd0VarM91718a == null || (list = (List) fmd0VarM91718a.f71031d) == null) {
                list = lau.f131415a;
            }
            if (list.isEmpty()) {
                di51Var = new fi51(str, 3, null);
            } else {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!wj50.m88271j(((tld0) next).m81050g(), str));
                tld0 tld0Var = (tld0) next;
                if (tld0Var == null) {
                    di51Var = new fi51(str, 4, null);
                } else if (uaqVar.f228529b.isEnabled()) {
                    di51Var = (bm51.m29803n0(tld0Var.m81050g(), "social-connect-", false) || uaqVar.m82699b(uaq.m82698a(tld0Var)) || (bundleM81047d = tld0Var.m81047d()) == null || !bundleM81047d.getBoolean("com.spotify.connect.EXTRA_IS_CAST")) ? new di51(str, uaq.m82698a(tld0Var)) : new bi51(str, edb.m38564m("spotify_artisanal_group-", tld0Var.m81050g()));
                } else {
                    rac racVarM55355r = k47.m55355r(tld0Var.m81047d());
                    if (racVarM55355r == null) {
                        gi51Var = new gi51(ei51.CONNECT_NOT_ENABLED);
                    } else if (bm51.m29803n0(tld0Var.m81050g(), "social-connect-", false)) {
                        gi51Var = new gi51(ei51.SOCIAL_SESSION_ROUTE);
                    } else {
                        gi51Var = uaqVar.m82699b(uaq.m82698a(tld0Var)) ? new gi51(ei51.IS_A_JAM) : hi51.f91720a;
                    }
                    if (gi51Var instanceof hi51) {
                        if (racVarM55355r == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        di51Var = new ci51(str, racVarM55355r.f197252a, uaq.m82698a(tld0Var));
                    } else {
                        if (!(gi51Var instanceof gi51)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        di51Var = new di51(str, uaq.m82698a(tld0Var));
                    }
                }
            }
        } else {
            di51Var = new fi51(str, 2, null);
        }
        boolean z = di51Var instanceof fi51;
        x3p x3pVar = this.f50491M0;
        if (z) {
            Logger.m3966b("GOS->Dynamic group controller creation refused: " + di51Var, new Object[0]);
            int iM38547C = edb.m38547C(((fi51) di51Var).f69796b);
            if (iM38547C == 0) {
                ybcVar = ybc.CAST_DYNAMIC_GROUP_CONTROLLER_REFUSED_UNSUPPORTED_OS;
            } else if (iM38547C == 1) {
                ybcVar = ybc.CAST_DYNAMIC_GROUP_CONTROLLER_REFUSED_NOT_ENABLED;
            } else if (iM38547C == 2) {
                ybcVar = ybc.CAST_DYNAMIC_GROUP_CONTROLLER_REFUSED_NO_ROUTES;
            } else {
                if (iM38547C != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ybcVar = ybc.CAST_DYNAMIC_GROUP_CONTROLLER_REFUSED_ROUTE_NOT_FOUND;
            }
            x3pVar.m89810b(ybcVar);
            return null;
        }
        boolean z2 = di51Var instanceof ci51;
        he90 he90Var = this.f50497t;
        if (z2) {
            ci51 ci51Var = (ci51) di51Var;
            this.f50492N0.add(ci51Var.f38231c);
            x3pVar.m89810b(ybc.CAST_DYNAMIC_GROUP_CONTROLLER_CREATED);
            frm frmVar = (frm) ((drm) he90Var.f90379c).f52357a.f102320c;
            aqp aqpVar = (aqp) frmVar.f72568b0.get();
            h4t0 h4t0Var = frmVar.f72602m1;
            csi csiVar = frmVar.f72564a;
            return new sac(new x28(ci51Var, aqpVar, (xwi) h4t0Var.get(), (c8p) frmVar.f72614q1.get(), new fin((aqp) frmVar.f72568b0.get(), new k47(false), (String) csiVar.f41615v.get(), (x3p) frmVar.f72541O0.get(), (voi) frmVar.f72618s.get()), (mep) frmVar.f72617r1.get(), (cui) frmVar.f72620s1.get(), (xip) frmVar.f72595k0.get(), (x3p) frmVar.f72541O0.get(), new gfz(frmVar.f72526H, 4), csiVar.m33773d()));
        }
        if (di51Var instanceof bi51) {
            bi51 bi51Var = (bi51) di51Var;
            erm ermVar = (erm) he90Var.f90380d;
            ermVar.getClass();
            rg41 rg41Var = new rg41();
            frm frmVar2 = (frm) ermVar.f62147a.f102320c;
            return new sac(new rk0(bi51Var, rg41Var, (cui) frmVar2.f72620s1.get(), (xpp) frmVar2.f72589i0.get(), (xwi) frmVar2.f72602m1.get(), frmVar2.f72564a.m33773d()));
        }
        if (!(di51Var instanceof di51)) {
            throw new NoWhenBranchMatchedException();
        }
        x3pVar.m89810b(ybc.CAST_DYNAMIC_INDIVIDUAL_CONTROLLER_CREATED);
        di51 di51Var2 = (di51) di51Var;
        he90Var.getClass();
        return new nms(di51Var2, new zo40(di51Var2.f49258a, (yo40) ((er70) he90Var.f90378b).get()), (voi) he90Var.f90381e, (xpp) he90Var.f90382f, (xwi) he90Var.f90384h, (x3p) he90Var.f90385i, (luk) he90Var.f90383g);
    }

    @Override // p204p.emd0
    /* JADX INFO: renamed from: c */
    public final amd0 mo36411c(String str) {
        fmd0 fmd0Var = this.f60893g;
        tld0 tld0VarM36409i = fmd0Var != null ? m36409i(fmd0Var, str) : null;
        if (tld0VarM36409i != null && tld0VarM36409i.m81055l()) {
            return new zo40(str, (yo40) ((er70) this.f50496i.f133740b).get());
        }
        Objects.toString(tld0VarM36409i);
        return null;
    }

    @Override // p204p.emd0
    /* JADX INFO: renamed from: d */
    public final amd0 mo36412d(String str, String str2) {
        fmd0 fmd0Var;
        tld0 tld0VarM36409i;
        Bundle bundleM81047d;
        boolean zIsEnabled = this.f50493X.isEnabled();
        li80 li80Var = this.f50496i;
        if (!zIsEnabled) {
            return (bm51.m29803n0(str, "social-connect-", false) || (!this.f50492N0.contains(str2) && ((fmd0Var = this.f60893g) == null || (tld0VarM36409i = m36409i(fmd0Var, str)) == null || (bundleM81047d = tld0VarM36409i.m81047d()) == null || !bundleM81047d.getBoolean("com.spotify.connect.EXTRA_IS_CAST")))) ? new zo40(str, (yo40) ((er70) li80Var.f133740b).get()) : new yac(str, (xac) ((er70) li80Var.f133741c).get());
        }
        if (bm51.m29803n0(str, "social-connect-", false)) {
            return new zo40(str, (yo40) ((er70) li80Var.f133740b).get());
        }
        if (!bm51.m29803n0(str2, "spotify_artisanal_group-", false)) {
            return new zo40(str, (yo40) ((er70) li80Var.f133740b).get());
        }
        if (str.equals(str2)) {
            return null;
        }
        return new rp5(str, (qp5) ((er70) li80Var.f133742d).get());
    }

    @Override // p204p.emd0
    /* JADX INFO: renamed from: f */
    public final void mo36413f(uld0 uld0Var) {
        wsi wsiVar = this.f50495Z;
        v5p v5pVar = wsiVar.f254637b;
        Objects.toString(uld0Var);
        if (uld0Var != null) {
            uld0Var.m83361a();
            if (!uld0Var.f231531b.m67345b().contains(((edi0) wsiVar.f254636a).f58523a + ".SPOTIFY_CONNECT") || !uld0Var.m83363c()) {
                uld0Var.toString();
            } else if (uld0Var.m83362b()) {
                v5pVar.m84739g("GoogleOutputSwitcher");
            } else {
                if (((Boolean) wsiVar.f254638c.f281556b.getValue()).booleanValue()) {
                    return;
                }
                v5pVar.m84740i();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m36414j() {
        xpp xppVar = this.f50494Y;
        Objects.toString(xppVar.f264700a);
        xppVar.f264700a = null;
        zv41 zv41Var = xppVar.f264701b;
        Boolean bool = Boolean.FALSE;
        zv41Var.getClass();
        zv41Var.m97091m(null, bool);
        this.f50492N0.clear();
    }
}
