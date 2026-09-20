package p204p;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.gander.p072v2.proto.SecondaryAction;
import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionStatus;
import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.AccessoryContentSize;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.ButtonIconAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.ClickActionType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.ContentAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.EncoreFont;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.IconName;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.ImageStyle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.EventType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.MessageParsingException;
import com.spotify.music.R;
import com.spotify.pendragon.p123v1.proto.AccessoryImage;
import com.spotify.pendragon.p123v1.proto.Capping;
import com.spotify.pendragon.p123v1.proto.Icon;
import com.spotify.pendragon.p123v1.proto.Text;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class sn91 implements gh00 {

    /* JADX INFO: renamed from: b */
    public static final sn91 f210858b = new sn91(0);

    /* JADX INFO: renamed from: c */
    public static final sn91 f210859c = new sn91(1);

    /* JADX INFO: renamed from: d */
    public static final sn91 f210860d = new sn91(2);

    /* JADX INFO: renamed from: e */
    public static final sn91 f210861e = new sn91(3);

    /* JADX INFO: renamed from: f */
    public static final sn91 f210862f = new sn91(4);

    /* JADX INFO: renamed from: g */
    public static final sn91 f210863g = new sn91(5);

    /* JADX INFO: renamed from: h */
    public static final sn91 f210864h = new sn91(6);

    /* JADX INFO: renamed from: i */
    public static final sn91 f210865i = new sn91(7);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f210866a;

    public /* synthetic */ sn91(int i) {
        this.f210866a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final int m78548a(sn91 sn91Var, mio mioVar) {
        int i = bfo.f26752a[mioVar.f144057f.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    return 3;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: e */
    public static v58 m78549e(g58 g58Var) {
        int i;
        bjg1 bjg1Var = g58Var.f76608a;
        if (bjg1Var.equals(oim0.f165836c)) {
            return new u58();
        }
        if (bjg1Var instanceof aim0) {
            ay31 ay31Var = ((aim0) bjg1Var).f16031c.f279662c;
            wj50.m88279p(ay31Var);
            return new r58(Integer.valueOf(R.string.puffin_button_enable_matched), ay31Var.f21088e, true, false);
        }
        if (bjg1Var.equals(dim0.f49415c)) {
            return new s58();
        }
        if (!(bjg1Var instanceof him0)) {
            if (!(bjg1Var instanceof zhm0)) {
                throw new NoWhenBranchMatchedException();
            }
            ay31 ay31Var2 = ((zhm0) bjg1Var).f282961c.f279662c;
            wj50.m88279p(ay31Var2);
            return new r58(null, ay31Var2.f21088e, false, true);
        }
        int iM38547C = edb.m38547C(((him0) bjg1Var).f91843c);
        if (iM38547C == 0) {
            i = R.string.puffin_headphones_optimization_error_message;
        } else {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.puffin_network_offline_error_message;
        }
        khw khwVar = new khw(t48.f216934a);
        n48 n48Var = n48.f150229a;
        return new t58(new lhw(i, n48Var, khwVar, new khw(n48Var)));
    }

    /* JADX INFO: renamed from: g */
    public static jag1 m78550g(DataSectionStatus dataSectionStatus, int i) {
        if (wj50.m88271j(dataSectionStatus, kio.f123023a)) {
            return pio.f177995e;
        }
        if (wj50.m88271j(dataSectionStatus, lio.f133858a)) {
            return pio.f177996f;
        }
        if (dataSectionStatus instanceof jio) {
            return new oio(((jio) dataSectionStatus).f112803a, i);
        }
        if (!(dataSectionStatus instanceof iio)) {
            throw new NoWhenBranchMatchedException();
        }
        iio iioVar = (iio) dataSectionStatus;
        return new nio(iioVar.f102610a, iioVar.f102611b, iioVar.f102612c);
    }

    /* JADX INFO: renamed from: f */
    public afo m78551f(meo meoVar) {
        mio mioVar;
        List list = meoVar.f142779a;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                List listM43711Y0 = g6f.m43711Y0(arrayList, new p3c(this, 4));
                boolean z2 = meoVar.f142780b;
                boolean z3 = meoVar.f142781c;
                if (list.isEmpty()) {
                    z = false;
                } else {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (wj50.m88271j(((hio) it2.next()).f91851b, kio.f123023a)) {
                            if (meoVar.f142782d) {
                                break;
                            }
                        }
                    }
                    z = false;
                }
                return new afo(listM43711Y0, z2, z3, z, meoVar.f142782d, meoVar.f142783e, meoVar.f142784f);
            }
            hio hioVar = (hio) it.next();
            DataSectionType dataSectionType = hioVar.f91850a;
            DataSectionStatus dataSectionStatus = hioVar.f91851b;
            int i = bfo.f26752a[dataSectionType.ordinal()];
            if (i == 1) {
                mioVar = new mio(R.string.data_download_account_data_title, R.string.data_download_account_data_body, R.string.data_download_account_data_select_title, 5, m78550g(dataSectionStatus, 5), DataSectionType.ACCOUNT_DATA);
            } else if (i == 2) {
                mioVar = new mio(R.string.data_download_extended_streaming_history_title, R.string.data_download_extended_streaming_history_body, R.string.data_download_extended_streaming_history_select_title, 30, m78550g(dataSectionStatus, 30), DataSectionType.EXTENDED_STREAMING_HISTORY);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                mioVar = new mio(R.string.data_download_technical_log_information_title, R.string.data_download_technical_log_information_body, R.string.data_download_technical_log_information_select_title, 30, m78550g(dataSectionStatus, 30), DataSectionType.TECHNICAL_LOG_INFORMATION);
            }
            arrayList.add(mioVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x011a  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Map] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) throws MessageParsingException {
        EventType eventType;
        int i;
        int i2 = 4;
        boolean z = false;
        z = false;
        boolean z2 = false;
        z = false;
        boolean z3 = false;
        z = false;
        z = false;
        ImageStyle imageStyle = null;
        IconName iconName = null;
        d5a d5aVar = null;
        int i3 = 1;
        switch (this.f210866a) {
            case 0:
                return (nys0) obj;
            case 1:
                return (cab) obj;
            case 2:
                return Boolean.valueOf(((oqo) obj) instanceof cab);
            case 3:
                return Boolean.valueOf(!(((oqo) obj) instanceof k8j));
            case 4:
                return new ek5(((cab) ((oqo) obj)).getTypeParameters(), i3);
            case 5:
                qge qgeVarMo25169G = ((d6a1) obj).mo36063C0().mo25169G();
                if (qgeVarMo25169G != null && (qgeVarMo25169G instanceof bo91) && (((bo91) qgeVarMo25169G).mo27379o() instanceof cn91)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                qge qgeVarMo25169G2 = ((d6a1) obj).mo36063C0().mo25169G();
                if (qgeVarMo25169G2 != null && ((qgeVarMo25169G2 instanceof cn91) || (qgeVarMo25169G2 instanceof bo91))) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 7:
                View view = (View) obj;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    return new C2042k7(viewGroup, 8);
                }
                return null;
            case 8:
                ((ld70) obj).getClass();
                return null;
            case 9:
                int iOrdinal = ((EnumC2613yh) obj).ordinal();
                if (iOrdinal == 1) {
                    return AccessoryContentSize.LARGE;
                }
                if (iOrdinal == 2) {
                    return AccessoryContentSize.MEDIUM;
                }
                if (iOrdinal != 3) {
                    return iOrdinal != 4 ? AccessoryContentSize.UNKNOWN : AccessoryContentSize.XSMALL;
                }
                return AccessoryContentSize.SMALL;
            case 10:
                AccessoryImage accessoryImage = (AccessoryImage) obj;
                String imageUrl = accessoryImage.getImageUrl();
                String strName = accessoryImage.m16986p().name();
                ImageStyle imageStyle2 = ImageStyle.UNKNOWN_IMAGE_STYLE;
                for (ImageStyle imageStyle3 : ImageStyle.values()) {
                    if (wj50.m88271j(imageStyle3.name(), strName)) {
                        imageStyle = imageStyle3;
                        if (imageStyle != null) {
                            imageStyle2 = imageStyle;
                        }
                        return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.AccessoryImage(imageUrl, imageStyle2);
                    }
                }
                if (imageStyle != null) {
                    imageStyle2 = imageStyle;
                }
                return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.AccessoryImage(imageUrl, imageStyle2);
            case 11:
                return m78549e((g58) obj);
            case 12:
                return new yr8(((ity) obj).f105788a);
            case 13:
                int iOrdinal2 = ((hta) obj).ordinal();
                if (iOrdinal2 != 1) {
                    return iOrdinal2 != 2 ? ButtonIconAlignment.LEADING : ButtonIconAlignment.TRAILING;
                }
                return ButtonIconAlignment.LEADING;
            case 14:
                wd50 wd50VarM17138p = ((Capping) obj).m17138p();
                ArrayList arrayList = new ArrayList(i6f.m49804T(wd50VarM17138p, 10));
                Iterator it = wd50VarM17138p.iterator();
                while (it.hasNext()) {
                    String strName2 = ((y8x) it.next()).name();
                    EventType eventType2 = EventType.EVENT_TYPE_UNKNOWN;
                    EventType[] eventTypeArrValues = EventType.values();
                    int length = eventTypeArrValues.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length) {
                            eventType = eventTypeArrValues[i4];
                            if (!wj50.m88271j(eventType.name(), strName2)) {
                                i4++;
                            }
                        } else {
                            eventType = null;
                        }
                    }
                    if (eventType != null) {
                        eventType2 = eventType;
                    }
                    arrayList.add(eventType2);
                }
                return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Capping(arrayList);
            case 15:
                switch (((xhe) obj).ordinal()) {
                    case 0:
                    case 28:
                        throw new MessageParsingException(fte0.INVALID_CLICK_ACTION_IDENTIFIER);
                    case 1:
                        return ClickActionType.ADD_TO_QUEUE;
                    case 2:
                        return ClickActionType.ADD_TO_YOUR_EPISODES;
                    case 3:
                        return ClickActionType.PRESENT_SSO_EMAIL_COLLECTION;
                    case 4:
                        return ClickActionType.DOWNLOAD_ENTITY;
                    case 5:
                        return ClickActionType.CREATE_PLAYLIST;
                    case 6:
                        return ClickActionType.ENABLE_ALL_NOTIFICATION_PREFERENCE_CATEGORIES_V2;
                    case 7:
                        return ClickActionType.EMAIL_VERIFICATION;
                    case 8:
                        return ClickActionType.OPT_OUT_BRAND_LIFT;
                    case 9:
                        return ClickActionType.OPT_IN;
                    case 10:
                        return ClickActionType.OPT_OUT;
                    case 11:
                        return ClickActionType.SELECT_OPTION;
                    case 12:
                        return ClickActionType.OPEN_SYSTEM_SETTINGS_SPOTIFY_APP_PAGE;
                    case 13:
                        return ClickActionType.SHARE_ENTITY;
                    case 14:
                        return ClickActionType.ADD_TO_PLAYLIST;
                    case 15:
                        return ClickActionType.PDP_URL;
                    case 16:
                        return ClickActionType.DISMISS;
                    case 17:
                        return ClickActionType.SAVE_ENTITY;
                    case 18:
                        return ClickActionType.SHARE_CONTENT;
                    case 19:
                        return ClickActionType.INTERNAL_WEBVIEW;
                    case 20:
                        return ClickActionType.TOGGLE_NOTIFICATION_PREFERENCE;
                    case 21:
                        return ClickActionType.OPEN_PUSH_PERMISSIONS_DIALOG;
                    case 22:
                        return ClickActionType.URL;
                    case 23:
                        return ClickActionType.EXTERNAL_URL;
                    case 24:
                        return ClickActionType.OPEN_ADS_TRACKING_PERMISSIONS_DIALOG;
                    case 25:
                        return ClickActionType.START_PLAYBACK;
                    case 26:
                        return ClickActionType.SAVE_AND_NAVIGATE;
                    case 27:
                        return ClickActionType.IAP;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 16:
                return efj.f59057a[((dfj) obj).ordinal()] == 1 ? ContentAlignment.BOTTOM : ContentAlignment.CENTER;
            case 17:
                return m78551f((meo) obj);
            case 18:
                bpe1 bpe1Var = ((dhv) obj).f49173b;
                if (wj50.m88271j(bpe1.f29423i.get(bpe1Var.f29428e), d5a.class)) {
                    n4y n4yVar = bpe1Var.f29430g;
                    if (n4yVar == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.BookExtraInfo");
                    }
                    d5aVar = (d5a) n4yVar;
                }
                int i5 = d5aVar != null ? d5aVar.f45377d : 0;
                long j = d5aVar != null ? d5aVar.f45378e : 0L;
                int i6 = d5aVar != null ? d5aVar.f45375b : 0;
                i = i6 != 0 ? l1q.f128769a[edb.m38547C(i6)] : -1;
                if (i == 1) {
                    i2 = 1;
                } else if (i == 2) {
                    i2 = 2;
                } else if (i == 3) {
                    i2 = 3;
                }
                return new g5s0(i5, j, i2);
            case 19:
                return du31.f52959o0;
            case 20:
                Icon icon = (Icon) obj;
                String strName3 = icon.m17219q().name();
                IconName iconName2 = IconName.ICON_UNKNOWN;
                for (IconName iconName3 : IconName.values()) {
                    if (wj50.m88271j(iconName3.name(), strName3)) {
                        iconName = iconName3;
                        if (iconName != null) {
                            iconName2 = iconName;
                        }
                        return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Icon(iconName2, wl51.m88491o1(icon.m17218o()).toString());
                    }
                }
                if (iconName != null) {
                    iconName2 = iconName;
                }
                return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Icon(iconName2, wl51.m88491o1(icon.m17218o()).toString());
            case 21:
                eab eabVar = (eab) obj;
                if (eabVar.mo38278l0() == 1) {
                    nfe nfeVar = (nfe) eabVar.mo27379o();
                    String str = vd60.f240327a;
                    if (vd60.f240336j.containsKey(rxq.m76668f(nfeVar))) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case 22:
                return ((wma0) obj).f252764b.invoke();
            case 23:
                Text text = (Text) obj;
                return new MessageText(text.m17301p(), text.m17302q(), text.m17303r() ? EncoreFont.valueOf(text.m17300o().name()) : null);
            case 24:
                return (eab) obj;
            case 25:
                return (eab) obj;
            case 26:
                String strConcat = "java/util/".concat("Spliterator");
                de60 de60Var = rfq0.f198717b;
                ((v221) obj).m84493b(strConcat, de60Var, de60Var);
                return w2a1.f247311a;
            case 27:
                throw new IndexOutOfBoundsException(dq60.m36613m("Empty list doesn't contain element at index ", ((Number) obj).intValue(), '.'));
            case 28:
                throw new IndexOutOfBoundsException(dq60.m36613m("Empty list doesn't contain element at index ", ((Number) obj).intValue(), '.'));
            default:
                SecondaryAction secondaryAction = (SecondaryAction) obj;
                int iM11125r = secondaryAction.m11125r();
                i = iM11125r != 0 ? w4z0.f247924a[edb.m38547C(iM11125r)] : -1;
                if (i == 1) {
                    return new r4z0(secondaryAction.m11127t().getUsername(), secondaryAction.m11127t().m11115q());
                }
                if (i == 2) {
                    return new j4z0(secondaryAction.m11126s().getUsername(), secondaryAction.m11126s().m11069q());
                }
                if (i == 3) {
                    return new u4z0(secondaryAction.m11128u().getPlaylistUri());
                }
                if (i != 4) {
                    return null;
                }
                return new o4z0();
        }
    }

    public /* synthetic */ sn91(Object obj, int i) {
        this.f210866a = i;
    }

    public /* synthetic */ sn91(boolean z) {
        this.f210866a = 29;
    }
}
