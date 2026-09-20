package p204p;

import androidx.car.app.model.Alert;
import com.google.protobuf.Empty;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.PlayerState;
import com.spotify.profile.socialgraphimpl.proto.BlockedlistResponse$RelationsUsernameResponse;
import com.spotify.profile.socialgraphimpl.proto.BlockedlistResponse$UsernameUser;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFlatMapMaybe;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableZip;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p196j$.util.Base64;
import spotify.collection.esperanto.proto.CollectionTrack;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: classes9.dex */
public final class ykq0 implements BiFunction, Function, tn61, Predicate, tpk, Init {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f273817a;

    /* JADX INFO: renamed from: b */
    public static final ykq0 f273807b = new ykq0(0);

    /* JADX INFO: renamed from: c */
    public static final ykq0 f273809c = new ykq0(1);

    /* JADX INFO: renamed from: d */
    public static final ykq0 f273810d = new ykq0(2);

    /* JADX INFO: renamed from: e */
    public static final ykq0 f273811e = new ykq0(3);

    /* JADX INFO: renamed from: f */
    public static final ykq0 f273812f = new ykq0(4);

    /* JADX INFO: renamed from: g */
    public static final ykq0 f273813g = new ykq0(5);

    /* JADX INFO: renamed from: h */
    public static final ykq0 f273814h = new ykq0(6);

    /* JADX INFO: renamed from: i */
    public static final ykq0 f273815i = new ykq0(7);

    /* JADX INFO: renamed from: t */
    public static final ykq0 f273816t = new ykq0(8);

    /* JADX INFO: renamed from: X */
    public static final ykq0 f273800X = new ykq0(9);

    /* JADX INFO: renamed from: Y */
    public static final ykq0 f273802Y = new ykq0(10);

    /* JADX INFO: renamed from: Z */
    public static final ykq0 f273804Z = new ykq0(11);

    /* JADX INFO: renamed from: L0 */
    public static final ykq0 f273788L0 = new ykq0(12);

    /* JADX INFO: renamed from: M0 */
    public static final ykq0 f273789M0 = new ykq0(13);

    /* JADX INFO: renamed from: N0 */
    public static final ykq0 f273790N0 = new ykq0(14);

    /* JADX INFO: renamed from: O0 */
    public static final ykq0 f273791O0 = new ykq0(15);

    /* JADX INFO: renamed from: P0 */
    public static final ykq0 f273792P0 = new ykq0(16);

    /* JADX INFO: renamed from: Q0 */
    public static final ykq0 f273793Q0 = new ykq0(17);

    /* JADX INFO: renamed from: R0 */
    public static final ykq0 f273794R0 = new ykq0(18);

    /* JADX INFO: renamed from: S0 */
    public static final ykq0 f273795S0 = new ykq0(19);

    /* JADX INFO: renamed from: T0 */
    public static final ykq0 f273796T0 = new ykq0(20);

    /* JADX INFO: renamed from: U0 */
    public static final ykq0 f273797U0 = new ykq0(21);

    /* JADX INFO: renamed from: V0 */
    public static final ykq0 f273798V0 = new ykq0(22);

    /* JADX INFO: renamed from: W0 */
    public static final ykq0 f273799W0 = new ykq0(23);

    /* JADX INFO: renamed from: X0 */
    public static final ykq0 f273801X0 = new ykq0(24);

    /* JADX INFO: renamed from: Y0 */
    public static final ykq0 f273803Y0 = new ykq0(25);

    /* JADX INFO: renamed from: Z0 */
    public static final ykq0 f273805Z0 = new ykq0(26);

    /* JADX INFO: renamed from: a1 */
    public static final ykq0 f273806a1 = new ykq0(27);

    /* JADX INFO: renamed from: b1 */
    public static final ykq0 f273808b1 = new ykq0(28);

