package p204p;

import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class gtf implements zsf {

    /* JADX INFO: renamed from: a */
    public final ve50 f84161a;

    /* JADX INFO: renamed from: b */
    public final epx f84162b;

    /* JADX INFO: renamed from: c */
    public final wt80 f84163c;

    /* JADX INFO: renamed from: d */
    public final luk f84164d;

    /* JADX INFO: renamed from: e */
    public final lsi0 f84165e = msi0.m62770a();

    public gtf(ve50 ve50Var, epx epxVar, wt80 wt80Var, luk lukVar) {
        this.f84161a = ve50Var;
        this.f84162b = epxVar;
        this.f84163c = wt80Var;
        this.f84164d = lukVar;
    }

    /* JADX INFO: renamed from: a */
    public final Observable m45690a(List list) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            esf esfVar = (esf) this.f84161a.f240622a.m66541c(str);
            if (esfVar != null) {
                map.put(str, esfVar);
            } else {
                arrayList.add(str);
            }
        }
        return Observable.just(arrayList).switchMap(new c9a(this, 12)).map(new fw7(25, list, map));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        if (r11 == r5) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [int] */
    /* JADX WARN: Type inference failed for: r9v1, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v4, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m45691b(int i, String str, ibk ibkVar) {
        dtf dtfVar;
        int i2;
        String str2;
        ?? r10;
        jsi0 jsi0Var;
        if (ibkVar instanceof dtf) {
            dtfVar = (dtf) ibkVar;
            int i3 = dtfVar.f52825g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dtfVar.f52825g = i3 - Integer.MIN_VALUE;
            } else {
                dtfVar = new dtf(this, ibkVar);
            }
        } else {
            dtfVar = new dtf(this, ibkVar);
        }
        Object objM96571q = dtfVar.f52823e;
        int i4 = dtfVar.f52825g;
        yuk yukVar = yuk.f276404a;
        try {
            if (i4 == 0) {
                bga.m29073P(objM96571q);
                dtfVar.f52819a = str;
                lsi0 lsi0Var = this.f84165e;
                dtfVar.f52820b = lsi0Var;
                dtfVar.f52821c = i;
                i2 = 0;
                dtfVar.f52822d = 0;
                dtfVar.f52825g = 1;
                if (lsi0Var.mo54248a(dtfVar) != yukVar) {
                    str2 = str;
                    r10 = i;
                    jsi0Var = lsi0Var;
                }
                i = jsi0Var;
                return yukVar;
            }
            if (i4 == 1) {
                int i5 = dtfVar.f52822d;
                int i6 = dtfVar.f52821c;
                jsi0 jsi0Var2 = dtfVar.f52820b;
                str2 = dtfVar.f52819a;
                bga.m29073P(objM96571q);
                i2 = i5;
                jsi0Var = jsi0Var2;
                r10 = i6;
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jsi0 jsi0Var3 = dtfVar.f52820b;
                bga.m29073P(objM96571q);
                i = jsi0Var3;
            }
            i = jsi0Var;
            ctf ctfVar = (ctf) objM96571q;
            pvf pvfVarM30464a = ctfVar instanceof btf ? ((btf) ctfVar).m30464a() : null;
            i.mo54249c(null);
            return pvfVarM30464a;
            Set set = dd41.f47702f;
            if (!r46.m74708A(str2, gn80.SHOW_EPISODE)) {
                jsi0Var.mo54249c(null);
                return null;
            }
            Observable observableSwitchMap = m45690a(geg1.m44518y(str2)).switchMap(new cl8(this, (int) r10, 3));
            atf atfVar = atf.f19666a;
            dtfVar.f52819a = null;
            dtfVar.f52820b = jsi0Var;
            dtfVar.f52821c = r10;
            dtfVar.f52822d = i2;
            dtfVar.f52825g = 2;
            objM96571q = zn91.m96571q(observableSwitchMap, 2, atfVar, dtfVar);
        } catch (Throwable th) {
            i.mo54249c(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c2, code lost:
    
        if (r14 == r8) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [p.gtf] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m45692c(String str, ibk ibkVar) {
        etf etfVar;
        jsi0 jsi0Var;
        int i;
        ?? r13;
        Object objM45693d;
        jsi0 jsi0Var2;
        if (ibkVar instanceof etf) {
            etfVar = (etf) ibkVar;
            int i2 = etfVar.f62703g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                etfVar.f62703g = i2 - Integer.MIN_VALUE;
            } else {
                etfVar = new etf(this, ibkVar);
            }
        } else {
            etfVar = new etf(this, ibkVar);
        }
        Object objM96571q = etfVar.f62701e;
        int i3 = etfVar.f62703g;
        int i4 = 0;
        lau lauVar = lau.f131415a;
        yuk yukVar = yuk.f276404a;
        try {
            try {
                if (i3 == 0) {
                    bga.m29073P(objM96571q);
                    etfVar.f62697a = str;
                    jsi0Var = this.f84165e;
                    etfVar.f62698b = jsi0Var;
                    etfVar.f62699c = 0;
                    etfVar.f62703g = 1;
                    if (jsi0Var.mo54248a(etfVar) != yukVar) {
                        i = 0;
                        r13 = str;
                    }
                    return yukVar;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        i4 = etfVar.f62700d;
                        int i5 = etfVar.f62699c;
                        jsi0 jsi0Var3 = etfVar.f62698b;
                        try {
                            bga.m29073P(objM96571q);
                            jsi0Var2 = jsi0Var3;
                            i = i5;
                            jsi0 jsi0Var4 = jsi0Var2;
                            Observable observableM45690a = m45690a((List) objM96571q);
                            etfVar.f62697a = null;
                            etfVar.f62698b = jsi0Var4;
                            etfVar.f62699c = i;
                            etfVar.f62700d = i4;
                            etfVar.f62703g = 3;
                            objM96571q = zn91.m96571q(observableM45690a, 2, lauVar, etfVar);
                            str = jsi0Var4;
                        } catch (Throwable th) {
                            th = th;
                            str = jsi0Var3;
                            str.mo54249c(null);
                            throw th;
                        }
                    } else {
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jsi0 jsi0Var5 = etfVar.f62698b;
                        bga.m29073P(objM96571q);
                        str = jsi0Var5;
                    }
                    str.mo54249c(null);
                    return objM96571q;
                }
                int i6 = etfVar.f62699c;
                jsi0 jsi0Var6 = etfVar.f62698b;
                String str2 = etfVar.f62697a;
                bga.m29073P(objM96571q);
                jsi0Var = jsi0Var6;
                i = i6;
                r13 = str2;
                Set set = dd41.f47702f;
                gn80 gn80Var = gn80.SHOW_EPISODE;
                gn80 gn80Var2 = gn80.SHOW_SHOW;
                if (!r46.m74709B(r13, gn80Var, gn80Var2)) {
                    jsi0Var.mo54249c(null);
                    return lauVar;
                }
                etfVar.f62697a = null;
                etfVar.f62698b = jsi0Var;
                etfVar.f62699c = i;
                etfVar.f62700d = 0;
                etfVar.f62703g = 2;
                if (r46.m74708A(r13, gn80Var)) {
                    objM45693d = geg1.m44518y(r13);
                } else {
                    objM45693d = r46.m74708A(r13, gn80Var2) ? m45693d(r13, etfVar) : lauVar;
                }
                if (objM45693d != yukVar) {
                    jsi0Var2 = jsi0Var;
                    objM96571q = objM45693d;
                    jsi0 jsi0Var7 = jsi0Var2;
                    Observable observableM45690a2 = m45690a((List) objM96571q);
                    etfVar.f62697a = null;
                    etfVar.f62698b = jsi0Var7;
                    etfVar.f62699c = i;
                    etfVar.f62700d = i4;
                    etfVar.f62703g = 3;
                    objM96571q = zn91.m96571q(observableM45690a2, 2, lauVar, etfVar);
                    str = jsi0Var7;
                }
                return yukVar;
            } catch (Throwable th2) {
                jsi0 jsi0Var8 = jsi0Var;
                th = th2;
                str = jsi0Var8;
                str.mo54249c(null);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: d */
    public final Serializable m45693d(String str, ibk ibkVar) {
        ftf ftfVar;
        if (ibkVar instanceof ftf) {
            ftfVar = (ftf) ibkVar;
            int i = ftfVar.f73207c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ftfVar.f73207c = i - Integer.MIN_VALUE;
            } else {
                ftfVar = new ftf(this, ibkVar);
            }
        } else {
            ftfVar = new ftf(this, ibkVar);
        }
        Object objM62841f = ftfVar.f73205a;
        int i2 = ftfVar.f73207c;
        if (i2 == 0) {
            bga.m29073P(objM62841f);
            top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
            qjp0 qjp0VarM18379C = PlaylistEpisodeDecorationPolicy.m18379C();
            qjp0VarM18379C.m72941s(EpisodeDecorationPolicy.newBuilder().setLink(true));
            top0VarM18421v.m81212t(qjp0VarM18379C);
            PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
            wj50.m88279p(playlistRequestDecorationPolicy);
            st80 st80Var = new st80(playlistRequestDecorationPolicy, null, null, false, null, a5u0.f12598a, null, 0, null, 478);
            ftfVar.f73207c = 1;
            objM62841f = ((mu80) this.f84163c).m62841f(str, st80Var, ftfVar);
            yuk yukVar = yuk.f276404a;
            if (objM62841f == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM62841f);
        }
        qu80 qu80Var = (qu80) ((p2x0) objM62841f).m68970c();
        if (qu80Var == null) {
            return lau.f131415a;
        }
        List list = qu80Var.f192598d;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((nw80) it.next()).f159049c);
        }
        return arrayList;
    }
}
