package p204p;

import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.protobuf.Empty;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse;
import com.spotify.connect.esperanto.proto.CommonMessages$StatusResponse;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates.BottomSheetTemplate;
import com.spotify.metadata.esperanto.proto.GetEntityResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.playlist.p126ai.creation.p127v2.GetPusherMessageResponse;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p196j$.util.Base64;
import retrofit2.HttpException;
import spotify.autodownload.esperanto.proto.EnabledShowsCountResponse;
import spotify.collection.esperanto.proto.CollectionDecorateResponse;
import spotify.your_library_tags_esperanto.proto.YourLibraryTagsResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class k8f0 implements Function, Predicate, Init, BiFunction, i5w0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f120354a;

    /* JADX INFO: renamed from: b */
    public static final k8f0 f120344b = new k8f0(0);

    /* JADX INFO: renamed from: c */
    public static final k8f0 f120346c = new k8f0(1);

    /* JADX INFO: renamed from: d */
    public static final k8f0 f120347d = new k8f0(2);

    /* JADX INFO: renamed from: e */
    public static final k8f0 f120348e = new k8f0(3);

    /* JADX INFO: renamed from: f */
    public static final k8f0 f120349f = new k8f0(4);

    /* JADX INFO: renamed from: g */
    public static final k8f0 f120350g = new k8f0(5);

    /* JADX INFO: renamed from: h */
    public static final k8f0 f120351h = new k8f0(6);

    /* JADX INFO: renamed from: i */
    public static final k8f0 f120352i = new k8f0(7);

    /* JADX INFO: renamed from: t */
    public static final k8f0 f120353t = new k8f0(8);

    /* JADX INFO: renamed from: X */
    public static final k8f0 f120337X = new k8f0(9);

    /* JADX INFO: renamed from: Y */
    public static final k8f0 f120339Y = new k8f0(10);

    /* JADX INFO: renamed from: Z */
    public static final k8f0 f120341Z = new k8f0(11);

    /* JADX INFO: renamed from: L0 */
    public static final k8f0 f120325L0 = new k8f0(12);

    /* JADX INFO: renamed from: M0 */
    public static final k8f0 f120326M0 = new k8f0(13);

    /* JADX INFO: renamed from: N0 */
    public static final k8f0 f120327N0 = new k8f0(14);

    /* JADX INFO: renamed from: O0 */
    public static final k8f0 f120328O0 = new k8f0(15);

    /* JADX INFO: renamed from: P0 */
    public static final k8f0 f120329P0 = new k8f0(16);

    /* JADX INFO: renamed from: Q0 */
    public static final k8f0 f120330Q0 = new k8f0(17);

    /* JADX INFO: renamed from: R0 */
    public static final k8f0 f120331R0 = new k8f0(18);

    /* JADX INFO: renamed from: S0 */
    public static final k8f0 f120332S0 = new k8f0(20);

    /* JADX INFO: renamed from: T0 */
    public static final k8f0 f120333T0 = new k8f0(21);

    /* JADX INFO: renamed from: U0 */
    public static final k8f0 f120334U0 = new k8f0(22);

    /* JADX INFO: renamed from: V0 */
    public static final k8f0 f120335V0 = new k8f0(23);

    /* JADX INFO: renamed from: W0 */
    public static final k8f0 f120336W0 = new k8f0(24);

    /* JADX INFO: renamed from: X0 */
    public static final k8f0 f120338X0 = new k8f0(25);

    /* JADX INFO: renamed from: Y0 */
    public static final k8f0 f120340Y0 = new k8f0(26);

    /* JADX INFO: renamed from: Z0 */
    public static final k8f0 f120342Z0 = new k8f0(27);

    /* JADX INFO: renamed from: a1 */
    public static final k8f0 f120343a1 = new k8f0(28);

    /* JADX INFO: renamed from: b1 */
    public static final k8f0 f120345b1 = new k8f0(29);

    public /* synthetic */ k8f0(int i) {
        this.f120354a = i;
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m55741a(String str, List list, String str2) {
        String string = wl51.m88491o1(str).toString();
        ArrayList<mwk> arrayList = new ArrayList();
        for (Object obj : list) {
            mwk mwkVar = (mwk) obj;
            if (wl51.m88460J0(string) || wl51.m88496t0(mwkVar.f147803b, string, true)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        for (mwk mwkVar2 : arrayList) {
            arrayList2.add(new dxk(mwkVar2, wj50.m88271j(mwkVar2.f147802a, str2)));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: c */
    public static final ArrayList m55742c(View view) {
        if (p2l.f173365a.contains(k8f0.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ViewGroup viewGroupM83153i = uhc1.m83153i(view);
            if (viewGroupM83153i != null) {
                for (View view2 : uhc1.m83147b(viewGroupM83153i)) {
                    if (view != view2) {
                        arrayList.addAll(f120344b.m55745e(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            p2l.m68953a(k8f0.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final ArrayList m55743d(View view) {
        List listM44518y;
        if (p2l.f173365a.contains(k8f0.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(uhc1.m83152h(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    Pattern patternCompile = Pattern.compile("/");
                    wl51.m88474X0(0);
                    Matcher matcher = patternCompile.matcher(resourceName);
                    if (matcher.find()) {
                        ArrayList arrayList2 = new ArrayList(10);
                        int iEnd = 0;
                        do {
                            arrayList2.add(resourceName.subSequence(iEnd, matcher.start()).toString());
                            iEnd = matcher.end();
                        } while (matcher.find());
                        arrayList2.add(resourceName.subSequence(iEnd, resourceName.length()).toString());
                        listM44518y = arrayList2;
                    } else {
                        listM44518y = geg1.m44518y(resourceName.toString());
                    }
                    String[] strArr = (String[]) listM44518y.toArray(new String[0]);
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList3 = new ArrayList();
            for (String str : arrayList) {
                if (str.length() > 0 && str.length() <= 100) {
                    arrayList3.add(str.toLowerCase());
                }
            }
            return arrayList3;
        } catch (Throwable th) {
            p2l.m68953a(k8f0.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m55744f(ArrayList arrayList, ArrayList arrayList2) {
        if (!p2l.f173365a.contains(k8f0.class)) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    k8f0 k8f0Var = f120344b;
                    if (!p2l.f173365a.contains(k8f0Var)) {
                        try {
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                if (wl51.m88496t0(str, (String) it2.next(), false)) {
                                    return true;
                                }
                            }
                        } catch (Throwable th) {
                            p2l.m68953a(k8f0Var, th);
                        }
                    }
                }
            } catch (Throwable th2) {
                p2l.m68953a(k8f0.class, th2);
                return false;
            }
        }
        return false;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f120354a) {
            case 1:
                return C2465uo.f232292a;
            case 2:
                return new s6x0(new c6x0((Throwable) obj));
            case 3:
                return new xz1(((Uri) obj).toString());
            case 4:
                return GetPusherMessageResponse.parseFrom((byte[]) obj);
            case 5:
                return ((dy3) obj).f54158a;
            case 6:
                return ((PlayerState) obj).track();
            case 7:
                CollectionDecorateResponse collectionDecorateResponse = (CollectionDecorateResponse) obj;
                if (collectionDecorateResponse.getArtistCount() != 0) {
                    return collectionDecorateResponse.m97479o();
                }
                throw new IllegalArgumentException("We should have an Artist Model");
            case 8:
            case 10:
            case 12:
            case 13:
            case 14:
            case 19:
            case 20:
            case 21:
            case 26:
            default:
                return htw.f95204a;
            case 9:
                return Boolean.valueOf(((EnabledShowsCountResponse) obj).m97412n() > 0);
            case 11:
                o2x0 o2x0Var = (o2x0) obj;
                n2x0 n2x0Var = o2x0Var.f161171a;
                if (n2x0Var.f149852O0) {
                    e2b1 e2b1Var = (e2b1) o2x0Var.f161172b;
                    if (e2b1Var != null) {
                        return e2b1Var;
                    }
                    throw new HttpException(o2x0Var);
                }
                int i = n2x0Var.f149860d;
                if (i == 409) {
                    return min0.INSTANCE;
                }
                if (i == 410) {
                    return qlx.INSTANCE;
                }
                throw new HttpException(o2x0Var);
            case 15:
                byte[] bArr = (byte[]) obj;
                try {
                    return CollectionPlatformEsperantoContainsResponse.m6872q(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 16:
                return ilf.f103374a;
            case 17:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return CommonMessages$StatusResponse.m7301o(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.connect.esperanto.proto.CommonMessages.StatusResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 18:
                PlayerState playerState = (PlayerState) obj;
                String str = (String) ((ContextTrack) playerState.track().mo49278b()).metadata().get(ContextTrack.Metadata.KEY_STATION_TITLE);
                String str2 = (String) ((ContextTrack) playerState.track().mo49278b()).metadata().get(ContextTrack.Metadata.KEY_STATION_SUBTITLE);
                return Boolean.valueOf((str == null || str.length() == 0) && (str2 == null || str2.length() == 0));
            case 22:
                return Observable.fromIterable((List) obj).filter(wqb0.f253974X0);
            case 23:
                na6.m63959g("Failed in YourLibraryServiceClient.Contains", (Throwable) obj);
                return CompletableEmpty.f7437a;
            case 24:
                return new hse1(((YourLibraryTagsResponse) obj).m98323n());
            case 25:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr3);
                } catch (Exception e3) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e3);
                }
            case 27:
                return ((GetEntityResponse) obj).m15422n().m15415t().getName();
            case 28:
                return new jbw((ew50) obj);
        }
    }

    @Override // p204p.i5w0
    /* JADX INFO: renamed from: b */
    public p5w0 mo39759b(h9x h9xVar) {
        if (h9xVar.equals(d9x.f46928a)) {
            return n5w0.f150633a;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public ArrayList m55745e(View view) {
        if (p2l.f173365a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String string = ((TextView) view).getText().toString();
                if (string.length() > 0 && string.length() < 100) {
                    arrayList.add(string.toLowerCase());
                    return arrayList;
                }
            } else {
                Iterator it = uhc1.m83147b(view).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(m55745e((View) it.next()));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            p2l.m68953a(this, th);
            return null;
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        switch (this.f120354a) {
            case 12:
                MessageResponseToken messageResponseToken = ((vfa) obj).f240917a;
                return First.m15574b(new vfa(messageResponseToken, (BottomSheetTemplate) lq51.m59702h(messageResponseToken), false));
            default:
                return First.m15574b((ftd) obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f120354a) {
            case 8:
                return !((iqx) ((gqx) obj)).f104863f;
            default:
                api apiVar = (api) ((xul0) obj).mo49283h();
                return apiVar != null && apiVar.mo26697m();
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f120354a) {
            case 13:
                PlayerState playerState = (PlayerState) obj;
                PlayerState playerState2 = (PlayerState) obj2;
                return (wj50.m88271j((String) playerState.track().mo49284i(cx7.f42935f).mo49280e(""), (String) playerState2.track().mo49284i(cx7.f42936g).mo49280e("")) && playerState.isPaused() == playerState2.isPaused()) ? playerState : playerState2;
            default:
                gqi gqiVar = (gqi) obj;
                bzd1 bzd1Var = (bzd1) obj2;
                if (gqiVar.f83482d == 6) {
                    return new gqi(bzd1Var == bzd1.f32476a ? 2 : 6, gqiVar.f83483e, gqiVar.f83479a, gqiVar.f83480b, gqiVar.f83481c);
                }
                return gqiVar;
        }
    }
}
