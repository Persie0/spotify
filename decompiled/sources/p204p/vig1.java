package p204p;

import android.content.Context;
import android.os.Build;
import com.comscore.streaming.ContentType;
import com.spotify.highlightsstats.data.proto.timeline.view.p075v1.StatsDetailsResponse;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vig1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f241710a;

    /* JADX INFO: renamed from: b */
    public static sd40 f241711b;

    /* JADX INFO: renamed from: a */
    public static final void m85646a(int i, String str, String str2, xq00 xq00Var, fxh0 fxh0Var) {
        xq00Var.m91775k0(1634229871);
        int i2 = (xq00Var.m91766g(str) ? 4 : 2) | i | (xq00Var.m91766g(str2) ? 32 : 16) | 384;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            y0v.m92603a(2, rkk.m75772x(-292463365, new C1884g4(str2, str), xq00Var), xq00Var, 390, 2);
            fxh0Var = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
        }
        fxh0 fxh0Var2 = fxh0Var;
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1921h4(str, str2, fxh0Var2, i, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m85647b(fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1543391073);
        int i2 = i | 6;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            fxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM61820d = mi21.m61820d(1.0f, fxh0Var2);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM61820d);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            mrg1.m62627b(null, 0L, xq00Var, 0, 3);
            p271.m68899b(pha.f177517a.mo66945a(fxh0Var2, d7f0.f46174i), 5, 0L, 0L, xq00Var, 48, 12);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new i6q(fxh0Var2, i, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m85648c(fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(39930214);
        int i2 = i | 6;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            fxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM61820d = mi21.m61820d(1.0f, fxh0Var2);
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = i4y.f98646Z0;
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM39673I = epv0.m39673I("add-account-progress-indicator", nec.m64246i(hdi.m47247x(fxh0VarM61820d, false, null, null, null, (eh00) objM91750T, 15), n6f.m63765b(leu.m58815a(xq00Var).f112823a.f229876c, 0.5f, 0.0f, 0.0f, 0.0f, 14), kxf1.f127485a));
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM39673I);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            p271.m68899b(null, 5, 0L, 0L, xq00Var, 48, 13);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new i6q(fxh0Var2, i, 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:87:0x0132  */
    /* JADX WARN: Code duplicated, block: B:90:0x013e  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m85649d(fxh0 fxh0Var, th00 th00Var, th00 th00Var2, tvd1 tvd1Var, fyf fyfVar, xq00 xq00Var, int i, int i2) {
        fxh0 fxh0Var2;
        int i3;
        th00 th00Var3;
        int i4;
        th00 th00Var4;
        int i5;
        tvd1 tvd1Var2;
        boolean z;
        fxh0 fxh0Var3;
        th00 th00Var5;
        tvd1 tvd1Var3;
        pgv0 pgv0VarM91796v;
        th00 th00Var6;
        tvd1 tvd1Var4;
        tvd1 tvd1Var5;
        th00 th00Var7;
        int i6;
        xq00Var.m91775k0(187630438);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            fxh0Var2 = fxh0Var;
        } else if ((i & 6) == 0) {
            fxh0Var2 = fxh0Var;
            i3 = (xq00Var.m91770i(fxh0Var2) ? 4 : 2) | i;
        } else {
            fxh0Var2 = fxh0Var;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                th00Var3 = th00Var;
                i3 |= xq00Var.m91770i(th00Var3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    th00Var4 = th00Var2;
                    if (xq00Var.m91770i(th00Var4)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        tvd1Var2 = tvd1Var;
                        int i9 = xq00Var.m91770i(tvd1Var2) ? 2048 : 1024;
                        i3 |= i9;
                    } else {
                        tvd1Var2 = tvd1Var;
                    }
                    i3 |= i9;
                } else {
                    tvd1Var2 = tvd1Var;
                }
                if ((i & 24576) == 0) {
                    if (xq00Var.m91770i(fyfVar)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq00Var.m91752Y(i3 & 1, z)) {
                    xq00Var.m91761d0();
                    if ((i & 1) != 0 || xq00Var.m91735E()) {
                        if (i7 != 0) {
                            fxh0Var3 = cxh0.f43038a;
                        } else {
                            fxh0Var3 = fxh0Var2;
                        }
                        if (i8 != 0) {
                            th00Var6 = vxg.f245737a;
                        } else {
                            th00Var6 = th00Var3;
                        }
                        if (i4 != 0) {
                            th00Var4 = vxg.f245738b;
                        }
                        if ((i2 & 8) != 0) {
                            tvd1Var4 = (tvd1) xq00Var.m91774k(rwb0.f203317b);
                            if (tvd1Var4 == null) {
                                xq00Var.m91771i0(-241884180);
                                WeakHashMap weakHashMap = cxd1.f42984x;
                                tvd1Var4 = bxd1.m30815d(xq00Var).f42991g;
                            } else {
                                xq00Var.m91771i0(-241885792);
                            }
                            xq00Var.m91788r(false);
                            i3 &= -7169;
                            th00Var3 = th00Var6;
                            tvd1Var5 = tvd1Var4;
                            th00Var7 = th00Var4;
                        } else {
                            th00Var3 = th00Var6;
                        }
                        xq00Var.m91790s();
                        lay0.m58586a(mi21.m61820d(1.0f, fxh0Var3), th00Var3, th00Var7, null, null, 0, 0L, 0L, tvd1Var5, rkk.m75772x(-1553544073, new jd11(fyfVar, 17), xq00Var), xq00Var, (i3 & ContentType.LONG_FORM_ON_DEMAND) | 805306368 | (i3 & 896) | ((i3 << 15) & 234881024), 248);
                        th00Var5 = th00Var7;
                        tvd1Var3 = tvd1Var5;
                    } else {
                        xq00Var.m91757b0();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        fxh0Var3 = fxh0Var2;
                    }
                    th00Var7 = th00Var4;
                    tvd1Var5 = tvd1Var2;
                    xq00Var.m91790s();
                    lay0.m58586a(mi21.m61820d(1.0f, fxh0Var3), th00Var3, th00Var7, null, null, 0, 0L, 0L, tvd1Var5, rkk.m75772x(-1553544073, new jd11(fyfVar, 17), xq00Var), xq00Var, (i3 & ContentType.LONG_FORM_ON_DEMAND) | 805306368 | (i3 & 896) | ((i3 << 15) & 234881024), 248);
                    th00Var5 = th00Var7;
                    tvd1Var3 = tvd1Var5;
                } else {
                    xq00Var.m91757b0();
                    fxh0Var3 = fxh0Var2;
                    th00Var5 = th00Var4;
                    tvd1Var3 = tvd1Var2;
                }
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new ni1(fxh0Var3, th00Var3, th00Var5, tvd1Var3, fyfVar, i, i2);
                }
            }
            i3 |= 384;
            th00Var4 = th00Var2;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    tvd1Var2 = tvd1Var;
                    if (xq00Var.m91770i(tvd1Var2)) {
                    }
                    i3 |= i9;
                } else {
                    tvd1Var2 = tvd1Var;
                }
                i3 |= i9;
            } else {
                tvd1Var2 = tvd1Var;
            }
            if ((i & 24576) == 0) {
                if (xq00Var.m91770i(fyfVar)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i3 & 1, z)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var2;
                    }
                    if (i8 != 0) {
                        th00Var6 = vxg.f245737a;
                    } else {
                        th00Var6 = th00Var3;
                    }
                    if (i4 != 0) {
                        th00Var4 = vxg.f245738b;
                    }
                    if ((i2 & 8) != 0) {
                        tvd1Var4 = (tvd1) xq00Var.m91774k(rwb0.f203317b);
                        if (tvd1Var4 == null) {
                            xq00Var.m91771i0(-241884180);
                            WeakHashMap weakHashMap2 = cxd1.f42984x;
                            tvd1Var4 = bxd1.m30815d(xq00Var).f42991g;
                        } else {
                            xq00Var.m91771i0(-241885792);
                        }
                        xq00Var.m91788r(false);
                        i3 &= -7169;
                        th00Var3 = th00Var6;
                        tvd1Var5 = tvd1Var4;
                        th00Var7 = th00Var4;
                    } else {
                        th00Var3 = th00Var6;
                        th00Var7 = th00Var4;
                        tvd1Var5 = tvd1Var2;
                    }
                } else {
                    if (i7 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var2;
                    }
                    if (i8 != 0) {
                        th00Var6 = vxg.f245737a;
                    } else {
                        th00Var6 = th00Var3;
                    }
                    if (i4 != 0) {
                        th00Var4 = vxg.f245738b;
                    }
                    if ((i2 & 8) != 0) {
                        tvd1Var4 = (tvd1) xq00Var.m91774k(rwb0.f203317b);
                        if (tvd1Var4 == null) {
                            xq00Var.m91771i0(-241884180);
                            WeakHashMap weakHashMap3 = cxd1.f42984x;
                            tvd1Var4 = bxd1.m30815d(xq00Var).f42991g;
                        } else {
                            xq00Var.m91771i0(-241885792);
                        }
                        xq00Var.m91788r(false);
                        i3 &= -7169;
                        th00Var3 = th00Var6;
                        tvd1Var5 = tvd1Var4;
                        th00Var7 = th00Var4;
                    } else {
                        th00Var3 = th00Var6;
                        th00Var7 = th00Var4;
                        tvd1Var5 = tvd1Var2;
                    }
                }
                xq00Var.m91790s();
                lay0.m58586a(mi21.m61820d(1.0f, fxh0Var3), th00Var3, th00Var7, null, null, 0, 0L, 0L, tvd1Var5, rkk.m75772x(-1553544073, new jd11(fyfVar, 17), xq00Var), xq00Var, (i3 & ContentType.LONG_FORM_ON_DEMAND) | 805306368 | (i3 & 896) | ((i3 << 15) & 234881024), 248);
                th00Var5 = th00Var7;
                tvd1Var3 = tvd1Var5;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var2;
                th00Var5 = th00Var4;
                tvd1Var3 = tvd1Var2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new ni1(fxh0Var3, th00Var3, th00Var5, tvd1Var3, fyfVar, i, i2);
            }
        }
        i3 |= 48;
        th00Var3 = th00Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                th00Var4 = th00Var2;
                if (xq00Var.m91770i(th00Var4)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    tvd1Var2 = tvd1Var;
                    if (xq00Var.m91770i(tvd1Var2)) {
                    }
                    i3 |= i9;
                } else {
                    tvd1Var2 = tvd1Var;
                }
                i3 |= i9;
            } else {
                tvd1Var2 = tvd1Var;
            }
            if ((i & 24576) == 0) {
                if (xq00Var.m91770i(fyfVar)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i3 & 1, z)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var2;
                    }
                    if (i8 != 0) {
                        th00Var6 = vxg.f245737a;
                    } else {
                        th00Var6 = th00Var3;
                    }
                    if (i4 != 0) {
                        th00Var4 = vxg.f245738b;
                    }
                    if ((i2 & 8) != 0) {
                        tvd1Var4 = (tvd1) xq00Var.m91774k(rwb0.f203317b);
                        if (tvd1Var4 == null) {
                            xq00Var.m91771i0(-241884180);
                            WeakHashMap weakHashMap4 = cxd1.f42984x;
                            tvd1Var4 = bxd1.m30815d(xq00Var).f42991g;
                        } else {
                            xq00Var.m91771i0(-241885792);
                        }
                        xq00Var.m91788r(false);
                        i3 &= -7169;
                        th00Var3 = th00Var6;
                        tvd1Var5 = tvd1Var4;
                        th00Var7 = th00Var4;
                    } else {
                        th00Var3 = th00Var6;
                        th00Var7 = th00Var4;
                        tvd1Var5 = tvd1Var2;
                    }
                } else {
                    if (i7 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var2;
                    }
                    if (i8 != 0) {
                        th00Var6 = vxg.f245737a;
                    } else {
                        th00Var6 = th00Var3;
                    }
                    if (i4 != 0) {
                        th00Var4 = vxg.f245738b;
                    }
                    if ((i2 & 8) != 0) {
                        tvd1Var4 = (tvd1) xq00Var.m91774k(rwb0.f203317b);
                        if (tvd1Var4 == null) {
                            xq00Var.m91771i0(-241884180);
                            WeakHashMap weakHashMap5 = cxd1.f42984x;
                            tvd1Var4 = bxd1.m30815d(xq00Var).f42991g;
                        } else {
                            xq00Var.m91771i0(-241885792);
                        }
                        xq00Var.m91788r(false);
                        i3 &= -7169;
                        th00Var3 = th00Var6;
                        tvd1Var5 = tvd1Var4;
                        th00Var7 = th00Var4;
                    } else {
                        th00Var3 = th00Var6;
                        th00Var7 = th00Var4;
                        tvd1Var5 = tvd1Var2;
                    }
                }
                xq00Var.m91790s();
                lay0.m58586a(mi21.m61820d(1.0f, fxh0Var3), th00Var3, th00Var7, null, null, 0, 0L, 0L, tvd1Var5, rkk.m75772x(-1553544073, new jd11(fyfVar, 17), xq00Var), xq00Var, (i3 & ContentType.LONG_FORM_ON_DEMAND) | 805306368 | (i3 & 896) | ((i3 << 15) & 234881024), 248);
                th00Var5 = th00Var7;
                tvd1Var3 = tvd1Var5;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var2;
                th00Var5 = th00Var4;
                tvd1Var3 = tvd1Var2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new ni1(fxh0Var3, th00Var3, th00Var5, tvd1Var3, fyfVar, i, i2);
            }
        }
        i3 |= 384;
        th00Var4 = th00Var2;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                tvd1Var2 = tvd1Var;
                if (xq00Var.m91770i(tvd1Var2)) {
                }
                i3 |= i9;
            } else {
                tvd1Var2 = tvd1Var;
            }
            i3 |= i9;
        } else {
            tvd1Var2 = tvd1Var;
        }
        if ((i & 24576) == 0) {
            if (xq00Var.m91770i(fyfVar)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (xq00Var.m91752Y(i3 & 1, z)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    fxh0Var3 = cxh0.f43038a;
                } else {
                    fxh0Var3 = fxh0Var2;
                }
                if (i8 != 0) {
                    th00Var6 = vxg.f245737a;
                } else {
                    th00Var6 = th00Var3;
                }
                if (i4 != 0) {
                    th00Var4 = vxg.f245738b;
                }
                if ((i2 & 8) != 0) {
                    tvd1Var4 = (tvd1) xq00Var.m91774k(rwb0.f203317b);
                    if (tvd1Var4 == null) {
                        xq00Var.m91771i0(-241884180);
                        WeakHashMap weakHashMap6 = cxd1.f42984x;
                        tvd1Var4 = bxd1.m30815d(xq00Var).f42991g;
                    } else {
                        xq00Var.m91771i0(-241885792);
                    }
                    xq00Var.m91788r(false);
                    i3 &= -7169;
                    th00Var3 = th00Var6;
                    tvd1Var5 = tvd1Var4;
                    th00Var7 = th00Var4;
                } else {
                    th00Var3 = th00Var6;
                    th00Var7 = th00Var4;
                    tvd1Var5 = tvd1Var2;
                }
            } else {
                if (i7 != 0) {
                    fxh0Var3 = cxh0.f43038a;
                } else {
                    fxh0Var3 = fxh0Var2;
                }
                if (i8 != 0) {
                    th00Var6 = vxg.f245737a;
                } else {
                    th00Var6 = th00Var3;
                }
                if (i4 != 0) {
                    th00Var4 = vxg.f245738b;
                }
                if ((i2 & 8) != 0) {
                    tvd1Var4 = (tvd1) xq00Var.m91774k(rwb0.f203317b);
                    if (tvd1Var4 == null) {
                        xq00Var.m91771i0(-241884180);
                        WeakHashMap weakHashMap7 = cxd1.f42984x;
                        tvd1Var4 = bxd1.m30815d(xq00Var).f42991g;
                    } else {
                        xq00Var.m91771i0(-241885792);
                    }
                    xq00Var.m91788r(false);
                    i3 &= -7169;
                    th00Var3 = th00Var6;
                    tvd1Var5 = tvd1Var4;
                    th00Var7 = th00Var4;
                } else {
                    th00Var3 = th00Var6;
                    th00Var7 = th00Var4;
                    tvd1Var5 = tvd1Var2;
                }
            }
            xq00Var.m91790s();
            lay0.m58586a(mi21.m61820d(1.0f, fxh0Var3), th00Var3, th00Var7, null, null, 0, 0L, 0L, tvd1Var5, rkk.m75772x(-1553544073, new jd11(fyfVar, 17), xq00Var), xq00Var, (i3 & ContentType.LONG_FORM_ON_DEMAND) | 805306368 | (i3 & 896) | ((i3 << 15) & 234881024), 248);
            th00Var5 = th00Var7;
            tvd1Var3 = tvd1Var5;
        } else {
            xq00Var.m91757b0();
            fxh0Var3 = fxh0Var2;
            th00Var5 = th00Var4;
            tvd1Var3 = tvd1Var2;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ni1(fxh0Var3, th00Var3, th00Var5, tvd1Var3, fyfVar, i, i2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m85650e(int i, String str, xq00 xq00Var) {
        int i2;
        xq00Var.m91775k0(344977297);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            qiu.m72876b(6, rkk.m75772x(-2057242692, new yx9(str, 19), xq00Var), xq00Var, 54);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new hd0(str, i, 5);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final o3t0 m85651f(o3t0 o3t0Var, long j) {
        return new o3t0(j == 19500 ? o3t0Var.m66198f() : o3t0Var.m66197e());
    }

    /* JADX INFO: renamed from: g */
    public static final o3t0 m85652g(o3t0 o3t0Var, long j) {
        return new o3t0(j == 19500 ? o3t0Var.m66198f() : o3t0Var.m66197e());
    }

    /* JADX INFO: renamed from: i */
    public static final tx50 m85654i(by50 by50Var) {
        Object next;
        Iterator it = by50Var.f32077c.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (wj50.m88271j(((tx50) next).f224567c, by50Var.f32082h.f287209b.f224567c)) {
                return (tx50) next;
            }
        }
        next = null;
        return (tx50) next;
    }

    /* JADX INFO: renamed from: j */
    public static final zob0 m85655j(lob0 lob0Var, uob0 uob0Var, List list) {
        tob0 tob0Var;
        yob0 yob0Var;
        kob0 kob0Var = lob0Var.f135371a;
        boolean z = kob0Var instanceof gob0;
        uob0 pob0Var = oob0.f167525a;
        if (!z) {
            boolean z2 = kob0Var instanceof hob0;
            Map mapM42081x = nau.f152117a;
            if (z2) {
                gk80 gk80Var = ((hob0) kob0Var).f93492a;
                fk80 fk80Var = new fk80(gk80Var.f80750a);
                if (!gk80Var.isEmpty()) {
                    Iterator it = gk80Var.iterator();
                    while (it.hasNext()) {
                        int i = ((fk80) it.next()).f70497a;
                        int size = list.size();
                        if (i >= 0 && i < size && ((CharSequence) list.get(i)).length() > 0) {
                            mapM42081x = fm8.m42081x(mapM42081x, list, i);
                        }
                    }
                }
                pob0Var = new tob0(fk80Var, mapM42081x);
            } else if (kob0Var instanceof job0) {
                if (uob0Var == null || uob0Var.equals(pob0Var)) {
                    tob0Var = new tob0(((job0) kob0Var).f114383a, mapM42081x);
                } else if (uob0Var instanceof tob0) {
                    tob0 tob0Var2 = (tob0) uob0Var;
                    pob0Var = new tob0(tob0Var2.f222220a, tob0Var2.f222221b);
                } else {
                    if (!(uob0Var instanceof pob0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tob0Var = new tob0(((job0) kob0Var).f114383a, mapM42081x);
                }
                pob0Var = tob0Var;
            } else {
                if (!(kob0Var instanceof iob0)) {
                    throw new NoWhenBranchMatchedException();
                }
                pob0 pob0Var2 = uob0Var instanceof pob0 ? (pob0) uob0Var : null;
                Map map = pob0Var2 != null ? pob0Var2.f179668a : null;
                if (map != null) {
                    mapM42081x = map;
                }
                pob0Var = new pob0(mapM42081x);
            }
        }
        uob0 uob0Var2 = pob0Var;
        int iM38547C = edb.m38547C(lob0Var.f135372b);
        if (iM38547C == 0) {
            yob0Var = xob0.f263820a;
        } else if (iM38547C == 1) {
            yob0Var = wob0.f253428a;
        } else {
            if (iM38547C != 2) {
                throw new NoWhenBranchMatchedException();
            }
            yob0Var = vob0.f243447a;
        }
        return new zob0(uob0Var2, yob0Var, lob0Var.f135373c, lob0Var.f135374d, lob0Var.f135375e, lob0Var.f135376f, 16.0f);
    }

    /* JADX INFO: renamed from: k */
    public static final sd40 m85656k() {
        sd40 sd40Var = f241710a;
        if (sd40Var != null) {
            return sd40Var;
        }
        float f = 24;
        rd40 rd40Var = new rd40("Encore.Vector.Collection24", f, f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = c5b1.f34134a;
        pk31 pk31Var = new pk31(n6f.f150862b);
        sep sepVarM62656j = mrx0.m62656j(14.5f, 2.134f);
        sepVarM62656j.m77933g(1.0f, 1.0f, false, true, 1.0f, 0.0f);
        sepVarM62656j.m77944r(6.0f, 3.464f);
        sepVarM62656j.m77933g(1.0f, 1.0f, false, true, 0.5f, 0.866f);
        sepVarM62656j.m77926C(21.0f);
        sepVarM62656j.m77933g(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        sepVarM62656j.m77942p(-6.0f);
        sepVarM62656j.m77933g(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        sepVarM62656j.m77926C(3.0f);
        sepVarM62656j.m77933g(1.0f, 1.0f, false, true, 0.5f, -0.866f);
        sepVarM62656j.m77945s(16.0f, 4.732f);
        sepVarM62656j.m77926C(20.0f);
        sepVarM62656j.m77942p(4.0f);
        sepVarM62656j.m77926C(7.041f);
        sepVarM62656j.m77937k();
        sepVarM62656j.m77945s(3.0f, 22.0f);
        sepVarM62656j.m77933g(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        sepVarM62656j.m77926C(3.0f);
        sepVarM62656j.m77933g(1.0f, 1.0f, false, true, 2.0f, 0.0f);
        sepVarM62656j.m77927D(18.0f);
        sepVarM62656j.m77933g(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        sepVarM62656j.m77946t(6.0f, 0.0f);
        sepVarM62656j.m77933g(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        sepVarM62656j.m77926C(3.0f);
        sepVarM62656j.m77933g(1.0f, 1.0f, false, true, 2.0f, 0.0f);
        sepVarM62656j.m77927D(18.0f);
        sepVarM62656j.m77933g(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        rd40.m75320a(rd40Var, sepVarM62656j.f208338a, pk31Var, 1.0f, 2, 1.0f);
        sd40 sd40VarM75321b = rd40Var.m75321b();
        f241710a = sd40VarM75321b;
        return sd40VarM75321b;
    }

    /* JADX INFO: renamed from: l */
    public static final ArrayList m85657l(mob0 mob0Var) {
        Iterable iterableM43714b1;
        fob0 fob0Var = mob0Var.f145640a;
        wab0 wab0Var = fob0Var.f71495c;
        if (fob0Var.f71497e) {
            List listM43714b1 = g6f.m43714b1(wab0Var.f249431a, 5);
            if (listM43714b1.isEmpty()) {
                iterableM43714b1 = lau.f131415a;
                break;
            }
            ListIterator listIterator = listM43714b1.listIterator(listM43714b1.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iterableM43714b1 = lau.f131415a;
                    break;
                }
                if (((rab0) listIterator.previous()).f197249b.length() != 0) {
                    iterableM43714b1 = g6f.m43714b1(listM43714b1, listIterator.nextIndex() + 1);
                    break;
                }
            }
        } else {
            iterableM43714b1 = wab0Var.f249431a;
        }
        ArrayList arrayList = new ArrayList(i6f.m49804T(iterableM43714b1, 10));
        int i = 0;
        for (Object obj : iterableM43714b1) {
            int i2 = i + 1;
            if (i < 0) {
                h6f.m46722S();
                throw null;
            }
            rab0 rab0Var = (rab0) obj;
            arrayList.add(new kib0(i, rab0Var.f197249b, rab0Var.f197248a, rab0Var.f197250c));
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public static final npb0 m85658m(mob0 mob0Var) {
        uab0 uab0Var = (uab0) g6f.m43745s0(mob0Var.f145640a.f71495c.f249433c);
        if (uab0Var == null) {
            return mpb0.f145955a;
        }
        return new lpb0(mob0Var.f145641b.f135374d, uab0Var.f228441b, uab0Var.f228442c);
    }

    /* JADX INFO: renamed from: n */
    public static rb8 m85659n(ic8 ic8Var) {
        boolean z = ic8Var.f100754b;
        Set set = ic8Var.f100756d;
        if (!z || !ic8Var.f100755c || set.isEmpty()) {
            set = gbu.f78413a;
        }
        return new rb8(set);
    }

    /* JADX INFO: renamed from: o */
    public static final void m85660o(StatsDetailsResponse statsDetailsResponse, ArrayList arrayList, int i) {
        f361 f361Var;
        fuz0 fuz0VarM40079a = euz0.m40079a(statsDetailsResponse.m11439q());
        fuz0 fuz0VarM40079a2 = statsDetailsResponse.m11445w() ? euz0.m40079a(statsDetailsResponse.m11443u()) : null;
        String subtitle = statsDetailsResponse.getSubtitle();
        wj50.m88279p(subtitle);
        String str = subtitle.length() > 0 ? subtitle : null;
        int iM11442t = statsDetailsResponse.m11442t();
        if (iM11442t == 0) {
            f361Var = null;
        } else {
            f361Var = iM11442t > 0 ? new f361(iM11442t, R.string.user_stats_summary_percentage_increased_accessibility_label, R.color.user_stats_details_top_track_up_change_text_color, R.drawable.user_stats_circle_arrow_up) : new f361(iM11442t, R.string.user_stats_summary_percentage_decreased_accessibility_label, R.color.user_stats_details_top_track_down_change_text_color, R.drawable.user_stats_circle_arrow_down);
        }
        String strM11440r = statsDetailsResponse.m11440r();
        wj50.m88279p(strM11440r);
        arrayList.add(new g361(i, fuz0VarM40079a, fuz0VarM40079a2, str, strM11440r.length() > 0 ? strM11440r : null, f361Var, null, 64));
        if (statsDetailsResponse.m11438p() == 3 || statsDetailsResponse.getSubtitle().length() <= 0) {
            return;
        }
        arrayList.add(cyr.f43342a);
    }

    /* JADX INFO: renamed from: p */
    public static Object m85661p(iej0 iej0Var, taj0 taj0Var, Context context, bya0 bya0Var, ibk ibkVar, int i) {
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            bya0Var = null;
        }
        bya0 bya0Var2 = bya0Var;
        iej0Var.getClass();
        boolean z2 = Build.VERSION.SDK_INT > 36;
        maj0 maj0Var = new maj0(R.drawable.bluetooth_permission_full_screen_sheet_header, context.getString(z2 ? R.string.f5862x3a0d6878 : R.string.bluetooth_permission_full_screen_sheet_header_title_text), h6f.m46715L(new laj0(dru.f52389c, context.getString(R.string.bluetooth_permission_full_screen_sheet_section_1_title_text), context.getString(z2 ? R.string.f5863xfc26cca2 : R.string.f5864x83927dfa)), new laj0(jqu.f115003c, context.getString(R.string.bluetooth_permission_full_screen_sheet_section_2_title_text), context.getString(R.string.f5865x48246019))), z, taj0Var, true, bya0Var2);
        gaj0 gaj0Var = gaj0.f78060a;
        Object objM50388b = iej0Var.m50388b(new bej0(gaj0Var, maj0Var, gaj0Var), ibkVar);
        return objM50388b == yuk.f276404a ? objM50388b : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: q */
    public static final o260 m85662q(tx50 tx50Var, String str, boolean z) {
        boolean zM88271j = wj50.m88271j(tx50Var.f224567c, str);
        return new o260(tx50Var.f224565a, tx50Var.f224568d, tx50Var.f224566b, tx50Var.f224569e, zM88271j, tx50Var.f224570f, edb.m38564m("spotify:user:", tx50Var.f224567c), z && !zM88271j);
    }

    /* JADX INFO: renamed from: r */
    public static final ro80 m85663r(String str, List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((tx50) obj).f224571g) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        ro80 ro80VarM44508o = geg1.m44508o();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ro80VarM44508o.add(m85662q((tx50) it.next(), str, z));
        }
        if (!arrayList.isEmpty()) {
            ro80VarM44508o.add(new n260(arrayList.size()));
        }
        return geg1.m44506m(ro80VarM44508o);
    }

    /* JADX INFO: renamed from: s */
    public static final v260 m85664s(by50 by50Var, mx50 mx50Var) {
        String str;
        ArrayList arrayList = by50Var.f32077c;
        tx50 tx50Var = by50Var.f32082h.f287209b;
        i260 i260Var = null;
        if (tx50Var.f224569e) {
            String str2 = tx50Var.f224567c;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!((tx50) obj).f224570f) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((tx50) obj2).f224570f) {
                    arrayList3.add(obj2);
                }
            }
            z260 z260Var = new z260();
            q260 q260Var = new q260(arrayList2.size(), m85663r(str2, arrayList2, true));
            if (arrayList3.isEmpty()) {
                arrayList3 = null;
            }
            m260 m260Var = arrayList3 != null ? new m260(arrayList3.size(), m85663r(str2, arrayList3, true)) : null;
            fx50 fx50Var = mx50Var.f147963c;
            if (fx50Var != null) {
                ex50 ex50Var = fx50Var.f74246d;
                str = ex50Var != null ? ex50Var.f63672b : fx50Var.f74244b;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            if (str.length() == 0) {
                str = by50Var.f32078d.f266864b;
            }
            int iOrdinal = mx50Var.f147961a.f127335a.ordinal();
            if (iOrdinal == 0) {
                i260Var = new i260(true, str);
            } else if (iOrdinal == 1) {
                i260Var = new i260(false, str);
            } else if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return new s260(z260Var, q260Var, m260Var, by50Var, i260Var);
        }
        tx50 tx50VarM85654i = m85654i(by50Var);
        if (tx50VarM85654i == null || !tx50VarM85654i.f224570f) {
            String str3 = tx50Var.f224567c;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (!((tx50) obj3).f224570f) {
                    arrayList4.add(obj3);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : arrayList) {
                if (((tx50) obj4).f224570f) {
                    arrayList5.add(obj4);
                }
            }
            y260 y260Var = new y260(gue.m45750l(arrayList).f224566b);
            q260 q260Var2 = new q260(arrayList4.size(), m85663r(str3, arrayList4, false));
            if (arrayList5.isEmpty()) {
                arrayList5 = null;
            }
            return new u260(y260Var, q260Var2, arrayList5 != null ? new m260(arrayList5.size(), m85663r(str3, arrayList5, false)) : null, by50Var);
        }
        String str4 = tx50Var.f224567c;
        ArrayList arrayList6 = new ArrayList();
        for (Object obj5 : arrayList) {
            if (!((tx50) obj5).f224570f) {
                arrayList6.add(obj5);
            }
        }
        String str5 = gue.m45750l(arrayList).f224566b;
        ro80 ro80VarM44508o = geg1.m44508o();
        tx50 tx50VarM85654i2 = m85654i(by50Var);
        if (tx50VarM85654i2 != null) {
            ro80VarM44508o.add(m85662q(tx50VarM85654i2, str4, false));
        }
        ro80 ro80VarM44506m = geg1.m44506m(ro80VarM44508o);
        y260 y260Var2 = new y260(str5);
        q260 q260Var3 = new q260(arrayList6.size(), m85663r(str4, arrayList6, false));
        if (ro80VarM44506m.isEmpty()) {
            ro80VarM44506m = null;
        }
        return new t260(y260Var2, q260Var3, ro80VarM44506m != null ? new m260(ro80VarM44506m.f201179b, ro80VarM44506m) : null, by50Var);
    }

    /* JADX INFO: renamed from: t */
    public static Next m85665t(ic8 ic8Var, bc8 bc8Var, boolean z) {
        Set set = ic8Var.f100756d;
        Object obj = null;
        oc8 oc8Var = null;
        if (bc8Var instanceof zb8) {
            Set set2 = ((zb8) bc8Var).f281276a;
            Set set3 = set2.isEmpty() ? null : set2;
            if (set3 == null) {
                return Next.m15608j();
            }
            Set setM43734m1 = g6f.m43734m1(set);
            Set set4 = set3;
            if (setM43734m1.containsAll(set4)) {
                return Next.m15608j();
            }
            setM43734m1.addAll(set4);
            ic8 ic8VarM50242a = ic8.m50242a(ic8Var, false, false, false, setM43734m1, 7);
            return Next.m15607i(ic8VarM50242a, Effects.m15571a(m85659n(ic8VarM50242a), new qb8(ic8VarM50242a.f100756d)));
        }
        if (bc8Var instanceof ac8) {
            Set set5 = ((ac8) bc8Var).f14282a;
            Set set6 = set5.isEmpty() ? null : set5;
            if (set6 == null) {
                return Next.m15608j();
            }
            Set setM43734m2 = g6f.m43734m1(set);
            Set set7 = set6;
            if (!(set7 instanceof Collection) || !set7.isEmpty()) {
                Iterator it = set7.iterator();
                while (it.hasNext()) {
                    if (setM43734m2.contains((oc8) it.next())) {
                        setM43734m2.removeAll(set6);
                        ic8 ic8VarM50242a2 = ic8.m50242a(ic8Var, false, false, false, setM43734m2, 7);
                        return Next.m15607i(ic8VarM50242a2, Effects.m15571a(m85659n(ic8VarM50242a2), new qb8(ic8VarM50242a2.f100756d)));
                    }
                }
            }
            return Next.m15608j();
        }
        if (bc8Var instanceof xb8) {
            xb8 xb8Var = (xb8) bc8Var;
            ic8 ic8VarM50242a3 = ic8.m50242a(ic8Var, false, xb8Var.f259856a, xb8Var.f259857b, null, 9);
            return Next.m15607i(ic8VarM50242a3, Effects.m15571a(m85659n(ic8VarM50242a3)));
        }
        if (bc8Var instanceof vb8) {
            ic8 ic8VarM50242a4 = ic8.m50242a(ic8Var, true, false, false, null, 14);
            return Next.m15607i(ic8VarM50242a4, Effects.m15571a(new nb8(ic8VarM50242a4.f100753a)));
        }
        if (bc8Var instanceof wb8) {
            ic8 ic8VarM50242a5 = ic8.m50242a(ic8Var, false, false, false, null, 14);
            return Next.m15607i(ic8VarM50242a5, Effects.m15571a(new nb8(ic8VarM50242a5.f100753a)));
        }
        if (!(bc8Var instanceof yb8)) {
            throw new NoWhenBranchMatchedException();
        }
        yb8 yb8Var = (yb8) bc8Var;
        oc8 oc8Var2 = yb8Var.f271097b;
        if (!z) {
            for (Object obj2 : set) {
                if (wj50.m88271j(((oc8) obj2).getUuid(), oc8Var2.getUuid())) {
                    obj = obj2;
                    break;
                }
            }
            oc8Var = (oc8) obj;
        } else if (set.contains(oc8Var2)) {
            oc8Var = oc8Var2;
        }
        return oc8Var == null ? Next.m15608j() : Next.m15605a(Effects.m15571a(new ob8(yb8Var.f271096a, oc8Var, yb8Var.f271098c), new pb8(System.currentTimeMillis())));
    }
}
