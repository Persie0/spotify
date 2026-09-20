package p204p;

import android.content.Intent;
import android.net.Uri;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import io.reactivex.rxjava3.core.Observable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class rib implements v550 {

    /* JADX INFO: renamed from: e */
    public static final List f199471e = h6f.m46715L("spotify.com", "www.spotify.com", "open.spotify.com");

    /* JADX INFO: renamed from: a */
    public final iy3 f199472a;

    /* JADX INFO: renamed from: b */
    public final pee1 f199473b;

    /* JADX INFO: renamed from: c */
    public final cgm f199474c;

    /* JADX INFO: renamed from: d */
    public final luk f199475d;

    public rib(iy3 iy3Var, pee1 pee1Var, cgm cgmVar, luk lukVar) {
        this.f199472a = iy3Var;
        this.f199473b = pee1Var;
        this.f199474c = cgmVar;
        this.f199475d = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m75582b(rib ribVar, Intent intent, ibk ibkVar) {
        mib mibVar;
        String strM35712j;
        List<String> pathSegments;
        String strPrevious;
        Set<String> queryParameterNames;
        if (ibkVar instanceof mib) {
            mibVar = (mib) ibkVar;
            int i = mibVar.f143994d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mibVar.f143994d = i - Integer.MIN_VALUE;
            } else {
                mibVar = new mib(ribVar, ibkVar);
            }
        } else {
            mibVar = new mib(ribVar, ibkVar);
        }
        Object objM75585e = mibVar.f143992b;
        int i2 = mibVar.f143994d;
        if (i2 == 0) {
            bga.m29073P(objM75585e);
            mibVar.f143991a = intent;
            mibVar.f143994d = 1;
            objM75585e = ribVar.m75585e(mibVar);
            Object obj = yuk.f276404a;
            if (objM75585e == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intent = mibVar.f143991a;
            bga.m29073P(objM75585e);
        }
        if (((Boolean) objM75585e).booleanValue()) {
            intent.setData(Uri.parse(WidgetInteraction.Background.DESTINATION_HOME));
            return tm4.m81097u(intent);
        }
        Uri data = intent.getData();
        Set set = dd41.f47702f;
        dd41 dd41VarM74726U = r46.m74726U(intent.getDataString());
        LinkedHashMap linkedHashMap = null;
        if (dd41VarM74726U.f47709c == gn80.WRAPPED_INSTANCE_SHARE) {
            strM35712j = dd41VarM74726U.m35712j();
        } else if (data == null || (pathSegments = data.getPathSegments()) == null) {
            strM35712j = null;
        } else {
            ListIterator<String> listIterator = pathSegments.listIterator(pathSegments.size());
            do {
                if (!listIterator.hasPrevious()) {
                    strPrevious = null;
                    break;
                }
                strPrevious = listIterator.previous();
            } while (wl51.m88499w0(strPrevious));
            strM35712j = strPrevious;
        }
        if (strM35712j != null) {
            Set set2 = dd41.f47702f;
            final Uri.Builder builderBuildUpon = Uri.parse(r46.m74733b0(strM35712j).m35728z()).buildUpon();
            if (data != null && data.isOpaque()) {
                data = dd41VarM74726U.f47707a;
            }
            if (data != null && (queryParameterNames = data.getQueryParameterNames()) != null) {
                Set<String> set3 = queryParameterNames;
                int iM31820L = c95.m31820L(i6f.m49804T(set3, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                linkedHashMap = new LinkedHashMap(iM31820L);
                for (Object obj2 : set3) {
                    String queryParameter = data.getQueryParameter((String) obj2);
                    if (queryParameter == null) {
                        queryParameter = "";
                    }
                    linkedHashMap.put(obj2, queryParameter);
                }
            }
            if (linkedHashMap != null) {
                wj50.m88279p(builderBuildUpon);
                linkedHashMap.forEach(new BiConsumer() { // from class: p.nib
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj3, Object obj4) {
                        builderBuildUpon.appendQueryParameter((String) obj3, (String) obj4);
                    }
                });
            }
            Uri uriBuild = builderBuildUpon.build();
            if (uriBuild != null) {
                intent.setData(uriBuild);
                return tm4.m81097u(intent);
            }
        }
        return p1j0.f173119a;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x011d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0121  */
    /* JADX WARN: Code duplicated, block: B:70:0x0126  */
    /* JADX WARN: Code duplicated, block: B:79:0x0155  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:88:0x016e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0179  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final Object m75583c(rib ribVar, Intent intent, ibk ibkVar) {
        oib oibVar;
        String strConcat;
        String strM75584d;
        String str;
        Uri uri;
        String dataString;
        String[] strArr;
        int i;
        int iOrdinal;
        String str2;
        String strM75584d2;
        iy3 iy3Var = ribVar.f199472a;
        if (ibkVar instanceof oib) {
            oibVar = (oib) ibkVar;
            int i2 = oibVar.f165754e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oibVar.f165754e = i2 - Integer.MIN_VALUE;
            } else {
                oibVar = new oib(ribVar, ibkVar);
            }
        } else {
            oibVar = new oib(ribVar, ibkVar);
        }
        Object objM75585e = oibVar.f165752c;
        int i3 = oibVar.f165754e;
        Uri uri2 = null;
        Object[] objArr = 0;
        Object obj = yuk.f276404a;
        if (i3 == 0) {
            bga.m29073P(objM75585e);
            oibVar.f165750a = intent;
            oibVar.f165754e = 1;
            objM75585e = ribVar.m75585e(oibVar);
            if (objM75585e != obj) {
            }
            return obj;
        }
        if (i3 == 1) {
            intent = oibVar.f165750a;
            bga.m29073P(objM75585e);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = oibVar.f165751b;
            intent = oibVar.f165750a;
            bga.m29073P(objM75585e);
        }
        if (!((Boolean) objM75585e).booleanValue() && (str == null || wl51.m88460J0(str))) {
            Set set = dd41.f47702f;
            return tm4.m81098v(r46.m74726U(xoc1.f263876E5.f243453a));
        }
        if (str != null || wl51.m88460J0(str)) {
            strConcat = s571.m77250i(xoc1.f263884F5.f243453a, "?loadingPlaceholder=pageApiDefault");
        } else {
            strConcat = klh.m56834f(xoc1.f263884F5.f243453a, "?loadingPlaceholder=pageApiDefault&target=", str);
        }
        strM75584d = str;
        uri = Uri.parse(strConcat);
        dataString = intent.getDataString();
        strArr = new String[]{"artist-id", "track-id", "show-id"};
        for (i = 0; i < 3; i++) {
            str2 = strArr[i];
            if (dataString != null) {
                strM75584d2 = m75584d(dataString, str2);
            } else {
                strM75584d2 = null;
            }
            if (strM75584d2 == null && !wl51.m88460J0(strM75584d2)) {
                uri2 = Uri.parse("spotify:" + wl51.m88501y0(3, str2) + ":" + strM75584d2);
                break;
            }
        }
        if (uri2 != null) {
            uri = uri2;
        }
        intent.setData(uri);
        if (strM75584d != null && !wl51.m88460J0(strM75584d) && (iOrdinal = iy3Var.m51878a().ordinal()) != 0) {
            if (iOrdinal != 1) {
                intent.putExtra("target", strM75584d);
            } else if (iOrdinal != 2 && iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return tm4.m81097u(intent);
        boolean zBooleanValue = ((Boolean) objM75585e).booleanValue();
        strConcat = WidgetInteraction.Background.DESTINATION_HOME;
        if (zBooleanValue) {
            intent.setData(Uri.parse(WidgetInteraction.Background.DESTINATION_HOME));
            return tm4.m81097u(intent);
        }
        String dataString2 = intent.getDataString();
        strM75584d = dataString2 != null ? m75584d(dataString2, "target") : null;
        int iOrdinal2 = iy3Var.m51878a().ordinal();
        if (iOrdinal2 == 0) {
            oibVar.f165750a = intent;
            oibVar.f165751b = strM75584d;
            oibVar.f165754e = 2;
            Object objM89557A = x0h1.m89557A(ribVar.f199475d, new cg5((Object) ribVar, (fbk) (objArr == true ? 1 : 0), 20), oibVar);
            if (objM89557A != obj) {
                String str3 = strM75584d;
                objM75585e = objM89557A;
                str = str3;
                if (!((Boolean) objM75585e).booleanValue()) {
                }
                if (str != null) {
                    strConcat = s571.m77250i(xoc1.f263884F5.f243453a, "?loadingPlaceholder=pageApiDefault");
                } else {
                    strConcat = s571.m77250i(xoc1.f263884F5.f243453a, "?loadingPlaceholder=pageApiDefault");
                }
                strM75584d = str;
            }
            return obj;
        }
        if (iOrdinal2 == 1) {
            Uri data = intent.getData();
            String encodedQuery = data != null ? data.getEncodedQuery() : null;
            strConcat = (encodedQuery == null || encodedQuery.length() == 0) ? "spotify:sitemodal:watchfeed-fallback" : "spotify:sitemodal:watchfeed-fallback?".concat(encodedQuery);
        } else if (iOrdinal2 == 2) {
            strConcat = "spotify:playlist:37i9dQZF1FoyQGyinuuvRu";
        } else if (iOrdinal2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        uri = Uri.parse(strConcat);
        dataString = intent.getDataString();
        strArr = new String[]{"artist-id", "track-id", "show-id"};
        while (i < 3) {
            str2 = strArr[i];
            if (dataString != null) {
                strM75584d2 = m75584d(dataString, str2);
            } else {
                strM75584d2 = null;
            }
            if (strM75584d2 == null) {
            }
        }
        if (uri2 != null) {
            uri = uri2;
        }
        intent.setData(uri);
        if (strM75584d != null) {
            if (iOrdinal != 1) {
                intent.putExtra("target", strM75584d);
            } else if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return tm4.m81097u(intent);
    }

    /* JADX INFO: renamed from: d */
    public static String m75584d(String str, String str2) {
        Object next;
        Iterator it = wl51.m88477a1(str, new String[]{"&"}, 0, 6).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!wl51.m88496t0((String) next, str2, false));
        String str3 = (String) next;
        if (str3 == null) {
            str3 = "";
        }
        List listM88477a1 = wl51.m88477a1(str3, new String[]{"="}, 2, 2);
        return listM88477a1.size() < 2 ? "" : (String) listM88477a1.get(1);
    }

    @Override // p204p.v550
    /* JADX INFO: renamed from: a */
    public final void mo27509a(cxe cxeVar) {
        fbk fbkVar = null;
        q350.m72058m(cxeVar, jib.f112711c, "Campaign Route", new kib(this, fbkVar, 0));
        q350.m72059n(cxeVar, new qib(0), "Campaign Route", new lib(this, fbkVar, 0));
        q350.m72058m(cxeVar, jib.f112710b, "Campaign Route", new lib(this, fbkVar, 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m75585e(ibk ibkVar) {
        pib pibVar;
        if (ibkVar instanceof pib) {
            pibVar = (pib) ibkVar;
            int i = pibVar.f177882c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pibVar.f177882c = i - Integer.MIN_VALUE;
            } else {
                pibVar = new pib(this, ibkVar);
            }
        } else {
            pibVar = new pib(this, ibkVar);
        }
        Object obj = pibVar.f177880a;
        int i2 = pibVar.f177882c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        Observable observableOnErrorReturnItem = this.f199474c.m32730a(true).timeout(1000L, TimeUnit.MILLISECONDS).onErrorReturnItem(qyg1.m74178H(false));
        pibVar.f177882c = 1;
        Object objM96571q = zn91.m96571q(observableOnErrorReturnItem, 1, null, pibVar);
        yuk yukVar = yuk.f276404a;
        return objM96571q == yukVar ? yukVar : objM96571q;
    }
}
