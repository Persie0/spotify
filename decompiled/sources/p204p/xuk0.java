package p204p;

import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.music.R;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.internal.AccountAttribute;
import com.spotify.remoteconfig.internal.ProductStateProto;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class xuk0 implements Function, Predicate, dn6, ant, diq0, Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f266126a;

    /* JADX INFO: renamed from: b */
    public final Object f266127b;

    public /* synthetic */ xuk0(Object obj, int i) {
        this.f266126a = i;
        this.f266127b = obj;
    }

    /* JADX INFO: renamed from: a */
    public boolean m92195a() {
        IOException e;
        boolean z;
        Properties properties = new Properties();
        boolean z2 = false;
        try {
            try {
                pwy pwyVarM60518q = ((jiq0) this.f266127b).f102622a.m60518q(m92196b());
                try {
                    properties.load(pwyVarM60518q);
                    z = true;
                    try {
                        pwyVarM60518q.close();
                        return true;
                    } catch (FileNotFoundException unused) {
                        z2 = true;
                        return z2;
                    } catch (IOException e2) {
                        e = e2;
                        Logger.m3967c(e, "", new Object[0]);
                        return z;
                    }
                } catch (Throwable th) {
                    try {
                        pwyVarM60518q.close();
                    } catch (Throwable th2) {
                        try {
                            th.addSuppressed(th2);
                        } catch (IOException e3) {
                            e = e3;
                            z = false;
                            Logger.m3967c(e, "", new Object[0]);
                            return z;
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused2) {
            }
        } catch (IOException e4) {
            e = e4;
        }
    }

    /* JADX WARN: Type inference failed for: r1v89, types: [java.lang.Object, java.util.Collection] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v26 java.lang.Object, still in use, count: 2, list:
          (r6v26 java.lang.Object) from 0x0272: PHI (r6 I:??) = (r6v23 java.lang.Object), (r6v26 java.lang.Object) binds: [B:69:0x0271, B:125:0x0272] A[DONT_GENERATE, DONT_INLINE]
          (r6v26 java.lang.Object) from 0x0264: CHECK_CAST (p.axx) (r6v26 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public java.lang.Object mo98394apply(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.xuk0.mo98394apply(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public String m92196b() {
        m12 m12Var = ((jiq0) this.f266127b).f102622a;
        if (((ewy) m12Var.mo28560n("/oem/etc/spotify.preload")).f63623b.exists()) {
            return "/oem/etc/spotify.preload";
        }
        if (((ewy) m12Var.mo28560n("/product/etc/spotify.preload")).f63623b.exists()) {
            return "/product/etc/spotify.preload";
        }
        return ((ewy) m12Var.mo28560n("/data/etc/appchannel/spotify.preload")).f63623b.exists() ? "/data/etc/appchannel/spotify.preload" : "/system/etc/spotify.preload";
    }

    /* JADX INFO: renamed from: c */
    public String m92197c(String str) {
        Properties properties = new Properties();
        try {
            pwy pwyVarM60518q = ((jiq0) this.f266127b).f102622a.m60518q(m92196b());
            try {
                properties.load(pwyVarM60518q);
                pwyVarM60518q.close();
            } catch (Throwable th) {
                try {
                    pwyVarM60518q.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException unused) {
        } catch (IOException e) {
            Logger.m3967c(e, "", new Object[0]);
        }
        return properties.getProperty(str, "");
    }

    /* JADX INFO: renamed from: d */
    public byte[] m92198d() {
        return ((ProductStateProto) this.f266127b).toByteArray();
    }

    /* JADX INFO: renamed from: e */
    public LinkedHashMap m92199e() {
        tlr0 plr0Var;
        String strValueOf;
        Map mapM20417o = ((ProductStateProto) this.f266127b).m20417o();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(mapM20417o.size()));
        Iterator it = mapM20417o.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            plr0Var = slr0.f210473a;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            AccountAttribute accountAttribute = (AccountAttribute) entry.getValue();
            int iM20413s = accountAttribute.m20413s();
            int i = iM20413s == 0 ? -1 : ikr0.f103195a[edb.m38547C(iM20413s)];
            if (i == 1) {
                plr0Var = new plr0(accountAttribute.getBoolValue());
            } else if (i == 2) {
                plr0Var = new qlr0(accountAttribute.m20412r());
            } else if (i == 3) {
                plr0Var = new rlr0(accountAttribute.getStringValue());
            }
            linkedHashMap.put(key, plr0Var);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (!wj50.m88271j(entry2.getValue(), plr0Var)) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(c95.m31820L(linkedHashMap2.size()));
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Object key2 = entry3.getKey();
            tlr0 tlr0Var = (tlr0) entry3.getValue();
            if (tlr0Var instanceof plr0) {
                strValueOf = ((plr0) tlr0Var).f178776a ? "1" : "0";
            } else if (tlr0Var instanceof qlr0) {
                strValueOf = String.valueOf(((qlr0) tlr0Var).f189905a);
            } else {
                if (!(tlr0Var instanceof rlr0)) {
                    if (wj50.m88271j(tlr0Var, plr0Var)) {
                        throw new IllegalStateException("ValueNotSet");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                strValueOf = ((rlr0) tlr0Var).f200358a;
            }
            linkedHashMap3.put(key2, strValueOf);
        }
        return linkedHashMap3;
    }

    @Override // p204p.dn6
    /* JADX INFO: renamed from: g */
    public Single mo25091g(Intent intent, e301 e301Var) {
        Maybe maybe;
        e1q0 e1q0Var = (e1q0) this.f266127b;
        Set set = dd41.f47702f;
        dd41 dd41VarM74726U = r46.m74726U(intent.getDataString());
        String strM37565e = e1q0.m37565e(dd41VarM74726U);
        Map map = (Map) x0h1.m89581x(dau.f47107a, new onm0(e1q0Var, (fbk) null, 21));
        if (!dxf1.m37244s("has-podcasts-available", map) && !dxf1.m37246v(map)) {
            return Single.just(e1q0.m37566f());
        }
        t1w t1wVar = (t1w) e1q0Var.f55238d;
        String strM35694A = dd41VarM74726U.m35694A();
        if (!dd41VarM74726U.m35725w() || strM35694A == null) {
            maybe = MaybeEmpty.f8264a;
        } else {
            maybe = ((jpx) t1wVar.f216363a).m53978b(new C1668ai("GatedContentRouter", false, (gh00) new jss(strM35694A, 23))).flatMap(new nps(11, strM35694A, t1wVar)).firstOrError().toMaybe();
        }
        return maybe.m23366c(new mww0(strM37565e)).observeOn((Scheduler) e1q0Var.f55236b).map(new iqp0(strM37565e, dd41VarM74726U, e1q0Var, intent, e301Var, 1));
    }

    @Override // com.spotify.mobius.functions.Producer
    public Object get() {
        return new DispatcherWorker(((zqt0) this.f266127b).f285458e);
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        Set set = (Set) obj;
        l5q0 l5q0Var = (l5q0) this.f266127b;
        wj50.m88279p(set);
        MobiusLoop mobiusLoop = l5q0Var.f129993b;
        if (mobiusLoop != null) {
            mobiusLoop.m15600a(new h5q0(set));
        } else {
            wj50.m88260d0("loop");
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        pj70 pj70Var = ((eap0) this.f266127b).f57709c;
        pj70Var.getClass();
        return pj70Var.m70128i(playerState.contextUri(), pqo0.m70678r(playerState));
    }

    public xuk0(d7m0 d7m0Var, a5j0 a5j0Var, xv41 xv41Var) {
        int i;
        String str;
        cbf0 cbf0VarM35556a;
        v140 v140Var;
        this.f266126a = 6;
        String str2 = d7m0Var.f46240a;
        dbf0 dbf0VarM38368c = ((ebf0) xv41Var.getValue()).m38368c(v140.class, str2);
        String str3 = (dbf0VarM38368c == null || (cbf0VarM35556a = dbf0VarM38368c.m35556a()) == null || (v140Var = (v140) cbf0VarM35556a.f36107a) == null || (str3 = v140Var.f236243a) == null) ? "" : str3;
        List<c7m0> list = d7m0Var.f46241b;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        for (c7m0 c7m0Var : list) {
            List list2 = c7m0Var.f34949b;
            int i2 = c7m0Var.f34948a;
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(list2, 10));
            int i3 = 0;
            for (Object obj : list2) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    h6f.m46722S();
                    throw null;
                }
                a7m0 a7m0Var = (a7m0) obj;
                kkm0 kkm0Var = (kkm0) ((vdm) a5j0Var.f12530c).m85260z().get(a7m0Var.f13102a);
                if (kkm0Var == null) {
                    throw new IllegalStateException(edb.m38564m("Missing SectionRegistration for section ", a7m0Var.f13102a.name()));
                }
                arrayList2.add(kkm0Var.f123632b.mo25043a(i3, d7m0Var.f46240a, xv41Var));
                i3 = i4;
            }
            Context context = (Context) a5j0Var.f12529b;
            switch (i2) {
                case 1:
                    i = R.string.author_tab_title;
                    break;
                case 2:
                    i = R.string.artist_music_tab_title;
                    break;
                case 3:
                    i = R.string.artist_events_tab_title;
                    break;
                case 4:
                    i = R.string.artist_merch_tab_title;
                    break;
                case 5:
                    i = R.string.artist_clips_tab_title;
                    break;
                case 6:
                    i = R.string.artist_video_tab_title;
                    break;
                default:
                    throw null;
            }
            String string = context.getString(i);
            switch (i2) {
                case 1:
                    str = "Author";
                    break;
                case 2:
                    str = "Music";
                    break;
                case 3:
                    str = "Events";
                    break;
                case 4:
                    str = "Merch";
                    break;
                case 5:
                    str = "Clips";
                    break;
                case 6:
                    str = "Video";
                    break;
                default:
                    throw null;
            }
            arrayList.add(new hkm0(string, str.toLowerCase(Locale.US), arrayList2));
        }
        this.f266127b = new ikm0(str2, str3, arrayList);
    }
}
