package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.comscore.streaming.ContentType;
import com.spotify.metadata.classic.proto.Metadata$Episode;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.signup.signup.p150v2.proto.Error;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class jmj implements Parcelable {
    public static final Parcelable.Creator CREATOR = new wcj(26);

    /* JADX INFO: renamed from: L0 */
    public Double f113877L0;

    /* JADX INFO: renamed from: M0 */
    public String f113878M0;

    /* JADX INFO: renamed from: N0 */
    public String f113879N0;

    /* JADX INFO: renamed from: O0 */
    public String f113880O0;

    /* JADX INFO: renamed from: P0 */
    public String f113881P0;

    /* JADX INFO: renamed from: Q0 */
    public String f113882Q0;

    /* JADX INFO: renamed from: R0 */
    public Double f113883R0;

    /* JADX INFO: renamed from: S0 */
    public Double f113884S0;

    /* JADX INFO: renamed from: T0 */
    public final ArrayList f113885T0 = new ArrayList();

    /* JADX INFO: renamed from: U0 */
    public final HashMap f113886U0 = new HashMap();

    /* JADX INFO: renamed from: X */
    public Double f113887X;

    /* JADX INFO: renamed from: Y */
    public Double f113888Y;

    /* JADX INFO: renamed from: Z */
    public Integer f113889Z;

    /* JADX INFO: renamed from: a */
    public int f113890a;

    /* JADX INFO: renamed from: b */
    public Double f113891b;

    /* JADX INFO: renamed from: c */
    public Double f113892c;

    /* JADX INFO: renamed from: d */
    public int f113893d;

    /* JADX INFO: renamed from: e */
    public String f113894e;

    /* JADX INFO: renamed from: f */
    public String f113895f;

    /* JADX INFO: renamed from: g */
    public String f113896g;

    /* JADX INFO: renamed from: h */
    public int f113897h;

    /* JADX INFO: renamed from: i */
    public int f113898i;

    /* JADX INFO: renamed from: t */
    public String f113899t;

    /* JADX INFO: renamed from: c */
    public final JSONObject m53783c() {
        ArrayList arrayList = this.f113885T0;
        String str = this.f113882Q0;
        String str2 = this.f113881P0;
        String str3 = this.f113880O0;
        String str4 = this.f113879N0;
        String str5 = this.f113878M0;
        String str6 = this.f113899t;
        String str7 = this.f113896g;
        String str8 = this.f113895f;
        String str9 = this.f113894e;
        HashMap map = this.f113886U0;
        JSONObject jSONObject = new JSONObject();
        try {
            int i = this.f113890a;
            if (i != 0) {
                okq okqVar = okq.RandomizedBundleToken;
                jSONObject.put("$content_schema", pi9.m70093r(i));
            }
            Double d = this.f113891b;
            if (d != null) {
                okq okqVar2 = okq.RandomizedBundleToken;
                jSONObject.put("$quantity", d);
            }
            Double d2 = this.f113892c;
            if (d2 != null) {
                okq okqVar3 = okq.RandomizedBundleToken;
                jSONObject.put("$price", d2);
            }
            int i2 = this.f113893d;
            if (i2 != 0) {
                okq okqVar4 = okq.RandomizedBundleToken;
                jSONObject.put("$currency", ptl.m70980a(i2));
            }
            if (!TextUtils.isEmpty(str9)) {
                okq okqVar5 = okq.RandomizedBundleToken;
                jSONObject.put("$sku", str9);
            }
            if (!TextUtils.isEmpty(str8)) {
                okq okqVar6 = okq.RandomizedBundleToken;
                jSONObject.put("$product_name", str8);
            }
            if (!TextUtils.isEmpty(str7)) {
                okq okqVar7 = okq.RandomizedBundleToken;
                jSONObject.put("$product_brand", str7);
            }
            int i3 = this.f113897h;
            if (i3 != 0) {
                okq okqVar8 = okq.RandomizedBundleToken;
                jSONObject.put("$product_category", m5p0.m60872d(i3));
            }
            int i4 = this.f113898i;
            if (i4 != 0) {
                okq okqVar9 = okq.RandomizedBundleToken;
                jSONObject.put("$condition", ydj.m93459r(i4));
            }
            if (!TextUtils.isEmpty(str6)) {
                okq okqVar10 = okq.RandomizedBundleToken;
                jSONObject.put("$product_variant", str6);
            }
            Double d3 = this.f113887X;
            if (d3 != null) {
                okq okqVar11 = okq.RandomizedBundleToken;
                jSONObject.put("$rating", d3);
            }
            Double d4 = this.f113888Y;
            if (d4 != null) {
                okq okqVar12 = okq.RandomizedBundleToken;
                jSONObject.put("$rating_average", d4);
            }
            Integer num = this.f113889Z;
            if (num != null) {
                okq okqVar13 = okq.RandomizedBundleToken;
                jSONObject.put("$rating_count", num);
            }
            Double d5 = this.f113877L0;
            if (d5 != null) {
                okq okqVar14 = okq.RandomizedBundleToken;
                jSONObject.put("$rating_max", d5);
            }
            if (!TextUtils.isEmpty(str5)) {
                okq okqVar15 = okq.RandomizedBundleToken;
                jSONObject.put("$address_street", str5);
            }
            if (!TextUtils.isEmpty(str4)) {
                okq okqVar16 = okq.RandomizedBundleToken;
                jSONObject.put("$address_city", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                okq okqVar17 = okq.RandomizedBundleToken;
                jSONObject.put("$address_region", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                okq okqVar18 = okq.RandomizedBundleToken;
                jSONObject.put("$address_country", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                okq okqVar19 = okq.RandomizedBundleToken;
                jSONObject.put("$address_postal_code", str);
            }
            Double d6 = this.f113883R0;
            if (d6 != null) {
                okq okqVar20 = okq.RandomizedBundleToken;
                jSONObject.put("$latitude", d6);
            }
            Double d7 = this.f113884S0;
            if (d7 != null) {
                okq okqVar21 = okq.RandomizedBundleToken;
                jSONObject.put("$longitude", d7);
            }
            if (arrayList.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                okq okqVar22 = okq.RandomizedBundleToken;
                jSONObject.put("$image_captions", jSONArray);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
            }
            if (map.size() > 0) {
                for (String str10 : map.keySet()) {
                    jSONObject.put(str10, map.get(str10));
                }
            }
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.f113890a;
        parcel.writeString(i2 != 0 ? pi9.m70093r(i2) : "");
        parcel.writeSerializable(this.f113891b);
        parcel.writeSerializable(this.f113892c);
        int i3 = this.f113893d;
        if (i3 != 0) {
            switch (i3) {
                case 1:
                    str = "AED";
                    break;
                case 2:
                    str = "AFN";
                    break;
                case 3:
                    str = "ALL";
                    break;
                case 4:
                    str = "AMD";
                    break;
                case 5:
                    str = "ANG";
                    break;
                case 6:
                    str = "AOA";
                    break;
                case 7:
                    str = "ARS";
                    break;
                case 8:
                    str = "AUD";
                    break;
                case 9:
                    str = "AWG";
                    break;
                case 10:
                    str = "AZN";
                    break;
                case 11:
                    str = "BAM";
                    break;
                case 12:
                    str = "BBD";
                    break;
                case 13:
                    str = "BDT";
                    break;
                case 14:
                    str = "BGN";
                    break;
                case 15:
                    str = "BHD";
                    break;
                case 16:
                    str = "BIF";
                    break;
                case 17:
                    str = "BMD";
                    break;
                case 18:
                    str = "BND";
                    break;
                case 19:
                    str = "BOB";
                    break;
                case 20:
                    str = "BOV";
                    break;
                case 21:
                    str = "BRL";
                    break;
                case 22:
                    str = "BSD";
                    break;
                case 23:
                    str = "BTN";
                    break;
                case 24:
                    str = "BWP";
                    break;
                case 25:
                    str = "BYN";
                    break;
                case 26:
                    str = "BYR";
                    break;
                case 27:
                    str = "BZD";
                    break;
                case 28:
                    str = "CAD";
                    break;
                case 29:
                    str = "CDF";
                    break;
                case 30:
                    str = "CHE";
                    break;
                case 31:
                    str = "CHF";
                    break;
                case 32:
                    str = "CHW";
                    break;
                case 33:
                    str = "CLF";
                    break;
                case 34:
                    str = "CLP";
                    break;
                case 35:
                    str = "CNY";
                    break;
                case 36:
                    str = "COP";
                    break;
                case 37:
                    str = "COU";
                    break;
                case 38:
                    str = "CRC";
                    break;
                case 39:
                    str = "CUC";
                    break;
                case 40:
                    str = "CUP";
                    break;
                case 41:
                    str = "CVE";
                    break;
                case 42:
                    str = "CZK";
                    break;
                case 43:
                    str = "DJF";
                    break;
                case 44:
                    str = "DKK";
                    break;
                case 45:
                    str = "DOP";
                    break;
                case 46:
                    str = "DZD";
                    break;
                case 47:
                    str = "EGP";
                    break;
                case 48:
                    str = "ERN";
                    break;
                case 49:
                    str = "ETB";
                    break;
                case 50:
                    str = "EUR";
                    break;
                case 51:
                    str = "FJD";
                    break;
                case 52:
                    str = "FKP";
                    break;
                case 53:
                    str = "GBP";
                    break;
                case 54:
                    str = "GEL";
                    break;
                case 55:
                    str = "GHS";
                    break;
                case 56:
                    str = "GIP";
                    break;
                case 57:
                    str = "GMD";
                    break;
                case 58:
                    str = "GNF";
                    break;
                case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                    str = "GTQ";
                    break;
                case 60:
                    str = "GYD";
                    break;
                case 61:
                    str = "HKD";
                    break;
                case 62:
                    str = "HNL";
                    break;
                case 63:
                    str = "HRK";
                    break;
                case 64:
                    str = "HTG";
                    break;
                case 65:
                    str = "HUF";
                    break;
                case 66:
                    str = "IDR";
                    break;
                case 67:
                    str = "ILS";
                    break;
                case 68:
                    str = "INR";
                    break;
                case 69:
                    str = "IQD";
                    break;
                case 70:
                    str = "IRR";
                    break;
                case 71:
                    str = "ISK";
                    break;
                case 72:
                    str = "JMD";
                    break;
                case 73:
                    str = "JOD";
                    break;
                case 74:
                    str = "JPY";
                    break;
                case 75:
                    str = "KES";
                    break;
                case 76:
                    str = "KGS";
                    break;
                case 77:
                    str = "KHR";
                    break;
                case 78:
                    str = "KMF";
                    break;
                case 79:
                    str = "KPW";
                    break;
                case 80:
                    str = "KRW";
                    break;
                case 81:
                    str = "KWD";
                    break;
                case 82:
                    str = "KYD";
                    break;
                case 83:
                    str = "KZT";
                    break;
                case 84:
                    str = "LAK";
                    break;
                case 85:
                    str = "LBP";
                    break;
                case Metadata$Episode.RSS_GUID_FIELD_NUMBER /* 86 */:
                    str = "LKR";
                    break;
                case 87:
                    str = "LRD";
                    break;
                case Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
                    str = "LSL";
                    break;
                case 89:
                    str = "LYD";
                    break;
                case 90:
                    str = "MAD";
                    break;
                case 91:
                    str = "MDL";
                    break;
                case 92:
                    str = "MGA";
                    break;
                case 93:
                    str = "MKD";
                    break;
                case 94:
                    str = "MMK";
                    break;
                case 95:
                    str = "MNT";
                    break;
                case 96:
                    str = "MOP";
                    break;
                case com.spotify.metadata.proto.Metadata$Episode.IS_PODCAST_SHORT_FIELD_NUMBER /* 97 */:
                    str = "MRO";
                    break;
                case 98:
                    str = "MUR";
                    break;
                case 99:
                    str = "MVR";
                    break;
                case 100:
                    str = "MWK";
                    break;
                case 101:
                    str = "MXN";
                    break;
                case 102:
                    str = "MXV";
                    break;
                case 103:
                    str = "MYR";
                    break;
                case 104:
                    str = "MZN";
                    break;
                case 105:
                    str = "NAD";
                    break;
                case Error.INVALID_COUNTRY_FIELD_NUMBER /* 106 */:
                    str = "NGN";
                    break;
                case Error.TOO_YOUNG_FIELD_NUMBER /* 107 */:
                    str = "NIO";
                    break;
                case 108:
                    str = "NOK";
                    break;
                case 109:
                    str = "NPR";
                    break;
                case 110:
                    str = "NZD";
                    break;
                case ContentType.SHORT_FORM_ON_DEMAND /* 111 */:
                    str = "OMR";
                    break;
                case ContentType.LONG_FORM_ON_DEMAND /* 112 */:
                    str = "PAB";
                    break;
                case ContentType.LIVE /* 113 */:
                    str = "PEN";
                    break;
                case 114:
                    str = "PGK";
                    break;
                case 115:
                    str = "PHP";
                    break;
                case 116:
                    str = "PKR";
                    break;
                case 117:
                    str = "PLN";
                    break;
                case 118:
                    str = "PYG";
                    break;
                case 119:
                    str = "QAR";
                    break;
                case 120:
                    str = "RON";
                    break;
                case ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND /* 121 */:
                    str = "RSD";
                    break;
                case ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND /* 122 */:
                    str = "RUB";
                    break;
                case ContentType.USER_GENERATED_LIVE /* 123 */:
                    str = "RWF";
                    break;
                case 124:
                    str = "SAR";
                    break;
                case 125:
                    str = "SBD";
                    break;
                case 126:
                    str = "SCR";
                    break;
                case 127:
                    str = "SDG";
                    break;
                case 128:
                    str = "SEK";
                    break;
                case 129:
                    str = "SGD";
                    break;
                case 130:
                    str = "SHP";
                    break;
                case 131:
                    str = "SLL";
                    break;
                case 132:
                    str = "SOS";
                    break;
                case 133:
                    str = "SRD";
                    break;
                case 134:
                    str = "SSP";
                    break;
                case 135:
                    str = "STD";
                    break;
                case 136:
                    str = "SYP";
                    break;
                case 137:
                    str = "SZL";
                    break;
                case 138:
                    str = "THB";
                    break;
                case 139:
                    str = "TJS";
                    break;
                case 140:
                    str = "TMT";
                    break;
                case 141:
                    str = "TND";
                    break;
                case 142:
                    str = "TOP";
                    break;
                case 143:
                    str = "TRY";
                    break;
                case 144:
                    str = "TTD";
                    break;
                case 145:
                    str = "TWD";
                    break;
                case 146:
                    str = "TZS";
                    break;
                case 147:
                    str = "UAH";
                    break;
                case 148:
                    str = "UGX";
                    break;
                case 149:
                    str = "USD";
                    break;
                case 150:
                    str = "USN";
                    break;
                case 151:
                    str = "UYI";
                    break;
                case 152:
                    str = "UYU";
                    break;
                case 153:
                    str = "UZS";
                    break;
                case 154:
                    str = "VEF";
                    break;
                case 155:
                    str = "VND";
                    break;
                case 156:
                    str = "VUV";
                    break;
                case 157:
                    str = "WST";
                    break;
                case 158:
                    str = "XAF";
                    break;
                case 159:
                    str = "XAG";
                    break;
                case 160:
                    str = "XAU";
                    break;
                case 161:
                    str = "XBA";
                    break;
                case 162:
                    str = "XBB";
                    break;
                case 163:
                    str = "XBC";
                    break;
                case 164:
                    str = "XBD";
                    break;
                case 165:
                    str = "XCD";
                    break;
                case 166:
                    str = "XDR";
                    break;
                case 167:
                    str = "XFU";
                    break;
                case 168:
                    str = "XOF";
                    break;
                case 169:
                    str = "XPD";
                    break;
                case 170:
                    str = "XPF";
                    break;
                case 171:
                    str = "XPT";
                    break;
                case 172:
                    str = "XSU";
                    break;
                case 173:
                    str = "XTS";
                    break;
                case 174:
                    str = "XUA";
                    break;
                case 175:
                    str = "XXX";
                    break;
                case 176:
                    str = "YER";
                    break;
                case 177:
                    str = "ZAR";
                    break;
                case 178:
                    str = "ZMW";
                    break;
                default:
                    throw null;
            }
        } else {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeString(this.f113894e);
        parcel.writeString(this.f113895f);
        parcel.writeString(this.f113896g);
        int i4 = this.f113897h;
        parcel.writeString(i4 != 0 ? m5p0.m60872d(i4) : "");
        int i5 = this.f113898i;
        parcel.writeString(i5 != 0 ? ydj.m93459r(i5) : "");
        parcel.writeString(this.f113899t);
        parcel.writeSerializable(this.f113887X);
        parcel.writeSerializable(this.f113888Y);
        parcel.writeSerializable(this.f113889Z);
        parcel.writeSerializable(this.f113877L0);
        parcel.writeString(this.f113878M0);
        parcel.writeString(this.f113879N0);
        parcel.writeString(this.f113880O0);
        parcel.writeString(this.f113881P0);
        parcel.writeString(this.f113882Q0);
        parcel.writeSerializable(this.f113883R0);
        parcel.writeSerializable(this.f113884S0);
        parcel.writeSerializable(this.f113885T0);
        parcel.writeSerializable(this.f113886U0);
    }
}