    public /* synthetic */ ykq0(int i) {
        this.f273817a = i;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        boolean z;
        switch (this.f273817a) {
            case 1:
                return new omr0(null);
            case 2:
                BlockedlistResponse$RelationsUsernameResponse blockedlistResponse$RelationsUsernameResponse = (BlockedlistResponse$RelationsUsernameResponse) obj;
                String nextPageToken = blockedlistResponse$RelationsUsernameResponse.getNextPageToken();
                wj50.m88279p(nextPageToken);
                String str = nextPageToken.length() > 0 ? nextPageToken : null;
                ae50<BlockedlistResponse$UsernameUser> ae50VarM19834o = blockedlistResponse$RelationsUsernameResponse.m19834o();
                ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM19834o, 10));
                for (BlockedlistResponse$UsernameUser blockedlistResponse$UsernameUser : ae50VarM19834o) {
                    Set set = dd41.f47702f;
                    String strM35694A = r46.m74732a0(blockedlistResponse$UsernameUser.getUsername(), null).m35694A();
                    wj50.m88279p(strM35694A);
                    arrayList.add(new p0s0(k0s0.f118140a, strM35694A, null, null, null, null, null, 4092));
                }
                return new qxr0(3, arrayList, str, str == null, 104);
            case 3:
                return new kot0(nau.f152117a);
            case 4:
                return new gau0((fau0) obj);
            case 5:
            case 6:
            case 8:
            case 9:
            default:
                pqm0 pqm0Var = (pqm0) obj;
                pqm0 pqm0Var2 = (pqm0) pqm0Var.f180350a;
                fs11 fs11Var = (fs11) pqm0Var.f180351b;
                xaw xawVar = (xaw) pqm0Var2.f180350a;
                d5x0 d5x0Var = (d5x0) pqm0Var2.f180351b;
                if (fs11Var == null || xawVar == null) {
                    return kv81.f126798a;
                }
                String string = xawVar.f259774a.toString();
                String str2 = xawVar.f259776c;
                int iM33198q = cks.m33198q(jwg1.m54450E(xawVar.f259787n, ils.MILLISECONDS), ils.SECONDS);
                boolean z2 = (xawVar.f259782i && d5x0Var.f45528a) || (bxg1.m30836m(xawVar) && d5x0Var.f45529b);
                Set setM90293a = xawVar.m90293a();
                if ((setM90293a instanceof Collection) && setM90293a.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = setM90293a.iterator();
                    while (it.hasNext()) {
                        if (((uaw) it.next()) == uaw.f228562b) {
                            z = true;
                        }
                    }
                    z = false;
                }
                return new jv81(new ov81(string, str2, iM33198q, z2, z, xawVar.f259778e.f256621b, bxg1.m30836m(xawVar), xawVar.f259782i, new tl11(new xj11(fs11Var.f72737a, fs11Var.f72738b, null, null, 0L, null, null, null, false, false, false, null, 0L, null, null, 0, null, null, null, false, false, null, null, 0, null, 536870902), lau.f131415a, false, 0, 0, new m3w(0, 0), null, null, null, null)));
            case 7:
                return new mpw0((String) obj);
            case 10:
                return (Long) ((xul0) obj).mo49278b();
            case 11:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 12:
                Object obj2 = ((gv31) obj).f84602a;
                if (obj2 != null) {
                    return (Boolean) obj2;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 13:
                return xul0.m92200a(((g331) obj).f76084a);
            case 14:
                return new vhj0((Throwable) obj, null);
            case 15:
                return ((u031) obj).f225378b;
            case 16:
                return new vhj0((Throwable) obj, null);
            case 17:
                FlowableZip flowableZipM23347c0 = ((Flowable) obj).m23347c0(Flowable.m23315O(1, 3), olr0.f166883P0);
                ObjectHelper.m23450a(Alert.DURATION_SHOW_INDEFINITELY, "maxConcurrency");
                return new FlowableFlatMapMaybe(flowableZipM23347c0);
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((l8a1) obj);
    }

    @Override // p204p.tpk
    /* JADX INFO: renamed from: k */
    public Object mo26363k(Object obj) {
        return Integer.valueOf(((p3x0) obj).m69093g());
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f273817a) {
            case 6:
                return ((Boolean) obj).booleanValue();
            case 18:
                return ((lcf) obj) instanceof hcf;
            case 24:
                return ((PlayerState) obj).playbackQuality().mo49279c();
            default:
                return !((YourLibraryResponse) obj).m98199q().m98204q();
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f273817a) {
            case 0:
                return (ciq0) obj;
            case 19:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && !((Boolean) obj2).booleanValue());
            case 20:
                return new pqm0((CollectionTrack) obj, (us6) obj2);
            case 23:
                return new pqm0((Boolean) obj, (q5c1) obj2);
            default:
                m291 m291Var = (m291) obj2;
                wj50.m88279p(m291Var);
                return new j091(m291Var, ((Long) obj).longValue());
        }
    }
}
