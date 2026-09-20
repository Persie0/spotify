package p204p;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.google.protobuf.Duration;
import com.spotify.agentstories.p017v1.GetStoriesRequest;
import com.spotify.microsoftcontinuity.events.proto.MicrosoftContinuityConnected;
import com.spotify.microsoftcontinuity.events.proto.MicrosoftContinuityError;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import spotify.progress_playback_esperanto.proto.ProgressPlaybackEsperanto$OnUpdateRequest;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto$GetResumePointRequest;

/* JADX INFO: loaded from: classes8.dex */
public final class suj implements Function, rdc1 {

    /* JADX INFO: renamed from: a */
    public Object f214135a;

    /* JADX INFO: renamed from: b */
    public Object f214136b;

    /* JADX INFO: renamed from: c */
    public Object f214137c;

    public /* synthetic */ suj(Object obj, Object obj2, Object obj3) {
        this.f214135a = obj;
        this.f214136b = obj2;
        this.f214137c = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m79389c(suj sujVar, List list, fbk fbkVar) {
        kil kilVar;
        Object dnn0Var;
        int i;
        if (fbkVar instanceof kil) {
            kilVar = (kil) fbkVar;
            int i2 = kilVar.f123008c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kilVar.f123008c = i2 - Integer.MIN_VALUE;
            } else {
                kilVar = new kil(sujVar, fbkVar);
            }
        } else {
            kilVar = new kil(sujVar, fbkVar);
        }
        Object objM76073a = kilVar.f123006a;
        int i3 = kilVar.f123008c;
        try {
            if (i3 == 0) {
                bga.m29073P(objM76073a);
                ron0 ron0Var = (ron0) sujVar.f214135a;
                kilVar.f123008c = 1;
                objM76073a = ron0.m76073a(ron0Var, list, "creator_page_permission", kilVar);
                yuk yukVar = yuk.f276404a;
                if (objM76073a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM76073a);
            }
            for (pob pobVar : (List) objM76073a) {
                if (pobVar.f179664b || (i = pobVar.f179665c) == 4) {
                    dnn0Var = bnn0.f28897a;
                } else {
                    boolean z = i == 3;
                    wl6 wl6Var = pobVar.f179666d;
                    dnn0Var = new dnn0(z, wl6Var != null ? wl6Var.f252474a : 0);
                }
                lqi0 lqi0Var = (lqi0) ((ConcurrentHashMap) sujVar.f214136b).get(pobVar.f179663a);
                if (lqi0Var != null) {
                    ((zv41) lqi0Var).m97091m(null, dnn0Var);
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            na6.m63972t("Failed to check age assurance permissions for creator page", e2);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: a */
    public void m79390a(String str, c4m c4mVar, gh00 gh00Var, gh00 gh00Var2, eh00 eh00Var, xq00 xq00Var, int i) {
        Object jq9Var;
        o7h0 o7h0Var;
        Object obj;
        suj sujVar;
        gku gkuVar;
        xq00Var.m91775k0(-602349349);
        int i2 = i | (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91770i(c4mVar) ? 32 : 16) | (xq00Var.m91770i(gh00Var) ? 256 : 128) | (xq00Var.m91770i(gh00Var2) ? 2048 : 1024) | (xq00Var.m91770i(eh00Var) ? 16384 : 8192) | (xq00Var.m91770i(this) ? 131072 : 65536);
        if (xq00Var.m91752Y(i2 & 1, (74899 & i2) != 74898)) {
            Object objM91750T = xq00Var.m91750T();
            Object obj2 = t6x0.f217647t;
            if (objM91750T == obj2) {
                objM91750T = hz40.m49254z(dau.f47107a, xq00Var);
                xq00Var.m91793t0(objM91750T);
            }
            xuk xukVar = (xuk) objM91750T;
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == obj2) {
                objM91750T2 = new o7h0();
                xq00Var.m91793t0(objM91750T2);
            }
            o7h0 o7h0Var2 = (o7h0) objM91750T2;
            boolean zM91770i = xq00Var.m91770i(this) | xq00Var.m91770i(o7h0Var2);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91770i || objM91750T3 == obj2) {
                objM91750T3 = new qhk(this, o7h0Var2, null, 11);
                xq00Var.m91793t0(objM91750T3);
            }
            hz40.m49237i(w2a1.f247311a, (th00) objM91750T3, xq00Var);
            String strM54977L = k0e1.m54977L(R.string.curation_education_dialog_title, xq00Var);
            String strM54977L2 = k0e1.m54977L(c4mVar.mo24705a(), xq00Var);
            String strM54977L3 = k0e1.m54977L(R.string.curation_education_curation_confirmation_dialog_secondary_button, xq00Var);
            int i3 = i2 & 14;
            int i4 = i2 & 57344;
            boolean zM91770i2 = xq00Var.m91770i(this) | xq00Var.m91770i(o7h0Var2) | (i3 == 4) | xq00Var.m91770i(xukVar) | (i4 == 16384) | ((i2 & 7168) == 2048);
            Object objM91750T4 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T4 == obj2) {
                o7h0Var = o7h0Var2;
                obj = obj2;
                sujVar = this;
                jq9Var = new jq9(sujVar, o7h0Var, str, xukVar, eh00Var, gh00Var2);
                xq00Var.m91793t0(jq9Var);
            } else {
                jq9Var = objM91750T4;
                o7h0Var = o7h0Var2;
                sujVar = this;
                obj = obj2;
            }
            u40 u40Var = u40.f226523c;
            gku gkuVar2 = new gku(strM54977L3, new peu(u40Var, (eh00) jq9Var));
            String strM54977L4 = k0e1.m54977L(R.string.curation_education_update_dialog_primary_button_continue_anyway, xq00Var);
            boolean zM91770i3 = xq00Var.m91770i(sujVar) | xq00Var.m91770i(o7h0Var) | (i3 == 4) | (i4 == 16384) | ((i2 & 896) == 256);
            Object objM91750T5 = xq00Var.m91750T();
            if (zM91770i3 || objM91750T5 == obj) {
                gkuVar = gkuVar2;
                Object oo5Var = new oo5(6, this, o7h0Var, str, eh00Var, gh00Var, false);
                xq00Var.m91793t0(oo5Var);
                objM91750T5 = oo5Var;
            } else {
                gkuVar = gkuVar2;
            }
            kku.m56741a(eh00Var, null, null, strM54977L, strM54977L2, gkuVar, new gku(strM54977L4, new peu(u40Var, (eh00) objM91750T5)), xq00Var, ((i2 >> 12) & 14) | 2359296, 6);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new e4m(this, str, c4mVar, gh00Var, gh00Var2, eh00Var, i, 0);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        return vjf1.m85770t(dau.f47107a, new y5i((p4k) this.f214135a, (u4k) this.f214136b, (g7k) obj, (gh00) this.f214137c, null)).toObservable();
    }

    /* JADX INFO: renamed from: b */
    public void m79391b(String str, c4m c4mVar, gh00 gh00Var, gh00 gh00Var2, eh00 eh00Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-1564820155);
        int i2 = i | (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91770i(c4mVar) ? 32 : 16) | (xq00Var.m91770i(gh00Var) ? 256 : 128) | (xq00Var.m91770i(gh00Var2) ? 2048 : 1024) | (xq00Var.m91770i(eh00Var) ? 16384 : 8192) | (xq00Var.m91770i(this) ? 131072 : 65536);
        if (xq00Var.m91752Y(i2 & 1, (74899 & i2) != 74898)) {
            m79390a(str, c4mVar, gh00Var, gh00Var2, eh00Var, xq00Var, i2 & 524286);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new e4m(this, str, c4mVar, gh00Var, gh00Var2, eh00Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public hol0 m79392d() {
        ddc ddcVar = (ddc) this.f214135a;
        vgq0 vgq0Var = (vgq0) ddcVar.f47767c.get();
        jg31.m53271i(vgq0Var);
        pqk0 pqk0Var = new pqk0(m79399k(), 18);
        jp11 jp11Var = (jp11) ddcVar.f47769e.get();
        jg31.m53271i(jp11Var);
        return new hol0(vgq0Var, pqk0Var, jp11Var, new i97(25), m79399k(), 16);
    }

    /* JADX INFO: renamed from: e */
    public o08 m79393e(String str) {
        return new o08((Context) this.f214135a, (wre) this.f214136b, (wre) this.f214137c, str);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x015f  */
    /* JADX WARN: Code duplicated, block: B:59:0x016b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0173  */
    /* JADX WARN: Code duplicated, block: B:64:0x017e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0186  */
    /* JADX WARN: Code duplicated, block: B:68:0x0196  */
    /* JADX WARN: Code duplicated, block: B:70:0x019d  */
    /* JADX WARN: Code duplicated, block: B:76:0x01af  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public Serializable m79394f(List list, ibk ibkVar) {
        dkk dkkVar;
        pqm0 pqm0Var;
        List list2;
        Object objM96769g;
        Map map;
        Map map2;
        List list3;
        Map map3;
        ArrayList arrayList;
        pla1 pla1Var;
        pla1 pla1Var2;
        akk akkVarM26248c;
        String str;
        pla1 pla1Var3;
        pla1 pla1Var4;
        List<akk> list4 = list;
        ynb ynbVar = (ynb) this.f214137c;
        if (ibkVar instanceof dkk) {
            dkkVar = (dkk) ibkVar;
            int i = dkkVar.f49989f;
            if ((i & Integer.MIN_VALUE) != 0) {
                dkkVar.f49989f = i - Integer.MIN_VALUE;
            } else {
                dkkVar = new dkk(this, ibkVar);
            }
        } else {
            dkkVar = new dkk(this, ibkVar);
        }
        Object objM69915o = dkkVar.f49987d;
        int i2 = dkkVar.f49989f;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM69915o);
            if (ynbVar.m94228a()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : list4) {
                    if (z2h1.m95215v(((akk) obj).f16560a)) {
                        arrayList2.add(obj);
                    } else {
                        arrayList3.add(obj);
                    }
                }
                pqm0Var = new pqm0(arrayList2, arrayList3);
            } else {
                pqm0Var = new pqm0(lau.f131415a, list4);
            }
            list2 = (List) pqm0Var.f180350a;
            List<akk> list5 = (List) pqm0Var.f180351b;
            ArrayList<pqm0> arrayList4 = new ArrayList(i6f.m49804T(list5, 10));
            for (akk akkVar : list5) {
                String str2 = akkVar.f16560a.f178681a;
                pla1 pla1Var5 = akkVar.f16563d;
                arrayList4.add(new pqm0(str2, pla1Var5 != null ? pla1Var5.f178681a : null));
            }
            ArrayList arrayList5 = new ArrayList();
            for (pqm0 pqm0Var2 : arrayList4) {
                j6f.m52564V(bk5.m29582E0(new String[]{pqm0Var2.f180350a, pqm0Var2.f180351b}), arrayList5);
            }
            List listM43727j0 = g6f.m43727j0(arrayList5);
            zrr0 zrr0Var = (zrr0) this.f214135a;
            dkkVar.f49984a = list4;
            dkkVar.f49985b = list2;
            dkkVar.f49989f = 1;
            objM96769g = zrr0Var.m96769g(listM43727j0, dkkVar);
            if (objM96769g != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            List list6 = dkkVar.f49985b;
            List list7 = dkkVar.f49984a;
            bga.m29073P(objM69915o);
            list2 = list6;
            list4 = list7;
            objM96769g = objM69915o;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map3 = dkkVar.f49986c;
            list3 = dkkVar.f49984a;
            bga.m29073P(objM69915o);
        }
        map2 = (Map) objM69915o;
        map = map3;
        list4 = list3;
        arrayList = new ArrayList(i6f.m49804T(list4, 10));
        for (akk akkVar2 : list4) {
            if (ynbVar.m94228a()) {
                pla1Var3 = akkVar2.f16560a;
                if (z2h1.m95215v(pla1Var3)) {
                    pla1Var4 = (pla1) map2.get(pla1Var3.f178681a);
                    if (pla1Var4 != null) {
                        pla1Var3 = pla1Var4;
                    }
                    akkVarM26248c = akk.m26248c(akkVar2, pla1Var3, null, 14);
                } else {
                    pla1 pla1Var6 = akkVar2.f16560a;
                    pla1Var = akkVar2.f16563d;
                    pla1Var2 = (pla1) map.get(pla1Var6.f178681a);
                    if (pla1Var2 == null) {
                        na6.m63971s("Failed to fetch metadata for user. This should never happen, please report this issue.");
                        pla1Var2 = akkVar2.f16560a;
                    }
                    if (pla1Var != null || (str = pla1Var.f178681a) == null) {
                        pla1Var = null;
                    } else {
                        pla1 pla1Var7 = (pla1) map.get(str);
                        if (pla1Var7 == null) {
                            na6.m63971s("Failed to fetch metadata for user. This should never happen, please report this issue.");
                        } else {
                            pla1Var = pla1Var7;
                        }
                    }
                    akkVarM26248c = akk.m26248c(akkVar2, pla1Var2, pla1Var, 6);
                }
            } else {
                pla1 pla1Var8 = akkVar2.f16560a;
                pla1Var = akkVar2.f16563d;
                pla1Var2 = (pla1) map.get(pla1Var8.f178681a);
                if (pla1Var2 == null) {
                    na6.m63971s("Failed to fetch metadata for user. This should never happen, please report this issue.");
                    pla1Var2 = akkVar2.f16560a;
                }
                if (pla1Var != null) {
                    pla1Var = null;
                } else {
                    pla1Var = null;
                }
                akkVarM26248c = akk.m26248c(akkVar2, pla1Var2, pla1Var, 6);
            }
            arrayList.add(akkVarM26248c);
        }
        return arrayList;
        map = (Map) objM96769g;
        if (!list2.isEmpty()) {
            pgq0 pgq0Var = (pgq0) this.f214136b;
            ArrayList arrayList6 = new ArrayList(i6f.m49804T(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList6.add(((akk) it.next()).f16560a.f178681a);
            }
            dkkVar.f49984a = list4;
            dkkVar.f49985b = null;
            dkkVar.f49986c = map;
            dkkVar.f49989f = 2;
            objM69915o = pgq0Var.m69915o(arrayList6, dkkVar);
            if (objM69915o != yukVar) {
                list3 = list4;
                map3 = map;
                map2 = (Map) objM69915o;
                map = map3;
                list4 = list3;
            }
            return yukVar;
        }
        map2 = nau.f152117a;
        arrayList = new ArrayList(i6f.m49804T(list4, 10));
        while (r1.hasNext()) {
            if (ynbVar.m94228a()) {
                pla1Var3 = akkVar2.f16560a;
                if (z2h1.m95215v(pla1Var3)) {
                    pla1Var4 = (pla1) map2.get(pla1Var3.f178681a);
                    if (pla1Var4 != null) {
                        pla1Var3 = pla1Var4;
                    }
                    akkVarM26248c = akk.m26248c(akkVar2, pla1Var3, null, 14);
                } else {
                    pla1 pla1Var9 = akkVar2.f16560a;
                    pla1Var = akkVar2.f16563d;
                    pla1Var2 = (pla1) map.get(pla1Var9.f178681a);
                    if (pla1Var2 == null) {
                        na6.m63971s("Failed to fetch metadata for user. This should never happen, please report this issue.");
                        pla1Var2 = akkVar2.f16560a;
                    }
                    if (pla1Var != null) {
                        pla1Var = null;
                    } else {
                        pla1Var = null;
                    }
                    akkVarM26248c = akk.m26248c(akkVar2, pla1Var2, pla1Var, 6);
                }
            } else {
                pla1 pla1Var10 = akkVar2.f16560a;
                pla1Var = akkVar2.f16563d;
                pla1Var2 = (pla1) map.get(pla1Var10.f178681a);
                if (pla1Var2 == null) {
                    na6.m63971s("Failed to fetch metadata for user. This should never happen, please report this issue.");
                    pla1Var2 = akkVar2.f16560a;
                }
                if (pla1Var != null) {
                    pla1Var = null;
                } else {
                    pla1Var = null;
                }
                akkVarM26248c = akk.m26248c(akkVar2, pla1Var2, pla1Var, 6);
            }
            arrayList.add(akkVarM26248c);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x011c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0139 A[PHI: r4
      0x0139: PHI (r4v9 p.pla1) = (r4v7 p.pla1), (r4v13 p.pla1) binds: [B:59:0x0143, B:55:0x0136] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x013b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0145  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: g */
    public Serializable m79395g(ArrayList arrayList, ibk ibkVar) {
        ekk ekkVar;
        pqm0 pqm0Var;
        List<pla1> list;
        List list2;
        Map map;
        Map map2;
        List list3;
        ArrayList arrayList2;
        pla1 pla1Var;
        ynb ynbVar = (ynb) this.f214137c;
        if (ibkVar instanceof ekk) {
            ekkVar = (ekk) ibkVar;
            int i = ekkVar.f60467f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ekkVar.f60467f = i - Integer.MIN_VALUE;
            } else {
                ekkVar = new ekk(this, ibkVar);
            }
        } else {
            ekkVar = new ekk(this, ibkVar);
        }
        Object obj = ekkVar.f60465d;
        int i2 = ekkVar.f60467f;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                list2 = ekkVar.f60463b;
                list = ekkVar.f60462a;
                bga.m29073P(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map2 = ekkVar.f60464c;
                list3 = ekkVar.f60462a;
                bga.m29073P(obj);
            }
            map = (Map) obj;
            list = list3;
            arrayList2 = new ArrayList(i6f.m49804T(list, 10));
            for (pla1 pla1Var2 : list) {
                if (ynbVar.m94228a() || !z2h1.m95215v(pla1Var2)) {
                    pla1Var = (pla1) map2.get(pla1Var2.f178681a);
                    if (pla1Var == null) {
                        na6.m63971s("Failed to fetch metadata for user. This should never happen, please report this issue.");
                    } else {
                        pla1Var2 = pla1Var;
                    }
                } else {
                    pla1Var = (pla1) map.get(pla1Var2.f178681a);
                    if (pla1Var != null) {
                        pla1Var2 = pla1Var;
                    }
                }
                arrayList2.add(pla1Var2);
            }
            return arrayList2;
        }
        bga.m29073P(obj);
        if (ynbVar.m94228a()) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (z2h1.m95215v((pla1) obj2)) {
                    arrayList3.add(obj2);
                } else {
                    arrayList4.add(obj2);
                }
            }
            pqm0Var = new pqm0(arrayList3, arrayList4);
        } else {
            pqm0Var = new pqm0(lau.f131415a, arrayList);
        }
        List list4 = (List) pqm0Var.f180350a;
        List list5 = (List) pqm0Var.f180351b;
        zrr0 zrr0Var = (zrr0) this.f214135a;
        ArrayList arrayList5 = new ArrayList(i6f.m49804T(list5, 10));
        Iterator it = list5.iterator();
        while (it.hasNext()) {
            arrayList5.add(((pla1) it.next()).f178681a);
        }
        ekkVar.f60462a = arrayList;
        ekkVar.f60463b = list4;
        ekkVar.f60467f = 1;
        Object objM96769g = zrr0Var.m96769g(arrayList5, ekkVar);
        if (objM96769g != yukVar) {
            list = arrayList;
            list2 = list4;
            obj = objM96769g;
        }
        return yukVar;
        Map map3 = (Map) obj;
        if (!list2.isEmpty()) {
            pgq0 pgq0Var = (pgq0) this.f214136b;
            ArrayList arrayList6 = new ArrayList(i6f.m49804T(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList6.add(((pla1) it2.next()).f178681a);
            }
            ekkVar.f60462a = list;
            ekkVar.f60463b = null;
            ekkVar.f60464c = map3;
            ekkVar.f60467f = 2;
            Object objM69915o = pgq0Var.m69915o(arrayList6, ekkVar);
            if (objM69915o != yukVar) {
                obj = objM69915o;
                map2 = map3;
                list3 = list;
                map = (Map) obj;
                list = list3;
            }
            return yukVar;
        }
        map = nau.f152117a;
        map2 = map3;
        arrayList2 = new ArrayList(i6f.m49804T(list, 10));
        while (r2.hasNext()) {
            if (ynbVar.m94228a()) {
                pla1Var = (pla1) map2.get(pla1Var2.f178681a);
                if (pla1Var == null) {
                    na6.m63971s("Failed to fetch metadata for user. This should never happen, please report this issue.");
                } else {
                    pla1Var2 = pla1Var;
                }
            } else {
                pla1Var = (pla1) map2.get(pla1Var2.f178681a);
                if (pla1Var == null) {
                    na6.m63971s("Failed to fetch metadata for user. This should never happen, please report this issue.");
                } else {
                    pla1Var2 = pla1Var;
                }
            }
            arrayList2.add(pla1Var2);
        }
        return arrayList2;
    }

    @Override // p204p.rdc1
    public View getRoot() {
        return (LinearLayout) this.f214135a;
    }

    /* JADX INFO: renamed from: h */
    public fiz m79396h(Set set) {
        if (set.isEmpty()) {
            return new ysk(nau.f152117a, 27);
        }
        sr6 sr6Var = (sr6) this.f214135a;
        gax0 gax0VarM97880s = ResumptionProgressEsperanto$GetResumePointRequest.m97880s();
        gax0VarM97880s.m44186r(((zam0) this.f214137c).path());
        gax0VarM97880s.m44187s("episode_card");
        gax0VarM97880s.m44184m(set);
        return new ysk(new lcw0(sr6Var.callStream("spotify.resumption_progress_esperanto.proto.ResumptionProgress", "SubResumePoint", (ResumptionProgressEsperanto$GetResumePointRequest) gax0VarM97880s.build()), 11), 0);
    }

    /* JADX INFO: renamed from: i */
    public q9h0 m79397i() {
        st91 st91Var = st91.f213865b;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        return new q9h0(new w9h0(new z9h0(0, xgg1.m90637J4().f36166c, (String) this.f214135a, st91Var), (x9h0) this.f214137c), 1);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public Object m79398j(String str, ibk ibkVar) {
        ruj rujVar;
        Exception e;
        sr4 sr4Var;
        String str2;
        if (ibkVar instanceof ruj) {
            rujVar = (ruj) ibkVar;
            int i = rujVar.f202865d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rujVar.f202865d = i - Integer.MIN_VALUE;
            } else {
                rujVar = new ruj(this, ibkVar);
            }
        } else {
            rujVar = new ruj(this, ibkVar);
        }
        Object obj = rujVar.f202863b;
        yuk yukVar = yuk.f276404a;
        int i2 = rujVar.f202865d;
        if (i2 == 0) {
            bga.m29073P(obj);
            sr4 sr4VarM76275a = ((rr4) ((am71) this.f214137c)).m76275a("get_stories_request");
            sr4VarM76275a.f213231f = "android-martini-dataloader-impl";
            sr4VarM76275a.m79014b(ContextTrack.Metadata.KEY_ENTITY_URI, str);
            sr4VarM76275a.m79019k("get_stories_request", null, (4 & 4) != 0);
            try {
                tb10 tb10Var = (tb10) this.f214135a;
                sb10 sb10VarM3015o = GetStoriesRequest.m3015o();
                sb10VarM3015o.m77705m(str);
                SingleSource map = tb10Var.m80370a((GetStoriesRequest) sb10VarM3015o.build()).timeout(90000L, TimeUnit.MILLISECONDS).map(let.f132695R0);
                rujVar.f202862a = sr4VarM76275a;
                rujVar.f202865d = 1;
                Object objM96567o = zn91.m96567o(map, rujVar);
                if (objM96567o == yukVar) {
                    return yukVar;
                }
                obj = objM96567o;
                sr4Var = sr4VarM76275a;
            } catch (Exception e2) {
                e = e2;
                sr4Var = sr4VarM76275a;
                if (e instanceof TimeoutException) {
                    str2 = "timeout";
                } else {
                    str2 = "unknown_error";
                }
                sr4Var.m79016f("get_stories_request");
                sr4Var.m79013a("load_outcome", str2);
                ((rr4) ((am71) this.f214137c)).m76276b(sr4Var.m79015d());
                throw e;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sr4Var = rujVar.f202862a;
            try {
                bga.m29073P(obj);
            } catch (Exception e3) {
                e = e3;
                if (e instanceof TimeoutException) {
                    str2 = "timeout";
                } else {
                    str2 = "unknown_error";
                }
                sr4Var.m79016f("get_stories_request");
                sr4Var.m79013a("load_outcome", str2);
                ((rr4) ((am71) this.f214137c)).m76276b(sr4Var.m79015d());
                throw e;
            }
        }
        qf40 qf40Var = (qf40) obj;
        sr4Var.m79016f("get_stories_request");
        sr4Var.m79013a("load_outcome", "success");
        ((rr4) ((am71) this.f214137c)).m76276b(sr4Var.m79015d());
        return qf40Var;
    }

    /* JADX INFO: renamed from: k */
    public f2k0 m79399k() {
        ddc ddcVar = (ddc) this.f214135a;
        bji bjiVar = (bji) ddcVar.f47773i.get();
        jg31.m53271i(bjiVar);
        r54 r54Var = new r54(bjiVar);
        ynb ynbVar = (ynb) ddcVar.f47778n.get();
        jg31.m53271i(ynbVar);
        return new f2k0(r54Var, ynbVar);
    }

    /* JADX INFO: renamed from: l */
    public void m79400l(String str, gxj0 gxj0Var) {
        int i = 1;
        fbk fbkVar = null;
        wxf1.m89255l(n5h1.m63737m((hc80) this.f214137c), new r1a(new vjz(new zux(new evi((fiz) ((ik40) this.f214135a).f103011g, 9), (fiz) ((suj) this.f214136b).f214137c, new elj(3, i, fbkVar), i), new qri(this, str, fbkVar, 21)), new izk(gxj0Var, str, fbkVar, 0), 8));
    }

    /* JADX INFO: renamed from: m */
    public void m79401m() {
        hv31 hv31Var = (hv31) this.f214136b;
        fv31 fv31Var = qbk.f187102a;
        long jMo48712g = hv31Var.mo48712g(fv31Var, 0L);
        wy3 wy3Var = (wy3) ((xre) this.f214137c);
        if (fr0.m42463g(wy3Var, jMo48712g) > 1209600000) {
            qre0 qre0Var = (qre0) this.f214135a;
            qdf0 qdf0VarM15455o = MicrosoftContinuityConnected.m15455o();
            qdf0VarM15455o.m72593m();
            qre0Var.m73616a((MicrosoftContinuityConnected) qdf0VarM15455o.build());
            lv31 lv31VarEdit = hv31Var.edit();
            wy3Var.getClass();
            lv31VarEdit.m60050c(fv31Var, System.currentTimeMillis());
            lv31VarEdit.m60055h();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m79402n(String str, Throwable th) {
        rdf0 rdf0VarM15458p = MicrosoftContinuityError.m15458p();
        rdf0VarM15458p.m75339q(str);
        rdf0VarM15458p.m75338m(String.valueOf(th.getMessage()));
        ((qre0) this.f214135a).m73616a(rdf0VarM15458p.build());
    }

    /* JADX INFO: renamed from: o */
    public Object m79403o(r9x0 r9x0Var, ibk ibkVar) {
        p6s0 p6s0Var;
        qax0 qax0Var = (qax0) this.f214136b;
        o6s0 o6s0VarM97834u = ProgressPlaybackEsperanto$OnUpdateRequest.m97834u();
        o6s0VarM97834u.m66357r(((zam0) this.f214137c).path());
        o6s0VarM97834u.m66362w("episode_card");
        o6s0VarM97834u.m66356q(r9x0Var.f197135a);
        jda1 jda1Var = r9x0Var.f197138d;
        hda1 hda1Var = hda1.f90095e;
        o6s0VarM97834u.m66358s(wj50.m88271j(jda1Var, hda1Var));
        bks bksVarM1929s = Duration.m1929s();
        long j = 1000;
        bksVarM1929s.m29723q(r9x0Var.f197137c / j);
        o6s0VarM97834u.m66359t((Duration) bksVarM1929s.build());
        bks bksVarM1929s2 = Duration.m1929s();
        bksVarM1929s2.m29723q(r9x0Var.f197136b / j);
        o6s0VarM97834u.m66355m((Duration) bksVarM1929s2.build());
        if (wj50.m88271j(jda1Var, hda1.f90098h)) {
            p6s0Var = p6s0.REASON_ACTIVATION_UNMUTE;
        } else if (wj50.m88271j(jda1Var, hda1.f90094d)) {
            p6s0Var = p6s0.REASON_PLAYBACK_PERIODIC;
        } else if (wj50.m88271j(jda1Var, hda1Var)) {
            p6s0Var = p6s0.REASON_PLAYBACK_ENDED;
        } else if (wj50.m88271j(jda1Var, hda1.f90091a)) {
            p6s0Var = p6s0.REASON_ACTIVATION_ADDED_TO_LIBRARY;
        } else if (wj50.m88271j(jda1Var, hda1.f90093c)) {
            p6s0Var = p6s0.REASON_ACTIVATION_DOWNLOADED;
        } else if (wj50.m88271j(jda1Var, hda1.f90097g)) {
            p6s0Var = p6s0.REASON_ACTIVATION_TIME_THRESHOLD_EXCEEDED;
        } else if (wj50.m88271j(jda1Var, hda1.f90096f)) {
            p6s0Var = p6s0.REASON_ACTIVATION_SHARED;
        } else {
            p6s0Var = wj50.m88271j(jda1Var, ida1.f101014a) ? p6s0.REASON_ACTIVATION_SEEK : p6s0.REASON_ACTIVATION_GENERIC;
        }
        o6s0VarM97834u.m66361v(p6s0Var);
        Object objM72477a = qax0Var.m72477a((ProgressPlaybackEsperanto$OnUpdateRequest) o6s0VarM97834u.build(), ibkVar);
        return objM72477a == yuk.f276404a ? objM72477a : w2a1.f247311a;
    }

    public suj(j4a0 j4a0Var, oa81 oa81Var) {
        this.f214135a = j4a0Var;
        this.f214136b = oa81Var;
        this.f214137c = mvl0.m62953p(new zux(new evi(j4a0Var.f108642i, 20), (kxr) oa81Var.f163267d, new ju0(this, (fbk) null, 12), 1));
    }
}
