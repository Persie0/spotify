package p204p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.spotify.allboarding.entrypoint.EntryPoint;
import com.spotify.bluetooth.categorizer.CategorizerResponse;
import com.spotify.mobius.Next;
import com.spotify.music.R;
import com.spotify.player.esperanto.proto.EsContextPlayerError$ContextPlayerError;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ErrorType;
import com.spotify.player.model.PlayerError;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import spotify.collection.esperanto.proto.CollectionArtist;
import spotify.collection.esperanto.proto.CollectionDecorateResponse;
import spotify.your_library.esperanto.proto.YourLibraryDecorateResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;

/* JADX INFO: loaded from: classes4.dex */
public final class g2h1 implements Predicate, Function, BiFunction, BiPredicate, yh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f75962a;

    /* JADX INFO: renamed from: b */
    public static final g2h1 f75953b = new g2h1(1);

    /* JADX INFO: renamed from: c */
    public static final g2h1 f75954c = new g2h1(2);

    /* JADX INFO: renamed from: d */
    public static final g2h1 f75955d = new g2h1(3);

    /* JADX INFO: renamed from: e */
    public static final g2h1 f75956e = new g2h1(5);

    /* JADX INFO: renamed from: f */
    public static final g2h1 f75957f = new g2h1(6);

    /* JADX INFO: renamed from: g */
    public static final g2h1 f75958g = new g2h1(7);

    /* JADX INFO: renamed from: h */
    public static final g2h1 f75959h = new g2h1(8);

    /* JADX INFO: renamed from: i */
    public static final g2h1 f75960i = new g2h1(9);

    /* JADX INFO: renamed from: t */
    public static final g2h1 f75961t = new g2h1(10);

    /* JADX INFO: renamed from: X */
    public static final g2h1 f75947X = new g2h1(11);

    /* JADX INFO: renamed from: Y */
    public static final g2h1 f75949Y = new g2h1(12);

    /* JADX INFO: renamed from: Z */
    public static final g2h1 f75951Z = new g2h1(13);

    /* JADX INFO: renamed from: L0 */
    public static final g2h1 f75935L0 = new g2h1(14);

    /* JADX INFO: renamed from: M0 */
    public static final g2h1 f75936M0 = new g2h1(15);

    /* JADX INFO: renamed from: N0 */
    public static final g2h1 f75937N0 = new g2h1(16);

    /* JADX INFO: renamed from: O0 */
    public static final g2h1 f75938O0 = new g2h1(17);

    /* JADX INFO: renamed from: P0 */
    public static final g2h1 f75939P0 = new g2h1(18);

    /* JADX INFO: renamed from: Q0 */
    public static final g2h1 f75940Q0 = new g2h1(19);

    /* JADX INFO: renamed from: R0 */
    public static final g2h1 f75941R0 = new g2h1(20);

    /* JADX INFO: renamed from: S0 */
    public static final g2h1 f75942S0 = new g2h1(21);

    /* JADX INFO: renamed from: T0 */
    public static final g2h1 f75943T0 = new g2h1(22);

    /* JADX INFO: renamed from: U0 */
    public static final g2h1 f75944U0 = new g2h1(23);

    /* JADX INFO: renamed from: V0 */
    public static final g2h1 f75945V0 = new g2h1(24);

    /* JADX INFO: renamed from: W0 */
    public static final g2h1 f75946W0 = new g2h1(26);

    /* JADX INFO: renamed from: X0 */
    public static final g2h1 f75948X0 = new g2h1(27);

    /* JADX INFO: renamed from: Y0 */
    public static final g2h1 f75950Y0 = new g2h1(28);

    /* JADX INFO: renamed from: Z0 */
    public static final g2h1 f75952Z0 = new g2h1(29);

    public /* synthetic */ g2h1(int i) {
        this.f75962a = i;
    }

    /* JADX INFO: renamed from: a */
    public static LayerDrawable m43391a(Context context, int i, int i2) {
        Drawable drawable = context.getDrawable(i);
        Drawable drawable2 = context.getDrawable(i2);
        wj50.m88279p(drawable2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.baseTextSubdued});
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
        Drawable drawableMutate = drawable2.mutate();
        drawableMutate.setTintList(colorStateList);
        return new LayerDrawable(new Drawable[]{drawable, new s10((Drawable) new s10((Object) drawableMutate, 3), 0.375f)});
    }

    /* JADX INFO: renamed from: b */
    public static Next m43392b(ad3 ad3Var, q151 q151Var, List list) {
        ad3 ad3VarM25511c;
        oiy0 oiy0Var = q151Var.f184213c;
        List list2 = ad3Var.f14502c;
        q151 q151Var2 = ad3Var.f14501b;
        EntryPoint entryPoint = ad3Var.f14500a;
        ArrayList arrayListM43700N0 = g6f.m43700N0(list, list2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM43700N0) {
            if (obj instanceof bej) {
                arrayList.add(obj);
            }
        }
        if (oiy0Var instanceof miy0) {
            ad3VarM25511c = ad3.m25511c(ad3Var, null, q151.m71870c(q151Var2, new miy0(((miy0) oiy0Var).f144120a, arrayList)), arrayListM43700N0, null, 9);
        } else if (oiy0Var instanceof iiy0) {
            ad3VarM25511c = ad3.m25511c(ad3Var, null, q151.m71870c(q151Var2, new iiy0(null, arrayList)), arrayListM43700N0, null, 9);
        } else {
            boolean z = oiy0Var instanceof fiy0;
            kiy0 kiy0Var = kiy0.f123141a;
            ad3VarM25511c = z ? ad3.m25511c(ad3Var, null, q151.m71870c(q151Var2, kiy0Var), arrayListM43700N0, null, 9) : ad3.m25511c(ad3Var, null, q151.m71870c(q151Var2, kiy0Var), arrayListM43700N0, null, 9);
        }
        ad3 ad3Var2 = ad3VarM25511c;
        e10 e10Var = q151Var.f184212b;
        if (wj50.m88271j(e10Var, C2433tz.f225078a)) {
            return Next.m15606h(ad3Var2);
        }
        boolean z2 = true;
        if (!(e10Var instanceof o00)) {
            if (wj50.m88271j(e10Var, C1759cz.f43410a)) {
                return Next.m15605a(Collections.singleton(new zb3(z2, entryPoint, "Completed with Action.Dismiss on processAction")));
            }
            if (!(e10Var instanceof u00)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((u00) e10Var).f225339a;
            return Next.m15605a(Collections.singleton(new zb3(true, entryPoint, s571.m77251j("Completed with Action.Uri on processAction [", str, "]"), str)));
        }
        oiy0 oiy0Var2 = q151Var2.f184213c;
        int size = list.size();
        if ((oiy0Var2 instanceof hiy0) && entryPoint != null && entryPoint.getCanExit() && ((hiy0) oiy0Var2).f91908h == 0 && size == 0) {
            return Next.m15605a(Collections.singleton(new zb3(z2, entryPoint, "Exited with no selection")));
        }
        String str2 = ((o00) e10Var).f160196a;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((b221) it.next()).getUri());
        }
        cc3 cc3Var = new cc3(str2, arrayList2, entryPoint, q151Var.f184213c instanceof miy0);
        return Next.m15607i(ad3.m25511c(ad3Var2, null, null, null, cc3Var, 7), Collections.singleton(cc3Var));
    }

    /* JADX INFO: renamed from: c */
    public static Next m43393c(ad3 ad3Var, sc3 sc3Var) {
        oiy0 miy0Var;
        ec3 ec3Var = ad3Var.f14503d;
        q151 q151Var = ad3Var.f14501b;
        EntryPoint entryPoint = ad3Var.f14500a;
        if (sc3Var instanceof qc3) {
            qc3 qc3Var = (qc3) sc3Var;
            return Next.m15607i(ad3.m25511c(ad3Var, qc3Var.f187244a, ad3.f14499e.f14501b, null, null, 12), Collections.singleton(new ac3(qc3Var.f187244a)));
        }
        boolean z = false;
        boolean z2 = true;
        if (!(sc3Var instanceof oc3)) {
            if (sc3Var instanceof nc3) {
                return Next.m15606h(ad3.m25511c(ad3Var, null, q151.m71870c(q151Var, new jiy0(q151Var.f184211a)), null, ((nc3) sc3Var).f152410a, 5));
            }
            if (!(sc3Var instanceof mc3)) {
                if (sc3Var instanceof pc3) {
                    return ec3Var != null ? Next.m15605a(Collections.singleton(ec3Var)) : Next.m15608j();
                }
                if (sc3Var instanceof rc3) {
                    return Next.m15605a(Collections.singleton(new zb3(z, entryPoint, ((rc3) sc3Var).f197713a)));
                }
                throw new NoWhenBranchMatchedException();
            }
            mc3 mc3Var = (mc3) sc3Var;
            if (q151Var.f184213c instanceof jiy0) {
                return Next.m15607i(ad3.m25511c(ad3Var, null, q151.m71870c(q151Var, kiy0.f123141a), null, null, 13), Collections.singleton(ec3Var));
            }
            yiy0 yiy0Var = mc3Var.f142021a;
            int i = yiy0Var.f273224a;
            List list = yiy0Var.f273225b;
            int iM38547C = edb.m38547C(i);
            if (iM38547C == 0) {
                q151 q151Var2 = q151Var.f184214d;
                return q151Var2 != null ? m43392b(ad3Var, q151Var2, list) : Next.m15608j();
            }
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            q151 q151Var3 = q151Var.f184215e;
            return q151Var3 != null ? m43392b(ad3Var, q151Var3, list) : Next.m15608j();
        }
        q151 q151Var4 = ((oc3) sc3Var).f163801a;
        if (q151Var4.f184213c instanceof miy0) {
            q151 q151Var5 = q151Var4.f184214d;
            e10 e10Var = q151Var5 != null ? q151Var5.f184212b : null;
            if (wj50.m88271j(e10Var, C1759cz.f43410a)) {
                return Next.m15605a(Collections.singleton(new zb3(z2, entryPoint, "Completed with Action.Dismiss from onPresentNextStep")));
            }
            if (e10Var instanceof u00) {
                String str = ((u00) e10Var).f225339a;
                return Next.m15605a(Collections.singleton(new zb3(true, entryPoint, s571.m77251j("Completed with Action.Uri from onPresentNextStep [", str, "]"), str)));
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List list2 = ad3Var.f14502c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof bej) {
                arrayList.add(obj);
            }
        }
        oiy0 oiy0VarM47645c = q151Var4.f184213c;
        if (oiy0VarM47645c instanceof hiy0) {
            oiy0VarM47645c = hiy0.m47645c((hiy0) oiy0VarM47645c, null, null, null, 0, entryPoint.getCanExit(), 6143);
        } else {
            if (oiy0VarM47645c instanceof iiy0) {
                miy0Var = new iiy0(((iiy0) oiy0VarM47645c).f102650a, arrayList);
            } else if (oiy0VarM47645c instanceof miy0) {
                miy0Var = new miy0(((miy0) oiy0VarM47645c).f144120a, arrayList);
            }
            oiy0VarM47645c = miy0Var;
        }
        return Next.m15607i(ad3.m25511c(ad3Var, null, q151.m71870c(q151Var4, oiy0VarM47645c), null, null, 5), linkedHashSet);
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f75962a) {
            case 5:
                return new crd0((PlayerState) obj, Integer.valueOf(((l241) obj2).f128916a));
            default:
                Map map = (Map) obj;
                return new q4w(dxf1.m37244s("has-podcasts-available", map), dxf1.m37246v(map), ((Boolean) obj2).booleanValue());
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f75962a) {
            case 1:
                return ((xul0) obj).mo49279c();
            case 12:
                return ((Boolean) obj).booleanValue();
            case 14:
                return !((iqx) ((gqx) obj)).f104863f;
            default:
                return !((iqx) ((gqx) obj)).f104863f;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        ErrorType errorType;
        switch (this.f75962a) {
            case 2:
                return e41.f55925a;
            case 3:
                return w2a1.f247311a;
            case 4:
            case 5:
            case 12:
            case 14:
            case 20:
            case 22:
            case 25:
            case 26:
            case 27:
            default:
                p2x0 p2x0Var = (p2x0) obj;
                if (!(p2x0Var instanceof k2x0)) {
                    if (p2x0Var instanceof m2x0) {
                        return (qu80) ((m2x0) p2x0Var).f139474a;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Failed to fetch show list: " + ((k2x0) p2x0Var).f118699a);
            case 6:
                CollectionArtist collectionArtist = (CollectionArtist) g6f.m43747t0(0, ((CollectionDecorateResponse) obj).getArtistList());
                return collectionArtist == null ? CollectionArtist.m97450s() : collectionArtist;
            case 7:
                return Boolean.valueOf(((pe01) obj).f176601r != 1);
            case 8:
                return Boolean.valueOf(((Map) obj).values().contains(Boolean.TRUE));
            case 9:
                return new uw7((v3a0) obj);
            case 10:
                YourLibraryDecorateResponse yourLibraryDecorateResponse = (YourLibraryDecorateResponse) obj;
                if (yourLibraryDecorateResponse.m98164b() == 1) {
                    return yourLibraryDecorateResponse.m98165n();
                }
                return YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.m98254q();
            case 11:
                String category = ((CategorizerResponse) obj).getCategory();
                wj50.m88279p(category);
                return category;
            case 13:
                g0j g0jVar = (g0j) obj;
                return Boolean.valueOf(g0jVar.f75382b && g0jVar != g0j.f75374Z);
            case 15:
                return Boolean.valueOf(dxf1.m37244s("offline", (Map) obj));
            case 16:
                for (api apiVar : (List) obj) {
                    if (apiVar.mo26697m()) {
                        return apiVar;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 17:
                return new znj(((enj) obj).f61168a, false);
            case 18:
                return Boolean.valueOf(((lcf) obj) instanceof icf);
            case 19:
                return Boolean.TRUE;
            case 21:
                return new n8z((Map) obj);
            case 23:
                return ((jc81) obj).f111017b;
            case 24:
                return new qor(((Boolean) obj).booleanValue());
            case 28:
                EsContextPlayerError$ContextPlayerError esContextPlayerError$ContextPlayerError = (EsContextPlayerError$ContextPlayerError) obj;
                switch (esContextPlayerError$ContextPlayerError.m17683n().ordinal()) {
                    case 0:
                        errorType = ErrorType.SUCCESS;
                        break;
                    case 1:
                        errorType = ErrorType.PLAYBACK_STUCK;
                        break;
                    case 2:
                        errorType = ErrorType.PLAYBACK_ERROR;
                        break;
                    case 3:
                        errorType = ErrorType.LICENSE_CHANGE;
                        break;
                    case 4:
                        errorType = ErrorType.PLAY_RESTRICTED;
                        break;
                    case 5:
                        errorType = ErrorType.STOP_RESTRICTED;
                        break;
                    case 6:
                        errorType = ErrorType.UPDATE_RESTRICTED;
                        break;
                    case 7:
                        errorType = ErrorType.PAUSE_RESTRICTED;
                        break;
                    case 8:
                        errorType = ErrorType.RESUME_RESTRICTED;
                        break;
                    case 9:
                        errorType = ErrorType.SKIP_TO_PREV_RESTRICTED;
                        break;
                    case 10:
                        errorType = ErrorType.SKIP_TO_NEXT_RESTRICTED;
                        break;
                    case 11:
                        errorType = ErrorType.SKIP_TO_NON_EXISTENT_TRACK;
                        break;
                    case 12:
                        errorType = ErrorType.SEEK_TO_RESTRICTED;
                        break;
                    case 13:
                        errorType = ErrorType.TOGGLE_REPEAT_CONTEXT_RESTRICTED;
                        break;
                    case 14:
                        errorType = ErrorType.TOGGLE_REPEAT_TRACK_RESTRICTED;
                        break;
                    case 15:
                        errorType = ErrorType.SET_OPTIONS_RESTRICTED;
                        break;
                    case 16:
                        errorType = ErrorType.TOGGLE_SHUFFLE_RESTRICTED;
                        break;
                    case 17:
                        errorType = ErrorType.SET_QUEUE_RESTRICTED;
                        break;
                    case 18:
                        errorType = ErrorType.INTERRUPT_PLAYBACK_RESTRICTED;
                        break;
                    case 19:
                        errorType = ErrorType.ONE_TRACK_UNPLAYABLE;
                        break;
                    case 20:
                        errorType = ErrorType.ONE_TRACK_UNPLAYABLE_AUTO_STOPPED;
                        break;
                    case 21:
                        errorType = ErrorType.ALL_TRACKS_UNPLAYABLE_AUTO_STOPPED;
                        break;
                    case 22:
                        errorType = ErrorType.SKIP_TO_NON_EXISTENT_TRACK_AUTO_STOPPED;
                        break;
                    case 23:
                        errorType = ErrorType.QUEUE_REVISION_MISMATCH;
                        break;
                    case 24:
                        errorType = ErrorType.VIDEO_PLAYBACK_ERROR;
                        break;
                    case 25:
                        errorType = ErrorType.VIDEO_GEORESTRICTED;
                        break;
                    case 26:
                        errorType = ErrorType.VIDEO_UNSUPPORTED_PLATFORM_VERSION;
                        break;
                    case 27:
                        errorType = ErrorType.VIDEO_UNSUPPORTED_CLIENT_VERSION;
                        break;
                    case 28:
                        errorType = ErrorType.VIDEO_UNSUPPORTED_KEY_VERSION;
                        break;
                    case 29:
                        errorType = ErrorType.VIDEO_MANIFEST_DELETED;
                        break;
                    case 30:
                        errorType = ErrorType.VIDEO_COUNTRY_RESTRICTED;
                        break;
                    case 31:
                        errorType = ErrorType.VIDEO_UNAVAILABLE;
                        break;
                    case 32:
                        errorType = ErrorType.VIDEO_CATALOGUE_RESTRICTED;
                        break;
                    case 33:
                        errorType = ErrorType.INVALID;
                        break;
                    case 34:
                        errorType = ErrorType.TIMEOUT;
                        break;
                    case 35:
                        errorType = ErrorType.PLAYBACK_REPORTING_ERROR;
                        break;
                    case 36:
                        errorType = ErrorType.UNKNOWN;
                        break;
                    case 37:
                        errorType = ErrorType.ADD_TO_QUEUE_RESTRICTED;
                        break;
                    case 38:
                        errorType = ErrorType.PICK_AND_SHUFFLE_CAPPED;
                        break;
                    case 39:
                        errorType = ErrorType.PICK_AND_SHUFFLE_CONNECT_RESTRICTED;
                        break;
                    case 40:
                        errorType = ErrorType.CONTEXT_LOADING_FAILED;
                        break;
                    case 41:
                        errorType = ErrorType.AUDIOBOOK_NOT_PLAYABLE;
                        break;
                    case 42:
                    case 43:
                    case 48:
                    default:
                        errorType = ErrorType.UNKNOWN;
                        break;
                    case 44:
                        errorType = ErrorType.PLAYBACK_START_SLOW;
                        break;
                    case 45:
                        errorType = ErrorType.PLAYBACK_START_TIMEOUT;
                        break;
                    case 46:
                        errorType = ErrorType.PLAYBACK_STUCK_TIMEOUT;
                        break;
                    case 47:
                        errorType = ErrorType.PLAYBACK_CLIENT_VERSION_IS_SUNSETTED;
                        break;
                    case 49:
                        errorType = ErrorType.UNKNOWN;
                        break;
                }
                PlayerError.Builder builder = PlayerError.builder(errorType);
                String str = (String) esContextPlayerError$ContextPlayerError.getDataMap().get("track_uri");
                if (str != null) {
                    wj50.m88279p(builder);
                    builder.trackUri(str);
                }
                String str2 = (String) esContextPlayerError$ContextPlayerError.getDataMap().get(ContextTrack.Metadata.KEY_CONTEXT_URI);
                if (str2 != null) {
                    wj50.m88279p(builder);
                    builder.contextUri(str2);
                }
                String str3 = (String) esContextPlayerError$ContextPlayerError.getDataMap().get("reasons");
                if (str3 == null) {
                    str3 = (String) esContextPlayerError$ContextPlayerError.getDataMap().get("playback_error");
                }
                if (str3 != null) {
                    wj50.m88279p(builder);
                    builder.reasons(str3);
                }
                return builder.build();
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiPredicate
    public boolean test(Object obj, Object obj2) {
        return wj50.m88271j(((e07) obj).f54886a, ((e07) obj2).f54886a);
    }
}
