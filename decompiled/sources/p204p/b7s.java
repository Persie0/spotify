package p204p;

import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$DownloadCommand;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$DownloadResponse;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b7s {

    /* JADX INFO: renamed from: a */
    public static final PlaylistRequestDecorationPolicy f24375a;

    static {
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        bjp0 bjp0VarM18365h0 = PlaylistDecorationPolicy.m18365h0();
        bjp0VarM18365h0.m29496H();
        bjp0VarM18365h0.m29495G();
        top0VarM18421v.m81216x(bjp0VarM18365h0);
        amp0 amp0VarM18396H = PlaylistItemDecorationPolicy.m18396H();
        amp0VarM18396H.m26433D(true);
        amp0VarM18396H.m26440v();
        top0VarM18421v.m81214v(amp0VarM18396H);
        f24375a = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m28395a(p0m p0mVar, String str, n95 n95Var, djs0 djs0Var, rwt0 rwt0Var, ibk ibkVar) {
        x6s x6sVar;
        p0m p0mVar2;
        n95 n95Var2;
        if (ibkVar instanceof x6s) {
            x6sVar = (x6s) ibkVar;
            int i = x6sVar.f258744f;
            if ((i & Integer.MIN_VALUE) != 0) {
                x6sVar.f258744f = i - Integer.MIN_VALUE;
            } else {
                x6sVar = new x6s(ibkVar);
            }
        } else {
            x6sVar = new x6s(ibkVar);
        }
        Object objM36222m = x6sVar.f258743e;
        int i2 = x6sVar.f258744f;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM36222m);
            String str2 = p0mVar.f172712a;
            String str3 = p0mVar.f172713b;
            String str4 = p0mVar.f172714c;
            x6sVar.f258739a = p0mVar;
            x6sVar.f258740b = str;
            x6sVar.f258741c = n95Var;
            x6sVar.f258742d = rwt0Var;
            x6sVar.f258744f = 1;
            objM36222m = djs0Var.m36222m(str2, str3, str4, x6sVar);
            if (objM36222m != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            rwt0Var = x6sVar.f258742d;
            n95Var = x6sVar.f258741c;
            str = x6sVar.f258740b;
            p0mVar = x6sVar.f258739a;
            bga.m29073P(objM36222m);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n95Var2 = x6sVar.f258741c;
            str = x6sVar.f258740b;
            p0mVar2 = x6sVar.f258739a;
            bga.m29073P(objM36222m);
        }
        Object obj2 = n95Var2.f151718b;
        String strM82448m = u6j0.m82448m(rbz.m75190h(p0mVar2.f172714c, "/", p0mVar2.f172713b, "/", p0mVar2.f172712a).getBytes(vuc.f244913a));
        n95Var2.m63899H(str).mkdirs();
        n95.m63884I(n95Var2.m63900k(str, strM82448m), (byte[]) objM36222m);
        return w2a1.f247311a;
        x6sVar.f258739a = p0mVar;
        x6sVar.f258740b = str;
        x6sVar.f258741c = n95Var;
        x6sVar.f258742d = null;
        x6sVar.f258744f = 2;
        objM36222m = rwt0Var.m76582d((String) objM36222m, x6sVar);
        if (objM36222m != obj) {
            n95 n95Var3 = n95Var;
            p0mVar2 = p0mVar;
            n95Var2 = n95Var3;
            Object obj3 = n95Var2.f151718b;
            String strM82448m2 = u6j0.m82448m(rbz.m75190h(p0mVar2.f172714c, "/", p0mVar2.f172713b, "/", p0mVar2.f172712a).getBytes(vuc.f244913a));
            n95Var2.m63899H(str).mkdirs();
            n95.m63884I(n95Var2.m63900k(str, strM82448m2), (byte[]) objM36222m);
            return w2a1.f247311a;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m28396b(g4p g4pVar, ibk ibkVar) {
        a7s a7sVar;
        if (ibkVar instanceof a7s) {
            a7sVar = (a7s) ibkVar;
            int i = a7sVar.f13131c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a7sVar.f13131c = i - Integer.MIN_VALUE;
            } else {
                a7sVar = new a7s(ibkVar);
            }
        } else {
            a7sVar = new a7s(ibkVar);
        }
        Object objInvoke = a7sVar.f13130b;
        int i2 = a7sVar.f13131c;
        Object obj = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objInvoke);
                a7sVar.f13129a = g4pVar;
                a7sVar.f13131c = 1;
                Object objInvoke2 = g4pVar.invoke(a7sVar);
                return objInvoke2 == obj ? obj : objInvoke2;
            }
            if (i2 == 1) {
                g4p g4pVar2 = a7sVar.f13129a;
                bga.m29073P(objInvoke);
                return objInvoke;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objInvoke);
            return objInvoke;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            a7sVar.f13129a = null;
            a7sVar.f13131c = 2;
            objInvoke = g4pVar.invoke(a7sVar);
            if (objInvoke == obj) {
                return obj;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final EsOfflinePlugin$DownloadResponse m28397c(String str, pmw pmwVar) {
        omw omwVarM16048t = EsOfflinePlugin$DownloadResponse.m16048t();
        omwVarM16048t.m67378u(str);
        omwVarM16048t.m67374q();
        omwVarM16048t.m67375r(pmwVar);
        return (EsOfflinePlugin$DownloadResponse) omwVarM16048t.build();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0388  */
    /* JADX WARN: Code duplicated, block: B:105:0x0394  */
    /* JADX WARN: Code duplicated, block: B:106:0x0397  */
    /* JADX WARN: Code duplicated, block: B:110:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x02ff A[EDGE_INSN: B:112:0x02ff->B:92:0x02ff BREAK  A[LOOP:1: B:89:0x02b2->B:91:0x02bc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0340 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x021d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x021f A[EDGE_INSN: B:117:0x021f->B:65:0x021f BREAK  A[LOOP:3: B:58:0x0201->B:63:0x021a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0165  */
    /* JADX WARN: Code duplicated, block: B:40:0x016d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0178  */
    /* JADX WARN: Code duplicated, block: B:44:0x0184  */
    /* JADX WARN: Code duplicated, block: B:45:0x0188  */
    /* JADX WARN: Code duplicated, block: B:47:0x0190  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:53:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:55:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:60:0x0207  */
    /* JADX WARN: Code duplicated, block: B:63:0x021a A[LOOP:3: B:58:0x0201->B:63:0x021a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x0223 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x0254  */
    /* JADX WARN: Code duplicated, block: B:76:0x025c  */
    /* JADX WARN: Code duplicated, block: B:79:0x026b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:84:0x0283 A[PHI: r0 r2 r4 r5 r7 r9 r11 r14 r15 r16 r17 r19
      0x0283: PHI (r0v20 p.t5m0) = (r0v14 p.t5m0), (r0v14 p.t5m0), (r0v39 p.t5m0) binds: [B:66:0x0221, B:67:0x0223, B:83:0x027c] A[DONT_GENERATE, DONT_INLINE]
      0x0283: PHI (r2v13 int) = (r2v9 int), (r2v9 int), (r2v16 int) binds: [B:66:0x0221, B:67:0x0223, B:83:0x027c] A[DONT_GENERATE, DONT_INLINE]
      0x0283: PHI (r4v10 p.u6j0) = (r4v7 p.u6j0), (r4v7 p.u6j0), (r4v25 p.u6j0) binds: [B:66:0x0221, B:67:0x0223, B:83:0x027c] A[DONT_GENERATE, DONT_INLINE]
      0x0283: PHI (r5v15 boolean) = (r5v12 boolean), (r5v12 boolean), (r5v16 boolean) binds: [B:66:0x0221, B:67:0x0223, B:83:0x027c] A[DONT_GENERATE, DONT_INLINE]
      0x0283: PHI (r7v8 p.z3l0) = (r7v5 p.z3l0), (r7v5 p.z3l0), (r7v10 p.z3l0) binds: [B:66:0x0221, B:67:0x0223, B:83:0x027c] A[DONT_GENERATE, DONT_INLINE]
      0x0283: PHI (r9v11 java.lang.String) = (r9v9 java.lang.String), (r9v9 java.lang.String), (r9v12 java.lang.String) binds: [B:66:0x0221, B:67:0x0223, B:83:0x027c] A[DONT_GENERATE, DONT_INLINE]
      0x0283: PHI (r11v9 p.n95) = (r11v6 p.n95), (r11v6 p.n95), (r11v10 p.n95) binds: [B:66:0x0221, B:67:0x0223, B:83:0x027c] A[DONT_GENERATE, DONT_INLINE]
      0x0283: PHI (r14v9 p.rwt0) = (r14v6 p.rwt0), (r14v6 p.rwt0), (r14v10 p.rwt0) binds: [B:66:0x0221, B:67:0x0223, B:83:0x027c] A[DONT_GENERATE, DONT_INLINE]
      0x0283: PHI (r15v10 p.djs0) = (r15v7 p.djs0), (r15v7 p.djs0), (r15v11 p.djs0) binds: [B:66:0x0221, B:67:0x0223, B:83:0x027c] A[DONT_GENERATE, DONT_INLINE]
      0x0283: PHI (r16v9 p.lau) = (r16v6 p.lau), (r16v6 p.lau), (r16v11 p.lau) binds: [B:66:0x0221, B:67:0x0223, B:83:0x027c] A[DONT_GENERATE, DONT_INLINE]
      0x0283: PHI (r17v5 p.nw80) = (r17v3 p.nw80), (r17v3 p.nw80), (r17v7 p.nw80) binds: [B:66:0x0221, B:67:0x0223, B:83:0x027c] A[DONT_GENERATE, DONT_INLINE]
      0x0283: PHI (r19v5 p.pmw) = (r19v3 p.pmw), (r19v3 p.pmw), (r19v8 p.pmw) binds: [B:66:0x0221, B:67:0x0223, B:83:0x027c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0287  */
    /* JADX WARN: Code duplicated, block: B:88:0x0296  */
    /* JADX WARN: Code duplicated, block: B:91:0x02bc A[LOOP:1: B:89:0x02b2->B:91:0x02bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x0316  */
    /* JADX WARN: Code duplicated, block: B:97:0x033d  */
    /* JADX WARN: Instruction removed from duplicated block: B:91:0x02bc, please report this as an issue */
    /* JADX INFO: renamed from: d */
    public static final Object m28398d(EsOfflinePlugin$DownloadCommand esOfflinePlugin$DownloadCommand, fwk0 fwk0Var, wt80 wt80Var, t5m0 t5m0Var, n95 n95Var, u6j0 u6j0Var, kr00 kr00Var, djs0 djs0Var, rwt0 rwt0Var, ConcurrentHashMap concurrentHashMap, ibk ibkVar) {
        w6s w6sVar;
        n95 n95Var2;
        kr00 kr00Var2;
        rwt0 rwt0Var2;
        Object objM85381b;
        String str;
        djs0 djs0Var2;
        u6j0 u6j0Var2;
        wt80 wt80Var2;
        ConcurrentHashMap concurrentHashMap2;
        t5m0 t5m0Var2;
        n95 n95Var3;
        t5m0 t5m0Var3;
        rwt0 rwt0Var3;
        u6j0 u6j0Var3;
        djs0 djs0Var3;
        Object obj;
        String str2;
        ConcurrentHashMap concurrentHashMap3;
        t3e1 t3e1Var;
        boolean z;
        String str3;
        z3l0 z3l0Var;
        qu80 qu80Var;
        int i;
        z3l0 z3l0Var2;
        int i2;
        String str4;
        u6j0 u6j0Var4;
        rwt0 rwt0Var4;
        n95 n95Var4;
        djs0 djs0Var4;
        ConcurrentHashMap concurrentHashMap4;
        String str5;
        boolean z2;
        t5m0 t5m0Var4;
        lau lauVar;
        qu80 qu80Var2;
        t5m0 t5m0Var5;
        Object objM28399e;
        boolean z3;
        Object obj2;
        t5m0 t5m0Var6;
        n95 n95Var5;
        u6j0 u6j0Var5;
        djs0 djs0Var5;
        rwt0 rwt0Var5;
        ConcurrentHashMap concurrentHashMap5;
        z3l0 z3l0Var3;
        Iterator it;
        Object next;
        nw80 nw80Var;
        t5m0 t5m0Var7;
        Object obj3;
        int i3;
        z3l0 z3l0Var4;
        Iterator it2;
        qu80 qu80Var3;
        nw80 nw80Var2;
        pmw pmwVar;
        List list;
        ArrayList arrayList;
        Iterator it3;
        List list2;
        pmw pmwVar2;
        ArrayList arrayList2;
        Iterator it4;
        String str6;
        Object next2;
        qu80 qu80Var4;
        Iterator it5;
        Object next3;
        boolean zBooleanValue;
        pmw pmwVar3;
        if (ibkVar instanceof w6s) {
            w6sVar = (w6s) ibkVar;
            int i4 = w6sVar.f248450M0;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                w6sVar.f248450M0 = i4 - Integer.MIN_VALUE;
            } else {
                w6sVar = new w6s(ibkVar);
            }
        } else {
            w6sVar = new w6s(ibkVar);
        }
        Object objM56684z = w6sVar.f248449L0;
        int i5 = w6sVar.f248450M0;
        lau lauVar2 = lau.f131415a;
        pmw pmwVar4 = pmw.OK;
        pmw pmwVar5 = pmw.TEMPORARY_ERROR;
        yuk yukVar = yuk.f276404a;
        if (i5 == 0) {
            bga.m29073P(objM56684z);
            String link = esOfflinePlugin$DownloadCommand.getLink();
            wj50.m88279p(link);
            w6sVar.f248454a = wt80Var;
            w6sVar.f248455b = t5m0Var;
            n95Var2 = n95Var;
            w6sVar.f248456c = n95Var2;
            w6sVar.f248457d = u6j0Var;
            kr00Var2 = kr00Var;
            w6sVar.f248458e = kr00Var2;
            w6sVar.f248459f = djs0Var;
            rwt0Var2 = rwt0Var;
            w6sVar.f248460g = rwt0Var2;
            w6sVar.f248461h = concurrentHashMap;
            w6sVar.f248462i = link;
            w6sVar.f248450M0 = 1;
            objM85381b = vfp0.m85381b(link, fwk0Var, w6sVar);
            if (objM85381b != yukVar) {
                str = link;
                djs0Var2 = djs0Var;
                u6j0Var2 = u6j0Var;
                wt80Var2 = wt80Var;
                concurrentHashMap2 = concurrentHashMap;
                t5m0Var2 = t5m0Var;
            }
            return yukVar;
        }
        if (i5 == 1) {
            String str7 = w6sVar.f248462i;
            concurrentHashMap2 = w6sVar.f248461h;
            rwt0 rwt0Var6 = w6sVar.f248460g;
            djs0 djs0Var6 = w6sVar.f248459f;
            kr00Var2 = w6sVar.f248458e;
            u6j0Var2 = w6sVar.f248457d;
            n95 n95Var6 = w6sVar.f248456c;
            t5m0Var2 = w6sVar.f248455b;
            wt80Var2 = w6sVar.f248454a;
            bga.m29073P(objM56684z);
            str = str7;
            djs0Var2 = djs0Var6;
            n95Var2 = n95Var6;
            rwt0Var2 = rwt0Var6;
            objM85381b = objM56684z;
        } else {
            if (i5 == 2) {
                String str8 = w6sVar.f248462i;
                concurrentHashMap2 = w6sVar.f248461h;
                rwt0 rwt0Var7 = w6sVar.f248460g;
                djs0 djs0Var7 = w6sVar.f248459f;
                u6j0 u6j0Var6 = w6sVar.f248457d;
                n95 n95Var7 = w6sVar.f248456c;
                t5m0 t5m0Var8 = w6sVar.f248455b;
                wt80 wt80Var3 = w6sVar.f248454a;
                bga.m29073P(objM56684z);
                djs0Var3 = djs0Var7;
                t5m0Var3 = t5m0Var8;
                n95Var3 = n95Var7;
                wt80Var2 = wt80Var3;
                rwt0Var3 = rwt0Var7;
                u6j0Var3 = u6j0Var6;
                str2 = str8;
                obj = objM56684z;
                concurrentHashMap3 = concurrentHashMap2;
                v3e1 v3e1Var = (v3e1) obj;
                t3e1Var = v3e1Var.f236842a;
                z = v3e1Var.f236843b;
                if (t3e1Var == null) {
                    if (z) {
                        wj50.m88279p(str2);
                        return m28397c(str2, pmwVar5);
                    }
                    wj50.m88279p(str2);
                    n95Var3.m63896D(str2, lauVar2);
                    return m28397c(str2, pmwVar4);
                }
                str3 = t3e1Var.f216758a;
                z3l0Var = t3e1Var.f216759b;
                qu80Var = (qu80) concurrentHashMap3.get(str3);
                if (qu80Var != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (qu80Var == null) {
                    w6sVar.f248454a = wt80Var2;
                    w6sVar.f248455b = t5m0Var3;
                    w6sVar.f248456c = n95Var3;
                    w6sVar.f248457d = u6j0Var3;
                    t5m0Var5 = t5m0Var3;
                    w6sVar.f248458e = null;
                    w6sVar.f248459f = djs0Var3;
                    w6sVar.f248460g = rwt0Var3;
                    w6sVar.f248461h = concurrentHashMap3;
                    w6sVar.f248462i = str2;
                    w6sVar.f248463t = str3;
                    w6sVar.f248451X = z3l0Var;
                    w6sVar.f248452Y = z;
                    w6sVar.f248453Z = i;
                    w6sVar.f248450M0 = 3;
                    objM28399e = m28399e(str3, w6sVar, wt80Var2);
                    if (objM28399e != yukVar) {
                        z3 = z;
                        obj2 = objM28399e;
                        t5m0Var6 = t5m0Var5;
                        n95Var5 = n95Var3;
                        u6j0Var5 = u6j0Var3;
                        djs0Var5 = djs0Var3;
                        rwt0Var5 = rwt0Var3;
                        concurrentHashMap5 = concurrentHashMap3;
                        str5 = str2;
                        str4 = str3;
                        z3l0Var3 = z3l0Var;
                        qu80Var3 = (qu80) obj2;
                        if (qu80Var3 == null) {
                            wj50.m88279p(str5);
                            return m28397c(str5, pmwVar5);
                        }
                        concurrentHashMap5.put(str4, qu80Var3);
                        qu80Var2 = qu80Var3;
                        t5m0Var4 = t5m0Var6;
                        z2 = z3;
                        i2 = i;
                        z3l0Var2 = z3l0Var3;
                        u6j0Var4 = u6j0Var5;
                        djs0Var4 = djs0Var5;
                        rwt0Var4 = rwt0Var5;
                        concurrentHashMap4 = concurrentHashMap5;
                        n95Var4 = n95Var5;
                        lauVar = lauVar2;
                        it = qu80Var2.f192598d.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            it2 = it;
                            if (wj50.m88271j(((nw80) next).f159049c, str5)) {
                                break;
                                break;
                            }
                            it = it2;
                        }
                        nw80Var = (nw80) next;
                        if (nw80Var == null) {
                            nw80Var2 = nw80Var;
                            if (nw80Var2 == null) {
                                wj50.m88279p(str5);
                                n95Var4.m63896D(str5, lauVar);
                                return m28397c(str5, pmwVar4);
                            }
                            pmwVar = pmwVar4;
                            Map map = nw80Var2.f159053g;
                            t5m0Var4.getClass();
                            list = t5m0.m80117g(map).f218568b;
                            arrayList = new ArrayList(i6f.m49804T(list, 10));
                            it3 = list.iterator();
                            while (true) {
                                list2 = list;
                                if (!it3.hasNext()) {
                                    break;
                                    break;
                                }
                                String str9 = ((c3e1) it3.next()).f33664a;
                                u6j0 u6j0Var7 = u6j0Var4;
                                String str10 = z3l0Var2.f278978a;
                                pmw pmwVar6 = pmwVar;
                                String str11 = z3l0Var2.f278979b;
                                u6j0Var7.getClass();
                                arrayList.add(u6j0.m82448m((str11 + "/" + str10 + "/" + str9).getBytes(vuc.f244913a)));
                                u6j0Var4 = u6j0Var7;
                                it3 = it3;
                                list = list2;
                                pmwVar = pmwVar6;
                            }
                            pmwVar2 = pmwVar;
                            wj50.m88279p(str5);
                            n95Var4.m63896D(str5, arrayList);
                            arrayList2 = new ArrayList();
                            it4 = list2.iterator();
                            while (it4.hasNext()) {
                                next2 = it4.next();
                                Iterator it6 = it4;
                                if (!n95Var4.m63900k(str5, u6j0.m82448m(rbz.m75190h(z3l0Var2.f278979b, "/", z3l0Var2.f278978a, "/", ((c3e1) next2).f33664a).getBytes(vuc.f244913a))).exists()) {
                                    arrayList2.add(next2);
                                }
                                it4 = it6;
                            }
                            mm0 mm0Var = new mm0(arrayList2, upz0.m83743a(8), z3l0Var2, str5, n95Var4, djs0Var4, rwt0Var4, (fbk) null);
                            w6sVar.f248454a = null;
                            w6sVar.f248455b = null;
                            w6sVar.f248456c = null;
                            w6sVar.f248457d = null;
                            w6sVar.f248458e = null;
                            w6sVar.f248459f = null;
                            w6sVar.f248460g = null;
                            w6sVar.f248461h = null;
                            w6sVar.f248462i = str5;
                            w6sVar.f248463t = null;
                            w6sVar.f248451X = null;
                            w6sVar.f248452Y = z2;
                            w6sVar.f248453Z = i2;
                            w6sVar.f248450M0 = 5;
                            objM56684z = kk40.m56684z(mm0Var, w6sVar);
                            if (objM56684z != yukVar) {
                                str6 = str5;
                            }
                        } else {
                            nw80Var2 = nw80Var;
                            if (nw80Var2 == null) {
                                wj50.m88279p(str5);
                                n95Var4.m63896D(str5, lauVar);
                                return m28397c(str5, pmwVar4);
                            }
                            pmwVar = pmwVar4;
                            Map map2 = nw80Var2.f159053g;
                            t5m0Var4.getClass();
                            list = t5m0.m80117g(map2).f218568b;
                            arrayList = new ArrayList(i6f.m49804T(list, 10));
                            it3 = list.iterator();
                            while (true) {
                                list2 = list;
                                if (!it3.hasNext()) {
                                    break;
                                    break;
                                }
                                String str12 = ((c3e1) it3.next()).f33664a;
                                u6j0 u6j0Var8 = u6j0Var4;
                                String str13 = z3l0Var2.f278978a;
                                pmw pmwVar7 = pmwVar;
                                String str14 = z3l0Var2.f278979b;
                                u6j0Var8.getClass();
                                arrayList.add(u6j0.m82448m((str14 + "/" + str13 + "/" + str12).getBytes(vuc.f244913a)));
                                u6j0Var4 = u6j0Var8;
                                it3 = it3;
                                list = list2;
                                pmwVar = pmwVar7;
                            }
                            pmwVar2 = pmwVar;
                            wj50.m88279p(str5);
                            n95Var4.m63896D(str5, arrayList);
                            arrayList2 = new ArrayList();
                            it4 = list2.iterator();
                            while (it4.hasNext()) {
                                next2 = it4.next();
                                Iterator it7 = it4;
                                if (!n95Var4.m63900k(str5, u6j0.m82448m(rbz.m75190h(z3l0Var2.f278979b, "/", z3l0Var2.f278978a, "/", ((c3e1) next2).f33664a).getBytes(vuc.f244913a))).exists()) {
                                    arrayList2.add(next2);
                                }
                                it4 = it7;
                            }
                            mm0 mm0Var2 = new mm0(arrayList2, upz0.m83743a(8), z3l0Var2, str5, n95Var4, djs0Var4, rwt0Var4, (fbk) null);
                            w6sVar.f248454a = null;
                            w6sVar.f248455b = null;
                            w6sVar.f248456c = null;
                            w6sVar.f248457d = null;
                            w6sVar.f248458e = null;
                            w6sVar.f248459f = null;
                            w6sVar.f248460g = null;
                            w6sVar.f248461h = null;
                            w6sVar.f248462i = str5;
                            w6sVar.f248463t = null;
                            w6sVar.f248451X = null;
                            w6sVar.f248452Y = z2;
                            w6sVar.f248453Z = i2;
                            w6sVar.f248450M0 = 5;
                            objM56684z = kk40.m56684z(mm0Var2, w6sVar);
                            if (objM56684z != yukVar) {
                                str6 = str5;
                            }
                        }
                    }
                } else {
                    t5m0 t5m0Var9 = t5m0Var3;
                    int i6 = i;
                    z3l0Var2 = z3l0Var;
                    i2 = i6;
                    String str15 = str2;
                    str4 = str3;
                    u6j0Var4 = u6j0Var3;
                    rwt0Var4 = rwt0Var3;
                    n95Var4 = n95Var3;
                    djs0Var4 = djs0Var3;
                    concurrentHashMap4 = concurrentHashMap3;
                    str5 = str15;
                    z2 = z;
                    t5m0Var4 = t5m0Var9;
                    lauVar = lauVar2;
                    qu80Var2 = qu80Var;
                    it = qu80Var2.f192598d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        it2 = it;
                        if (wj50.m88271j(((nw80) next).f159049c, str5)) {
                            break;
                            break;
                        }
                        it = it2;
                    }
                    nw80Var = (nw80) next;
                    if (nw80Var == null) {
                        nw80Var2 = nw80Var;
                        if (nw80Var2 == null) {
                            wj50.m88279p(str5);
                            n95Var4.m63896D(str5, lauVar);
                            return m28397c(str5, pmwVar4);
                        }
                        pmwVar = pmwVar4;
                        Map map3 = nw80Var2.f159053g;
                        t5m0Var4.getClass();
                        list = t5m0.m80117g(map3).f218568b;
                        arrayList = new ArrayList(i6f.m49804T(list, 10));
                        it3 = list.iterator();
                        while (true) {
                            list2 = list;
                            if (!it3.hasNext()) {
                                break;
                                break;
                            }
                            String str16 = ((c3e1) it3.next()).f33664a;
                            u6j0 u6j0Var9 = u6j0Var4;
                            String str17 = z3l0Var2.f278978a;
                            pmw pmwVar8 = pmwVar;
                            String str18 = z3l0Var2.f278979b;
                            u6j0Var9.getClass();
                            arrayList.add(u6j0.m82448m((str18 + "/" + str17 + "/" + str16).getBytes(vuc.f244913a)));
                            u6j0Var4 = u6j0Var9;
                            it3 = it3;
                            list = list2;
                            pmwVar = pmwVar8;
                        }
                        pmwVar2 = pmwVar;
                        wj50.m88279p(str5);
                        n95Var4.m63896D(str5, arrayList);
                        arrayList2 = new ArrayList();
                        it4 = list2.iterator();
                        while (it4.hasNext()) {
                            next2 = it4.next();
                            Iterator it8 = it4;
                            if (!n95Var4.m63900k(str5, u6j0.m82448m(rbz.m75190h(z3l0Var2.f278979b, "/", z3l0Var2.f278978a, "/", ((c3e1) next2).f33664a).getBytes(vuc.f244913a))).exists()) {
                                arrayList2.add(next2);
                            }
                            it4 = it8;
                        }
                        mm0 mm0Var3 = new mm0(arrayList2, upz0.m83743a(8), z3l0Var2, str5, n95Var4, djs0Var4, rwt0Var4, (fbk) null);
                        w6sVar.f248454a = null;
                        w6sVar.f248455b = null;
                        w6sVar.f248456c = null;
                        w6sVar.f248457d = null;
                        w6sVar.f248458e = null;
                        w6sVar.f248459f = null;
                        w6sVar.f248460g = null;
                        w6sVar.f248461h = null;
                        w6sVar.f248462i = str5;
                        w6sVar.f248463t = null;
                        w6sVar.f248451X = null;
                        w6sVar.f248452Y = z2;
                        w6sVar.f248453Z = i2;
                        w6sVar.f248450M0 = 5;
                        objM56684z = kk40.m56684z(mm0Var3, w6sVar);
                        if (objM56684z != yukVar) {
                            str6 = str5;
                        }
                    } else {
                        nw80Var2 = nw80Var;
                        if (nw80Var2 == null) {
                            wj50.m88279p(str5);
                            n95Var4.m63896D(str5, lauVar);
                            return m28397c(str5, pmwVar4);
                        }
                        pmwVar = pmwVar4;
                        Map map4 = nw80Var2.f159053g;
                        t5m0Var4.getClass();
                        list = t5m0.m80117g(map4).f218568b;
                        arrayList = new ArrayList(i6f.m49804T(list, 10));
                        it3 = list.iterator();
                        while (true) {
                            list2 = list;
                            if (!it3.hasNext()) {
                                break;
                                break;
                            }
                            String str19 = ((c3e1) it3.next()).f33664a;
                            u6j0 u6j0Var10 = u6j0Var4;
                            String str110 = z3l0Var2.f278978a;
                            pmw pmwVar9 = pmwVar;
                            String str111 = z3l0Var2.f278979b;
                            u6j0Var10.getClass();
                            arrayList.add(u6j0.m82448m((str111 + "/" + str110 + "/" + str19).getBytes(vuc.f244913a)));
                            u6j0Var4 = u6j0Var10;
                            it3 = it3;
                            list = list2;
                            pmwVar = pmwVar9;
                        }
                        pmwVar2 = pmwVar;
                        wj50.m88279p(str5);
                        n95Var4.m63896D(str5, arrayList);
                        arrayList2 = new ArrayList();
                        it4 = list2.iterator();
                        while (it4.hasNext()) {
                            next2 = it4.next();
                            Iterator it9 = it4;
                            if (!n95Var4.m63900k(str5, u6j0.m82448m(rbz.m75190h(z3l0Var2.f278979b, "/", z3l0Var2.f278978a, "/", ((c3e1) next2).f33664a).getBytes(vuc.f244913a))).exists()) {
                                arrayList2.add(next2);
                            }
                            it4 = it9;
                        }
                        mm0 mm0Var4 = new mm0(arrayList2, upz0.m83743a(8), z3l0Var2, str5, n95Var4, djs0Var4, rwt0Var4, (fbk) null);
                        w6sVar.f248454a = null;
                        w6sVar.f248455b = null;
                        w6sVar.f248456c = null;
                        w6sVar.f248457d = null;
                        w6sVar.f248458e = null;
                        w6sVar.f248459f = null;
                        w6sVar.f248460g = null;
                        w6sVar.f248461h = null;
                        w6sVar.f248462i = str5;
                        w6sVar.f248463t = null;
                        w6sVar.f248451X = null;
                        w6sVar.f248452Y = z2;
                        w6sVar.f248453Z = i2;
                        w6sVar.f248450M0 = 5;
                        objM56684z = kk40.m56684z(mm0Var4, w6sVar);
                        if (objM56684z != yukVar) {
                            str6 = str5;
                        }
                    }
                }
                return yukVar;
            }
            if (i5 == 3) {
                int i7 = w6sVar.f248453Z;
                z3 = w6sVar.f248452Y;
                z3l0Var3 = w6sVar.f248451X;
                String str20 = w6sVar.f248463t;
                String str21 = w6sVar.f248462i;
                ConcurrentHashMap concurrentHashMap6 = w6sVar.f248461h;
                rwt0 rwt0Var8 = w6sVar.f248460g;
                djs0 djs0Var8 = w6sVar.f248459f;
                u6j0 u6j0Var11 = w6sVar.f248457d;
                n95 n95Var8 = w6sVar.f248456c;
                t5m0Var6 = w6sVar.f248455b;
                wt80 wt80Var4 = w6sVar.f248454a;
                bga.m29073P(objM56684z);
                wt80Var2 = wt80Var4;
                obj2 = objM56684z;
                n95Var5 = n95Var8;
                u6j0Var5 = u6j0Var11;
                djs0Var5 = djs0Var8;
                rwt0Var5 = rwt0Var8;
                concurrentHashMap5 = concurrentHashMap6;
                str5 = str21;
                str4 = str20;
                pmwVar4 = pmwVar4;
                i = i7;
                qu80Var3 = (qu80) obj2;
                if (qu80Var3 == null) {
                    wj50.m88279p(str5);
                    return m28397c(str5, pmwVar5);
                }
                concurrentHashMap5.put(str4, qu80Var3);
                qu80Var2 = qu80Var3;
                t5m0Var4 = t5m0Var6;
                z2 = z3;
                i2 = i;
                z3l0Var2 = z3l0Var3;
                u6j0Var4 = u6j0Var5;
                djs0Var4 = djs0Var5;
                rwt0Var4 = rwt0Var5;
                concurrentHashMap4 = concurrentHashMap5;
                n95Var4 = n95Var5;
                lauVar = lauVar2;
                it = qu80Var2.f192598d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    it2 = it;
                    if (wj50.m88271j(((nw80) next).f159049c, str5)) {
                        break;
                    }
                    it = it2;
                }
                nw80Var = (nw80) next;
                if (nw80Var == null || i2 == 0) {
                    nw80Var2 = nw80Var;
                    if (nw80Var2 == null) {
                        wj50.m88279p(str5);
                        n95Var4.m63896D(str5, lauVar);
                        return m28397c(str5, pmwVar4);
                    }
                    pmwVar = pmwVar4;
                    Map map5 = nw80Var2.f159053g;
                    t5m0Var4.getClass();
                    list = t5m0.m80117g(map5).f218568b;
                    arrayList = new ArrayList(i6f.m49804T(list, 10));
                    it3 = list.iterator();
                    while (true) {
                        list2 = list;
                        if (!it3.hasNext()) {
                            break;
                            break;
                        }
                        String str112 = ((c3e1) it3.next()).f33664a;
                        u6j0 u6j0Var12 = u6j0Var4;
                        String str113 = z3l0Var2.f278978a;
                        pmw pmwVar10 = pmwVar;
                        String str114 = z3l0Var2.f278979b;
                        u6j0Var12.getClass();
                        arrayList.add(u6j0.m82448m((str114 + "/" + str113 + "/" + str112).getBytes(vuc.f244913a)));
                        u6j0Var4 = u6j0Var12;
                        it3 = it3;
                        list = list2;
                        pmwVar = pmwVar10;
                    }
                    pmwVar2 = pmwVar;
                    wj50.m88279p(str5);
                    n95Var4.m63896D(str5, arrayList);
                    arrayList2 = new ArrayList();
                    it4 = list2.iterator();
                    while (it4.hasNext()) {
                        next2 = it4.next();
                        Iterator it10 = it4;
                        if (!n95Var4.m63900k(str5, u6j0.m82448m(rbz.m75190h(z3l0Var2.f278979b, "/", z3l0Var2.f278978a, "/", ((c3e1) next2).f33664a).getBytes(vuc.f244913a))).exists()) {
                            arrayList2.add(next2);
                        }
                        it4 = it10;
                    }
                    mm0 mm0Var5 = new mm0(arrayList2, upz0.m83743a(8), z3l0Var2, str5, n95Var4, djs0Var4, rwt0Var4, (fbk) null);
                    w6sVar.f248454a = null;
                    w6sVar.f248455b = null;
                    w6sVar.f248456c = null;
                    w6sVar.f248457d = null;
                    w6sVar.f248458e = null;
                    w6sVar.f248459f = null;
                    w6sVar.f248460g = null;
                    w6sVar.f248461h = null;
                    w6sVar.f248462i = str5;
                    w6sVar.f248463t = null;
                    w6sVar.f248451X = null;
                    w6sVar.f248452Y = z2;
                    w6sVar.f248453Z = i2;
                    w6sVar.f248450M0 = 5;
                    objM56684z = kk40.m56684z(mm0Var5, w6sVar);
                    if (objM56684z != yukVar) {
                        str6 = str5;
                    }
                } else {
                    w6sVar.f248454a = null;
                    w6sVar.f248455b = t5m0Var4;
                    w6sVar.f248456c = n95Var4;
                    w6sVar.f248457d = u6j0Var4;
                    w6sVar.f248458e = null;
                    w6sVar.f248459f = djs0Var4;
                    w6sVar.f248460g = rwt0Var4;
                    w6sVar.f248461h = concurrentHashMap4;
                    w6sVar.f248462i = str5;
                    w6sVar.f248463t = str4;
                    w6sVar.f248451X = z3l0Var2;
                    w6sVar.f248452Y = z2;
                    w6sVar.f248453Z = i2;
                    w6sVar.f248450M0 = 4;
                    Object objM28399e2 = m28399e(str4, w6sVar, wt80Var2);
                    if (objM28399e2 != yukVar) {
                        int i8 = i2;
                        t5m0Var7 = t5m0Var4;
                        obj3 = objM28399e2;
                        i3 = i8;
                        z3l0Var4 = z3l0Var2;
                        qu80Var4 = (qu80) obj3;
                        if (qu80Var4 == null) {
                            wj50.m88279p(str5);
                            return m28397c(str5, pmwVar5);
                        }
                        concurrentHashMap4.put(str4, qu80Var4);
                        it5 = qu80Var4.f192598d.iterator();
                        do {
                            if (it5.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it5.next();
                        } while (!wj50.m88271j(((nw80) next3).f159049c, str5));
                        nw80Var = (nw80) next3;
                        t5m0Var4 = t5m0Var7;
                        i2 = i3;
                        z3l0Var2 = z3l0Var4;
                        nw80Var2 = nw80Var;
                        if (nw80Var2 == null) {
                            wj50.m88279p(str5);
                            n95Var4.m63896D(str5, lauVar);
                            return m28397c(str5, pmwVar4);
                        }
                        pmwVar = pmwVar4;
                        Map map6 = nw80Var2.f159053g;
                        t5m0Var4.getClass();
                        list = t5m0.m80117g(map6).f218568b;
                        arrayList = new ArrayList(i6f.m49804T(list, 10));
                        it3 = list.iterator();
                        while (true) {
                            list2 = list;
                            if (!it3.hasNext()) {
                                break;
                                break;
                            }
                            String str115 = ((c3e1) it3.next()).f33664a;
                            u6j0 u6j0Var13 = u6j0Var4;
                            String str116 = z3l0Var2.f278978a;
                            pmw pmwVar11 = pmwVar;
                            String str117 = z3l0Var2.f278979b;
                            u6j0Var13.getClass();
                            arrayList.add(u6j0.m82448m((str117 + "/" + str116 + "/" + str115).getBytes(vuc.f244913a)));
                            u6j0Var4 = u6j0Var13;
                            it3 = it3;
                            list = list2;
                            pmwVar = pmwVar11;
                        }
                        pmwVar2 = pmwVar;
                        wj50.m88279p(str5);
                        n95Var4.m63896D(str5, arrayList);
                        arrayList2 = new ArrayList();
                        it4 = list2.iterator();
                        while (it4.hasNext()) {
                            next2 = it4.next();
                            Iterator it11 = it4;
                            if (!n95Var4.m63900k(str5, u6j0.m82448m(rbz.m75190h(z3l0Var2.f278979b, "/", z3l0Var2.f278978a, "/", ((c3e1) next2).f33664a).getBytes(vuc.f244913a))).exists()) {
                                arrayList2.add(next2);
                            }
                            it4 = it11;
                        }
                        mm0 mm0Var6 = new mm0(arrayList2, upz0.m83743a(8), z3l0Var2, str5, n95Var4, djs0Var4, rwt0Var4, (fbk) null);
                        w6sVar.f248454a = null;
                        w6sVar.f248455b = null;
                        w6sVar.f248456c = null;
                        w6sVar.f248457d = null;
                        w6sVar.f248458e = null;
                        w6sVar.f248459f = null;
                        w6sVar.f248460g = null;
                        w6sVar.f248461h = null;
                        w6sVar.f248462i = str5;
                        w6sVar.f248463t = null;
                        w6sVar.f248451X = null;
                        w6sVar.f248452Y = z2;
                        w6sVar.f248453Z = i2;
                        w6sVar.f248450M0 = 5;
                        objM56684z = kk40.m56684z(mm0Var6, w6sVar);
                        if (objM56684z != yukVar) {
                            str6 = str5;
                        }
                    }
                }
                return yukVar;
            }
            if (i5 == 4) {
                int i9 = w6sVar.f248453Z;
                z2 = w6sVar.f248452Y;
                z3l0Var4 = w6sVar.f248451X;
                str4 = w6sVar.f248463t;
                str5 = w6sVar.f248462i;
                concurrentHashMap4 = w6sVar.f248461h;
                rwt0Var4 = w6sVar.f248460g;
                djs0Var4 = w6sVar.f248459f;
                u6j0Var4 = w6sVar.f248457d;
                n95Var4 = w6sVar.f248456c;
                t5m0 t5m0Var10 = w6sVar.f248455b;
                bga.m29073P(objM56684z);
                t5m0Var7 = t5m0Var10;
                obj3 = objM56684z;
                lauVar = lauVar2;
                i3 = i9;
                pmwVar4 = pmwVar4;
                qu80Var4 = (qu80) obj3;
                if (qu80Var4 == null) {
                    wj50.m88279p(str5);
                    return m28397c(str5, pmwVar5);
                }
                concurrentHashMap4.put(str4, qu80Var4);
                it5 = qu80Var4.f192598d.iterator();
                do {
                    if (it5.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it5.next();
                } while (!wj50.m88271j(((nw80) next3).f159049c, str5));
                nw80Var = (nw80) next3;
                t5m0Var4 = t5m0Var7;
                i2 = i3;
                z3l0Var2 = z3l0Var4;
                nw80Var2 = nw80Var;
                if (nw80Var2 == null) {
                    wj50.m88279p(str5);
                    n95Var4.m63896D(str5, lauVar);
                    return m28397c(str5, pmwVar4);
                }
                pmwVar = pmwVar4;
                Map map7 = nw80Var2.f159053g;
                t5m0Var4.getClass();
                list = t5m0.m80117g(map7).f218568b;
                arrayList = new ArrayList(i6f.m49804T(list, 10));
                it3 = list.iterator();
                while (true) {
                    list2 = list;
                    if (!it3.hasNext()) {
                        break;
                    }
                    String str118 = ((c3e1) it3.next()).f33664a;
                    u6j0 u6j0Var14 = u6j0Var4;
                    String str119 = z3l0Var2.f278978a;
                    pmw pmwVar12 = pmwVar;
                    String str1110 = z3l0Var2.f278979b;
                    u6j0Var14.getClass();
                    arrayList.add(u6j0.m82448m((str1110 + "/" + str119 + "/" + str118).getBytes(vuc.f244913a)));
                    u6j0Var4 = u6j0Var14;
                    it3 = it3;
                    list = list2;
                    pmwVar = pmwVar12;
                }
                pmwVar2 = pmwVar;
                wj50.m88279p(str5);
                n95Var4.m63896D(str5, arrayList);
                arrayList2 = new ArrayList();
                it4 = list2.iterator();
                while (it4.hasNext()) {
                    next2 = it4.next();
                    Iterator it12 = it4;
                    if (!n95Var4.m63900k(str5, u6j0.m82448m(rbz.m75190h(z3l0Var2.f278979b, "/", z3l0Var2.f278978a, "/", ((c3e1) next2).f33664a).getBytes(vuc.f244913a))).exists()) {
                        arrayList2.add(next2);
                    }
                    it4 = it12;
                }
                mm0 mm0Var7 = new mm0(arrayList2, upz0.m83743a(8), z3l0Var2, str5, n95Var4, djs0Var4, rwt0Var4, (fbk) null);
                w6sVar.f248454a = null;
                w6sVar.f248455b = null;
                w6sVar.f248456c = null;
                w6sVar.f248457d = null;
                w6sVar.f248458e = null;
                w6sVar.f248459f = null;
                w6sVar.f248460g = null;
                w6sVar.f248461h = null;
                w6sVar.f248462i = str5;
                w6sVar.f248463t = null;
                w6sVar.f248451X = null;
                w6sVar.f248452Y = z2;
                w6sVar.f248453Z = i2;
                w6sVar.f248450M0 = 5;
                objM56684z = kk40.m56684z(mm0Var7, w6sVar);
                if (objM56684z != yukVar) {
                    str6 = str5;
                }
                return yukVar;
            }
            if (i5 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str6 = w6sVar.f248462i;
            bga.m29073P(objM56684z);
            pmwVar2 = pmwVar4;
        }
        zBooleanValue = ((Boolean) objM56684z).booleanValue();
        wj50.m88279p(str6);
        if (zBooleanValue) {
            pmwVar3 = pmwVar2;
        } else {
            pmwVar3 = pmwVar5;
        }
        return m28397c(str6, pmwVar3);
        List list3 = (List) objM85381b;
        if (list3 == null) {
            wj50.m88279p(str);
            return m28397c(str, pmwVar5);
        }
        w6sVar.f248454a = wt80Var2;
        w6sVar.f248455b = t5m0Var2;
        w6sVar.f248456c = n95Var2;
        w6sVar.f248457d = u6j0Var2;
        w6sVar.f248458e = null;
        w6sVar.f248459f = djs0Var2;
        w6sVar.f248460g = rwt0Var2;
        w6sVar.f248461h = concurrentHashMap2;
        w6sVar.f248462i = str;
        w6sVar.f248450M0 = 2;
        Object objM28400f = m28400f(list3, wt80Var2, kr00Var2, w6sVar);
        if (objM28400f != yukVar) {
            t5m0 t5m0Var11 = t5m0Var2;
            n95Var3 = n95Var2;
            t5m0Var3 = t5m0Var11;
            rwt0Var3 = rwt0Var2;
            u6j0Var3 = u6j0Var2;
            djs0Var3 = djs0Var2;
            obj = objM28400f;
            str2 = str;
            concurrentHashMap3 = concurrentHashMap2;
            v3e1 v3e1Var2 = (v3e1) obj;
            t3e1Var = v3e1Var2.f236842a;
            z = v3e1Var2.f236843b;
            if (t3e1Var == null) {
                if (z) {
                    wj50.m88279p(str2);
                    return m28397c(str2, pmwVar5);
                }
                wj50.m88279p(str2);
                n95Var3.m63896D(str2, lauVar2);
                return m28397c(str2, pmwVar4);
            }
            str3 = t3e1Var.f216758a;
            z3l0Var = t3e1Var.f216759b;
            qu80Var = (qu80) concurrentHashMap3.get(str3);
            if (qu80Var != null) {
                i = 1;
            } else {
                i = 0;
            }
            if (qu80Var == null) {
                w6sVar.f248454a = wt80Var2;
                w6sVar.f248455b = t5m0Var3;
                w6sVar.f248456c = n95Var3;
                w6sVar.f248457d = u6j0Var3;
                t5m0Var5 = t5m0Var3;
                w6sVar.f248458e = null;
                w6sVar.f248459f = djs0Var3;
                w6sVar.f248460g = rwt0Var3;
                w6sVar.f248461h = concurrentHashMap3;
                w6sVar.f248462i = str2;
                w6sVar.f248463t = str3;
                w6sVar.f248451X = z3l0Var;
                w6sVar.f248452Y = z;
                w6sVar.f248453Z = i;
                w6sVar.f248450M0 = 3;
                objM28399e = m28399e(str3, w6sVar, wt80Var2);
                if (objM28399e != yukVar) {
                    z3 = z;
                    obj2 = objM28399e;
                    t5m0Var6 = t5m0Var5;
                    n95Var5 = n95Var3;
                    u6j0Var5 = u6j0Var3;
                    djs0Var5 = djs0Var3;
                    rwt0Var5 = rwt0Var3;
                    concurrentHashMap5 = concurrentHashMap3;
                    str5 = str2;
                    str4 = str3;
                    z3l0Var3 = z3l0Var;
                    qu80Var3 = (qu80) obj2;
                    if (qu80Var3 == null) {
                        wj50.m88279p(str5);
                        return m28397c(str5, pmwVar5);
                    }
                    concurrentHashMap5.put(str4, qu80Var3);
                    qu80Var2 = qu80Var3;
                    t5m0Var4 = t5m0Var6;
                    z2 = z3;
                    i2 = i;
                    z3l0Var2 = z3l0Var3;
                    u6j0Var4 = u6j0Var5;
                    djs0Var4 = djs0Var5;
                    rwt0Var4 = rwt0Var5;
                    concurrentHashMap4 = concurrentHashMap5;
                    n95Var4 = n95Var5;
                    lauVar = lauVar2;
                    it = qu80Var2.f192598d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        it2 = it;
                        if (wj50.m88271j(((nw80) next).f159049c, str5)) {
                            break;
                            break;
                        }
                        it = it2;
                    }
                    nw80Var = (nw80) next;
                    if (nw80Var == null) {
                        nw80Var2 = nw80Var;
                        if (nw80Var2 == null) {
                            wj50.m88279p(str5);
                            n95Var4.m63896D(str5, lauVar);
                            return m28397c(str5, pmwVar4);
                        }
                        pmwVar = pmwVar4;
                        Map map8 = nw80Var2.f159053g;
                        t5m0Var4.getClass();
                        list = t5m0.m80117g(map8).f218568b;
                        arrayList = new ArrayList(i6f.m49804T(list, 10));
                        it3 = list.iterator();
                        while (true) {
                            list2 = list;
                            if (!it3.hasNext()) {
                                break;
                                break;
                            }
                            String str1111 = ((c3e1) it3.next()).f33664a;
                            u6j0 u6j0Var15 = u6j0Var4;
                            String str1112 = z3l0Var2.f278978a;
                            pmw pmwVar13 = pmwVar;
                            String str1113 = z3l0Var2.f278979b;
                            u6j0Var15.getClass();
                            arrayList.add(u6j0.m82448m((str1113 + "/" + str1112 + "/" + str1111).getBytes(vuc.f244913a)));
                            u6j0Var4 = u6j0Var15;
                            it3 = it3;
                            list = list2;
                            pmwVar = pmwVar13;
                        }
                        pmwVar2 = pmwVar;
                        wj50.m88279p(str5);
                        n95Var4.m63896D(str5, arrayList);
                        arrayList2 = new ArrayList();
                        it4 = list2.iterator();
                        while (it4.hasNext()) {
                            next2 = it4.next();
                            Iterator it13 = it4;
                            if (!n95Var4.m63900k(str5, u6j0.m82448m(rbz.m75190h(z3l0Var2.f278979b, "/", z3l0Var2.f278978a, "/", ((c3e1) next2).f33664a).getBytes(vuc.f244913a))).exists()) {
                                arrayList2.add(next2);
                            }
                            it4 = it13;
                        }
                        mm0 mm0Var8 = new mm0(arrayList2, upz0.m83743a(8), z3l0Var2, str5, n95Var4, djs0Var4, rwt0Var4, (fbk) null);
                        w6sVar.f248454a = null;
                        w6sVar.f248455b = null;
                        w6sVar.f248456c = null;
                        w6sVar.f248457d = null;
                        w6sVar.f248458e = null;
                        w6sVar.f248459f = null;
                        w6sVar.f248460g = null;
                        w6sVar.f248461h = null;
                        w6sVar.f248462i = str5;
                        w6sVar.f248463t = null;
                        w6sVar.f248451X = null;
                        w6sVar.f248452Y = z2;
                        w6sVar.f248453Z = i2;
                        w6sVar.f248450M0 = 5;
                        objM56684z = kk40.m56684z(mm0Var8, w6sVar);
                        if (objM56684z != yukVar) {
                            str6 = str5;
                            zBooleanValue = ((Boolean) objM56684z).booleanValue();
                            wj50.m88279p(str6);
                            if (zBooleanValue) {
                                pmwVar3 = pmwVar2;
                            } else {
                                pmwVar3 = pmwVar5;
                            }
                            return m28397c(str6, pmwVar3);
                        }
                    } else {
                        nw80Var2 = nw80Var;
                        if (nw80Var2 == null) {
                            wj50.m88279p(str5);
                            n95Var4.m63896D(str5, lauVar);
                            return m28397c(str5, pmwVar4);
                        }
                        pmwVar = pmwVar4;
                        Map map9 = nw80Var2.f159053g;
                        t5m0Var4.getClass();
                        list = t5m0.m80117g(map9).f218568b;
                        arrayList = new ArrayList(i6f.m49804T(list, 10));
                        it3 = list.iterator();
                        while (true) {
                            list2 = list;
                            if (!it3.hasNext()) {
                                break;
                                break;
                            }
                            String str1114 = ((c3e1) it3.next()).f33664a;
                            u6j0 u6j0Var16 = u6j0Var4;
                            String str1115 = z3l0Var2.f278978a;
                            pmw pmwVar14 = pmwVar;
                            String str1116 = z3l0Var2.f278979b;
                            u6j0Var16.getClass();
                            arrayList.add(u6j0.m82448m((str1116 + "/" + str1115 + "/" + str1114).getBytes(vuc.f244913a)));
                            u6j0Var4 = u6j0Var16;
                            it3 = it3;
                            list = list2;
                            pmwVar = pmwVar14;
                        }
                        pmwVar2 = pmwVar;
                        wj50.m88279p(str5);
                        n95Var4.m63896D(str5, arrayList);
                        arrayList2 = new ArrayList();
                        it4 = list2.iterator();
                        while (it4.hasNext()) {
                            next2 = it4.next();
                            Iterator it14 = it4;
                            if (!n95Var4.m63900k(str5, u6j0.m82448m(rbz.m75190h(z3l0Var2.f278979b, "/", z3l0Var2.f278978a, "/", ((c3e1) next2).f33664a).getBytes(vuc.f244913a))).exists()) {
                                arrayList2.add(next2);
                            }
                            it4 = it14;
                        }
                        mm0 mm0Var9 = new mm0(arrayList2, upz0.m83743a(8), z3l0Var2, str5, n95Var4, djs0Var4, rwt0Var4, (fbk) null);
                        w6sVar.f248454a = null;
                        w6sVar.f248455b = null;
                        w6sVar.f248456c = null;
                        w6sVar.f248457d = null;
                        w6sVar.f248458e = null;
                        w6sVar.f248459f = null;
                        w6sVar.f248460g = null;
                        w6sVar.f248461h = null;
                        w6sVar.f248462i = str5;
                        w6sVar.f248463t = null;
                        w6sVar.f248451X = null;
                        w6sVar.f248452Y = z2;
                        w6sVar.f248453Z = i2;
                        w6sVar.f248450M0 = 5;
                        objM56684z = kk40.m56684z(mm0Var9, w6sVar);
                        if (objM56684z != yukVar) {
                            str6 = str5;
                            zBooleanValue = ((Boolean) objM56684z).booleanValue();
                            wj50.m88279p(str6);
                            if (zBooleanValue) {
                                pmwVar3 = pmwVar2;
                            } else {
                                pmwVar3 = pmwVar5;
                            }
                            return m28397c(str6, pmwVar3);
                        }
                    }
                }
            } else {
                t5m0 t5m0Var12 = t5m0Var3;
                int i10 = i;
                z3l0Var2 = z3l0Var;
                i2 = i10;
                String str120 = str2;
                str4 = str3;
                u6j0Var4 = u6j0Var3;
                rwt0Var4 = rwt0Var3;
                n95Var4 = n95Var3;
                djs0Var4 = djs0Var3;
                concurrentHashMap4 = concurrentHashMap3;
                str5 = str120;
                z2 = z;
                t5m0Var4 = t5m0Var12;
                lauVar = lauVar2;
                qu80Var2 = qu80Var;
                it = qu80Var2.f192598d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    it2 = it;
                    if (wj50.m88271j(((nw80) next).f159049c, str5)) {
                        break;
                        break;
                    }
                    it = it2;
                }
                nw80Var = (nw80) next;
                if (nw80Var == null) {
                    nw80Var2 = nw80Var;
                    if (nw80Var2 == null) {
                        wj50.m88279p(str5);
                        n95Var4.m63896D(str5, lauVar);
                        return m28397c(str5, pmwVar4);
                    }
                    pmwVar = pmwVar4;
                    Map map10 = nw80Var2.f159053g;
                    t5m0Var4.getClass();
                    list = t5m0.m80117g(map10).f218568b;
                    arrayList = new ArrayList(i6f.m49804T(list, 10));
                    it3 = list.iterator();
                    while (true) {
                        list2 = list;
                        if (!it3.hasNext()) {
                            break;
                            break;
                        }
                        String str1117 = ((c3e1) it3.next()).f33664a;
                        u6j0 u6j0Var17 = u6j0Var4;
                        String str1118 = z3l0Var2.f278978a;
                        pmw pmwVar15 = pmwVar;
                        String str1119 = z3l0Var2.f278979b;
                        u6j0Var17.getClass();
                        arrayList.add(u6j0.m82448m((str1119 + "/" + str1118 + "/" + str1117).getBytes(vuc.f244913a)));
                        u6j0Var4 = u6j0Var17;
                        it3 = it3;
                        list = list2;
                        pmwVar = pmwVar15;
                    }
                    pmwVar2 = pmwVar;
                    wj50.m88279p(str5);
                    n95Var4.m63896D(str5, arrayList);
                    arrayList2 = new ArrayList();
                    it4 = list2.iterator();
                    while (it4.hasNext()) {
                        next2 = it4.next();
                        Iterator it15 = it4;
                        if (!n95Var4.m63900k(str5, u6j0.m82448m(rbz.m75190h(z3l0Var2.f278979b, "/", z3l0Var2.f278978a, "/", ((c3e1) next2).f33664a).getBytes(vuc.f244913a))).exists()) {
                            arrayList2.add(next2);
                        }
                        it4 = it15;
                    }
                    mm0 mm0Var10 = new mm0(arrayList2, upz0.m83743a(8), z3l0Var2, str5, n95Var4, djs0Var4, rwt0Var4, (fbk) null);
                    w6sVar.f248454a = null;
                    w6sVar.f248455b = null;
                    w6sVar.f248456c = null;
                    w6sVar.f248457d = null;
                    w6sVar.f248458e = null;
                    w6sVar.f248459f = null;
                    w6sVar.f248460g = null;
                    w6sVar.f248461h = null;
                    w6sVar.f248462i = str5;
                    w6sVar.f248463t = null;
                    w6sVar.f248451X = null;
                    w6sVar.f248452Y = z2;
                    w6sVar.f248453Z = i2;
                    w6sVar.f248450M0 = 5;
                    objM56684z = kk40.m56684z(mm0Var10, w6sVar);
                    if (objM56684z != yukVar) {
                        str6 = str5;
                        zBooleanValue = ((Boolean) objM56684z).booleanValue();
                        wj50.m88279p(str6);
                        if (zBooleanValue) {
                            pmwVar3 = pmwVar2;
                        } else {
                            pmwVar3 = pmwVar5;
                        }
                        return m28397c(str6, pmwVar3);
                    }
                } else {
                    nw80Var2 = nw80Var;
                    if (nw80Var2 == null) {
                        wj50.m88279p(str5);
                        n95Var4.m63896D(str5, lauVar);
                        return m28397c(str5, pmwVar4);
                    }
                    pmwVar = pmwVar4;
                    Map map11 = nw80Var2.f159053g;
                    t5m0Var4.getClass();
                    list = t5m0.m80117g(map11).f218568b;
                    arrayList = new ArrayList(i6f.m49804T(list, 10));
                    it3 = list.iterator();
                    while (true) {
                        list2 = list;
                        if (!it3.hasNext()) {
                            break;
                            break;
                        }
                        String str11110 = ((c3e1) it3.next()).f33664a;
                        u6j0 u6j0Var18 = u6j0Var4;
                        String str11111 = z3l0Var2.f278978a;
                        pmw pmwVar16 = pmwVar;
                        String str11112 = z3l0Var2.f278979b;
                        u6j0Var18.getClass();
                        arrayList.add(u6j0.m82448m((str11112 + "/" + str11111 + "/" + str11110).getBytes(vuc.f244913a)));
                        u6j0Var4 = u6j0Var18;
                        it3 = it3;
                        list = list2;
                        pmwVar = pmwVar16;
                    }
                    pmwVar2 = pmwVar;
                    wj50.m88279p(str5);
                    n95Var4.m63896D(str5, arrayList);
                    arrayList2 = new ArrayList();
                    it4 = list2.iterator();
                    while (it4.hasNext()) {
                        next2 = it4.next();
                        Iterator it16 = it4;
                        if (!n95Var4.m63900k(str5, u6j0.m82448m(rbz.m75190h(z3l0Var2.f278979b, "/", z3l0Var2.f278978a, "/", ((c3e1) next2).f33664a).getBytes(vuc.f244913a))).exists()) {
                            arrayList2.add(next2);
                        }
                        it4 = it16;
                    }
                    mm0 mm0Var11 = new mm0(arrayList2, upz0.m83743a(8), z3l0Var2, str5, n95Var4, djs0Var4, rwt0Var4, (fbk) null);
                    w6sVar.f248454a = null;
                    w6sVar.f248455b = null;
                    w6sVar.f248456c = null;
                    w6sVar.f248457d = null;
                    w6sVar.f248458e = null;
                    w6sVar.f248459f = null;
                    w6sVar.f248460g = null;
                    w6sVar.f248461h = null;
                    w6sVar.f248462i = str5;
                    w6sVar.f248463t = null;
                    w6sVar.f248451X = null;
                    w6sVar.f248452Y = z2;
                    w6sVar.f248453Z = i2;
                    w6sVar.f248450M0 = 5;
                    objM56684z = kk40.m56684z(mm0Var11, w6sVar);
                    if (objM56684z != yukVar) {
                        str6 = str5;
                        zBooleanValue = ((Boolean) objM56684z).booleanValue();
                        wj50.m88279p(str6);
                        if (zBooleanValue) {
                            pmwVar3 = pmwVar2;
                        } else {
                            pmwVar3 = pmwVar5;
                        }
                        return m28397c(str6, pmwVar3);
                    }
                }
            }
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: e */
    public static final Object m28399e(String str, ibk ibkVar, wt80 wt80Var) {
        y6s y6sVar;
        if (ibkVar instanceof y6s) {
            y6sVar = (y6s) ibkVar;
            int i = y6sVar.f269895b;
            if ((i & Integer.MIN_VALUE) != 0) {
                y6sVar.f269895b = i - Integer.MIN_VALUE;
            } else {
                y6sVar = new y6s(ibkVar);
            }
        } else {
            y6sVar = new y6s(ibkVar);
        }
        Object objM62841f = y6sVar.f269894a;
        int i2 = y6sVar.f269895b;
        if (i2 == 0) {
            bga.m29073P(objM62841f);
            st80 st80Var = new st80(f24375a, null, null, false, null, a5u0.f12598a, null, 0, null, 478);
            y6sVar.f269895b = 1;
            objM62841f = ((mu80) wt80Var).m62841f(str, st80Var, y6sVar);
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
        p2x0 p2x0Var = (p2x0) objM62841f;
        if (p2x0Var instanceof k2x0) {
            return null;
        }
        if (p2x0Var instanceof m2x0) {
            return (qu80) ((m2x0) p2x0Var).f139474a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:23:0x0065 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:38:0x008d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0091  */
    /* JADX WARN: Code duplicated, block: B:42:0x0095  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0066 -> B:25:0x006b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: f */
    public static final java.lang.Object m28400f(java.util.List r7, p204p.wt80 r8, p204p.kr00 r9, p204p.ibk r10) {
        /*
            boolean r0 = r10 instanceof p204p.z6s
            if (r0 == 0) goto L13
            r0 = r10
            p.z6s r0 = (p204p.z6s) r0
            int r1 = r0.f279986g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f279986g = r1
            goto L18
        L13:
            p.z6s r0 = new p.z6s
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f279985f
            int r1 = r0.f279986g
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 != r3) goto L30
            int r7 = r0.f279984e
            java.lang.String r8 = r0.f279983d
            java.util.Iterator r9 = r0.f279982c
            p.kr00 r1 = r0.f279981b
            p.wt80 r4 = r0.f279980a
            p204p.bga.m29073P(r10)     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> L9d
            goto L6b
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            p204p.bga.m29073P(r10)
            java.util.Iterator r7 = r7.iterator()
            r10 = r9
            r9 = r7
            r7 = r2
        L42:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L9f
            java.lang.Object r1 = r9.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.getClass()     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L9d
            r0.f279980a = r8     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L9d
            r0.f279981b = r10     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L9d
            r0.f279982c = r9     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L9d
            r0.f279983d = r1     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L9d
            r0.f279984e = r7     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L9d
            r0.f279986g = r3     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L9d
            java.lang.Object r4 = p204p.vfp0.m85380a(r1, r8, r10, r0)     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L9d
            p.yuk r5 = p204p.yuk.f276404a
            if (r4 != r5) goto L66
            return r5
        L66:
            r6 = r4
            r4 = r8
            r8 = r1
            r1 = r10
            r10 = r6
        L6b:
            p.pge r10 = (p204p.pge) r10     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> L9d
            goto L73
        L6e:
            r4 = r8
            r8 = r1
            r1 = r10
        L71:
            p.mge r10 = p204p.mge.f143450a
        L73:
            boolean r5 = r10 instanceof p204p.oge
            if (r5 == 0) goto L89
            p.v3e1 r9 = new p.v3e1
            p.t3e1 r0 = new p.t3e1
            p.oge r10 = (p204p.oge) r10
            p.z3l0 r10 = r10.f165105a
            r0.<init>(r8, r10)
            if (r7 == 0) goto L85
            r2 = r3
        L85:
            r9.<init>(r0, r2)
            return r9
        L89:
            boolean r8 = r10 instanceof p204p.nge
            if (r8 != 0) goto L9b
            boolean r7 = r10 instanceof p204p.mge
            if (r7 == 0) goto L95
            r10 = r1
            r7 = r3
        L93:
            r8 = r4
            goto L42
        L95:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L9b:
            r10 = r1
            goto L93
        L9d:
            r7 = move-exception
            throw r7
        L9f:
            p.v3e1 r8 = new p.v3e1
            if (r7 == 0) goto La4
            r2 = r3
        La4:
            r7 = 0
            r8.<init>(r7, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.b7s.m28400f(java.util.List, p.wt80, p.kr00, p.ibk):java.lang.Object");
    }
}
