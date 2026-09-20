package p204p;

import com.spotify.searchview.proto.AudioEpisode;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class bpk implements qnk {

    /* JADX INFO: renamed from: f */
    public static final long f29516f;

    /* JADX INFO: renamed from: g */
    public static final long f29517g;

    /* JADX INFO: renamed from: h */
    public static final long f29518h;

    /* JADX INFO: renamed from: i */
    public static final fv31 f29519i;

    /* JADX INFO: renamed from: j */
    public static final fv31 f29520j;

    /* JADX INFO: renamed from: k */
    public static final fv31 f29521k;

    /* JADX INFO: renamed from: l */
    public static final fv31 f29522l;

    /* JADX INFO: renamed from: m */
    public static final fv31 f29523m;

    /* JADX INFO: renamed from: n */
    public static final fv31 f29524n;

    /* JADX INFO: renamed from: o */
    public static final fv31 f29525o;

    /* JADX INFO: renamed from: p */
    public static final fv31 f29526p;

    /* JADX INFO: renamed from: q */
    public static final fv31 f29527q;

    /* JADX INFO: renamed from: r */
    public static final fv31 f29528r;

    /* JADX INFO: renamed from: s */
    public static final fv31 f29529s;

    /* JADX INFO: renamed from: a */
    public final Single f29530a;

    /* JADX INFO: renamed from: b */
    public final vq2 f29531b;

    /* JADX INFO: renamed from: c */
    public final nrd f29532c;

    /* JADX INFO: renamed from: d */
    public final wf4 f29533d;

    /* JADX INFO: renamed from: e */
    public final xuk f29534e;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f29516f = timeUnit.toMillis(10L);
        f29517g = TimeUnit.HOURS.toMillis(1L);
        f29518h = timeUnit.toMillis(20L);
        si5 si5Var = fv31.f73628b;
        f29519i = si5Var.m78183U("martini_gateway_conversation_id");
        f29520j = si5Var.m78183U("martini_gateway_conversation_last_activity_at_ms");
        f29521k = si5Var.m78183U("martini_gateway_last_activity_by_conversation");
        f29522l = si5Var.m78183U("martini_playback_conversation_id");
        f29523m = si5Var.m78183U("martini_linked_surfaces");
        f29524n = si5Var.m78183U("martini_last_response_text");
        f29525o = si5Var.m78183U("martini_last_response_message_id");
        f29526p = si5Var.m78183U("martini_last_response_conversation_id");
        f29527q = si5Var.m78183U("martini_last_responses_by_conversation");
        f29528r = si5Var.m78183U("martini_gateway_start_new_surfaces");
        f29529s = si5Var.m78183U("martini_gateway_force_new_conversation");
    }

    public bpk(Single single, xre xreVar, vq2 vq2Var, nrd nrdVar, wf4 wf4Var, xuk xukVar) {
        this.f29530a = single;
        this.f29531b = vq2Var;
        this.f29532c = nrdVar;
        this.f29533d = wf4Var;
        this.f29534e = xukVar;
    }

    /* JADX INFO: renamed from: g */
    public static String m30125g(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            if (!wl51.m88460J0((String) obj)) {
                arrayList.add(obj);
            }
        }
        return g6f.m43753y0(g6f.m43710X0(arrayList), "\t", null, null, null, 62);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: A */
    public final Object m30126A(LinkedHashMap linkedHashMap, ibk ibkVar) {
        rok rokVar;
        if (ibkVar instanceof rok) {
            rokVar = (rok) ibkVar;
            int i = rokVar.f201280d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rokVar.f201280d = i - Integer.MIN_VALUE;
            } else {
                rokVar = new rok(this, ibkVar);
            }
        } else {
            rokVar = new rok(this, ibkVar);
        }
        Object objM30135J = rokVar.f201278b;
        int i2 = rokVar.f201280d;
        if (i2 == 0) {
            bga.m29073P(objM30135J);
            rokVar.f201277a = linkedHashMap;
            rokVar.f201280d = 1;
            objM30135J = m30135J(rokVar);
            Object obj = yuk.f276404a;
            if (objM30135J == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkedHashMap = rokVar.f201277a;
            bga.m29073P(objM30135J);
        }
        hv31 hv31Var = (hv31) objM30135J;
        boolean zIsEmpty = linkedHashMap.isEmpty();
        w2a1 w2a1Var = w2a1.f247311a;
        fv31 fv31Var = f29523m;
        if (zIsEmpty) {
            lv31 lv31VarEdit = hv31Var.edit();
            lv31VarEdit.m60053f(fv31Var);
            lv31VarEdit.m60055h();
            return w2a1Var;
        }
        String strM43753y0 = g6f.m43753y0(linkedHashMap.entrySet(), "\n", null, null, cmk.f39720f, 30);
        lv31 lv31VarEdit2 = hv31Var.edit();
        lv31VarEdit2.m60051d(fv31Var, strM43753y0);
        lv31VarEdit2.m60055h();
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: B */
    public final Object m30127B(String str, ibk ibkVar) {
        sok sokVar;
        if (ibkVar instanceof sok) {
            sokVar = (sok) ibkVar;
            int i = sokVar.f211205d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sokVar.f211205d = i - Integer.MIN_VALUE;
            } else {
                sokVar = new sok(this, ibkVar);
            }
        } else {
            sokVar = new sok(this, ibkVar);
        }
        Object objM30135J = sokVar.f211203b;
        int i2 = sokVar.f211205d;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 == 0) {
            bga.m29073P(objM30135J);
            if (wl51.m88460J0(str)) {
                return w2a1Var;
            }
            sokVar.f211202a = str;
            sokVar.f211205d = 1;
            objM30135J = m30135J(sokVar);
            Object obj = yuk.f276404a;
            if (objM30135J == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = sokVar.f211202a;
            bga.m29073P(objM30135J);
        }
        lv31 lv31VarEdit = ((hv31) objM30135J).edit();
        lv31VarEdit.m60053f(f29529s);
        lv31VarEdit.m60051d(f29519i, str);
        lv31VarEdit.m60055h();
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: C */
    public final Object m30128C(String str, ibk ibkVar) {
        tok tokVar;
        if (ibkVar instanceof tok) {
            tokVar = (tok) ibkVar;
            int i = tokVar.f222279d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tokVar.f222279d = i - Integer.MIN_VALUE;
            } else {
                tokVar = new tok(this, ibkVar);
            }
        } else {
            tokVar = new tok(this, ibkVar);
        }
        Object objM30135J = tokVar.f222277b;
        int i2 = tokVar.f222279d;
        if (i2 == 0) {
            bga.m29073P(objM30135J);
            tokVar.f222276a = str;
            tokVar.f222279d = 1;
            objM30135J = m30135J(tokVar);
            Object obj = yuk.f276404a;
            if (objM30135J == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = tokVar.f222276a;
            bga.m29073P(objM30135J);
        }
        lv31 lv31VarEdit = ((hv31) objM30135J).edit();
        fv31 fv31Var = f29522l;
        if (str == null || wl51.m88460J0(str)) {
            lv31VarEdit.m60053f(fv31Var);
        } else {
            lv31VarEdit.m60051d(fv31Var, str);
        }
        lv31VarEdit.m60055h();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: D */
    public final Object m30129D(String str, ibk ibkVar) {
        uok uokVar;
        if (ibkVar instanceof uok) {
            uokVar = (uok) ibkVar;
            int i = uokVar.f232452d;
            if ((i & Integer.MIN_VALUE) != 0) {
                uokVar.f232452d = i - Integer.MIN_VALUE;
            } else {
                uokVar = new uok(this, ibkVar);
            }
        } else {
            uokVar = new uok(this, ibkVar);
        }
        Object obj = uokVar.f232450b;
        int i2 = uokVar.f232452d;
        if (i2 != 0) {
            if (i2 == 1) {
                bga.m29073P(obj);
                return qyg1.m74178H(((hv31) obj).mo48713h(f29529s, false));
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = uokVar.f232449a;
            bga.m29073P(obj);
            return qyg1.m74178H(((LinkedHashSet) obj).contains(str));
        }
        bga.m29073P(obj);
        Object obj2 = yuk.f276404a;
        if (str == null || wl51.m88460J0(str)) {
            uokVar.f232449a = null;
            uokVar.f232452d = 1;
            Object objM30135J = m30135J(uokVar);
            if (objM30135J != obj2) {
                obj = objM30135J;
                return qyg1.m74178H(((hv31) obj).mo48713h(f29529s, false));
            }
        } else {
            uokVar.f232449a = str;
            uokVar.f232452d = 2;
            Object objM30153s = m30153s(uokVar);
            if (objM30153s != obj2) {
                obj = objM30153s;
                return qyg1.m74178H(((LinkedHashSet) obj).contains(str));
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
    
        if (r9 == r7) goto L37;
     */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yuk m30130E(ibk ibkVar) {
        vok vokVar;
        String str;
        if (ibkVar instanceof vok) {
            vokVar = (vok) ibkVar;
            int i = vokVar.f243492c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vokVar.f243492c = i - Integer.MIN_VALUE;
            } else {
                vokVar = new vok(this, ibkVar);
            }
        } else {
            vokVar = new vok(this, ibkVar);
        }
        Object objM30154t = vokVar.f243490a;
        int i2 = vokVar.f243492c;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM30154t);
            vokVar.f243492c = 1;
            if (m30128C(null, vokVar) != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(objM30154t);
        } else {
            if (i2 == 2) {
                bga.m29073P(objM30154t);
                str = (String) objM30154t;
                if (str != null) {
                    vokVar.f243492c = 3;
                    objM30154t = m30145k(str, vokVar);
                } else {
                    vokVar.f243492c = 4;
                    if (m30136a(vokVar) == yukVar) {
                        return null;
                    }
                }
                return yukVar;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM30154t);
                return null;
            }
            bga.m29073P(objM30154t);
        }
        if (((Collection) objM30154t).isEmpty()) {
            vokVar.f243492c = 4;
            if (m30136a(vokVar) == yukVar) {
                return yukVar;
            }
        }
        return null;
        vokVar.f243492c = 2;
        objM30154t = m30154t(vokVar);
        if (objM30154t != yukVar) {
            str = (String) objM30154t;
            if (str != null) {
                vokVar.f243492c = 3;
                objM30154t = m30145k(str, vokVar);
            } else {
                vokVar.f243492c = 4;
                if (m30136a(vokVar) == yukVar) {
                    return null;
                }
            }
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: F */
    public final Object m30131F(String str, String str2, ibk ibkVar) {
        wok wokVar;
        hv31 hv31Var;
        String str3;
        hv31 hv31Var2;
        if (ibkVar instanceof wok) {
            wokVar = (wok) ibkVar;
            int i = wokVar.f253491f;
            if ((i & Integer.MIN_VALUE) != 0) {
                wokVar.f253491f = i - Integer.MIN_VALUE;
            } else {
                wokVar = new wok(this, ibkVar);
            }
        } else {
            wokVar = new wok(this, ibkVar);
        }
        Object objM30135J = wokVar.f253489d;
        int i2 = wokVar.f253491f;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM30135J);
            wokVar.f253486a = str;
            wokVar.f253487b = str2;
            wokVar.f253491f = 1;
            objM30135J = m30135J(wokVar);
            if (objM30135J != obj) {
            }
        }
        if (i2 == 1) {
            str2 = wokVar.f253487b;
            str = wokVar.f253486a;
            bga.m29073P(objM30135J);
        } else {
            if (i2 == 2) {
                hv31Var2 = wokVar.f253488c;
                str2 = wokVar.f253487b;
                str3 = wokVar.f253486a;
                bga.m29073P(objM30135J);
                LinkedHashSet linkedHashSet = (LinkedHashSet) objM30135J;
                linkedHashSet.add(str2);
                lv31 lv31VarEdit = hv31Var2.edit();
                lv31VarEdit.m60051d(f29528r, m30125g(linkedHashSet));
                lv31VarEdit.m60055h();
                hv31Var = hv31Var2;
                str = str3;
                if (str == null && !wl51.m88460J0(str)) {
                    wokVar.f253486a = str;
                    wokVar.f253487b = null;
                    wokVar.f253488c = null;
                    wokVar.f253491f = 3;
                    if (m30132G(str, str2, wokVar) != obj) {
                    }
                }
                lv31 lv31VarEdit2 = hv31Var.edit();
                lv31VarEdit2.m60053f(f29524n);
                lv31VarEdit2.m60053f(f29525o);
                lv31VarEdit2.m60053f(f29526p);
                lv31VarEdit2.m60055h();
                return w2a1Var;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM30135J);
                return w2a1Var;
            }
            str = wokVar.f253486a;
            bga.m29073P(objM30135J);
        }
        wokVar.f253486a = null;
        wokVar.f253487b = null;
        wokVar.f253488c = null;
        wokVar.f253491f = 4;
        return m30138c(str, wokVar) == obj ? obj : w2a1Var;
        hv31Var = (hv31) objM30135J;
        if (str2 == null || wl51.m88460J0(str2)) {
            lv31 lv31VarEdit3 = hv31Var.edit();
            lv31VarEdit3.m60048a(f29529s, true);
            lv31VarEdit3.m60055h();
            if (str == null) {
            }
            lv31 lv31VarEdit4 = hv31Var.edit();
            lv31VarEdit4.m60053f(f29524n);
            lv31VarEdit4.m60053f(f29525o);
            lv31VarEdit4.m60053f(f29526p);
            lv31VarEdit4.m60055h();
            return w2a1Var;
        }
        wokVar.f253486a = str;
        wokVar.f253487b = str2;
        wokVar.f253488c = hv31Var;
        wokVar.f253491f = 2;
        Object objM30153s = m30153s(wokVar);
        if (objM30153s != obj) {
            str3 = str;
            hv31Var2 = hv31Var;
            objM30135J = objM30153s;
            LinkedHashSet linkedHashSet2 = (LinkedHashSet) objM30135J;
            linkedHashSet2.add(str2);
            lv31 lv31VarEdit5 = hv31Var2.edit();
            lv31VarEdit5.m60051d(f29528r, m30125g(linkedHashSet2));
            lv31VarEdit5.m60055h();
            hv31Var = hv31Var2;
            str = str3;
            if (str == null) {
            }
            lv31 lv31VarEdit6 = hv31Var.edit();
            lv31VarEdit6.m60053f(f29524n);
            lv31VarEdit6.m60053f(f29525o);
            lv31VarEdit6.m60053f(f29526p);
            lv31VarEdit6.m60055h();
            return w2a1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: G */
    public final Object m30132G(String str, String str2, ibk ibkVar) {
        xok xokVar;
        if (ibkVar instanceof xok) {
            xokVar = (xok) ibkVar;
            int i = xokVar.f264297e;
            if ((i & Integer.MIN_VALUE) != 0) {
                xokVar.f264297e = i - Integer.MIN_VALUE;
            } else {
                xokVar = new xok(this, ibkVar);
            }
        } else {
            xokVar = new xok(this, ibkVar);
        }
        Object objM30151q = xokVar.f264295c;
        int i2 = xokVar.f264297e;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM30151q);
            if (!wl51.m88460J0(str) && str2 != null && !wl51.m88460J0(str2)) {
                xokVar.f264293a = str;
                xokVar.f264294b = str2;
                xokVar.f264297e = 1;
                objM30151q = m30151q(xokVar);
                if (objM30151q != obj) {
                }
                return obj;
            }
            return w2a1Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM30151q);
            return w2a1Var;
        }
        str2 = xokVar.f264294b;
        str = xokVar.f264293a;
        bga.m29073P(objM30151q);
        LinkedHashMap linkedHashMap = (LinkedHashMap) objM30151q;
        LinkedHashSet linkedHashSet = (LinkedHashSet) linkedHashMap.get(str);
        if (linkedHashSet != null) {
            linkedHashSet.remove(str2);
            if (linkedHashSet.isEmpty()) {
                linkedHashMap.remove(str);
            } else {
                linkedHashMap.put(str, linkedHashSet);
            }
            xokVar.f264293a = null;
            xokVar.f264294b = null;
            xokVar.f264297e = 2;
            if (m30126A(linkedHashMap, xokVar) == obj) {
                return obj;
            }
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: H */
    public final Object m30133H(String str, ibk ibkVar) {
        yok yokVar;
        long jCurrentTimeMillis;
        String str2;
        LinkedHashMap linkedHashMap;
        long j;
        if (ibkVar instanceof yok) {
            yokVar = (yok) ibkVar;
            int i = yokVar.f274688f;
            if ((i & Integer.MIN_VALUE) != 0) {
                yokVar.f274688f = i - Integer.MIN_VALUE;
            } else {
                yokVar = new yok(this, ibkVar);
            }
        } else {
            yokVar = new yok(this, ibkVar);
        }
        Object objM30147m = yokVar.f274686d;
        int i2 = yokVar.f274688f;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM30147m);
            if (wl51.m88460J0(str)) {
                return w2a1Var;
            }
            jCurrentTimeMillis = System.currentTimeMillis();
            yokVar.f274683a = str;
            yokVar.f274685c = jCurrentTimeMillis;
            yokVar.f274688f = 1;
            objM30147m = m30147m(yokVar);
            if (objM30147m != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            jCurrentTimeMillis = yokVar.f274685c;
            str = yokVar.f274683a;
            bga.m29073P(objM30147m);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = yokVar.f274685c;
            linkedHashMap = yokVar.f274684b;
            str2 = yokVar.f274683a;
            bga.m29073P(objM30147m);
        }
        lv31 lv31VarEdit = ((hv31) objM30147m).edit();
        lv31VarEdit.m60051d(f29519i, str2);
        lv31VarEdit.m60050c(f29520j, j);
        lv31VarEdit.m60051d(f29521k, g6f.m43753y0(linkedHashMap.entrySet(), "\n", null, null, cmk.f39718d, 30));
        lv31VarEdit.m60055h();
        return w2a1Var;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) objM30147m;
        linkedHashMap2.remove(str);
        linkedHashMap2.put(str, qyg1.m74181K(jCurrentTimeMillis));
        while (linkedHashMap2.size() > 20) {
            linkedHashMap2.remove(g6f.m43739p0(linkedHashMap2.keySet()));
        }
        yokVar.f274683a = str;
        yokVar.f274684b = linkedHashMap2;
        yokVar.f274685c = jCurrentTimeMillis;
        yokVar.f274688f = 2;
        Object objM30135J = m30135J(yokVar);
        if (objM30135J != obj) {
            str2 = str;
            linkedHashMap = linkedHashMap2;
            objM30147m = objM30135J;
            j = jCurrentTimeMillis;
            lv31 lv31VarEdit2 = ((hv31) objM30147m).edit();
            lv31VarEdit2.m60051d(f29519i, str2);
            lv31VarEdit2.m60050c(f29520j, j);
            lv31VarEdit2.m60051d(f29521k, g6f.m43753y0(linkedHashMap.entrySet(), "\n", null, null, cmk.f39718d, 30));
            lv31VarEdit2.m60055h();
            return w2a1Var;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (m30160z(r9, r0) == r4) goto L25;
     */
    /* JADX INFO: renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m30134I(String str, String str2, String str3, ibk ibkVar) {
        zok zokVar;
        if (ibkVar instanceof zok) {
            zokVar = (zok) ibkVar;
            int i = zokVar.f284807f;
            if ((i & Integer.MIN_VALUE) != 0) {
                zokVar.f284807f = i - Integer.MIN_VALUE;
            } else {
                zokVar = new zok(this, ibkVar);
            }
        } else {
            zokVar = new zok(this, ibkVar);
        }
        Object objM30150p = zokVar.f284805d;
        int i2 = zokVar.f284807f;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM30150p);
            zokVar.f284802a = str;
            zokVar.f284803b = str2;
            zokVar.f284804c = str3;
            zokVar.f284807f = 1;
            objM30150p = m30150p(zokVar);
            if (objM30150p != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str3 = zokVar.f284804c;
            str2 = zokVar.f284803b;
            str = zokVar.f284802a;
            bga.m29073P(objM30150p);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM30150p);
        }
        return w2a1.f247311a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) objM30150p;
        linkedHashMap.remove(str);
        linkedHashMap.put(str, new jj70(str2, str3, str));
        while (linkedHashMap.size() > 20) {
            linkedHashMap.remove(g6f.m43739p0(linkedHashMap.keySet()));
        }
        zokVar.f284802a = null;
        zokVar.f284803b = null;
        zokVar.f284804c = null;
        zokVar.f284807f = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: J */
    public final Object m30135J(ibk ibkVar) {
        apk apkVar;
        if (ibkVar instanceof apk) {
            apkVar = (apk) ibkVar;
            int i = apkVar.f17967c;
            if ((i & Integer.MIN_VALUE) != 0) {
                apkVar.f17967c = i - Integer.MIN_VALUE;
            } else {
                apkVar = new apk(this, ibkVar);
            }
        } else {
            apkVar = new apk(this, ibkVar);
        }
        Object obj = apkVar.f17965a;
        int i2 = apkVar.f17967c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        apkVar.f17967c = 1;
        Object objM96567o = zn91.m96567o(this.f29530a, apkVar);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (m30139d(r0) == r4) goto L21;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m30136a(ibk ibkVar) {
        snk snkVar;
        if (ibkVar instanceof snk) {
            snkVar = (snk) ibkVar;
            int i = snkVar.f210953c;
            if ((i & Integer.MIN_VALUE) != 0) {
                snkVar.f210953c = i - Integer.MIN_VALUE;
            } else {
                snkVar = new snk(this, ibkVar);
            }
        } else {
            snkVar = new snk(this, ibkVar);
        }
        Object objM30135J = snkVar.f210951a;
        int i2 = snkVar.f210953c;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM30135J);
            snkVar.f210953c = 1;
            objM30135J = m30135J(snkVar);
            if (objM30135J != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            bga.m29073P(objM30135J);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM30135J);
        }
        return w2a1.f247311a;
        lv31 lv31VarEdit = ((hv31) objM30135J).edit();
        lv31VarEdit.m60053f(f29519i);
        lv31VarEdit.m60053f(f29520j);
        lv31VarEdit.m60053f(f29521k);
        lv31VarEdit.m60053f(f29523m);
        lv31VarEdit.m60053f(f29528r);
        lv31VarEdit.m60053f(f29529s);
        lv31VarEdit.m60053f(wq2.m88731a());
        lv31VarEdit.m60055h();
        snkVar.f210953c = 2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0094 A[PHI: r11
      0x0094: PHI (r11v2 java.lang.String) = (r11v1 java.lang.String), (r11v1 java.lang.String), (r11v7 java.lang.String) binds: [B:34:0x0078, B:36:0x0091, B:19:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x009f A[PHI: r11 r12
      0x009f: PHI (r11v3 java.lang.String) = (r11v2 java.lang.String), (r11v8 java.lang.String) binds: [B:39:0x009c, B:18:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r12v9 java.lang.Object) = (r12v8 java.lang.Object), (r12v1 java.lang.Object) binds: [B:39:0x009c, B:18:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m30137b(String str, ibk ibkVar) {
        tnk tnkVar;
        LinkedHashMap linkedHashMap;
        if (ibkVar instanceof tnk) {
            tnkVar = (tnk) ibkVar;
            int i = tnkVar.f221994d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tnkVar.f221994d = i - Integer.MIN_VALUE;
            } else {
                tnkVar = new tnk(this, ibkVar);
            }
        } else {
            tnkVar = new tnk(this, ibkVar);
        }
        Object objM30135J = tnkVar.f221992b;
        int i2 = tnkVar.f221994d;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM30135J);
            if (!wl51.m88460J0(str)) {
                tnkVar.f221991a = str;
                tnkVar.f221994d = 1;
                objM30135J = m30135J(tnkVar);
                if (objM30135J != obj) {
                }
                return obj;
            }
            return w2a1Var;
        }
        if (i2 == 1) {
            str = tnkVar.f221991a;
            bga.m29073P(objM30135J);
        } else {
            if (i2 == 2) {
                str = tnkVar.f221991a;
                bga.m29073P(objM30135J);
                tnkVar.f221991a = str;
                tnkVar.f221994d = 3;
                objM30135J = m30151q(tnkVar);
                if (objM30135J != obj) {
                }
                return obj;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM30135J);
                return w2a1Var;
            }
            str = tnkVar.f221991a;
            bga.m29073P(objM30135J);
        }
        linkedHashMap = (LinkedHashMap) objM30135J;
        if (linkedHashMap.remove(str) != null) {
            tnkVar.f221991a = null;
            tnkVar.f221994d = 4;
            if (m30126A(linkedHashMap, tnkVar) == obj) {
                return obj;
            }
        }
        return w2a1Var;
        hv31 hv31Var = (hv31) objM30135J;
        fv31 fv31Var = f29519i;
        String strMo48710e = hv31Var.mo48710e(fv31Var, null);
        if (strMo48710e == null || wl51.m88460J0(strMo48710e)) {
            strMo48710e = null;
        }
        if (wj50.m88271j(strMo48710e, str)) {
            lv31 lv31VarEdit = hv31Var.edit();
            lv31VarEdit.m60053f(fv31Var);
            lv31VarEdit.m60053f(f29520j);
            lv31VarEdit.m60055h();
            tnkVar.f221991a = str;
            tnkVar.f221994d = 2;
            if (m30139d(tnkVar) != obj) {
                tnkVar.f221991a = str;
                tnkVar.f221994d = 3;
                objM30135J = m30151q(tnkVar);
                if (objM30135J != obj) {
                    linkedHashMap = (LinkedHashMap) objM30135J;
                    if (linkedHashMap.remove(str) != null) {
                        tnkVar.f221991a = null;
                        tnkVar.f221994d = 4;
                        if (m30126A(linkedHashMap, tnkVar) == obj) {
                        }
                    }
                    return w2a1Var;
                }
            }
        } else {
            tnkVar.f221991a = str;
            tnkVar.f221994d = 3;
            objM30135J = m30151q(tnkVar);
            if (objM30135J != obj) {
                linkedHashMap = (LinkedHashMap) objM30135J;
                if (linkedHashMap.remove(str) != null) {
                    tnkVar.f221991a = null;
                    tnkVar.f221994d = 4;
                    if (m30126A(linkedHashMap, tnkVar) == obj) {
                    }
                }
                return w2a1Var;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0082 A[PHI: r1 r9
      0x0082: PHI (r1v4 java.lang.String) = (r1v3 java.lang.String), (r1v6 java.lang.String) binds: [B:28:0x007f, B:17:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r9v4 p.jj70) = (r9v3 p.jj70), (r9v13 p.jj70) binds: [B:28:0x007f, B:17:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
    
        if (r10 == r6) goto L38;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m30138c(String str, ibk ibkVar) {
        vnk vnkVar;
        String str2;
        jj70 jj70Var;
        LinkedHashMap linkedHashMap;
        String strM53526a;
        if (ibkVar instanceof vnk) {
            vnkVar = (vnk) ibkVar;
            int i = vnkVar.f243154e;
            if ((i & Integer.MIN_VALUE) != 0) {
                vnkVar.f243154e = i - Integer.MIN_VALUE;
            } else {
                vnkVar = new vnk(this, ibkVar);
            }
        } else {
            vnkVar = new vnk(this, ibkVar);
        }
        Object objM30149o = vnkVar.f243152c;
        int i2 = vnkVar.f243154e;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM30149o);
            vnkVar.f243150a = str;
            vnkVar.f243154e = 1;
            objM30149o = m30149o(vnkVar);
            if (objM30149o != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str = vnkVar.f243150a;
            bga.m29073P(objM30149o);
        } else {
            if (i2 == 2) {
                jj70Var = vnkVar.f243151b;
                str2 = vnkVar.f243150a;
                bga.m29073P(objM30149o);
                linkedHashMap = (LinkedHashMap) objM30149o;
                linkedHashMap.remove(str2);
                vnkVar.f243150a = str2;
                vnkVar.f243151b = jj70Var;
                vnkVar.f243154e = 3;
                if (m30160z(linkedHashMap, vnkVar) != obj) {
                    if (jj70Var != null) {
                        strM53526a = jj70Var.m53526a();
                    } else {
                        strM53526a = null;
                    }
                    if (wj50.m88271j(strM53526a, str2)) {
                        vnkVar.f243150a = null;
                        vnkVar.f243151b = null;
                        vnkVar.f243154e = 4;
                        objM30149o = m30135J(vnkVar);
                    }
                    return w2a1.f247311a;
                }
                return obj;
            }
            if (i2 == 3) {
                jj70Var = vnkVar.f243151b;
                str2 = vnkVar.f243150a;
                bga.m29073P(objM30149o);
                if (jj70Var != null) {
                    strM53526a = jj70Var.m53526a();
                } else {
                    strM53526a = null;
                }
                if (wj50.m88271j(strM53526a, str2)) {
                    vnkVar.f243150a = null;
                    vnkVar.f243151b = null;
                    vnkVar.f243154e = 4;
                    objM30149o = m30135J(vnkVar);
                }
                return w2a1.f247311a;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM30149o);
        }
        lv31 lv31VarEdit = ((hv31) objM30149o).edit();
        lv31VarEdit.m60053f(f29524n);
        lv31VarEdit.m60053f(f29525o);
        lv31VarEdit.m60053f(f29526p);
        lv31VarEdit.m60055h();
        return w2a1.f247311a;
        jj70 jj70Var2 = (jj70) objM30149o;
        vnkVar.f243150a = str;
        vnkVar.f243151b = jj70Var2;
        vnkVar.f243154e = 2;
        Object objM30150p = m30150p(vnkVar);
        if (objM30150p != obj) {
            str2 = str;
            jj70Var = jj70Var2;
            objM30149o = objM30150p;
            linkedHashMap = (LinkedHashMap) objM30149o;
            linkedHashMap.remove(str2);
            vnkVar.f243150a = str2;
            vnkVar.f243151b = jj70Var;
            vnkVar.f243154e = 3;
            if (m30160z(linkedHashMap, vnkVar) != obj) {
                if (jj70Var != null) {
                    strM53526a = jj70Var.m53526a();
                } else {
                    strM53526a = null;
                }
                if (wj50.m88271j(strM53526a, str2)) {
                    vnkVar.f243150a = null;
                    vnkVar.f243151b = null;
                    vnkVar.f243154e = 4;
                    objM30149o = m30135J(vnkVar);
                }
                return w2a1.f247311a;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m30139d(ibk ibkVar) {
        unk unkVar;
        if (ibkVar instanceof unk) {
            unkVar = (unk) ibkVar;
            int i = unkVar.f232187c;
            if ((i & Integer.MIN_VALUE) != 0) {
                unkVar.f232187c = i - Integer.MIN_VALUE;
            } else {
                unkVar = new unk(this, ibkVar);
            }
        } else {
            unkVar = new unk(this, ibkVar);
        }
        Object objM30135J = unkVar.f232185a;
        int i2 = unkVar.f232187c;
        if (i2 == 0) {
            bga.m29073P(objM30135J);
            unkVar.f232187c = 1;
            objM30135J = m30135J(unkVar);
            Object obj = yuk.f276404a;
            if (objM30135J == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM30135J);
        }
        lv31 lv31VarEdit = ((hv31) objM30135J).edit();
        lv31VarEdit.m60053f(f29524n);
        lv31VarEdit.m60053f(f29525o);
        lv31VarEdit.m60053f(f29526p);
        lv31VarEdit.m60053f(f29527q);
        lv31VarEdit.m60055h();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (r7 == r4) goto L25;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m30140e(String str, ibk ibkVar) {
        wnk wnkVar;
        if (ibkVar instanceof wnk) {
            wnkVar = (wnk) ibkVar;
            int i = wnkVar.f253200d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wnkVar.f253200d = i - Integer.MIN_VALUE;
            } else {
                wnkVar = new wnk(this, ibkVar);
            }
        } else {
            wnkVar = new wnk(this, ibkVar);
        }
        Object objM30152r = wnkVar.f253198b;
        int i2 = wnkVar.f253200d;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM30152r);
            if (!wl51.m88460J0(str)) {
                wnkVar.f253197a = str;
                wnkVar.f253200d = 1;
                objM30152r = m30152r(wnkVar);
                if (objM30152r != obj) {
                }
                return obj;
            }
            return w2a1.f247311a;
        }
        if (i2 == 1) {
            str = wnkVar.f253197a;
            bga.m29073P(objM30152r);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM30152r);
        }
        lv31 lv31VarEdit = ((hv31) objM30152r).edit();
        lv31VarEdit.m60053f(f29522l);
        lv31VarEdit.m60055h();
        return w2a1.f247311a;
        if (wj50.m88271j(objM30152r, str)) {
            wnkVar.f253197a = null;
            wnkVar.f253200d = 2;
            objM30152r = m30135J(wnkVar);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b9, code lost:
    
        if (r5 == r13) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c2, code lost:
    
        if (((java.lang.Boolean) r5).booleanValue() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00da, code lost:
    
        if (r5 == r13) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e3, code lost:
    
        if (((java.lang.Boolean) r5).booleanValue() != false) goto L45;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum m30141f(String str, long j, boolean z, ibk ibkVar) {
        xnk xnkVar;
        boolean zM87952j;
        String str2;
        boolean z2;
        long j2;
        long j3;
        long j4;
        if (ibkVar instanceof xnk) {
            xnkVar = (xnk) ibkVar;
            int i = xnkVar.f263642i;
            if ((i & Integer.MIN_VALUE) != 0) {
                xnkVar.f263642i = i - Integer.MIN_VALUE;
            } else {
                xnkVar = new xnk(this, ibkVar);
            }
        } else {
            xnkVar = new xnk(this, ibkVar);
        }
        Object objM86185e = xnkVar.f263640g;
        int i2 = xnkVar.f263642i;
        vq2 vq2Var = this.f29531b;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86185e);
            zM87952j = this.f29533d.m87952j();
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            long j5 = zM87952j ? f29516f : f29517g;
            if (jCurrentTimeMillis >= j5) {
                if (zM87952j) {
                    xnkVar.f263634a = null;
                    xnkVar.f263635b = j;
                    xnkVar.f263638e = z;
                    xnkVar.f263639f = zM87952j;
                    xnkVar.f263636c = jCurrentTimeMillis;
                    xnkVar.f263637d = j5;
                    xnkVar.f263642i = 3;
                    objM86185e = vq2Var.m86185e(str);
                }
                return rnk.f200936b;
            }
            if (!z && zM87952j) {
                xnkVar.f263634a = str;
                xnkVar.f263635b = j;
                xnkVar.f263638e = z;
                xnkVar.f263639f = zM87952j;
                xnkVar.f263636c = jCurrentTimeMillis;
                xnkVar.f263637d = j5;
                xnkVar.f263642i = 1;
                objM86185e = ((trd) this.f29532c).m81345b(xnkVar);
                if (objM86185e != yukVar) {
                    str2 = str;
                    z2 = z;
                    j2 = j;
                    j3 = j5;
                    j4 = jCurrentTimeMillis;
                    if (((Number) objM86185e).longValue() > j2) {
                        xnkVar.f263634a = null;
                        xnkVar.f263635b = j2;
                        xnkVar.f263638e = z2;
                        xnkVar.f263639f = zM87952j;
                        xnkVar.f263636c = j4;
                        xnkVar.f263637d = j3;
                        xnkVar.f263642i = 2;
                        objM86185e = vq2Var.m86185e(str2);
                    }
                }
            }
            return rnk.f200935a;
            return yukVar;
        }
        if (i2 == 1) {
            j3 = xnkVar.f263637d;
            j4 = xnkVar.f263636c;
            zM87952j = xnkVar.f263639f;
            z2 = xnkVar.f263638e;
            j2 = xnkVar.f263635b;
            str2 = xnkVar.f263634a;
            bga.m29073P(objM86185e);
            if (((Number) objM86185e).longValue() > j2) {
                xnkVar.f263634a = null;
                xnkVar.f263635b = j2;
                xnkVar.f263638e = z2;
                xnkVar.f263639f = zM87952j;
                xnkVar.f263636c = j4;
                xnkVar.f263637d = j3;
                xnkVar.f263642i = 2;
                objM86185e = vq2Var.m86185e(str2);
            }
            return rnk.f200935a;
        }
        if (i2 == 2) {
            bga.m29073P(objM86185e);
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86185e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m30142h(String str, String str2, ibk ibkVar) {
        ynk ynkVar;
        if (ibkVar instanceof ynk) {
            ynkVar = (ynk) ibkVar;
            int i = ynkVar.f274468d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ynkVar.f274468d = i - Integer.MIN_VALUE;
            } else {
                ynkVar = new ynk(this, ibkVar);
            }
        } else {
            ynkVar = new ynk(this, ibkVar);
        }
        Object objM30145k = ynkVar.f274466b;
        int i2 = ynkVar.f274468d;
        if (i2 == 0) {
            bga.m29073P(objM30145k);
            if (wl51.m88460J0(str) || wl51.m88460J0(str2)) {
                return qyg1.m74178H(false);
            }
            ynkVar.f274465a = str2;
            ynkVar.f274468d = 1;
            objM30145k = m30145k(str, ynkVar);
            Object obj = yuk.f276404a;
            if (objM30145k == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = ynkVar.f274465a;
            bga.m29073P(objM30145k);
        }
        return qyg1.m74178H(((Set) objM30145k).contains(str2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m30143i(String str, ibk ibkVar) {
        znk znkVar;
        if (ibkVar instanceof znk) {
            znkVar = (znk) ibkVar;
            int i = znkVar.f284517d;
            if ((i & Integer.MIN_VALUE) != 0) {
                znkVar.f284517d = i - Integer.MIN_VALUE;
            } else {
                znkVar = new znk(this, ibkVar);
            }
        } else {
            znkVar = new znk(this, ibkVar);
        }
        Object objM30147m = znkVar.f284515b;
        int i2 = znkVar.f284517d;
        if (i2 == 0) {
            bga.m29073P(objM30147m);
            if (wl51.m88460J0(str)) {
                return null;
            }
            znkVar.f284514a = str;
            znkVar.f284517d = 1;
            objM30147m = m30147m(znkVar);
            Object obj = yuk.f276404a;
            if (objM30147m == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = znkVar.f284514a;
            bga.m29073P(objM30147m);
        }
        return ((LinkedHashMap) objM30147m).get(str);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x0093 A[LOOP:0: B:36:0x008b->B:38:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4 A[LOOP:1: B:40:0x009e->B:42:0x00a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m30144j(String str, String str2, ibk ibkVar) {
        aok aokVar;
        String str3;
        String str4;
        LinkedHashMap linkedHashMap;
        LinkedHashSet linkedHashSet;
        if (ibkVar instanceof aok) {
            aokVar = (aok) ibkVar;
            int i = aokVar.f17709e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aokVar.f17709e = i - Integer.MIN_VALUE;
            } else {
                aokVar = new aok(this, ibkVar);
            }
        } else {
            aokVar = new aok(this, ibkVar);
        }
        Object objM30151q = aokVar.f17707c;
        int i2 = aokVar.f17709e;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM30151q);
            if (!wl51.m88460J0(str) && str2 != null && !wl51.m88460J0(str2)) {
                aokVar.f17705a = str;
                aokVar.f17706b = str2;
                aokVar.f17709e = 1;
                if (m30156v(str2, aokVar) != obj) {
                }
                return obj;
            }
            return w2a1Var;
        }
        if (i2 == 1) {
            str2 = aokVar.f17706b;
            str = aokVar.f17705a;
            bga.m29073P(objM30151q);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM30151q);
                return w2a1Var;
            }
            str4 = aokVar.f17706b;
            str3 = aokVar.f17705a;
            bga.m29073P(objM30151q);
        }
        linkedHashMap = (LinkedHashMap) objM30151q;
        linkedHashSet = (LinkedHashSet) linkedHashMap.remove(str3);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
        }
        linkedHashSet.remove(str4);
        linkedHashSet.add(str4);
        while (linkedHashSet.size() > 20) {
            linkedHashSet.remove(g6f.m43739p0(linkedHashSet));
        }
        linkedHashMap.put(str3, linkedHashSet);
        while (linkedHashMap.size() > 20) {
            linkedHashMap.remove(g6f.m43739p0(linkedHashMap.keySet()));
        }
        aokVar.f17705a = null;
        aokVar.f17706b = null;
        aokVar.f17709e = 3;
        if (m30126A(linkedHashMap, aokVar) != obj) {
            return obj;
        }
        return w2a1Var;
        aokVar.f17705a = str;
        aokVar.f17706b = str2;
        aokVar.f17709e = 2;
        objM30151q = m30151q(aokVar);
        if (objM30151q != obj) {
            String str5 = str2;
            str3 = str;
            str4 = str5;
            linkedHashMap = (LinkedHashMap) objM30151q;
            linkedHashSet = (LinkedHashSet) linkedHashMap.remove(str3);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
            }
            linkedHashSet.remove(str4);
            linkedHashSet.add(str4);
            while (linkedHashSet.size() > 20) {
                linkedHashSet.remove(g6f.m43739p0(linkedHashSet));
            }
            linkedHashMap.put(str3, linkedHashSet);
            while (linkedHashMap.size() > 20) {
                linkedHashMap.remove(g6f.m43739p0(linkedHashMap.keySet()));
            }
            aokVar.f17705a = null;
            aokVar.f17706b = null;
            aokVar.f17709e = 3;
            if (m30126A(linkedHashMap, aokVar) != obj) {
                return w2a1Var;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m30145k(String str, ibk ibkVar) {
        bok bokVar;
        if (ibkVar instanceof bok) {
            bokVar = (bok) ibkVar;
            int i = bokVar.f29193d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bokVar.f29193d = i - Integer.MIN_VALUE;
            } else {
                bokVar = new bok(this, ibkVar);
            }
        } else {
            bokVar = new bok(this, ibkVar);
        }
        Object objM30151q = bokVar.f29191b;
        int i2 = bokVar.f29193d;
        if (i2 == 0) {
            bga.m29073P(objM30151q);
            if (!wl51.m88460J0(str)) {
                bokVar.f29190a = str;
                bokVar.f29193d = 1;
                objM30151q = m30151q(bokVar);
                Object obj = yuk.f276404a;
                if (objM30151q == obj) {
                    return obj;
                }
            }
            return gbu.f78413a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = bokVar.f29190a;
        bga.m29073P(objM30151q);
        Set set = (Set) ((LinkedHashMap) objM30151q).get(str);
        if (set != null) {
            return set;
        }
        return gbu.f78413a;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: l */
    public final Object m30146l(boolean z, ibk ibkVar) {
        cok cokVar;
        String str;
        long j;
        boolean z2;
        int iOrdinal;
        if (ibkVar instanceof cok) {
            cokVar = (cok) ibkVar;
            int i = cokVar.f40286f;
            if ((i & Integer.MIN_VALUE) != 0) {
                cokVar.f40286f = i - Integer.MIN_VALUE;
            } else {
                cokVar = new cok(this, ibkVar);
            }
        } else {
            cokVar = new cok(this, ibkVar);
        }
        cok cokVar2 = cokVar;
        Object objM30135J = cokVar2.f40284d;
        int i2 = cokVar2.f40286f;
        fbk fbkVar = null;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM30135J);
            trd trdVar = (trd) this.f29532c;
            boolean zCompareAndSet = trdVar.f223047c.compareAndSet(false, true);
            xuk xukVar = this.f29534e;
            if (zCompareAndSet) {
                x0h1.m89578u(xukVar, null, 0, new C2069kx(trdVar, fbkVar, 9), 3);
            }
            this.f29531b.m86187g(xukVar);
            cokVar2.f40281a = z;
            cokVar2.f40286f = 1;
            objM30135J = m30135J(cokVar2);
            if (objM30135J == obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            z = cokVar2.f40281a;
            bga.m29073P(objM30135J);
        } else {
            if (i2 == 2) {
                bga.m29073P(objM30135J);
                return null;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM30135J);
                return null;
            }
            long j2 = cokVar2.f40283c;
            z2 = cokVar2.f40281a;
            str = cokVar2.f40282b;
            bga.m29073P(objM30135J);
            j = j2;
        }
        iOrdinal = ((rnk) objM30135J).ordinal();
        if (iOrdinal != 0) {
            return str;
        }
        if (iOrdinal == 1) {
            throw new NoWhenBranchMatchedException();
        }
        cokVar2.f40282b = null;
        cokVar2.f40281a = z2;
        cokVar2.f40283c = j;
        cokVar2.f40286f = 4;
        if (m30136a(cokVar2) != obj) {
            return obj;
        }
        return null;
        boolean z3 = z;
        hv31 hv31Var = (hv31) objM30135J;
        String strMo48710e = hv31Var.mo48710e(f29519i, null);
        if (strMo48710e == null || wl51.m88460J0(strMo48710e)) {
            strMo48710e = null;
        }
        long jMo48712g = hv31Var.mo48712g(f29520j, 0L);
        if (strMo48710e == null || jMo48712g <= 0) {
            cokVar2.f40282b = null;
            cokVar2.f40281a = z3;
            cokVar2.f40283c = jMo48712g;
            cokVar2.f40286f = 2;
            if (m30136a(cokVar2) != obj) {
                return null;
            }
        } else {
            cokVar2.f40282b = strMo48710e;
            cokVar2.f40281a = z3;
            cokVar2.f40283c = jMo48712g;
            cokVar2.f40286f = 3;
            str = strMo48710e;
            j = jMo48712g;
            objM30135J = m30141f(str, j, z3, cokVar2);
            if (objM30135J != obj) {
                z2 = z3;
                iOrdinal = ((rnk) objM30135J).ordinal();
                if (iOrdinal != 0) {
                    return str;
                }
                if (iOrdinal == 1) {
                    throw new NoWhenBranchMatchedException();
                }
                cokVar2.f40282b = null;
                cokVar2.f40281a = z2;
                cokVar2.f40283c = j;
                cokVar2.f40286f = 4;
                if (m30136a(cokVar2) != obj) {
                    return null;
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Serializable m30147m(ibk ibkVar) {
        dok dokVar;
        if (ibkVar instanceof dok) {
            dokVar = (dok) ibkVar;
            int i = dokVar.f51057c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dokVar.f51057c = i - Integer.MIN_VALUE;
            } else {
                dokVar = new dok(this, ibkVar);
            }
        } else {
            dokVar = new dok(this, ibkVar);
        }
        Object objM30135J = dokVar.f51055a;
        int i2 = dokVar.f51057c;
        if (i2 == 0) {
            bga.m29073P(objM30135J);
            dokVar.f51057c = 1;
            objM30135J = m30135J(dokVar);
            yuk yukVar = yuk.f276404a;
            if (objM30135J == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM30135J);
        }
        String strMo48710e = ((hv31) objM30135J).mo48710e(f29521k, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (strMo48710e != null && strMo48710e.length() != 0) {
            Iterator it = wl51.m88476Z0(strMo48710e, new char[]{'\n'}, 6).iterator();
            while (it.hasNext()) {
                List listM88476Z0 = wl51.m88476Z0((String) it.next(), new char[]{'\t'}, 6);
                String str = (String) g6f.m43745s0(listM88476Z0);
                if (str == null || wl51.m88460J0(str)) {
                    str = null;
                }
                String str2 = (String) g6f.m43747t0(1, listM88476Z0);
                Long lM29808s0 = str2 != null ? bm51.m29808s0(10, str2) : null;
                if (str != null && lM29808s0 != null) {
                    linkedHashMap.put(str, lM29808s0);
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r7 == r4) goto L26;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m30148n(String str, ibk ibkVar) {
        fok fokVar;
        if (ibkVar instanceof fok) {
            fokVar = (fok) ibkVar;
            int i = fokVar.f71557d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fokVar.f71557d = i - Integer.MIN_VALUE;
            } else {
                fokVar = new fok(this, ibkVar);
            }
        } else {
            fokVar = new fok(this, ibkVar);
        }
        Object objM30150p = fokVar.f71555b;
        int i2 = fokVar.f71557d;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM30150p);
            if (wl51.m88460J0(str)) {
                return null;
            }
            fokVar.f71554a = str;
            fokVar.f71557d = 1;
            objM30150p = m30150p(fokVar);
            if (objM30150p != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str = fokVar.f71554a;
            bga.m29073P(objM30150p);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = fokVar.f71554a;
            bga.m29073P(objM30150p);
        }
        jj70 jj70Var = (jj70) objM30150p;
        if (jj70Var == null || !wj50.m88271j(jj70Var.m53526a(), str)) {
            return null;
        }
        return jj70Var;
        jj70 jj70Var2 = (jj70) ((LinkedHashMap) objM30150p).get(str);
        if (jj70Var2 != null) {
            return jj70Var2;
        }
        fokVar.f71554a = str;
        fokVar.f71557d = 2;
        objM30150p = m30149o(fokVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m30149o(ibk ibkVar) {
        eok eokVar;
        if (ibkVar instanceof eok) {
            eokVar = (eok) ibkVar;
            int i = eokVar.f61433c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eokVar.f61433c = i - Integer.MIN_VALUE;
            } else {
                eokVar = new eok(this, ibkVar);
            }
        } else {
            eokVar = new eok(this, ibkVar);
        }
        Object objM30135J = eokVar.f61431a;
        int i2 = eokVar.f61433c;
        if (i2 == 0) {
            bga.m29073P(objM30135J);
            eokVar.f61433c = 1;
            objM30135J = m30135J(eokVar);
            Object obj = yuk.f276404a;
            if (objM30135J == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM30135J);
        }
        hv31 hv31Var = (hv31) objM30135J;
        String strMo48710e = hv31Var.mo48710e(f29524n, null);
        if (strMo48710e == null) {
            return null;
        }
        if (wl51.m88460J0(strMo48710e)) {
            strMo48710e = null;
        }
        if (strMo48710e == null) {
            return null;
        }
        String strMo48710e2 = hv31Var.mo48710e(f29525o, null);
        if (strMo48710e2 == null || wl51.m88460J0(strMo48710e2)) {
            strMo48710e2 = null;
        }
        String strMo48710e3 = hv31Var.mo48710e(f29526p, null);
        if (strMo48710e3 == null) {
            return null;
        }
        if (wl51.m88460J0(strMo48710e3)) {
            strMo48710e3 = null;
        }
        if (strMo48710e3 == null) {
            return null;
        }
        return new jj70(strMo48710e, strMo48710e2, strMo48710e3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Serializable m30150p(ibk ibkVar) {
        gok gokVar;
        if (ibkVar instanceof gok) {
            gokVar = (gok) ibkVar;
            int i = gokVar.f82973c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gokVar.f82973c = i - Integer.MIN_VALUE;
            } else {
                gokVar = new gok(this, ibkVar);
            }
        } else {
            gokVar = new gok(this, ibkVar);
        }
        Object objM30135J = gokVar.f82971a;
        int i2 = gokVar.f82973c;
        if (i2 == 0) {
            bga.m29073P(objM30135J);
            gokVar.f82973c = 1;
            objM30135J = m30135J(gokVar);
            yuk yukVar = yuk.f276404a;
            if (objM30135J == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM30135J);
        }
        String strMo48710e = ((hv31) objM30135J).mo48710e(f29527q, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (strMo48710e != null && strMo48710e.length() != 0) {
            Iterator it = wl51.m88476Z0(strMo48710e, new char[]{'\n'}, 6).iterator();
            while (it.hasNext()) {
                List listM88476Z0 = wl51.m88476Z0((String) it.next(), new char[]{'\t'}, 6);
                String str = (String) g6f.m43745s0(listM88476Z0);
                if (str == null || wl51.m88460J0(str)) {
                    str = null;
                }
                String strM43753y0 = g6f.m43753y0(g6f.m43729k0(listM88476Z0, 2), "\t", null, null, null, 62);
                if (wl51.m88460J0(strM43753y0)) {
                    strM43753y0 = null;
                }
                if (str != null && listM88476Z0.size() >= 2 && strM43753y0 != null) {
                    Object obj = listM88476Z0.get(1);
                    if (wl51.m88460J0((String) obj)) {
                        obj = null;
                    }
                    linkedHashMap.put(str, new jj70(strM43753y0, (String) obj, str));
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    public final Serializable m30151q(ibk ibkVar) {
        hok hokVar;
        if (ibkVar instanceof hok) {
            hokVar = (hok) ibkVar;
            int i = hokVar.f93556c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hokVar.f93556c = i - Integer.MIN_VALUE;
            } else {
                hokVar = new hok(this, ibkVar);
            }
        } else {
            hokVar = new hok(this, ibkVar);
        }
        Object objM30135J = hokVar.f93554a;
        int i2 = hokVar.f93556c;
        if (i2 == 0) {
            bga.m29073P(objM30135J);
            hokVar.f93556c = 1;
            objM30135J = m30135J(hokVar);
            yuk yukVar = yuk.f276404a;
            if (objM30135J == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM30135J);
        }
        String strMo48710e = ((hv31) objM30135J).mo48710e(f29523m, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (strMo48710e != null && strMo48710e.length() != 0) {
            Iterator it = wl51.m88476Z0(strMo48710e, new char[]{'\n'}, 6).iterator();
            while (it.hasNext()) {
                List listM88476Z0 = wl51.m88476Z0((String) it.next(), new char[]{'\t'}, 6);
                String str = (String) g6f.m43745s0(listM88476Z0);
                if (str != null) {
                    if (wl51.m88460J0(str)) {
                        str = null;
                    }
                    if (str != null) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        int size = listM88476Z0.size();
                        for (int i3 = 1; i3 < size; i3++) {
                            Object obj = listM88476Z0.get(i3);
                            if (wl51.m88460J0((String) obj)) {
                                obj = null;
                            }
                            String str2 = (String) obj;
                            if (str2 != null) {
                                linkedHashSet.add(str2);
                            }
                        }
                        linkedHashMap.put(str, linkedHashSet);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public final Object m30152r(ibk ibkVar) {
        iok iokVar;
        if (ibkVar instanceof iok) {
            iokVar = (iok) ibkVar;
            int i = iokVar.f104240c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iokVar.f104240c = i - Integer.MIN_VALUE;
            } else {
                iokVar = new iok(this, ibkVar);
            }
        } else {
            iokVar = new iok(this, ibkVar);
        }
        Object objM30135J = iokVar.f104238a;
        int i2 = iokVar.f104240c;
        if (i2 == 0) {
            bga.m29073P(objM30135J);
            iokVar.f104240c = 1;
            objM30135J = m30135J(iokVar);
            Object obj = yuk.f276404a;
            if (objM30135J == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM30135J);
        }
        String strMo48710e = ((hv31) objM30135J).mo48710e(f29522l, null);
        if (strMo48710e == null || wl51.m88460J0(strMo48710e)) {
            return null;
        }
        return strMo48710e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    public final Serializable m30153s(ibk ibkVar) {
        jok jokVar;
        if (ibkVar instanceof jok) {
            jokVar = (jok) ibkVar;
            int i = jokVar.f114447c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jokVar.f114447c = i - Integer.MIN_VALUE;
            } else {
                jokVar = new jok(this, ibkVar);
            }
        } else {
            jokVar = new jok(this, ibkVar);
        }
        Object objM30135J = jokVar.f114445a;
        int i2 = jokVar.f114447c;
        if (i2 == 0) {
            bga.m29073P(objM30135J);
            jokVar.f114447c = 1;
            objM30135J = m30135J(jokVar);
            yuk yukVar = yuk.f276404a;
            if (objM30135J == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM30135J);
        }
        String strMo48710e = ((hv31) objM30135J).mo48710e(f29528r, null);
        if (strMo48710e == null || strMo48710e.length() == 0) {
            return new LinkedHashSet();
        }
        List listM88476Z0 = wl51.m88476Z0(strMo48710e, new char[]{'\t'}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM88476Z0) {
            if (!wl51.m88460J0((String) obj)) {
                arrayList.add(obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        g6f.m43720f1(arrayList, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: t */
    public final Object m30154t(ibk ibkVar) {
        kok kokVar;
        if (ibkVar instanceof kok) {
            kokVar = (kok) ibkVar;
            int i = kokVar.f124809c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kokVar.f124809c = i - Integer.MIN_VALUE;
            } else {
                kokVar = new kok(this, ibkVar);
            }
        } else {
            kokVar = new kok(this, ibkVar);
        }
        Object objM30135J = kokVar.f124807a;
        int i2 = kokVar.f124809c;
        if (i2 == 0) {
            bga.m29073P(objM30135J);
            kokVar.f124809c = 1;
            objM30135J = m30135J(kokVar);
            Object obj = yuk.f276404a;
            if (objM30135J == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM30135J);
        }
        String strMo48710e = ((hv31) objM30135J).mo48710e(f29519i, null);
        if (strMo48710e == null || wl51.m88460J0(strMo48710e)) {
            return null;
        }
        return strMo48710e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        if (r9 == r5) goto L35;
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m30155u(String str, ibk ibkVar) {
        lok lokVar;
        String str2;
        if (ibkVar instanceof lok) {
            lokVar = (lok) ibkVar;
            int i = lokVar.f135451e;
            if ((i & Integer.MIN_VALUE) != 0) {
                lokVar.f135451e = i - Integer.MIN_VALUE;
            } else {
                lokVar = new lok(this, ibkVar);
            }
        } else {
            lokVar = new lok(this, ibkVar);
        }
        Object objM30151q = lokVar.f135449c;
        int i2 = lokVar.f135451e;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM30151q);
            if (!wl51.m88460J0(str)) {
                lokVar.f135447a = str;
                lokVar.f135451e = 1;
                objM30151q = m30151q(lokVar);
                if (objM30151q != obj) {
                }
                return obj;
            }
            return null;
        }
        if (i2 == 1) {
            str = lokVar.f135447a;
            bga.m29073P(objM30151q);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = lokVar.f135448b;
            bga.m29073P(objM30151q);
        }
        Long l = (Long) ((LinkedHashMap) objM30151q).get(str2);
        if (l != null) {
            if (System.currentTimeMillis() - l.longValue() < f29516f) {
                return str2;
            }
        }
        return null;
        Object obj2 = null;
        for (Object obj3 : ((LinkedHashMap) objM30151q).entrySet()) {
            if (((LinkedHashSet) ((Map.Entry) obj3).getValue()).contains(str)) {
                obj2 = obj3;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry != null && (str2 = (String) entry.getKey()) != null) {
            lokVar.f135447a = null;
            lokVar.f135448b = str2;
            lokVar.f135451e = 2;
            objM30151q = m30147m(lokVar);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: v */
    public final Object m30156v(String str, ibk ibkVar) {
        mok mokVar;
        LinkedHashSet linkedHashSet;
        hv31 hv31Var;
        boolean zIsEmpty;
        fv31 fv31Var;
        if (ibkVar instanceof mok) {
            mokVar = (mok) ibkVar;
            int i = mokVar.f145695e;
            if ((i & Integer.MIN_VALUE) != 0) {
                mokVar.f145695e = i - Integer.MIN_VALUE;
            } else {
                mokVar = new mok(this, ibkVar);
            }
        } else {
            mokVar = new mok(this, ibkVar);
        }
        Object objM30153s = mokVar.f145693c;
        int i2 = mokVar.f145695e;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM30153s);
            mokVar.f145691a = str;
            mokVar.f145695e = 1;
            objM30153s = m30153s(mokVar);
            if (objM30153s != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str = mokVar.f145691a;
            bga.m29073P(objM30153s);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkedHashSet = mokVar.f145692b;
            bga.m29073P(objM30153s);
        }
        hv31Var = (hv31) objM30153s;
        zIsEmpty = linkedHashSet.isEmpty();
        fv31Var = f29528r;
        if (zIsEmpty) {
            lv31 lv31VarEdit = hv31Var.edit();
            lv31VarEdit.m60053f(fv31Var);
            lv31VarEdit.m60055h();
            return w2a1Var;
        }
        lv31 lv31VarEdit2 = hv31Var.edit();
        lv31VarEdit2.m60051d(fv31Var, m30125g(linkedHashSet));
        lv31VarEdit2.m60055h();
        return w2a1Var;
        LinkedHashSet linkedHashSet2 = (LinkedHashSet) objM30153s;
        if (!linkedHashSet2.remove(str)) {
            return w2a1Var;
        }
        mokVar.f145691a = null;
        mokVar.f145692b = linkedHashSet2;
        mokVar.f145695e = 2;
        Object objM30135J = m30135J(mokVar);
        if (objM30135J != obj) {
            objM30153s = objM30135J;
            linkedHashSet = linkedHashSet2;
            hv31Var = (hv31) objM30153s;
            zIsEmpty = linkedHashSet.isEmpty();
            fv31Var = f29528r;
            if (zIsEmpty) {
                lv31 lv31VarEdit3 = hv31Var.edit();
                lv31VarEdit3.m60053f(fv31Var);
                lv31VarEdit3.m60055h();
                return w2a1Var;
            }
            lv31 lv31VarEdit4 = hv31Var.edit();
            lv31VarEdit4.m60051d(fv31Var, m30125g(linkedHashSet));
            lv31VarEdit4.m60055h();
            return w2a1Var;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:101:0x01a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:102:0x01a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068 A[PHI: r8 r9
      0x0068: PHI (r8v5 java.lang.String) = (r8v1 java.lang.String), (r8v8 java.lang.String) binds: [B:44:0x00b0, B:26:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0068: PHI (r9v11 java.lang.Object) = (r9v10 java.lang.Object), (r9v1 java.lang.Object) binds: [B:44:0x00b0, B:26:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d3 A[DONT_INVERT, PHI: r1 r2 r8
      0x00d3: PHI (r1v2 java.lang.String) = (r1v1 java.lang.String), (r1v3 java.lang.String), (r1v3 java.lang.String) binds: [B:48:0x00b9, B:53:0x00d0, B:54:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r2v1 int) = (r2v0 int), (r2v0 int), (r2v2 int) binds: [B:48:0x00b9, B:53:0x00d0, B:54:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r8v12 java.lang.String) = (r8v7 java.lang.String), (r8v15 java.lang.String), (r8v15 java.lang.String) binds: [B:48:0x00b9, B:53:0x00d0, B:54:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fe A[PHI: r1 r8 r9
      0x00fe: PHI (r1v8 java.lang.String) = (r1v5 java.lang.String), (r1v9 java.lang.String) binds: [B:63:0x00fa, B:23:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r8v22 int) = (r8v17 int), (r8v25 int) binds: [B:63:0x00fa, B:23:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r9v23 java.lang.Object) = (r9v22 java.lang.Object), (r9v1 java.lang.Object) binds: [B:63:0x00fa, B:23:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0106  */
    /* JADX WARN: Code duplicated, block: B:70:0x0119 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x011a A[PHI: r1 r8
      0x011a: PHI (r1v7 java.lang.String) = (r1v5 java.lang.String), (r1v8 java.lang.String) binds: [B:61:0x00e9, B:66:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x011a: PHI (r8v19 int) = (r8v17 int), (r8v22 int) binds: [B:61:0x00e9, B:66:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x012e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x012f A[DONT_INVERT, PHI: r8
      0x012f: PHI (r8v9 java.lang.String) = (r8v7 java.lang.String), (r8v12 java.lang.String) binds: [B:47:0x00b7, B:55:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0131  */
    /* JADX WARN: Code duplicated, block: B:79:0x0140 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x0141  */
    /* JADX WARN: Code duplicated, block: B:83:0x0152 A[PHI: r8 r9
      0x0152: PHI (r8v26 java.lang.String) = (r8v9 java.lang.String), (r8v32 java.lang.String) binds: [B:81:0x014f, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r9v26 java.lang.Object) = (r9v15 java.lang.Object), (r9v1 java.lang.Object) binds: [B:81:0x014f, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x015d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0161  */
    /* JADX WARN: Code duplicated, block: B:90:0x016d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0189 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:96:0x018a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0192  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c6, code lost:
    
        if (r9 == r6) goto L100;
     */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m30157w(String str, ibk ibkVar) {
        nok nokVar;
        Object objM30146l;
        String str2;
        String str3;
        Object objM30158x;
        int i;
        String str4;
        Object objM30155u;
        Object objM30146l2;
        pq2 pq2Var;
        Object objM30130E;
        long jM67581a;
        Object objM30130E2;
        if (ibkVar instanceof nok) {
            nokVar = (nok) ibkVar;
            int i2 = nokVar.f156730g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nokVar.f156730g = i2 - Integer.MIN_VALUE;
            } else {
                nokVar = new nok(this, ibkVar);
            }
        } else {
            nokVar = new nok(this, ibkVar);
        }
        Object objM30129D = nokVar.f156728e;
        int i3 = nokVar.f156730g;
        int i4 = 0;
        vq2 vq2Var = this.f29531b;
        Object obj = yuk.f276404a;
        switch (i3) {
            case 0:
                bga.m29073P(objM30129D);
                vq2Var.m86187g(this.f29534e);
                nokVar.f156724a = str;
                nokVar.f156730g = 1;
                objM30129D = m30129D(str, nokVar);
                if (objM30129D != obj) {
                    if (((Boolean) objM30129D).booleanValue()) {
                        return null;
                    }
                    if (this.f29533d.m87952j()) {
                        nokVar.f156724a = str;
                        nokVar.f156730g = 3;
                        objM30129D = m30152r(nokVar);
                        if (objM30129D != obj) {
                            str2 = str;
                            str3 = (String) objM30129D;
                            if (str2 == null) {
                                if (str3 == null) {
                                    nokVar.f156724a = null;
                                    nokVar.f156725b = null;
                                    nokVar.f156730g = 9;
                                    objM30158x = m30158x(nokVar);
                                    if (objM30158x != obj) {
                                        return objM30158x;
                                    }
                                } else {
                                    nokVar.f156724a = null;
                                    nokVar.f156725b = null;
                                    nokVar.f156726c = str3;
                                    nokVar.f156730g = 10;
                                    objM30129D = vq2Var.m86182b(nokVar);
                                    if (objM30129D != obj) {
                                        pq2Var = (pq2) objM30129D;
                                        if (!wj50.m88271j(pq2Var, nq2.f157107b)) {
                                            if (pq2Var instanceof oq2) {
                                                jM67581a = ((oq2) pq2Var).m67581a();
                                                if (jM67581a > 0 && System.currentTimeMillis() - jM67581a >= f29518h) {
                                                    nokVar.f156724a = null;
                                                    nokVar.f156725b = null;
                                                    nokVar.f156726c = null;
                                                    nokVar.f156730g = 11;
                                                    objM30130E2 = m30130E(nokVar);
                                                    if (objM30130E2 != obj) {
                                                        return objM30130E2;
                                                    }
                                                }
                                            } else if (wj50.m88271j(pq2Var, nq2.f157106a)) {
                                                nokVar.f156724a = null;
                                                nokVar.f156725b = null;
                                                nokVar.f156726c = null;
                                                nokVar.f156730g = 12;
                                                objM30130E = m30130E(nokVar);
                                                if (objM30130E != obj) {
                                                    return objM30130E;
                                                }
                                            } else if (pq2Var != null) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                        }
                                        return str3;
                                    }
                                }
                            } else if (str3 != null) {
                                nokVar.f156724a = str2;
                                nokVar.f156725b = str3;
                                nokVar.f156730g = 4;
                                objM30129D = m30142h(str3, str2, nokVar);
                                break;
                            } else if (i4 == 0) {
                                nokVar.f156724a = str2;
                                nokVar.f156725b = null;
                                nokVar.f156727d = i4;
                                nokVar.f156730g = 5;
                                objM30129D = m30154t(nokVar);
                                if (objM30129D != obj) {
                                    i = i4;
                                    str4 = (String) objM30129D;
                                    if (str4 != null) {
                                        nokVar.f156724a = str2;
                                        nokVar.f156725b = null;
                                        nokVar.f156726c = null;
                                        nokVar.f156727d = i;
                                        nokVar.f156730g = 6;
                                        objM30129D = m30142h(str4, str2, nokVar);
                                        if (objM30129D != obj) {
                                            if (((Boolean) objM30129D).booleanValue()) {
                                                nokVar.f156724a = null;
                                                nokVar.f156725b = null;
                                                nokVar.f156726c = null;
                                                nokVar.f156727d = i;
                                                nokVar.f156730g = 7;
                                                objM30146l2 = m30146l(true, nokVar);
                                                if (objM30146l2 == obj) {
                                                    return objM30146l2;
                                                }
                                            } else {
                                                nokVar.f156724a = null;
                                                nokVar.f156725b = null;
                                                nokVar.f156726c = null;
                                                nokVar.f156727d = i;
                                                nokVar.f156730g = 8;
                                                objM30155u = m30155u(str2, nokVar);
                                                if (objM30155u != obj) {
                                                    return objM30155u;
                                                }
                                            }
                                        }
                                    } else {
                                        nokVar.f156724a = null;
                                        nokVar.f156725b = null;
                                        nokVar.f156726c = null;
                                        nokVar.f156727d = i;
                                        nokVar.f156730g = 8;
                                        objM30155u = m30155u(str2, nokVar);
                                        if (objM30155u != obj) {
                                            return objM30155u;
                                        }
                                    }
                                }
                            } else if (str3 == null) {
                                nokVar.f156724a = null;
                                nokVar.f156725b = null;
                                nokVar.f156730g = 9;
                                objM30158x = m30158x(nokVar);
                                if (objM30158x != obj) {
                                    return objM30158x;
                                }
                            } else {
                                nokVar.f156724a = null;
                                nokVar.f156725b = null;
                                nokVar.f156726c = str3;
                                nokVar.f156730g = 10;
                                objM30129D = vq2Var.m86182b(nokVar);
                                if (objM30129D != obj) {
                                    pq2Var = (pq2) objM30129D;
                                    if (!wj50.m88271j(pq2Var, nq2.f157107b)) {
                                        if (pq2Var instanceof oq2) {
                                            jM67581a = ((oq2) pq2Var).m67581a();
                                            if (jM67581a > 0) {
                                                nokVar.f156724a = null;
                                                nokVar.f156725b = null;
                                                nokVar.f156726c = null;
                                                nokVar.f156730g = 11;
                                                objM30130E2 = m30130E(nokVar);
                                                if (objM30130E2 != obj) {
                                                    return objM30130E2;
                                                }
                                            }
                                        } else if (wj50.m88271j(pq2Var, nq2.f157106a)) {
                                            nokVar.f156724a = null;
                                            nokVar.f156725b = null;
                                            nokVar.f156726c = null;
                                            nokVar.f156730g = 12;
                                            objM30130E = m30130E(nokVar);
                                            if (objM30130E != obj) {
                                                return objM30130E;
                                            }
                                        } else if (pq2Var != null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                    return str3;
                                }
                            }
                        }
                    } else {
                        nokVar.f156724a = null;
                        nokVar.f156730g = 2;
                        objM30146l = m30146l(false, nokVar);
                        if (objM30146l == obj) {
                            return objM30146l;
                        }
                    }
                }
                return obj;
            case 1:
                str = nokVar.f156724a;
                bga.m29073P(objM30129D);
                if (((Boolean) objM30129D).booleanValue()) {
                    return null;
                }
                if (this.f29533d.m87952j()) {
                    nokVar.f156724a = null;
                    nokVar.f156730g = 2;
                    objM30146l = m30146l(false, nokVar);
                    if (objM30146l == obj) {
                        return objM30146l;
                    }
                } else {
                    nokVar.f156724a = str;
                    nokVar.f156730g = 3;
                    objM30129D = m30152r(nokVar);
                    if (objM30129D != obj) {
                        str2 = str;
                        str3 = (String) objM30129D;
                        if (str2 == null) {
                            if (str3 == null) {
                                nokVar.f156724a = null;
                                nokVar.f156725b = null;
                                nokVar.f156730g = 9;
                                objM30158x = m30158x(nokVar);
                                if (objM30158x != obj) {
                                    return objM30158x;
                                }
                            } else {
                                nokVar.f156724a = null;
                                nokVar.f156725b = null;
                                nokVar.f156726c = str3;
                                nokVar.f156730g = 10;
                                objM30129D = vq2Var.m86182b(nokVar);
                                if (objM30129D != obj) {
                                    pq2Var = (pq2) objM30129D;
                                    if (!wj50.m88271j(pq2Var, nq2.f157107b)) {
                                        if (pq2Var instanceof oq2) {
                                            jM67581a = ((oq2) pq2Var).m67581a();
                                            if (jM67581a > 0) {
                                                nokVar.f156724a = null;
                                                nokVar.f156725b = null;
                                                nokVar.f156726c = null;
                                                nokVar.f156730g = 11;
                                                objM30130E2 = m30130E(nokVar);
                                                if (objM30130E2 != obj) {
                                                    return objM30130E2;
                                                }
                                            }
                                        } else if (wj50.m88271j(pq2Var, nq2.f157106a)) {
                                            nokVar.f156724a = null;
                                            nokVar.f156725b = null;
                                            nokVar.f156726c = null;
                                            nokVar.f156730g = 12;
                                            objM30130E = m30130E(nokVar);
                                            if (objM30130E != obj) {
                                                return objM30130E;
                                            }
                                        } else if (pq2Var != null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                    return str3;
                                }
                            }
                        } else if (str3 != null) {
                            nokVar.f156724a = str2;
                            nokVar.f156725b = str3;
                            nokVar.f156730g = 4;
                            objM30129D = m30142h(str3, str2, nokVar);
                            break;
                        } else if (i4 == 0) {
                            nokVar.f156724a = str2;
                            nokVar.f156725b = null;
                            nokVar.f156727d = i4;
                            nokVar.f156730g = 5;
                            objM30129D = m30154t(nokVar);
                            if (objM30129D != obj) {
                                i = i4;
                                str4 = (String) objM30129D;
                                if (str4 != null) {
                                    nokVar.f156724a = str2;
                                    nokVar.f156725b = null;
                                    nokVar.f156726c = null;
                                    nokVar.f156727d = i;
                                    nokVar.f156730g = 6;
                                    objM30129D = m30142h(str4, str2, nokVar);
                                    if (objM30129D != obj) {
                                        if (((Boolean) objM30129D).booleanValue()) {
                                            nokVar.f156724a = null;
                                            nokVar.f156725b = null;
                                            nokVar.f156726c = null;
                                            nokVar.f156727d = i;
                                            nokVar.f156730g = 7;
                                            objM30146l2 = m30146l(true, nokVar);
                                            if (objM30146l2 == obj) {
                                                return objM30146l2;
                                            }
                                        } else {
                                            nokVar.f156724a = null;
                                            nokVar.f156725b = null;
                                            nokVar.f156726c = null;
                                            nokVar.f156727d = i;
                                            nokVar.f156730g = 8;
                                            objM30155u = m30155u(str2, nokVar);
                                            if (objM30155u != obj) {
                                                return objM30155u;
                                            }
                                        }
                                    }
                                } else {
                                    nokVar.f156724a = null;
                                    nokVar.f156725b = null;
                                    nokVar.f156726c = null;
                                    nokVar.f156727d = i;
                                    nokVar.f156730g = 8;
                                    objM30155u = m30155u(str2, nokVar);
                                    if (objM30155u != obj) {
                                        return objM30155u;
                                    }
                                }
                            }
                        } else if (str3 == null) {
                            nokVar.f156724a = null;
                            nokVar.f156725b = null;
                            nokVar.f156730g = 9;
                            objM30158x = m30158x(nokVar);
                            if (objM30158x != obj) {
                                return objM30158x;
                            }
                        } else {
                            nokVar.f156724a = null;
                            nokVar.f156725b = null;
                            nokVar.f156726c = str3;
                            nokVar.f156730g = 10;
                            objM30129D = vq2Var.m86182b(nokVar);
                            if (objM30129D != obj) {
                                pq2Var = (pq2) objM30129D;
                                if (!wj50.m88271j(pq2Var, nq2.f157107b)) {
                                    if (pq2Var instanceof oq2) {
                                        jM67581a = ((oq2) pq2Var).m67581a();
                                        if (jM67581a > 0) {
                                            nokVar.f156724a = null;
                                            nokVar.f156725b = null;
                                            nokVar.f156726c = null;
                                            nokVar.f156730g = 11;
                                            objM30130E2 = m30130E(nokVar);
                                            if (objM30130E2 != obj) {
                                                return objM30130E2;
                                            }
                                        }
                                    } else if (wj50.m88271j(pq2Var, nq2.f157106a)) {
                                        nokVar.f156724a = null;
                                        nokVar.f156725b = null;
                                        nokVar.f156726c = null;
                                        nokVar.f156730g = 12;
                                        objM30130E = m30130E(nokVar);
                                        if (objM30130E != obj) {
                                            return objM30130E;
                                        }
                                    } else if (pq2Var != null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                                return str3;
                            }
                        }
                    }
                }
                return obj;
            case 2:
                bga.m29073P(objM30129D);
                return objM30129D;
            case 3:
                str = nokVar.f156724a;
                bga.m29073P(objM30129D);
                str2 = str;
                str3 = (String) objM30129D;
                if (str2 == null) {
                    if (str3 == null) {
                        nokVar.f156724a = null;
                        nokVar.f156725b = null;
                        nokVar.f156730g = 9;
                        objM30158x = m30158x(nokVar);
                        if (objM30158x != obj) {
                            return objM30158x;
                        }
                    } else {
                        nokVar.f156724a = null;
                        nokVar.f156725b = null;
                        nokVar.f156726c = str3;
                        nokVar.f156730g = 10;
                        objM30129D = vq2Var.m86182b(nokVar);
                        if (objM30129D != obj) {
                            pq2Var = (pq2) objM30129D;
                            if (!wj50.m88271j(pq2Var, nq2.f157107b)) {
                                if (pq2Var instanceof oq2) {
                                    jM67581a = ((oq2) pq2Var).m67581a();
                                    if (jM67581a > 0) {
                                        nokVar.f156724a = null;
                                        nokVar.f156725b = null;
                                        nokVar.f156726c = null;
                                        nokVar.f156730g = 11;
                                        objM30130E2 = m30130E(nokVar);
                                        if (objM30130E2 != obj) {
                                            return objM30130E2;
                                        }
                                    }
                                } else if (wj50.m88271j(pq2Var, nq2.f157106a)) {
                                    nokVar.f156724a = null;
                                    nokVar.f156725b = null;
                                    nokVar.f156726c = null;
                                    nokVar.f156730g = 12;
                                    objM30130E = m30130E(nokVar);
                                    if (objM30130E != obj) {
                                        return objM30130E;
                                    }
                                } else if (pq2Var != null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            return str3;
                        }
                    }
                } else if (str3 != null) {
                    nokVar.f156724a = str2;
                    nokVar.f156725b = str3;
                    nokVar.f156730g = 4;
                    objM30129D = m30142h(str3, str2, nokVar);
                    break;
                } else if (i4 == 0) {
                    nokVar.f156724a = str2;
                    nokVar.f156725b = null;
                    nokVar.f156727d = i4;
                    nokVar.f156730g = 5;
                    objM30129D = m30154t(nokVar);
                    if (objM30129D != obj) {
                        i = i4;
                        str4 = (String) objM30129D;
                        if (str4 != null) {
                            nokVar.f156724a = str2;
                            nokVar.f156725b = null;
                            nokVar.f156726c = null;
                            nokVar.f156727d = i;
                            nokVar.f156730g = 6;
                            objM30129D = m30142h(str4, str2, nokVar);
                            if (objM30129D != obj) {
                                if (((Boolean) objM30129D).booleanValue()) {
                                    nokVar.f156724a = null;
                                    nokVar.f156725b = null;
                                    nokVar.f156726c = null;
                                    nokVar.f156727d = i;
                                    nokVar.f156730g = 7;
                                    objM30146l2 = m30146l(true, nokVar);
                                    if (objM30146l2 == obj) {
                                        return objM30146l2;
                                    }
                                } else {
                                    nokVar.f156724a = null;
                                    nokVar.f156725b = null;
                                    nokVar.f156726c = null;
                                    nokVar.f156727d = i;
                                    nokVar.f156730g = 8;
                                    objM30155u = m30155u(str2, nokVar);
                                    if (objM30155u != obj) {
                                        return objM30155u;
                                    }
                                }
                            }
                        } else {
                            nokVar.f156724a = null;
                            nokVar.f156725b = null;
                            nokVar.f156726c = null;
                            nokVar.f156727d = i;
                            nokVar.f156730g = 8;
                            objM30155u = m30155u(str2, nokVar);
                            if (objM30155u != obj) {
                                return objM30155u;
                            }
                        }
                    }
                } else if (str3 == null) {
                    nokVar.f156724a = null;
                    nokVar.f156725b = null;
                    nokVar.f156730g = 9;
                    objM30158x = m30158x(nokVar);
                    if (objM30158x != obj) {
                        return objM30158x;
                    }
                } else {
                    nokVar.f156724a = null;
                    nokVar.f156725b = null;
                    nokVar.f156726c = str3;
                    nokVar.f156730g = 10;
                    objM30129D = vq2Var.m86182b(nokVar);
                    if (objM30129D != obj) {
                        pq2Var = (pq2) objM30129D;
                        if (!wj50.m88271j(pq2Var, nq2.f157107b)) {
                            if (pq2Var instanceof oq2) {
                                jM67581a = ((oq2) pq2Var).m67581a();
                                if (jM67581a > 0) {
                                    nokVar.f156724a = null;
                                    nokVar.f156725b = null;
                                    nokVar.f156726c = null;
                                    nokVar.f156730g = 11;
                                    objM30130E2 = m30130E(nokVar);
                                    if (objM30130E2 != obj) {
                                        return objM30130E2;
                                    }
                                }
                            } else if (wj50.m88271j(pq2Var, nq2.f157106a)) {
                                nokVar.f156724a = null;
                                nokVar.f156725b = null;
                                nokVar.f156726c = null;
                                nokVar.f156730g = 12;
                                objM30130E = m30130E(nokVar);
                                if (objM30130E != obj) {
                                    return objM30130E;
                                }
                            } else if (pq2Var != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        return str3;
                    }
                }
                return obj;
            case 4:
                str3 = nokVar.f156725b;
                str2 = nokVar.f156724a;
                bga.m29073P(objM30129D);
                if (((Boolean) objM30129D).booleanValue()) {
                    i4 = 1;
                }
                if (i4 == 0) {
                    nokVar.f156724a = str2;
                    nokVar.f156725b = null;
                    nokVar.f156727d = i4;
                    nokVar.f156730g = 5;
                    objM30129D = m30154t(nokVar);
                    if (objM30129D != obj) {
                        i = i4;
                        str4 = (String) objM30129D;
                        if (str4 != null) {
                            nokVar.f156724a = str2;
                            nokVar.f156725b = null;
                            nokVar.f156726c = null;
                            nokVar.f156727d = i;
                            nokVar.f156730g = 6;
                            objM30129D = m30142h(str4, str2, nokVar);
                            if (objM30129D != obj) {
                                if (((Boolean) objM30129D).booleanValue()) {
                                    nokVar.f156724a = null;
                                    nokVar.f156725b = null;
                                    nokVar.f156726c = null;
                                    nokVar.f156727d = i;
                                    nokVar.f156730g = 7;
                                    objM30146l2 = m30146l(true, nokVar);
                                    if (objM30146l2 == obj) {
                                        return objM30146l2;
                                    }
                                } else {
                                    nokVar.f156724a = null;
                                    nokVar.f156725b = null;
                                    nokVar.f156726c = null;
                                    nokVar.f156727d = i;
                                    nokVar.f156730g = 8;
                                    objM30155u = m30155u(str2, nokVar);
                                    if (objM30155u != obj) {
                                        return objM30155u;
                                    }
                                }
                            }
                        } else {
                            nokVar.f156724a = null;
                            nokVar.f156725b = null;
                            nokVar.f156726c = null;
                            nokVar.f156727d = i;
                            nokVar.f156730g = 8;
                            objM30155u = m30155u(str2, nokVar);
                            if (objM30155u != obj) {
                                return objM30155u;
                            }
                        }
                    }
                } else if (str3 == null) {
                    nokVar.f156724a = null;
                    nokVar.f156725b = null;
                    nokVar.f156730g = 9;
                    objM30158x = m30158x(nokVar);
                    if (objM30158x != obj) {
                        return objM30158x;
                    }
                } else {
                    nokVar.f156724a = null;
                    nokVar.f156725b = null;
                    nokVar.f156726c = str3;
                    nokVar.f156730g = 10;
                    objM30129D = vq2Var.m86182b(nokVar);
                    if (objM30129D != obj) {
                        pq2Var = (pq2) objM30129D;
                        if (!wj50.m88271j(pq2Var, nq2.f157107b)) {
                            if (pq2Var instanceof oq2) {
                                jM67581a = ((oq2) pq2Var).m67581a();
                                if (jM67581a > 0) {
                                    nokVar.f156724a = null;
                                    nokVar.f156725b = null;
                                    nokVar.f156726c = null;
                                    nokVar.f156730g = 11;
                                    objM30130E2 = m30130E(nokVar);
                                    if (objM30130E2 != obj) {
                                        return objM30130E2;
                                    }
                                }
                            } else if (wj50.m88271j(pq2Var, nq2.f157106a)) {
                                nokVar.f156724a = null;
                                nokVar.f156725b = null;
                                nokVar.f156726c = null;
                                nokVar.f156730g = 12;
                                objM30130E = m30130E(nokVar);
                                if (objM30130E != obj) {
                                    return objM30130E;
                                }
                            } else if (pq2Var != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        return str3;
                    }
                }
                return obj;
            case 5:
                i = nokVar.f156727d;
                str2 = nokVar.f156724a;
                bga.m29073P(objM30129D);
                str4 = (String) objM30129D;
                if (str4 != null) {
                    nokVar.f156724a = str2;
                    nokVar.f156725b = null;
                    nokVar.f156726c = null;
                    nokVar.f156727d = i;
                    nokVar.f156730g = 6;
                    objM30129D = m30142h(str4, str2, nokVar);
                    if (objM30129D != obj) {
                        if (((Boolean) objM30129D).booleanValue()) {
                            nokVar.f156724a = null;
                            nokVar.f156725b = null;
                            nokVar.f156726c = null;
                            nokVar.f156727d = i;
                            nokVar.f156730g = 7;
                            objM30146l2 = m30146l(true, nokVar);
                            if (objM30146l2 == obj) {
                                return objM30146l2;
                            }
                        } else {
                            nokVar.f156724a = null;
                            nokVar.f156725b = null;
                            nokVar.f156726c = null;
                            nokVar.f156727d = i;
                            nokVar.f156730g = 8;
                            objM30155u = m30155u(str2, nokVar);
                            if (objM30155u != obj) {
                                return objM30155u;
                            }
                        }
                    }
                } else {
                    nokVar.f156724a = null;
                    nokVar.f156725b = null;
                    nokVar.f156726c = null;
                    nokVar.f156727d = i;
                    nokVar.f156730g = 8;
                    objM30155u = m30155u(str2, nokVar);
                    if (objM30155u != obj) {
                        return objM30155u;
                    }
                }
                return obj;
            case 6:
                i = nokVar.f156727d;
                str2 = nokVar.f156724a;
                bga.m29073P(objM30129D);
                if (((Boolean) objM30129D).booleanValue()) {
                    nokVar.f156724a = null;
                    nokVar.f156725b = null;
                    nokVar.f156726c = null;
                    nokVar.f156727d = i;
                    nokVar.f156730g = 7;
                    objM30146l2 = m30146l(true, nokVar);
                    if (objM30146l2 == obj) {
                        return objM30146l2;
                    }
                } else {
                    nokVar.f156724a = null;
                    nokVar.f156725b = null;
                    nokVar.f156726c = null;
                    nokVar.f156727d = i;
                    nokVar.f156730g = 8;
                    objM30155u = m30155u(str2, nokVar);
                    if (objM30155u != obj) {
                        return objM30155u;
                    }
                }
                return obj;
            case 7:
                bga.m29073P(objM30129D);
                return objM30129D;
            case 8:
                bga.m29073P(objM30129D);
                return objM30129D;
            case 9:
                bga.m29073P(objM30129D);
                return objM30129D;
            case 10:
                str3 = nokVar.f156726c;
                bga.m29073P(objM30129D);
                pq2Var = (pq2) objM30129D;
                if (!wj50.m88271j(pq2Var, nq2.f157107b)) {
                    if (pq2Var instanceof oq2) {
                        jM67581a = ((oq2) pq2Var).m67581a();
                        if (jM67581a > 0) {
                            nokVar.f156724a = null;
                            nokVar.f156725b = null;
                            nokVar.f156726c = null;
                            nokVar.f156730g = 11;
                            objM30130E2 = m30130E(nokVar);
                            if (objM30130E2 != obj) {
                                return obj;
                            }
                            return objM30130E2;
                        }
                    } else {
                        if (wj50.m88271j(pq2Var, nq2.f157106a)) {
                            nokVar.f156724a = null;
                            nokVar.f156725b = null;
                            nokVar.f156726c = null;
                            nokVar.f156730g = 12;
                            objM30130E = m30130E(nokVar);
                            if (objM30130E != obj) {
                                return obj;
                            }
                            return objM30130E;
                        }
                        if (pq2Var != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                return str3;
            case 11:
                bga.m29073P(objM30129D);
                return objM30129D;
            case 12:
                bga.m29073P(objM30129D);
                return objM30129D;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r7 == r5) goto L33;
     */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m30158x(ibk ibkVar) {
        ook ookVar;
        Object objM30146l;
        if (ibkVar instanceof ook) {
            ookVar = (ook) ibkVar;
            int i = ookVar.f167648c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ookVar.f167648c = i - Integer.MIN_VALUE;
            } else {
                ookVar = new ook(this, ibkVar);
            }
        } else {
            ookVar = new ook(this, ibkVar);
        }
        Object objM30154t = ookVar.f167646a;
        int i2 = ookVar.f167648c;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM30154t);
            ookVar.f167648c = 1;
            objM30154t = m30154t(ookVar);
            if (objM30154t != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            bga.m29073P(objM30154t);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM30154t);
                return objM30154t;
            }
            bga.m29073P(objM30154t);
        }
        if (!((Collection) objM30154t).isEmpty()) {
            return null;
        }
        ookVar.f167648c = 3;
        objM30146l = m30146l(false, ookVar);
        if (objM30146l != obj) {
            return obj;
        }
        return objM30146l;
        String str = (String) objM30154t;
        if (str != null) {
            ookVar.f167648c = 2;
            objM30154t = m30145k(str, ookVar);
        } else {
            ookVar.f167648c = 3;
            objM30146l = m30146l(false, ookVar);
            if (objM30146l != obj) {
                return objM30146l;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: y */
    public final Object m30159y(String str, String str2, String str3, ibk ibkVar) {
        pok pokVar;
        String strM88489m1;
        if (ibkVar instanceof pok) {
            pokVar = (pok) ibkVar;
            int i = pokVar.f179725f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pokVar.f179725f = i - Integer.MIN_VALUE;
            } else {
                pokVar = new pok(this, ibkVar);
            }
        } else {
            pokVar = new pok(this, ibkVar);
        }
        Object objM30135J = pokVar.f179723d;
        int i2 = pokVar.f179725f;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM30135J);
            strM88489m1 = wl51.m88489m1(AudioEpisode.SHOW_URI_FIELD_NUMBER, str);
            pokVar.f179720a = str2;
            pokVar.f179721b = str3;
            pokVar.f179722c = strM88489m1;
            pokVar.f179725f = 1;
            objM30135J = m30135J(pokVar);
            if (objM30135J != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM30135J);
            return w2a1Var;
        }
        strM88489m1 = pokVar.f179722c;
        str3 = pokVar.f179721b;
        str2 = pokVar.f179720a;
        bga.m29073P(objM30135J);
        lv31 lv31VarEdit = ((hv31) objM30135J).edit();
        lv31VarEdit.m60051d(f29524n, strM88489m1);
        lv31VarEdit.m60051d(f29526p, str3);
        fv31 fv31Var = f29525o;
        if (str2 != null) {
            lv31VarEdit.m60051d(fv31Var, str2);
        } else {
            lv31VarEdit.m60053f(fv31Var);
        }
        lv31VarEdit.m60055h();
        if (!wl51.m88460J0(str3) && !wl51.m88460J0(strM88489m1)) {
            pokVar.f179720a = null;
            pokVar.f179721b = null;
            pokVar.f179722c = null;
            pokVar.f179725f = 2;
            if (m30134I(str3, strM88489m1, str2, pokVar) == obj) {
                return obj;
            }
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: z */
    public final Object m30160z(LinkedHashMap linkedHashMap, ibk ibkVar) {
        qok qokVar;
        if (ibkVar instanceof qok) {
            qokVar = (qok) ibkVar;
            int i = qokVar.f190995d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qokVar.f190995d = i - Integer.MIN_VALUE;
            } else {
                qokVar = new qok(this, ibkVar);
            }
        } else {
            qokVar = new qok(this, ibkVar);
        }
        Object objM30135J = qokVar.f190993b;
        int i2 = qokVar.f190995d;
        if (i2 == 0) {
            bga.m29073P(objM30135J);
            qokVar.f190992a = linkedHashMap;
            qokVar.f190995d = 1;
            objM30135J = m30135J(qokVar);
            Object obj = yuk.f276404a;
            if (objM30135J == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkedHashMap = qokVar.f190992a;
            bga.m29073P(objM30135J);
        }
        hv31 hv31Var = (hv31) objM30135J;
        boolean zIsEmpty = linkedHashMap.isEmpty();
        w2a1 w2a1Var = w2a1.f247311a;
        fv31 fv31Var = f29527q;
        if (zIsEmpty) {
            lv31 lv31VarEdit = hv31Var.edit();
            lv31VarEdit.m60053f(fv31Var);
            lv31VarEdit.m60055h();
            return w2a1Var;
        }
        String strM43753y0 = g6f.m43753y0(linkedHashMap.values(), "\n", null, null, cmk.f39719e, 30);
        lv31 lv31VarEdit2 = hv31Var.edit();
        lv31VarEdit2.m60051d(fv31Var, strM43753y0);
        lv31VarEdit2.m60055h();
        return w2a1Var;
    }
}
