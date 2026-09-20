package p204p;

import android.bluetooth.BluetoothDevice;
import android.view.View;
import com.google.protobuf.AbstractC0269h;
import com.spotify.base.java.logging.Logger;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse;
import com.spotify.download.esperanto.proto.EsDownload$SegmentFileStreamerId;
import com.spotify.liveroom.listeningpartymessagesourceapi.api.BatchedChatChannelEvent;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.PlayerError;
import com.spotify.player.model.PlayerState;
import com.spotify.playlist.p126ai.creation.p127v2.GetMessageHistoryResponse;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;
import spotify.your_library_tags_esperanto.proto.DecoratedClass;

/* JADX INFO: loaded from: classes7.dex */
public final class e370 implements t6l0, BiFunction, Predicate, Function, Function4, q7a, Init, BiPredicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55670a;

    /* JADX INFO: renamed from: b */
    public static final e370 f55659b = new e370(0);

    /* JADX INFO: renamed from: c */
    public static final e370 f55661c = new e370(1);

    /* JADX INFO: renamed from: d */
    public static final e370 f55663d = new e370(2);

    /* JADX INFO: renamed from: e */
    public static final e370 f55664e = new e370(3);

    /* JADX INFO: renamed from: f */
    public static final e370 f55665f = new e370(4);

    /* JADX INFO: renamed from: g */
    public static final e370 f55666g = new e370(5);

    /* JADX INFO: renamed from: h */
    public static final k25 f55667h = new k25();

    /* JADX INFO: renamed from: i */
    public static final e370 f55668i = new e370(7);

    /* JADX INFO: renamed from: t */
    public static final e370 f55669t = new e370(8);

    /* JADX INFO: renamed from: X */
    public static final e370 f55652X = new e370(9);

    /* JADX INFO: renamed from: Y */
    public static final e370 f55654Y = new e370(10);

    /* JADX INFO: renamed from: Z */
    public static final e370 f55656Z = new e370(11);

    /* JADX INFO: renamed from: L0 */
    public static final e370 f55640L0 = new e370(12);

    /* JADX INFO: renamed from: M0 */
    public static final e370 f55641M0 = new e370(13);

    /* JADX INFO: renamed from: N0 */
    public static final e370 f55642N0 = new e370(14);

    /* JADX INFO: renamed from: O0 */
    public static final e370 f55643O0 = new e370(15);

    /* JADX INFO: renamed from: P0 */
    public static final e370 f55644P0 = new e370(16);

    /* JADX INFO: renamed from: Q0 */
    public static final e370 f55645Q0 = new e370(17);

    /* JADX INFO: renamed from: R0 */
    public static final e370 f55646R0 = new e370(18);

    /* JADX INFO: renamed from: S0 */
    public static final e370 f55647S0 = new e370(19);

    /* JADX INFO: renamed from: T0 */
    public static final e370 f55648T0 = new e370(20);

    /* JADX INFO: renamed from: U0 */
    public static final e370 f55649U0 = new e370(21);

    /* JADX INFO: renamed from: V0 */
    public static final e370 f55650V0 = new e370(22);

    /* JADX INFO: renamed from: W0 */
    public static final e370 f55651W0 = new e370(23);

    /* JADX INFO: renamed from: X0 */
    public static final e370 f55653X0 = new e370(24);

    /* JADX INFO: renamed from: Y0 */
    public static final e370 f55655Y0 = new e370(25);

    /* JADX INFO: renamed from: Z0 */
    public static final e370 f55657Z0 = new e370(26);

    /* JADX INFO: renamed from: a1 */
    public static final e370 f55658a1 = new e370(27);

    /* JADX INFO: renamed from: b1 */
    public static final e370 f55660b1 = new e370(28);

    /* JADX INFO: renamed from: c1 */
    public static final e370 f55662c1 = new e370(29);

    public /* synthetic */ e370(int i) {
        this.f55670a = i;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f55670a) {
            case 4:
                return ((GetMessageHistoryResponse) obj).getMessagesList();
            case 5:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new gz9((BluetoothDevice) it.next()));
                }
                return arrayList;
            case 6:
            case 7:
            case 8:
            case 12:
            case 20:
            case 21:
            case 23:
            case 26:
            default:
                return new sxo0((PlayerError) obj);
            case 9:
                return Boolean.TRUE;
            case 10:
                return new s6x0(new c6x0((Throwable) obj));
            case 11:
                return u4m.f226774a;
            case 13:
                return (AbstractC0269h) ((xul0) obj).mo49278b();
            case 14:
                return ((BatchedChatChannelEvent) obj).f5148b;
            case 15:
                byte[] bArr = (byte[]) obj;
                try {
                    return CollectionPlatformEsperantoItemsResponse.m6874o(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 16:
                return new xlf((daa0) obj);
            case 17:
                return Double.valueOf(((dgr) ((xul0) obj).mo49278b()).f48884a);
            case 18:
                return Single.just(C2244p5.f174033a);
            case 19:
                h0c1 h0c1Var = hvk.f95744a;
                Logger.m3967c((Throwable) obj, "Error trying to send request to ContextPlayer", new Object[0]);
                return Observable.empty();
            case 22:
                List<DecoratedClass> list2 = ((hse1) obj).f94685a;
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(list2, 10));
                for (DecoratedClass decoratedClass : list2) {
                    ae50<tro> ae50VarM98318p = decoratedClass.m98318p();
                    ArrayList arrayList3 = new ArrayList(i6f.m49804T(ae50VarM98318p, 10));
                    for (tro troVar : ae50VarM98318p) {
                        arrayList3.add(new jyy(Integer.valueOf(troVar.mo79122b()), troVar.mo79123c(), troVar.getTagName()));
                    }
                    arrayList2.add(new n5z(decoratedClass.m98316n(), new a7z0(arrayList3)));
                }
                return arrayList2;
            case 24:
                return ((ph3) obj).f177454b.f117618a.f84783d;
            case 25:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsDownload$SegmentFileStreamerId.m9557q(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.download.esperanto.proto.EsDownload.SegmentFileStreamerId: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 27:
                p2x0 p2x0Var = (p2x0) obj;
                if (!(p2x0Var instanceof k2x0)) {
                    if (p2x0Var instanceof m2x0) {
                        return Single.just(((hz80) ((m2x0) p2x0Var).f139474a).f96825a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return Single.error(new Throwable("Failed to get playlist: " + ((k2x0) p2x0Var).f118699a));
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((q8t) obj);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f55670a) {
            case 3:
                return ((gqx) obj).mo45451c();
            case 7:
                return !((iqx) ((gqx) obj)).f104863f;
            case 21:
                return ((sg5) obj) == sg5.f208720a;
            default:
                return ((ywi) obj).f276973c != null;
        }
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        dx40 dx40VarMo51806g = swd1Var.f214650a.mo51806g(647);
        view.setPadding(dx40VarMo51806g.f53848a, view.getPaddingTop(), dx40VarMo51806g.f53850c, view.getPaddingBottom());
        return swd1Var;
    }

    @Override // io.reactivex.rxjava3.functions.Function4
    /* JADX INFO: renamed from: y */
    public Object mo23409y(Object obj, Object obj2, Object obj3, Object obj4) {
        return new x77((PlayerState) obj, (rhj) obj2, (b92) obj3, ((Boolean) obj4).booleanValue());
    }

    @Override // io.reactivex.rxjava3.functions.BiPredicate
    public boolean test(Object obj, Object obj2) {
        return wj50.m88271j(((ew50) obj).getItems(), ((ew50) obj2).getItems());
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return new cpo0((String) obj, ((Boolean) obj2).booleanValue(), null, 60);
    }
}
