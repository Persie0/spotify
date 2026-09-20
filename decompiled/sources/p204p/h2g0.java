package p204p;

import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import com.spotify.playlistmixing.endpoints.MixingReorderingError;
import com.spotify.playlistmixing.proto.C1221a;
import com.spotify.playlistmixing.proto.C1222b;
import com.spotify.playlistmixing.proto.C1223c;
import com.spotify.playlistmixing.proto.C1224d;
import com.spotify.playlistmixing.proto.C1225e;
import com.spotify.playlistmixing.proto.C1226f;
import com.spotify.playlistmixing.proto.Chain;
import com.spotify.playlistmixing.proto.Chains;
import com.spotify.playlistmixing.proto.Exclusions;
import com.spotify.playlistmixing.proto.HarmonizeRequestBody;
import com.spotify.playlistmixing.proto.HarmonizeResponseBody;
import com.spotify.playlistmixing.proto.HarmonizeSaveRequestBody;
import com.spotify.playlistmixing.proto.ManualOps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class h2g0 implements d2g0 {

    /* JADX INFO: renamed from: a */
    public final wt80 f86971a;

    /* JADX INFO: renamed from: b */
    public final yz80 f86972b;

    /* JADX INFO: renamed from: c */
    public final j2g0 f86973c;

    /* JADX INFO: renamed from: d */
    public final fjf0 f86974d;

    public h2g0(wt80 wt80Var, yz80 yz80Var, j2g0 j2g0Var, fjf0 fjf0Var) {
        this.f86971a = wt80Var;
        this.f86972b = yz80Var;
        this.f86973c = j2g0Var;
        this.f86974d = fjf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m46488a(h2g0 h2g0Var, String str, String str2, List list, List list2, List list3, List list4, ibk ibkVar) throws MixingReorderingError.RevisionConflict, MixingReorderingError.ReorderFailed {
        e2g0 e2g0Var;
        if (ibkVar instanceof e2g0) {
            e2g0Var = (e2g0) ibkVar;
            int i = e2g0Var.f55467c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e2g0Var.f55467c = i - Integer.MIN_VALUE;
            } else {
                e2g0Var = new e2g0(h2g0Var, ibkVar);
            }
        } else {
            e2g0Var = new e2g0(h2g0Var, ibkVar);
        }
        Object objM52219b = e2g0Var.f55465a;
        int i2 = e2g0Var.f55467c;
        if (i2 == 0) {
            bga.m29073P(objM52219b);
            mgx mgxVarM19384o = Exclusions.m19384o();
            ArrayList arrayList = new ArrayList(i6f.m49804T(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(l6l.m58361j((String) it.next()));
            }
            mgxVarM19384o.m61733m(arrayList);
            Exclusions exclusions = (Exclusions) mgxVarM19384o.build();
            Chains chainsM46490e = m46490e(list3);
            ManualOps manualOpsM46489b = m46489b(list, list2);
            cd20 cd20VarM19405s = HarmonizeSaveRequestBody.m19405s();
            cd20VarM19405s.m32338t(str2);
            cd20VarM19405s.m32335q(str);
            cd20VarM19405s.m32336r(exclusions);
            cd20VarM19405s.m32334m(chainsM46490e);
            cd20VarM19405s.m32337s(manualOpsM46489b);
            HarmonizeSaveRequestBody harmonizeSaveRequestBody = (HarmonizeSaveRequestBody) cd20VarM19405s.build();
            j2g0 j2g0Var = h2g0Var.f86973c;
            wj50.m88279p(harmonizeSaveRequestBody);
            e2g0Var.f55467c = 1;
            objM52219b = j2g0Var.m52219b(harmonizeSaveRequestBody, e2g0Var);
            yuk yukVar = yuk.f276404a;
            if (objM52219b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM52219b);
        }
        n2x0 n2x0Var = ((o2x0) objM52219b).f161171a;
        if (n2x0Var.f149852O0) {
            return w2a1.f247311a;
        }
        if (n2x0Var.f149860d == 409) {
            throw MixingReorderingError.RevisionConflict.f6468a;
        }
        throw MixingReorderingError.ReorderFailed.f6467a;
    }

    /* JADX INFO: renamed from: b */
    public static ManualOps m46489b(List list, List list2) {
        C1225e c1225eM19419o = ManualOps.PreOps.m19419o();
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m46491f((lvf0) it.next()));
        }
        c1225eM19419o.m19450m(arrayList);
        ManualOps.PreOps preOps = (ManualOps.PreOps) c1225eM19419o.build();
        C1224d c1224dM19417o = ManualOps.PostOps.m19417o();
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(m46491f((lvf0) it2.next()));
        }
        c1224dM19417o.m19449m(arrayList2);
        ManualOps.PostOps postOps = (ManualOps.PostOps) c1224dM19417o.build();
        C1221a c1221aM19408p = ManualOps.m19408p();
        c1221aM19408p.m19443q(preOps);
        c1221aM19408p.m19442m(postOps);
        return (ManualOps) c1221aM19408p.build();
    }

    /* JADX INFO: renamed from: e */
    public static Chains m46490e(List list) {
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List list2 = (List) it.next();
            zic zicVarM19376o = Chain.m19376o();
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(l6l.m58361j((String) it2.next()));
            }
            zicVarM19376o.m96203m(arrayList2);
            arrayList.add((Chain) zicVarM19376o.build());
        }
        kjc kjcVarM19378o = Chains.m19378o();
        kjcVarM19378o.m56561m(arrayList);
        return (Chains) kjcVarM19378o.build();
    }

    /* JADX INFO: renamed from: f */
    public static ManualOps.C1220Op m46491f(lvf0 lvf0Var) {
        if (!(lvf0Var instanceof jvf0)) {
            if (!(lvf0Var instanceof kvf0)) {
                throw new NoWhenBranchMatchedException();
            }
            C1223c c1223cM19415p = ManualOps.C1220Op.m19415p();
            C1226f c1226fM19421o = ManualOps.Remove.m19421o();
            c1226fM19421o.m19451m(l6l.m58361j(((kvf0) lvf0Var).f126858a));
            c1223cM19415p.m19448q(c1226fM19421o);
            return (ManualOps.C1220Op) c1223cM19415p.build();
        }
        C1223c c1223cM19415p2 = ManualOps.C1220Op.m19415p();
        C1222b c1222bM19412q = ManualOps.Move.m19412q();
        jvf0 jvf0Var = (jvf0) lvf0Var;
        c1222bM19412q.m19445q(l6l.m58361j(jvf0Var.f116345a));
        c1222bM19412q.m19446r(l6l.m58361j(jvf0Var.f116346b));
        c1222bM19412q.m19444m(jvf0Var.f116347c);
        c1223cM19415p2.m19447m(c1222bM19412q);
        return (ManualOps.C1220Op) c1223cM19415p2.build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m46492c(String str, List list, List list2, List list3, ibk ibkVar) {
        f2g0 f2g0Var;
        Object c6x0Var;
        if (ibkVar instanceof f2g0) {
            f2g0Var = (f2g0) ibkVar;
            int i = f2g0Var.f65191c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f2g0Var.f65191c = i - Integer.MIN_VALUE;
            } else {
                f2g0Var = new f2g0(this, ibkVar);
            }
        } else {
            f2g0Var = new f2g0(this, ibkVar);
        }
        Object objM52218a = f2g0Var.f65189a;
        int i2 = f2g0Var.f65191c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM52218a);
                mgx mgxVarM19384o = Exclusions.m19384o();
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(l6l.m58361j((String) it.next()));
                }
                mgxVarM19384o.m61733m(arrayList);
                Exclusions exclusions = (Exclusions) mgxVarM19384o.build();
                Chains chainsM46490e = m46490e(list2);
                ManualOps manualOpsM46489b = m46489b(list3, lau.f131415a);
                ad20 ad20VarM19397r = HarmonizeRequestBody.m19397r();
                ad20VarM19397r.m25507s(str);
                ad20VarM19397r.m25505q(exclusions);
                ad20VarM19397r.m25504m(chainsM46490e);
                ad20VarM19397r.m25506r(manualOpsM46489b);
                HarmonizeRequestBody harmonizeRequestBody = (HarmonizeRequestBody) ad20VarM19397r.build();
                j2g0 j2g0Var = this.f86973c;
                wj50.m88279p(harmonizeRequestBody);
                f2g0Var.f65191c = 1;
                objM52218a = j2g0Var.m52218a(harmonizeRequestBody, f2g0Var);
                yuk yukVar = yuk.f276404a;
                if (objM52218a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM52218a);
            }
            HarmonizeResponseBody harmonizeResponseBody = (HarmonizeResponseBody) ((o2x0) objM52218a).f161172b;
            if (harmonizeResponseBody == null) {
                throw MixingReorderingError.ReorderFailed.f6467a;
            }
            ae50<gva> ae50VarM19399o = harmonizeResponseBody.m19399o();
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM19399o, 10));
            for (gva gvaVar : ae50VarM19399o) {
                wj50.m88279p(gvaVar);
                arrayList2.add(bk5.m29591N0(gvaVar.m45891s(), e6u.f56732L0, 30));
            }
            c6x0Var = new bd20(arrayList2, harmonizeResponseBody.m19398n());
            if (s6x0.m77348a(c6x0Var) == null) {
                return c6x0Var;
            }
            try {
                throw MixingReorderingError.ReorderFailed.f6467a;
            } catch (Throwable th) {
                return new c6x0(th);
            }
        } catch (Throwable th2) {
            c6x0Var = new c6x0(th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ef A[Catch: all -> 0x00f3, TryCatch #0 {all -> 0x00f3, blocks: (B:43:0x00eb, B:45:0x00ef, B:52:0x00fb, B:51:0x00f9), top: B:55:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f9 A[Catch: all -> 0x00f3, TryCatch #0 {all -> 0x00f3, blocks: (B:43:0x00eb, B:45:0x00ef, B:52:0x00fb, B:51:0x00f9), top: B:55:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
    
        if (((p204p.n090) r0).m63326w(r5, r2, r12) == r15) goto L33;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m46493d(String str, String str2, List list, List list2, List list3, List list4, List list5, ibk ibkVar) {
        g2g0 g2g0Var;
        MixingReorderingError.RevisionConflict revisionConflict;
        Object c6x0Var;
        Throwable thM77348a;
        MixingReorderingError.RevisionConflict revisionConflict2;
        yuk yukVar;
        h2g0 h2g0Var;
        int i;
        String str3 = str2;
        if (ibkVar instanceof g2g0) {
            g2g0Var = (g2g0) ibkVar;
            int i2 = g2g0Var.f75929f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g2g0Var.f75929f = i2 - Integer.MIN_VALUE;
            } else {
                g2g0Var = new g2g0(this, ibkVar);
            }
        } else {
            g2g0Var = new g2g0(this, ibkVar);
        }
        g2g0 g2g0Var2 = g2g0Var;
        Object objM76980u = g2g0Var2.f75927d;
        int i3 = g2g0Var2.f75929f;
        yuk yukVar2 = yuk.f276404a;
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    i = g2g0Var2.f75926c;
                    h2g0Var = g2g0Var2.f75925b;
                    str3 = g2g0Var2.f75924a;
                    bga.m29073P(objM76980u);
                    yukVar = yukVar2;
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM76980u);
                }
                revisionConflict = null;
                c6x0Var = w2a1.f247311a;
                thM77348a = s6x0.m77348a(c6x0Var);
                if (thM77348a == null) {
                    return c6x0Var;
                }
                try {
                    if (thM77348a instanceof MixingReorderingError.RevisionConflict) {
                        revisionConflict2 = (MixingReorderingError.RevisionConflict) thM77348a;
                    } else {
                        revisionConflict2 = revisionConflict;
                    }
                    if (revisionConflict2 != null) {
                        throw revisionConflict2;
                    }
                    throw MixingReorderingError.ReorderFailed.f6467a;
                } catch (Throwable th) {
                    return new c6x0(th);
                }
            }
            bga.m29073P(objM76980u);
            top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
            ktp0 ktp0VarM18427E = PlaylistTrackDecorationPolicy.m18427E();
            ktp0VarM18427E.m57344B();
            top0VarM18421v.m81218z(ktp0VarM18427E);
            PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
            a5u0 a5u0Var = a5u0.f12598a;
            wj50.m88279p(playlistRequestDecorationPolicy);
            fiz fizVarM62846k = ((mu80) this.f86971a).m62846k(str3, new st80(playlistRequestDecorationPolicy, null, null, false, i2g0.f97840a, a5u0Var, null, 0, null, 462));
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            long j = this.f86974d.f70276u;
            yukVar = yukVar2;
            ly2 ly2Var = new ly2(fizVarM62846k, atomicBoolean, this, str, str3, list4, list5, list3, list2, list, null);
            g2g0Var2.f75924a = str3;
            g2g0Var2.f75925b = this;
            g2g0Var2.f75926c = 0;
            g2g0Var2.f75929f = 1;
            objM76980u = s1h1.m76980u(j, ly2Var, g2g0Var2);
            if (objM76980u != yukVar) {
                h2g0Var = this;
                i = 0;
            }
            return yukVar;
            if (((p2x0) objM76980u) == null) {
                yz80 yz80Var = h2g0Var.f86972b;
                rg61 rg61Var = rg61.f198872f;
                revisionConflict = null;
                try {
                    g2g0Var2.f75924a = null;
                    g2g0Var2.f75925b = null;
                    g2g0Var2.f75926c = i;
                    g2g0Var2.f75929f = 2;
                } catch (Throwable th2) {
                    th = th2;
                    c6x0Var = new c6x0(th);
                }
            } else {
                revisionConflict = null;
            }
            c6x0Var = w2a1.f247311a;
        } catch (Throwable th3) {
            th = th3;
            revisionConflict = null;
        }
        thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a == null) {
            return c6x0Var;
        }
        if (thM77348a instanceof MixingReorderingError.RevisionConflict) {
            revisionConflict2 = (MixingReorderingError.RevisionConflict) thM77348a;
        } else {
            revisionConflict2 = revisionConflict;
        }
        if (revisionConflict2 != null) {
            throw revisionConflict2;
        }
        throw MixingReorderingError.ReorderFailed.f6467a;
    }
}
