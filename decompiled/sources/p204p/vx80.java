package p204p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class vx80 implements l8d0 {

    /* JADX INFO: renamed from: a */
    public final Context f245639a;

    /* JADX INFO: renamed from: b */
    public final wt80 f245640b;

    /* JADX INFO: renamed from: c */
    public final yz80 f245641c;

    /* JADX INFO: renamed from: d */
    public final PlaylistRequestDecorationPolicy f245642d;

    /* JADX INFO: renamed from: e */
    public final q490 f245643e;

    /* JADX INFO: renamed from: f */
    public final Observable f245644f;

    /* JADX INFO: renamed from: g */
    public final m12 f245645g;

    /* JADX INFO: renamed from: h */
    public final kx21 f245646h;

    /* JADX INFO: renamed from: i */
    public final a8q f245647i;

    /* JADX INFO: renamed from: j */
    public final i4t0 f245648j;

    public vx80(Context context, wt80 wt80Var, yz80 yz80Var, PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy, q490 q490Var, Observable observable, m12 m12Var, kx21 kx21Var, a8q a8qVar, mi80 mi80Var, pne1 pne1Var, ure ureVar, ezm ezmVar) {
        this.f245639a = context;
        this.f245640b = wt80Var;
        this.f245641c = yz80Var;
        this.f245642d = playlistRequestDecorationPolicy;
        this.f245643e = q490Var;
        this.f245644f = observable;
        this.f245645g = m12Var;
        this.f245646h = kx21Var;
        this.f245647i = a8qVar;
        this.f245648j = ezmVar;
    }

    @Override // p204p.cxx
    /* JADX INFO: renamed from: a */
    public final Observable mo28057a(roa roaVar) {
        return k0e1.m54988g(oyf1.m68486s(nxf1.m65828g(new m320(this, roaVar, (fbk) null, 21)), new C2537wj(28)), dau.f47107a);
    }

    @Override // p204p.cxx
    /* JADX INFO: renamed from: b */
    public final Single mo24638b(roa roaVar) {
        return vjf1.m85770t(dau.f47107a, new n860(this, roaVar, (fbk) null, 28)).doOnError(frz.f72699Y0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: c */
    public final Object m86645c(String str, boolean z, ipm0 ipm0Var, ibk ibkVar) {
        ox80 ox80Var;
        Set setM77306i0;
        String str2;
        Object objM96567o;
        ipm0 ipm0Var2;
        Set set;
        ipm0 ipm0Var3;
        boolean z2 = z;
        if (ibkVar instanceof ox80) {
            ox80Var = (ox80) ibkVar;
            int i = ox80Var.f170913g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ox80Var.f170913g = i - Integer.MIN_VALUE;
            } else {
                ox80Var = new ox80(this, ibkVar);
            }
        } else {
            ox80Var = new ox80(this, ibkVar);
        }
        Object obj = ox80Var.f170911e;
        int i2 = ox80Var.f170913g;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            setM77306i0 = s601.m77306i0(us80.f233558a, zs80.f285887a, at80.f19613a, ys80.f275721a);
            if (!z2) {
                setM77306i0.add(ss80.f213529a);
            }
            Single singleFirstOrError = this.f245644f.firstOrError();
            str2 = str;
            ox80Var.f170907a = str2;
            ox80Var.f170908b = ipm0Var;
            ox80Var.f170909c = setM77306i0;
            ox80Var.f170910d = z2;
            ox80Var.f170913g = 1;
            objM96567o = zn91.m96567o(singleFirstOrError, ox80Var);
            if (objM96567o != yukVar) {
                ipm0Var2 = ipm0Var;
            }
            return yukVar;
        }
        if (i2 == 1) {
            z2 = ox80Var.f170910d;
            Set set2 = ox80Var.f170909c;
            ipm0Var2 = ox80Var.f170908b;
            str2 = ox80Var.f170907a;
            bga.m29073P(obj);
            objM96567o = obj;
            setM77306i0 = set2;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Set set3 = ox80Var.f170909c;
            ipm0Var3 = ox80Var.f170908b;
            bga.m29073P(obj);
            set = set3;
        }
        ipm0Var3.getClass();
        return new st80(this.f245642d, (i490) obj, set, false, pt80.f181071a, new b5u0(0, ipm0Var3.m51279a()), null, 0, null, 448);
        u490 u490VarMo44949a = this.f245643e.mo44949a((String) objM96567o);
        ox80Var.f170907a = null;
        ox80Var.f170908b = ipm0Var2;
        ox80Var.f170909c = setM77306i0;
        ox80Var.f170910d = z2;
        ox80Var.f170913g = 2;
        Object objM82316a = u490VarMo44949a.m82316a(str2, ox80Var);
        if (objM82316a != yukVar) {
            set = setM77306i0;
            ipm0Var3 = ipm0Var2;
            obj = objM82316a;
            ipm0Var3.getClass();
            return new st80(this.f245642d, (i490) obj, set, false, pt80.f181071a, new b5u0(0, ipm0Var3.m51279a()), null, 0, null, 448);
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m86646d(roa roaVar, ibk ibkVar) {
        px80 px80Var;
        Throwable th;
        aps apsVar;
        if (ibkVar instanceof px80) {
            px80Var = (px80) ibkVar;
            int i = px80Var.f182231d;
            if ((i & Integer.MIN_VALUE) != 0) {
                px80Var.f182231d = i - Integer.MIN_VALUE;
            } else {
                px80Var = new px80(this, ibkVar);
            }
        } else {
            px80Var = new px80(this, ibkVar);
        }
        Object obj = px80Var.f182229b;
        int i2 = px80Var.f182231d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apsVar = px80Var.f182228a;
            try {
                bga.m29073P(obj);
                apsVar.m26726a();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                apsVar.m26726a();
                throw th;
            }
        }
        bga.m29073P(obj);
        aps apsVar2 = (aps) this.f245648j.get();
        try {
            wj50.m88279p(apsVar2);
            px80Var.f182228a = apsVar2;
            px80Var.f182231d = 1;
            Object objM86647e = m86647e(roaVar, apsVar2, px80Var);
            Object obj2 = yuk.f276404a;
            if (objM86647e == obj2) {
                return obj2;
            }
            obj = objM86647e;
            apsVar = apsVar2;
            apsVar.m26726a();
            return obj;
        } catch (Throwable th3) {
            th = th3;
            apsVar = apsVar2;
            apsVar.m26726a();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:48:0x0112  */
    /* JADX WARN: Code duplicated, block: B:51:0x0119  */
    /* JADX WARN: Code duplicated, block: B:55:0x0149  */
    /* JADX WARN: Code duplicated, block: B:58:0x0153  */
    /* JADX WARN: Code duplicated, block: B:60:0x0159  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
    
        if (((p204p.n090) r9).m63326w(r1, r10, r0) == r8) goto L54;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x0159, please report this as an issue */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m86647e(roa roaVar, aps apsVar, ibk ibkVar) throws IOException {
        qx80 qx80Var;
        String strM76035e;
        ipm0 ipm0Var;
        boolean z;
        aps apsVar2;
        ago agoVar;
        aps apsVar3;
        p2x0 p2x0Var;
        nx80 nx80Var;
        qu80 qu80Var;
        Object objM76980u;
        qu80 qu80Var2;
        Map map;
        Object objM96567o;
        Map map2;
        if (ibkVar instanceof qx80) {
            qx80Var = (qx80) ibkVar;
            int i = qx80Var.f193549t;
            if ((i & Integer.MIN_VALUE) != 0) {
                qx80Var.f193549t = i - Integer.MIN_VALUE;
            } else {
                qx80Var = new qx80(this, ibkVar);
            }
        } else {
            qx80Var = new qx80(this, ibkVar);
        }
        Object objM86645c = qx80Var.f193547h;
        int i2 = qx80Var.f193549t;
        int i3 = 2;
        fbk fbkVar = null;
        Object obj = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    z = qx80Var.f193546g;
                    ipm0 ipm0Var2 = qx80Var.f193542c;
                    strM76035e = qx80Var.f193541b;
                    aps apsVar4 = qx80Var.f193540a;
                    try {
                        bga.m29073P(objM86645c);
                    } catch (Exception unused) {
                    }
                    ipm0Var = ipm0Var2;
                    apsVar = apsVar4;
                } else {
                    if (i2 == 2) {
                        z = qx80Var.f193546g;
                        agoVar = qx80Var.f193543d;
                        strM76035e = qx80Var.f193541b;
                        apsVar2 = qx80Var.f193540a;
                        bga.m29073P(objM86645c);
                        qx80Var.f193540a = apsVar2;
                        qx80Var.f193541b = strM76035e;
                        qx80Var.f193542c = null;
                        qx80Var.f193543d = agoVar;
                        qx80Var.f193546g = z;
                        qx80Var.f193549t = 3;
                        objM86645c = ((mu80) this.f245640b).m62841f(strM76035e, (st80) objM86645c, qx80Var);
                        if (objM86645c != obj) {
                            apsVar3 = apsVar2;
                            p2x0Var = (p2x0) objM86645c;
                            nx80Var = new nx80(apsVar3, i3);
                            p2x0Var.getClass();
                            if (p2x0Var instanceof k2x0) {
                                throw new IOException("Failed to get playlist: " + ((k2x0) p2x0Var).f118699a);
                            }
                            if (!(p2x0Var instanceof m2x0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            qu80Var = (qu80) nx80Var.invoke(((m2x0) p2x0Var).f139474a);
                            n860 n860Var = new n860(agoVar, qu80Var, fbkVar, 29);
                            qx80Var.f193540a = null;
                            qx80Var.f193541b = strM76035e;
                            qx80Var.f193542c = null;
                            qx80Var.f193543d = null;
                            qx80Var.f193544e = qu80Var;
                            qx80Var.f193546g = z;
                            qx80Var.f193549t = 4;
                            objM76980u = s1h1.m76980u(2000L, n860Var, qx80Var);
                            if (objM76980u != obj) {
                                objM86645c = objM76980u;
                                qu80Var2 = qu80Var;
                                map = (Map) objM86645c;
                                if (map == null) {
                                    map = nau.f152117a;
                                }
                                Observable observableM49110d = ((hy21) this.f245646h).m49110d(strM76035e);
                                ux80 ux80Var = ux80.f234845h;
                                Single singleFirstOrError = observableM49110d.map(new ri5()).firstOrError();
                                qx80Var.f193540a = null;
                                qx80Var.f193541b = null;
                                qx80Var.f193542c = null;
                                qx80Var.f193543d = null;
                                qx80Var.f193544e = qu80Var2;
                                qx80Var.f193545f = map;
                                qx80Var.f193546g = z;
                                qx80Var.f193549t = 5;
                                objM96567o = zn91.m96567o(singleFirstOrError, qx80Var);
                                if (objM96567o != obj) {
                                    Map map3 = map;
                                    objM86645c = objM96567o;
                                    map2 = map3;
                                }
                            }
                        }
                        return obj;
                    }
                    if (i2 == 3) {
                        z = qx80Var.f193546g;
                        agoVar = qx80Var.f193543d;
                        strM76035e = qx80Var.f193541b;
                        apsVar3 = qx80Var.f193540a;
                        bga.m29073P(objM86645c);
                        p2x0Var = (p2x0) objM86645c;
                        nx80Var = new nx80(apsVar3, i3);
                        p2x0Var.getClass();
                        if (p2x0Var instanceof k2x0) {
                            throw new IOException("Failed to get playlist: " + ((k2x0) p2x0Var).f118699a);
                        }
                        if (!(p2x0Var instanceof m2x0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        qu80Var = (qu80) nx80Var.invoke(((m2x0) p2x0Var).f139474a);
                        n860 n860Var2 = new n860(agoVar, qu80Var, fbkVar, 29);
                        qx80Var.f193540a = null;
                        qx80Var.f193541b = strM76035e;
                        qx80Var.f193542c = null;
                        qx80Var.f193543d = null;
                        qx80Var.f193544e = qu80Var;
                        qx80Var.f193546g = z;
                        qx80Var.f193549t = 4;
                        objM76980u = s1h1.m76980u(2000L, n860Var2, qx80Var);
                        if (objM76980u != obj) {
                            objM86645c = objM76980u;
                            qu80Var2 = qu80Var;
                            map = (Map) objM86645c;
                            if (map == null) {
                                map = nau.f152117a;
                            }
                            Observable observableM49110d2 = ((hy21) this.f245646h).m49110d(strM76035e);
                            ux80 ux80Var2 = ux80.f234845h;
                            Single singleFirstOrError2 = observableM49110d2.map(new ri5()).firstOrError();
                            qx80Var.f193540a = null;
                            qx80Var.f193541b = null;
                            qx80Var.f193542c = null;
                            qx80Var.f193543d = null;
                            qx80Var.f193544e = qu80Var2;
                            qx80Var.f193545f = map;
                            qx80Var.f193546g = z;
                            qx80Var.f193549t = 5;
                            objM96567o = zn91.m96567o(singleFirstOrError2, qx80Var);
                            if (objM96567o != obj) {
                                Map map4 = map;
                                objM86645c = objM96567o;
                                map2 = map4;
                            }
                        }
                        return obj;
                    }
                    if (i2 == 4) {
                        z = qx80Var.f193546g;
                        qu80Var2 = qx80Var.f193544e;
                        strM76035e = qx80Var.f193541b;
                        bga.m29073P(objM86645c);
                        map = (Map) objM86645c;
                        if (map == null) {
                            map = nau.f152117a;
                        }
                        Observable observableM49110d3 = ((hy21) this.f245646h).m49110d(strM76035e);
                        ux80 ux80Var3 = ux80.f234845h;
                        Single singleFirstOrError3 = observableM49110d3.map(new ri5()).firstOrError();
                        qx80Var.f193540a = null;
                        qx80Var.f193541b = null;
                        qx80Var.f193542c = null;
                        qx80Var.f193543d = null;
                        qx80Var.f193544e = qu80Var2;
                        qx80Var.f193545f = map;
                        qx80Var.f193546g = z;
                        qx80Var.f193549t = 5;
                        objM96567o = zn91.m96567o(singleFirstOrError3, qx80Var);
                        if (objM96567o != obj) {
                            Map map5 = map;
                            objM86645c = objM96567o;
                            map2 = map5;
                        }
                        return obj;
                    }
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map2 = qx80Var.f193545f;
                    qu80Var2 = qx80Var.f193544e;
                    bga.m29073P(objM86645c);
                }
                return m86648f(qu80Var2, (r431) objM86645c, map2);
            }
            bga.m29073P(objM86645c);
            strM76035e = roaVar.m76035e();
            boolean zM76041k = roaVar.m76041k();
            ipm0 ipm0VarM76034d = roaVar.m76034d();
            if (zM76041k) {
                try {
                    yz80 yz80Var = this.f245641c;
                    rg61 rg61Var = rg61.f198855W0;
                    qx80Var.f193540a = apsVar;
                    qx80Var.f193541b = strM76035e;
                    qx80Var.f193542c = ipm0VarM76034d;
                    qx80Var.f193546g = zM76041k;
                    qx80Var.f193549t = 1;
                } catch (Exception unused2) {
                }
            }
            ipm0Var = ipm0VarM76034d;
            z = zM76041k;
            ago agoVarM26727b = apsVar.m26727b();
            qx80Var.f193540a = apsVar;
            qx80Var.f193541b = strM76035e;
            qx80Var.f193542c = null;
            qx80Var.f193543d = agoVarM26727b;
            qx80Var.f193546g = z;
            qx80Var.f193549t = 2;
            objM86645c = m86645c(strM76035e, z, ipm0Var, qx80Var);
            if (objM86645c != obj) {
                apsVar2 = apsVar;
                agoVar = agoVarM26727b;
                qx80Var.f193540a = apsVar2;
                qx80Var.f193541b = strM76035e;
                qx80Var.f193542c = null;
                qx80Var.f193543d = agoVar;
                qx80Var.f193546g = z;
                qx80Var.f193549t = 3;
                objM86645c = ((mu80) this.f245640b).m62841f(strM76035e, (st80) objM86645c, qx80Var);
                if (objM86645c != obj) {
                    apsVar3 = apsVar2;
                    p2x0Var = (p2x0) objM86645c;
                    nx80Var = new nx80(apsVar3, i3);
                    p2x0Var.getClass();
                    if (p2x0Var instanceof k2x0) {
                        throw new IOException("Failed to get playlist: " + ((k2x0) p2x0Var).f118699a);
                    }
                    if (!(p2x0Var instanceof m2x0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qu80Var = (qu80) nx80Var.invoke(((m2x0) p2x0Var).f139474a);
                    n860 n860Var3 = new n860(agoVar, qu80Var, fbkVar, 29);
                    qx80Var.f193540a = null;
                    qx80Var.f193541b = strM76035e;
                    qx80Var.f193542c = null;
                    qx80Var.f193543d = null;
                    qx80Var.f193544e = qu80Var;
                    qx80Var.f193546g = z;
                    qx80Var.f193549t = 4;
                    objM76980u = s1h1.m76980u(2000L, n860Var3, qx80Var);
                    if (objM76980u != obj) {
                        objM86645c = objM76980u;
                        qu80Var2 = qu80Var;
                        map = (Map) objM86645c;
                        if (map == null) {
                            map = nau.f152117a;
                        }
                        Observable observableM49110d4 = ((hy21) this.f245646h).m49110d(strM76035e);
                        ux80 ux80Var4 = ux80.f234845h;
                        Single singleFirstOrError4 = observableM49110d4.map(new ri5()).firstOrError();
                        qx80Var.f193540a = null;
                        qx80Var.f193541b = null;
                        qx80Var.f193542c = null;
                        qx80Var.f193543d = null;
                        qx80Var.f193544e = qu80Var2;
                        qx80Var.f193545f = map;
                        qx80Var.f193546g = z;
                        qx80Var.f193549t = 5;
                        objM96567o = zn91.m96567o(singleFirstOrError4, qx80Var);
                        if (objM96567o != obj) {
                            Map map6 = map;
                            objM86645c = objM96567o;
                            map2 = map6;
                            return m86648f(qu80Var2, (r431) objM86645c, map2);
                        }
                    }
                }
            }
            return obj;
        } catch (CancellationException e) {
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045 A[PHI: r9
      0x0045: PHI (r9v3 p.vu41) = (r9v2 p.vu41), (r9v5 p.vu41) binds: [B:6:0x0035, B:10:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    /* JADX WARN: Code duplicated, block: B:18:0x0062  */
    /* JADX INFO: renamed from: f */
    public final fxx m86648f(qu80 qu80Var, r431 r431Var, Map map) {
        Context context;
        String string;
        Map map2;
        Map map3 = qu80Var.f192603i;
        ybv ybvVar = qu80Var.f192599e;
        String str = ybvVar.f271256a;
        List list = qu80Var.f192598d;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            context = this.f245639a;
            axx axxVarM60489C = null;
            if (!zHasNext) {
                break;
            }
            nw80 nw80Var = (nw80) it.next();
            Set set = dd41.f47702f;
            String str2 = nw80Var.f159049c;
            gn80 gn80Var = r46.m74726U(str2).f47709c;
            vu41 vu41VarM29401i = (vu41) map.get(new bzs0(str2));
            if (vu41VarM29401i != null) {
                vu41 vu41Var = vu41VarM29401i;
                if (gn80Var == gn80.SHOW_SHOW) {
                    string = context.getResources().getString(R.string.audiobook_subtitle);
                } else {
                    string = "%1$s";
                }
                String str3 = string;
                wj50.m88279p(str3);
                map2 = map;
                axxVarM60489C = this.f245645g.m60489C(nw80Var, vu41Var, str, str3, map2);
            } else {
                if (jjf1.m53566r(str2)) {
                    vu41VarM29401i = bjf1.m29401i(str2);
                    if (vu41VarM29401i != null) {
                        vu41 vu41Var2 = vu41VarM29401i;
                        if (gn80Var == gn80.SHOW_SHOW) {
                            string = context.getResources().getString(R.string.audiobook_subtitle);
                        } else {
                            string = "%1$s";
                        }
                        String str4 = string;
                        wj50.m88279p(str4);
                        map2 = map;
                        axxVarM60489C = this.f245645g.m60489C(nw80Var, vu41Var2, str, str4, map2);
                    }
                } else {
                    Logger.m3973i("EIS: No Kodiak decoration for item %s, skipping", str2);
                }
                map2 = map;
            }
            if (axxVarM60489C != null) {
                arrayList.add(axxVarM60489C);
            }
            map = map2;
        }
        ro80 ro80VarM44508o = geg1.m44508o();
        if (!arrayList.isEmpty() && (map3.keySet().size() != 1 || !map3.containsKey(in80.f103921b))) {
            ro80VarM44508o.add(n1h1.m63507r(context, str));
            if (!pne1.m70445a(str) && !str.equals("spotify:playlist:37i9dQZF1CIl0ks0ynmzpD")) {
                ro80VarM44508o.add(r431Var == r431.f195647c ? n1h1.m63509t(context, str, this.f245647i) : n1h1.m63508s(context, str));
            }
        }
        ro80 ro80VarM44506m = geg1.m44506m(ro80VarM44508o);
        String string2 = tg1.m80723m(str) ? context.getString(R.string.loader_collection_liked_songs_title) : ybvVar.f271257b;
        wj50.m88279p(string2);
        return new fxx(arrayList, new lxx(string2, (String) null, (wwx) null, ro80VarM44506m));
    }
}
