package p204p;

import android.os.Bundle;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.AbstractC0048e;
import com.google.android.gms.tasks.Task;
import com.google.protobuf.Empty;
import com.spotify.on_demand_set.proto.ResponseStatus;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.pses.p134v1.proto.ConfigurationResponse;
import com.spotify.time.esperanto.proto.EsServerTime$ServerTime;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes2.dex */
public final class wej0 implements Predicate, Function, t3b1, guz0, ma10, gbk, wi5, vd50, fz61, b8d0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f250570a;

    /* JADX INFO: renamed from: b */
    public static final wej0 f250561b = new wej0(0);

    /* JADX INFO: renamed from: c */
    public static final wej0 f250562c = new wej0(1);

    /* JADX INFO: renamed from: d */
    public static final wej0 f250563d = new wej0(2);

    /* JADX INFO: renamed from: e */
    public static final wej0 f250564e = new wej0(3);

    /* JADX INFO: renamed from: f */
    public static final wej0 f250565f = new wej0(4);

    /* JADX INFO: renamed from: g */
    public static final wej0 f250566g = new wej0(5);

    /* JADX INFO: renamed from: h */
    public static final wej0 f250567h = new wej0(6);

    /* JADX INFO: renamed from: i */
    public static final wej0 f250568i = new wej0(7);

    /* JADX INFO: renamed from: t */
    public static final wej0 f250569t = new wej0(8);

    /* JADX INFO: renamed from: X */
    public static final wej0 f250558X = new wej0(9);

    /* JADX INFO: renamed from: Y */
    public static final wej0 f250559Y = new wej0(11);

    /* JADX INFO: renamed from: Z */
    public static final wej0 f250560Z = new wej0(12);

    /* JADX INFO: renamed from: L0 */
    public static final wej0 f250551L0 = new wej0(13);

    /* JADX INFO: renamed from: M0 */
    public static final wej0 f250552M0 = new wej0(14);

    /* JADX INFO: renamed from: N0 */
    public static final wej0 f250553N0 = new wej0(15);

    /* JADX INFO: renamed from: O0 */
    public static final wej0 f250554O0 = new wej0(16);

    /* JADX INFO: renamed from: P0 */
    public static final wej0 f250555P0 = new wej0(17);

    /* JADX INFO: renamed from: Q0 */
    public static final /* synthetic */ wej0 f250556Q0 = new wej0(18);

    /* JADX INFO: renamed from: R0 */
    public static final /* synthetic */ wej0 f250557R0 = new wej0(19);

    public /* synthetic */ wej0(int i) {
        this.f250570a = i;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m87882h(ContextTrack contextTrack) {
        Set set = dd41.f47702f;
        return r46.m74726U(e72.m38002e0(contextTrack)).f47709c == gn80.PODCAST_CHAPTER;
    }

    @Override // p204p.guz0
    /* JADX INFO: renamed from: a */
    public Object mo30659a() {
        return ja61.m52792n();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f250570a) {
            case 1:
                return s3k0.f205301a;
            case 2:
                return Boolean.valueOf(gwg1.m45947s((String) obj));
            case 3:
                byte[] bArr = (byte[]) obj;
                try {
                    return ResponseStatus.m16224p(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.on_demand_set.proto.ResponseStatus: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 13:
            case 14:
            case 15:
            default:
                return Observable.just((esd1) obj);
            case 7:
                Map map = (Map) obj;
                return new akr0(dxf1.m37217F(map), dxf1.m37222K(map), gxf1.m46081k(map));
            case 8:
                return new s6x0(new yt31((ConfigurationResponse) obj));
            case 11:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsServerTime$ServerTime.m21809r(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.time.esperanto.proto.EsServerTime.ServerTime: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 12:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr3);
                } catch (Exception e3) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e3);
                }
            case 16:
                return Boolean.valueOf(gwg1.m45947s((String) obj));
            case 17:
                return new mxc1((sg5) obj);
        }
    }

    @Override // p204p.gbk
    /* JADX INFO: renamed from: b */
    public Object mo25397b(Task task) throws IOException {
        if (task.mo1518j()) {
            return (Bundle) task.mo1515g();
        }
        if (Log.isLoggable("Rpc", 3)) {
            new StringBuilder(String.valueOf(task.mo1514f()).length() + 22);
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.mo1514f());
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01da  */
    /* JADX WARN: Code duplicated, block: B:118:0x021e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0231 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0233  */
    /* JADX WARN: Code duplicated, block: B:124:0x0236  */
    /* JADX WARN: Code duplicated, block: B:129:0x0247  */
    /* JADX WARN: Code duplicated, block: B:132:0x0251  */
    /* JADX WARN: Code duplicated, block: B:137:0x0264  */
    /* JADX WARN: Code duplicated, block: B:139:0x0276  */
    /* JADX WARN: Code duplicated, block: B:141:0x027a  */
    /* JADX WARN: Code duplicated, block: B:144:0x027e  */
    /* JADX WARN: Code duplicated, block: B:154:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:170:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:172:0x0307  */
    /* JADX WARN: Code duplicated, block: B:174:0x0315  */
    /* JADX WARN: Code duplicated, block: B:175:0x0321  */
    /* JADX WARN: Code duplicated, block: B:177:0x032f  */
    /* JADX WARN: Code duplicated, block: B:184:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:90:0x019c  */
    /* JADX INFO: renamed from: c */
    public ArrayList m87883c(PlayerState playerState, l241 l241Var, boolean z, s431 s431Var, boolean z2, a8d0 a8d0Var, boolean z3, ure ureVar) {
        ContextTrack contextTrack;
        boolean z4;
        Object obj;
        String strContextUri;
        boolean z5;
        Iterator it;
        v7d0 v7d0Var;
        boolean zShufflingContext;
        r431 r431Var;
        c7d0 c7d0Var = c7d0.f34854d;
        p7d0 p7d0Var = p7d0.f174649a;
        int i = l241Var.f128916a;
        k241 k241Var = l241Var.f128917b;
        ArrayList arrayList = new ArrayList(30);
        arrayList.addAll(b8d0.f24568d0);
        xul0 xul0VarTrack = playerState.track();
        if (xul0VarTrack != null && (contextTrack = (ContextTrack) xul0VarTrack.mo49283h()) != null && (e72.m37976J(contextTrack) || !e72.m37996b0(contextTrack) || !wj50.m88271j(contextTrack.metadata().get(ContextTrack.Metadata.KEY_IS_BACKGROUNDABLE), "false"))) {
            arrayList.add(q7d0.f186077c);
            if (playerState.isPaused()) {
                arrayList.add(h7d0.f88438a);
            } else {
                arrayList.add(p7d0.f174650b);
                arrayList.add(h7d0.f88439b);
            }
            rhj rhjVar = a8d0Var.f13261f;
            boolean z6 = a8d0Var.f13262g;
            if (!e72.m37986T(contextTrack) && !m87882h(contextTrack)) {
                Set set = dd41.f47702f;
                if (r46.m74726U(e72.m38002e0(contextTrack)).f47709c == gn80.CLIP || z6) {
                    if (z6) {
                        z4 = false;
                    }
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else if (z6 || rhjVar == rhj.f199235c || rhjVar != rhj.f199234b) {
                z4 = true;
            } else {
                z4 = false;
            }
            g241 g241Var = g241.f75834a;
            k7d0 k7d0Var = k7d0.f120071d;
            j7d0 j7d0Var = j7d0.f109569d;
            if (z4) {
                boolean zIsEmpty = playerState.restrictions().disallowSeekingReasons().isEmpty();
                if (a8d0Var.f13263h && zIsEmpty) {
                    arrayList.add(j7d0Var);
                    arrayList.add(m7d0.f140767d);
                } else if (zIsEmpty) {
                    arrayList.add(j7d0Var);
                    arrayList.add(k7d0Var);
                }
                if (wj50.m88271j(k241Var, g241Var)) {
                    arrayList.add(new f7d0(i));
                }
            }
            boolean zM37987U = e72.m37987U(contextTrack);
            l7d0 l7d0Var = l7d0.f130627a;
            if (zM37987U) {
                Restrictions restrictions = playerState.restrictions();
                if (restrictions.disallowSkippingNextReasons().isEmpty()) {
                    arrayList.add(c7d0.f34855e);
                    arrayList.add(l7d0Var);
                } else if (restrictions.disallowSeekingReasons().isEmpty()) {
                    arrayList.add(j7d0Var);
                    arrayList.add(k7d0Var);
                }
                if (wj50.m88271j(k241Var, g241Var)) {
                    arrayList.add(new f7d0(i));
                    return arrayList;
                }
            } else if (!e72.m37976J(contextTrack)) {
                arrayList.add(p7d0.f174653e);
                if (playerState.restrictions().disallowSeekingReasons().isEmpty()) {
                    arrayList.add(q7d0.f186078d);
                }
                i7d0 i7d0Var = i7d0.f99493d;
                if (z4) {
                    if (!Boolean.parseBoolean((String) playerState.contextMetadata().get(Context.Metadata.KEY_IS_AUDIOBOOK))) {
                        if (z2) {
                            arrayList.add(i7d0Var);
                        } else {
                            arrayList.add(c7d0Var);
                        }
                    }
                    if (z3) {
                        pf40 pf40VarSignals = playerState.signals();
                        if (!(m87882h(contextTrack) && pf40VarSignals.contains("switch-to-full-episode")) && (m87882h(contextTrack) || !a8d0Var.f13260e)) {
                            pf40 pf40VarSignals2 = playerState.signals();
                            Set set2 = dd41.f47702f;
                            if (r46.m74726U(e72.m38002e0(contextTrack)).f47709c == gn80.CLIP && pf40VarSignals2.contains("switch-to-full-episode")) {
                                arrayList.add(d7d0.f46074e);
                            }
                        } else {
                            arrayList.add(d7d0.f46074e);
                        }
                    }
                    String strContextUri2 = playerState.contextUri();
                    Set set3 = dd41.f47702f;
                    he41 he41Var = r46.m74726U(strContextUri2).f47710d;
                    fka1 type = he41Var != null ? he41Var.getType() : null;
                    if (wj50.m88271j(type, ivp0.f106258f) || (wj50.m88271j(type, avp0.f20242e) && !wj50.m88271j(strContextUri2, "spotify:playlist:37i9dQZF1FgnTBfUlzkeKt") && (ureVar == null || !strContextUri2.equals("spotify:playlist:37i9dQZF1CIl0ks0ynmzpD")))) {
                        if (!z4) {
                            arrayList.add(l7d0Var);
                        }
                        if (!z4) {
                            arrayList.add(n7d0.f151137a);
                        }
                        if (playerState.restrictions().disallowTogglingShuffleReasons().isEmpty()) {
                            arrayList.add(q7d0.f186075a);
                            zShufflingContext = playerState.options().shufflingContext();
                            if (s431Var != null) {
                                if (zShufflingContext) {
                                    r431Var = r431.f195646b;
                                } else {
                                    r431Var = r431.f195645a;
                                }
                            } else if (zShufflingContext) {
                                r431Var = r431.f195646b;
                            } else {
                                r431Var = r431.f195645a;
                            }
                            arrayList.add(new g7d0(r431Var));
                        }
                        if (arrayList.isEmpty()) {
                            it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    v7d0Var = (v7d0) it.next();
                                    if (!wj50.m88271j(v7d0Var, c7d0Var)) {
                                    }
                                } else if (Boolean.parseBoolean((String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_COLLECTION_CAN_ADD))) {
                                    if (z2) {
                                    }
                                    if (obj == null) {
                                        obj = d7d0.f46073d;
                                    }
                                    arrayList.add(obj);
                                }
                            }
                        } else if (Boolean.parseBoolean((String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_COLLECTION_CAN_ADD))) {
                            if (z2) {
                            }
                            if (obj == null) {
                                obj = d7d0.f46073d;
                            }
                            arrayList.add(obj);
                        }
                        strContextUri = playerState.contextUri();
                        Set set4 = dd41.f47702f;
                        if (c8d0.f35190a[r46.m74726U(strContextUri).f47709c.ordinal()] != 1) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (z) {
                            arrayList.add(t7d0.f217753e);
                        }
                        if (playerState.options().repeatingContext()) {
                            if (playerState.options().repeatingTrack()) {
                                if (playerState.restrictions().disallowTogglingRepeatTrackReasons().isEmpty()) {
                                    arrayList.add(new s7d0(true));
                                    arrayList.add(p7d0Var);
                                }
                            } else if (playerState.restrictions().disallowTogglingRepeatContextReasons().isEmpty()) {
                                arrayList.add(r7d0.f196501d);
                                arrayList.add(p7d0Var);
                            }
                        } else if (playerState.options().repeatingTrack()) {
                            if (playerState.restrictions().disallowTogglingRepeatTrackReasons().isEmpty()) {
                                arrayList.add(new s7d0(true));
                                arrayList.add(p7d0Var);
                            }
                        } else if (playerState.restrictions().disallowTogglingRepeatContextReasons().isEmpty()) {
                            arrayList.add(r7d0.f196501d);
                            arrayList.add(p7d0Var);
                        }
                        if (hdi.m47214F(playerState)) {
                            arrayList.add(u7d0.f227575e);
                        }
                    }
                } else {
                    if (!z4 && playerState.restrictions().disallowSkippingNextReasons().isEmpty()) {
                        arrayList.add(l7d0Var);
                    }
                    if (!z4 && (playerState.restrictions().disallowSkippingPrevReasons().isEmpty() || playerState.restrictions().disallowSeekingReasons().isEmpty())) {
                        arrayList.add(n7d0.f151137a);
                    }
                    if (playerState.restrictions().disallowTogglingShuffleReasons().isEmpty()) {
                        arrayList.add(q7d0.f186075a);
                        zShufflingContext = playerState.options().shufflingContext();
                        if (s431Var != null || (r431Var = s431Var.f205428a) == null) {
                            if (zShufflingContext) {
                                r431Var = r431.f195646b;
                            } else {
                                r431Var = r431.f195645a;
                            }
                        }
                        arrayList.add(new g7d0(r431Var));
                    }
                    if (arrayList.isEmpty()) {
                        it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                v7d0Var = (v7d0) it.next();
                                if (!wj50.m88271j(v7d0Var, c7d0Var) || wj50.m88271j(v7d0Var, i7d0Var)) {
                                }
                            } else if (Boolean.parseBoolean((String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_COLLECTION_CAN_ADD))) {
                                if (z2) {
                                }
                                if (obj == null) {
                                    obj = d7d0.f46073d;
                                }
                                arrayList.add(obj);
                            }
                        }
                    } else if (Boolean.parseBoolean((String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_COLLECTION_CAN_ADD))) {
                        obj = z2 ? u7d0.f227574d : null;
                        if (obj == null) {
                            obj = d7d0.f46073d;
                        }
                        arrayList.add(obj);
                    }
                    strContextUri = playerState.contextUri();
                    Set set5 = dd41.f47702f;
                    if (c8d0.f35190a[r46.m74726U(strContextUri).f47709c.ordinal()] != 1 || e72.m37986T(contextTrack) || e72.m37984R(contextTrack)) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (z && z5 && !hdi.m47214F(playerState)) {
                        arrayList.add(t7d0.f217753e);
                    }
                    if (playerState.options().repeatingContext() || playerState.options().repeatingTrack()) {
                        if (playerState.options().repeatingTrack()) {
                            if (playerState.restrictions().disallowTogglingRepeatTrackReasons().isEmpty()) {
                                arrayList.add(new s7d0(true));
                                arrayList.add(p7d0Var);
                            }
                        } else if (playerState.restrictions().disallowTogglingRepeatContextReasons().isEmpty()) {
                            arrayList.add(r7d0.f196501d);
                            arrayList.add(p7d0Var);
                        }
                    } else if (playerState.restrictions().disallowTogglingRepeatTrackReasons().isEmpty()) {
                        arrayList.add(t7d0.f217752d);
                        arrayList.add(p7d0Var);
                    } else if (playerState.restrictions().disallowTogglingRepeatContextReasons().isEmpty()) {
                        arrayList.add(new s7d0(false));
                        arrayList.add(p7d0Var);
                    }
                    if (hdi.m47214F(playerState) && !e72.m37985S(contextTrack)) {
                        arrayList.add(u7d0.f227575e);
                    }
                }
            } else if (playerState.restrictions().disallowSkippingNextReasons().isEmpty()) {
                arrayList.add(l7d0Var);
                return arrayList;
            }
        }
        return arrayList;
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        qmw qmwVar;
        if (i == 0) {
            qmwVar = qmw.EMPTY;
        } else if (i != 1) {
            qmwVar = i != 2 ? null : qmw.EPISODE;
        } else {
            qmwVar = qmw.TRACK;
        }
        return qmwVar == null ? qmw.UNRECOGNIZED : qmwVar;
    }

    @Override // p204p.guz0
    /* JADX INFO: renamed from: d */
    public Object mo30660d(FileInputStream fileInputStream) throws CorruptionException {
        ahq0 ahq0VarM32957H = cjf1.m32957H(fileInputStream);
        qpi0 qpi0VarM52793o = ja61.m52793o(new tgq0[0]);
        for (Map.Entry entry : ahq0VarM32957H.m25997j().entrySet()) {
            String str = (String) entry.getKey();
            ehq0 ehq0Var = (ehq0) entry.getValue();
            int iM38996x = ehq0Var.m38996x();
            switch (iM38996x == 0 ? -1 : fhq0.f69692a[edb.m38547C(iM38996x)]) {
                case -1:
                    throw new CorruptionException("Value case is null.", null);
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    qpi0VarM52793o.m73446a(p271.m68909l(str), Boolean.valueOf(ehq0Var.m38989p()));
                    break;
                case 2:
                    qpi0VarM52793o.m73446a(p271.m68913p(str), Float.valueOf(ehq0Var.m38991s()));
                    break;
                case 3:
                    qpi0VarM52793o.m73446a(p271.m68911n(str), Double.valueOf(ehq0Var.m38990r()));
                    break;
                case 4:
                    qpi0VarM52793o.m73446a(p271.m68917t(str), Integer.valueOf(ehq0Var.m38992t()));
                    break;
                case 5:
                    qpi0VarM52793o.m73446a(p271.m68920w(str), Long.valueOf(ehq0Var.m38993u()));
                    break;
                case 6:
                    qpi0VarM52793o.m73446a(p271.m68922y(str), ehq0Var.m38994v());
                    break;
                case 7:
                    qpi0VarM52793o.m73446a(p271.m68923z(str), g6f.m43736n1(ehq0Var.m38995w().m32811l()));
                    break;
                case 8:
                    throw new CorruptionException("Value not set.", null);
            }
        }
        return qpi0VarM52793o.m73448c();
    }

    @Override // p204p.guz0
    /* JADX INFO: renamed from: e */
    public void mo30661e(Object obj, pg21 pg21Var) throws IOException {
        AbstractC0048e abstractC0048eM66037b;
        Map mapUnmodifiableMap = Collections.unmodifiableMap(((qpi0) obj).f191326a);
        ygq0 ygq0VarM25995k = ahq0.m25995k();
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            sgq0 sgq0Var = (sgq0) entry.getKey();
            Object value = entry.getValue();
            String str = sgq0Var.f208926a;
            if (value instanceof Boolean) {
                dhq0 dhq0VarM38988y = ehq0.m38988y();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                dhq0VarM38988y.m66039d();
                ehq0.m38984m((ehq0) dhq0VarM38988y.f160565b, zBooleanValue);
                abstractC0048eM66037b = dhq0VarM38988y.m66037b();
            } else if (value instanceof Float) {
                dhq0 dhq0VarM38988y2 = ehq0.m38988y();
                float fFloatValue = ((Number) value).floatValue();
                dhq0VarM38988y2.m66039d();
                ehq0.m38985n((ehq0) dhq0VarM38988y2.f160565b, fFloatValue);
                abstractC0048eM66037b = dhq0VarM38988y2.m66037b();
            } else if (value instanceof Double) {
                dhq0 dhq0VarM38988y3 = ehq0.m38988y();
                double dDoubleValue = ((Number) value).doubleValue();
                dhq0VarM38988y3.m66039d();
                ehq0.m38983l((ehq0) dhq0VarM38988y3.f160565b, dDoubleValue);
                abstractC0048eM66037b = dhq0VarM38988y3.m66037b();
            } else if (value instanceof Integer) {
                dhq0 dhq0VarM38988y4 = ehq0.m38988y();
                int iIntValue = ((Number) value).intValue();
                dhq0VarM38988y4.m66039d();
                ehq0.m38986o((ehq0) dhq0VarM38988y4.f160565b, iIntValue);
                abstractC0048eM66037b = dhq0VarM38988y4.m66037b();
            } else if (value instanceof Long) {
                dhq0 dhq0VarM38988y5 = ehq0.m38988y();
                long jLongValue = ((Number) value).longValue();
                dhq0VarM38988y5.m66039d();
                ehq0.m38980i((ehq0) dhq0VarM38988y5.f160565b, jLongValue);
                abstractC0048eM66037b = dhq0VarM38988y5.m66037b();
            } else if (value instanceof String) {
                dhq0 dhq0VarM38988y6 = ehq0.m38988y();
                dhq0VarM38988y6.m66039d();
                ehq0.m38981j((ehq0) dhq0VarM38988y6.f160565b, (String) value);
                abstractC0048eM66037b = dhq0VarM38988y6.m66037b();
            } else {
                if (!(value instanceof Set)) {
                    throw new IllegalStateException(wj50.m88258c0(value.getClass().getName(), "PreferencesSerializer does not support type: "));
                }
                dhq0 dhq0VarM38988y7 = ehq0.m38988y();
                bhq0 bhq0VarM32810m = chq0.m32810m();
                bhq0VarM32810m.m29256g((Set) value);
                dhq0VarM38988y7.m66039d();
                ehq0.m38982k((ehq0) dhq0VarM38988y7.f160565b, bhq0VarM32810m);
                abstractC0048eM66037b = dhq0VarM38988y7.m66037b();
            }
            ygq0VarM25995k.getClass();
            str.getClass();
            ygq0VarM25995k.m66039d();
            ahq0.m25994i((ahq0) ygq0VarM25995k.f160565b).put(str, (ehq0) abstractC0048eM66037b);
        }
        ahq0 ahq0Var = (ahq0) ygq0VarM25995k.m66037b();
        twe tweVar = new twe(pg21Var, twe.m81668A0(ahq0Var.mo426a()));
        ahq0Var.mo428c(tweVar);
        if (tweVar.f224429N0 > 0) {
            tweVar.m81702O0();
        }
    }

    @Override // p204p.t3b1
    /* JADX INFO: renamed from: f */
    public Object mo41272f(yl60 yl60Var, float f) {
        return mm60.m62269b(yl60Var, f);
    }

    /* JADX INFO: renamed from: g */
    public String m87884g(String str) {
        try {
            InputStream inputStreamM30734a = bx3.m30734a(str);
            if (inputStreamM30734a != null) {
                return new BufferedReader(new InputStreamReader(inputStreamM30734a)).readLine();
            }
            return null;
        } catch (IOException | SecurityException unused) {
            return null;
        }
    }

    @Override // p204p.wi5
    /* JADX INFO: renamed from: t */
    public void mo75551t(yqq yqqVar, int i, int[] iArr, ko70 ko70Var, int[] iArr2) {
        if (ko70Var == ko70.f124556a) {
            bj5.m29366c(i, iArr, iArr2, false);
        } else {
            bj5.m29365b(iArr, iArr2, true);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f250570a) {
            case 0:
                return ((e301) obj).f55572b;
            case 5:
                return !((ubp0) obj).f228873u;
            case 9:
                return ((PlayerState) obj).track().mo49279c();
            case 13:
                return ((e301) obj).f55572b;
            default:
                String str = ((pj31) obj).f178141h;
                return str == null || str.length() == 0;
        }
    }

    public String toString() {
        switch (this.f250570a) {
            case 20:
                return "Arrangement#End";
            case 26:
                return "sans-serif-medium";
            default:
                return super.toString();
        }
    }

    @Override // p204p.fz61
    /* JADX INFO: renamed from: w */
    public Object mo24968w(bz61 bz61Var) {
        switch (this.f250570a) {
            case 27:
                return jba0.m52882o6(bz61Var);
            default:
                return d4l0.m34918m6(bz61Var);
        }
    }

    public wej0(tti ttiVar) {
        this.f250570a = 23;
    }
}
