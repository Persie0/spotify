package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentFeedType;
import com.comscore.streaming.ContentType;
import com.spotify.signup.signup.p150v2.proto.Error;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
public final class hr01 implements Parcelable {
    public static final Parcelable.Creator<hr01> CREATOR;

    /* JADX INFO: renamed from: L0 */
    public static final hr01 f94281L0;

    /* JADX INFO: renamed from: M0 */
    public static final hr01 f94282M0;

    /* JADX INFO: renamed from: N0 */
    public static final hr01 f94283N0;

    /* JADX INFO: renamed from: O0 */
    public static final hr01 f94284O0;

    /* JADX INFO: renamed from: P0 */
    public static final hr01 f94285P0;

    /* JADX INFO: renamed from: Q0 */
    public static final hr01 f94286Q0;

    /* JADX INFO: renamed from: R0 */
    public static final /* synthetic */ hr01[] f94287R0;

    /* JADX INFO: renamed from: X */
    public static final hr01 f94288X;

    /* JADX INFO: renamed from: Y */
    public static final hr01 f94289Y;

    /* JADX INFO: renamed from: Z */
    public static final hr01 f94290Z;

    /* JADX INFO: renamed from: d */
    public static final hr01 f94291d;

    /* JADX INFO: renamed from: e */
    public static final hr01 f94292e;

    /* JADX INFO: renamed from: f */
    public static final hr01 f94293f;

    /* JADX INFO: renamed from: g */
    public static final hr01 f94294g;

    /* JADX INFO: renamed from: h */
    public static final hr01 f94295h;

    /* JADX INFO: renamed from: i */
    public static final hr01 f94296i;

    /* JADX INFO: renamed from: t */
    public static final hr01 f94297t;

    /* JADX INFO: renamed from: a */
    public final int f94298a;

    /* JADX INFO: renamed from: b */
    public final tg01 f94299b;

    /* JADX INFO: renamed from: c */
    public final boolean f94300c;

    static {
        tg01 tg01Var = tg01.ERROR;
        hr01 hr01Var = new hr01("UNKNOWN_ERROR", 0, 100, tg01Var, false);
        f94291d = hr01Var;
        hr01 hr01Var2 = new hr01("CREATE_OUTPUT_FILE_ERROR", 1, 103, tg01Var, false);
        f94292e = hr01Var2;
        hr01 hr01Var3 = new hr01("COMPRESS_IMAGE_ERROR", 2, 104, tg01Var, false);
        f94293f = hr01Var3;
        hr01 hr01Var4 = new hr01("FAILED_PROVIDING_SHARE_DATA", 3, ContentType.SHORT_FORM_ON_DEMAND, tg01Var, false);
        f94294g = hr01Var4;
        hr01 hr01Var5 = new hr01("FAILED_LOADING_SHARE_FORMATS", 4, ContentType.LONG_FORM_ON_DEMAND, tg01Var, false);
        f94295h = hr01Var5;
        hr01 hr01Var6 = new hr01("FAILED_FETCHING_OFFPLATFORM_DESTINATIONS", 5, 114, tg01Var, false);
        f94296i = hr01Var6;
        hr01 hr01Var7 = new hr01("FAILED_FETCHING_ONPLATFORM_DESTINATIONS", 6, 115, tg01Var, false);
        f94297t = hr01Var7;
        hr01 hr01Var8 = new hr01("INVALID_ARGUMENTS", 7, 201, tg01Var, false);
        f94288X = hr01Var8;
        hr01 hr01Var9 = new hr01("MISSING_PERMISSIONS", 8, ContentFeedType.EAST_HD, tg01Var, false);
        f94289Y = hr01Var9;
        tg01 tg01Var2 = tg01.WARNING;
        hr01 hr01Var10 = new hr01("REQUEST_SMART_SORTING_ERROR", 9, 105, tg01Var2, true);
        f94290Z = hr01Var10;
        hr01 hr01Var11 = new hr01("REQUEST_SMART_SORTING_TIMEOUT", 10, Error.INVALID_COUNTRY_FIELD_NUMBER, tg01Var2, true);
        f94281L0 = hr01Var11;
        hr01 hr01Var12 = new hr01("URL_GENERATION_REQUEST_ERROR", 11, 200, tg01Var2, true);
        f94282M0 = hr01Var12;
        hr01 hr01Var13 = new hr01("LINK_PREVIEW_UPLOAD_ERROR", 12, 210, tg01Var2, true);
        f94283N0 = hr01Var13;
        hr01 hr01Var14 = new hr01("ON_PLATFORM_PREVIEW_UPLOAD_ERROR", 13, AdvertisementType.ON_DEMAND_PRE_ROLL, tg01Var2, true);
        f94284O0 = hr01Var14;
        hr01 hr01Var15 = new hr01("SHARE_CARD_CONFIG_UPLOAD_ERROR", 14, AdvertisementType.ON_DEMAND_MID_ROLL, tg01Var2, true);
        f94285P0 = hr01Var15;
        hr01 hr01Var16 = new hr01("DEVICE_OFFLINE", 15, 300, tg01.INFO, true);
        f94286Q0 = hr01Var16;
        f94287R0 = new hr01[]{hr01Var, hr01Var2, hr01Var3, hr01Var4, hr01Var5, hr01Var6, hr01Var7, hr01Var8, hr01Var9, hr01Var10, hr01Var11, hr01Var12, hr01Var13, hr01Var14, hr01Var15, hr01Var16};
        CREATOR = new sp01(13);
    }

    public hr01(String str, int i, int i2, tg01 tg01Var, boolean z) {
        super(str, i);
        this.f94298a = i2;
        this.f94299b = tg01Var;
        this.f94300c = z;
    }

    public static hr01 valueOf(String str) {
        return (hr01) Enum.valueOf(hr01.class, str);
    }

    public static hr01[] values() {
        return (hr01[]) f94287R0.clone();
    }

    /* JADX INFO: renamed from: c */
    public final int m48319c() {
        return this.f94298a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public final tg01 m48320g() {
        return this.f94299b;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m48321h() {
        return this.f94300c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
