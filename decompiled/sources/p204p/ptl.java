package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.metadata.classic.proto.Metadata$Episode;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.signup.signup.p150v2.proto.Error;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class ptl {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m70980a(int i) {
        switch (i) {
            case 1:
                return "AED";
            case 2:
                return "AFN";
            case 3:
                return "ALL";
            case 4:
                return "AMD";
            case 5:
                return "ANG";
            case 6:
                return "AOA";
            case 7:
                return "ARS";
            case 8:
                return "AUD";
            case 9:
                return "AWG";
            case 10:
                return "AZN";
            case 11:
                return "BAM";
            case 12:
                return "BBD";
            case 13:
                return "BDT";
            case 14:
                return "BGN";
            case 15:
                return "BHD";
            case 16:
                return "BIF";
            case 17:
                return "BMD";
            case 18:
                return "BND";
            case 19:
                return "BOB";
            case 20:
                return "BOV";
            case 21:
                return "BRL";
            case 22:
                return "BSD";
            case 23:
                return "BTN";
            case 24:
                return "BWP";
            case 25:
                return "BYN";
            case 26:
                return "BYR";
            case 27:
                return "BZD";
            case 28:
                return "CAD";
            case 29:
                return "CDF";
            case 30:
                return "CHE";
            case 31:
                return "CHF";
            case 32:
                return "CHW";
            case 33:
                return "CLF";
            case 34:
                return "CLP";
            case 35:
                return "CNY";
            case 36:
                return "COP";
            case 37:
                return "COU";
            case 38:
                return "CRC";
            case 39:
                return "CUC";
            case 40:
                return "CUP";
            case 41:
                return "CVE";
            case 42:
                return "CZK";
            case 43:
                return "DJF";
            case 44:
                return "DKK";
            case 45:
                return "DOP";
            case 46:
                return "DZD";
            case 47:
                return "EGP";
            case 48:
                return "ERN";
            case 49:
                return "ETB";
            case 50:
                return "EUR";
            case 51:
                return "FJD";
            case 52:
                return "FKP";
            case 53:
                return "GBP";
            case 54:
                return "GEL";
            case 55:
                return "GHS";
            case 56:
                return "GIP";
            case 57:
                return "GMD";
            case 58:
                return "GNF";
            case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                return "GTQ";
            case 60:
                return "GYD";
            case 61:
                return "HKD";
            case 62:
                return "HNL";
            case 63:
                return "HRK";
            case 64:
                return "HTG";
            case 65:
                return "HUF";
            case 66:
                return "IDR";
            case 67:
                return "ILS";
            case 68:
                return "INR";
            case 69:
                return "IQD";
            case 70:
                return "IRR";
            case 71:
                return "ISK";
            case 72:
                return "JMD";
            case 73:
                return "JOD";
            case 74:
                return "JPY";
            case 75:
                return "KES";
            case 76:
                return "KGS";
            case 77:
                return "KHR";
            case 78:
                return "KMF";
            case 79:
                return "KPW";
            case 80:
                return "KRW";
            case 81:
                return "KWD";
            case 82:
                return "KYD";
            case 83:
                return "KZT";
            case 84:
                return "LAK";
            case 85:
                return "LBP";
            case Metadata$Episode.RSS_GUID_FIELD_NUMBER /* 86 */:
                return "LKR";
            case 87:
                return "LRD";
            case Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
                return "LSL";
            case 89:
                return "LYD";
            case 90:
                return "MAD";
            case 91:
                return "MDL";
            case 92:
                return "MGA";
            case 93:
                return "MKD";
            case 94:
                return "MMK";
            case 95:
                return "MNT";
            case 96:
                return "MOP";
            case com.spotify.metadata.proto.Metadata$Episode.IS_PODCAST_SHORT_FIELD_NUMBER /* 97 */:
                return "MRO";
            case 98:
                return "MUR";
            case 99:
                return "MVR";
            case 100:
                return "MWK";
            case 101:
                return "MXN";
            case 102:
                return "MXV";
            case 103:
                return "MYR";
            case 104:
                return "MZN";
            case 105:
                return "NAD";
            case Error.INVALID_COUNTRY_FIELD_NUMBER /* 106 */:
                return "NGN";
            case Error.TOO_YOUNG_FIELD_NUMBER /* 107 */:
                return "NIO";
            case 108:
                return "NOK";
            case 109:
                return "NPR";
            case 110:
                return "NZD";
            case ContentType.SHORT_FORM_ON_DEMAND /* 111 */:
                return "OMR";
            case ContentType.LONG_FORM_ON_DEMAND /* 112 */:
                return "PAB";
            case ContentType.LIVE /* 113 */:
                return "PEN";
            case 114:
                return "PGK";
            case 115:
                return "PHP";
            case 116:
                return "PKR";
            case 117:
                return "PLN";
            case 118:
                return "PYG";
            case 119:
                return "QAR";
            case 120:
                return "RON";
            case ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND /* 121 */:
                return "RSD";
            case ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND /* 122 */:
                return "RUB";
            case ContentType.USER_GENERATED_LIVE /* 123 */:
                return "RWF";
            case 124:
                return "SAR";
            case 125:
                return "SBD";
            case 126:
                return "SCR";
            case 127:
                return "SDG";
            case 128:
                return "SEK";
            case 129:
                return "SGD";
            case 130:
                return "SHP";
            case 131:
                return "SLL";
            case 132:
                return "SOS";
            case 133:
                return "SRD";
            case 134:
                return "SSP";
            case 135:
                return "STD";
            case 136:
                return "SYP";
            case 137:
                return "SZL";
            case 138:
                return "THB";
            case 139:
                return "TJS";
            case 140:
                return "TMT";
            case 141:
                return "TND";
            case 142:
                return "TOP";
            case 143:
                return "TRY";
            case 144:
                return "TTD";
            case 145:
                return "TWD";
            case 146:
                return "TZS";
            case 147:
                return "UAH";
            case 148:
                return "UGX";
            case 149:
                return "USD";
            case 150:
                return "USN";
            case 151:
                return "UYI";
            case 152:
                return "UYU";
            case 153:
                return "UZS";
            case 154:
                return "VEF";
            case 155:
                return "VND";
            case 156:
                return "VUV";
            case 157:
                return "WST";
            case 158:
                return "XAF";
            case 159:
                return "XAG";
            case 160:
                return "XAU";
            case 161:
                return "XBA";
            case 162:
                return "XBB";
            case 163:
                return "XBC";
            case 164:
                return "XBD";
            case 165:
                return "XCD";
            case 166:
                return "XDR";
            case 167:
                return "XFU";
            case 168:
                return "XOF";
            case 169:
                return "XPD";
            case 170:
                return "XPF";
            case 171:
                return "XPT";
            case 172:
                return "XSU";
            case 173:
                return "XTS";
            case 174:
                return "XUA";
            case 175:
                return "XXX";
            case 176:
                return "YER";
            case 177:
                return "ZAR";
            case 178:
                return "ZMW";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC2609yd m70981b(e940 e940Var, ikh ikhVar) {
        jg31.m53271i(e940Var);
        InterfaceC2609yd interfaceC2609ydMo31662e = ikhVar.mo31662e();
        jg31.m53271i(interfaceC2609ydMo31662e);
        return interfaceC2609ydMo31662e;
    }

    /* JADX INFO: renamed from: c */
    public static as4 m70982c(ikh ikhVar) {
        jg31.m53271i(ikhVar.mo31663h());
        as4 as4VarMo31664i = ikhVar.mo31664i();
        jg31.m53271i(as4VarMo31664i);
        return as4VarMo31664i;
    }

    /* JADX INFO: renamed from: d */
    public static n6q m70983d(o6q o6qVar) {
        jg31.m53271i(o6qVar);
        return new n6q();
    }

    /* JADX INFO: renamed from: e */
    public static h4t0 m70984e(xg0 xg0Var, int i) {
        return be21.m28868a(new ezm(xg0Var, i, 2));
    }

    /* JADX INFO: renamed from: f */
    public static h4t0 m70985f(nml nmlVar, int i) {
        return be21.m28868a(new igm(nmlVar, i, 7));
    }

    /* JADX INFO: renamed from: g */
    public static h4t0 m70986g(hjm hjmVar, int i) {
        return b2s.m27972b(new igm(hjmVar, i, 14));
    }

    /* JADX INFO: renamed from: h */
    public static h4t0 m70987h(ijm ijmVar, int i) {
        return be21.m28868a(new ezm(ijmVar, i, 16));
    }

    /* JADX INFO: renamed from: i */
    public static h4t0 m70988i(dlm dlmVar, int i) {
        return be21.m28868a(new yum(dlmVar, i, 9));
    }

    /* JADX INFO: renamed from: j */
    public static h4t0 m70989j(ilm ilmVar, int i) {
        return be21.m28868a(new igm(ilmVar, i, 28));
    }

    /* JADX INFO: renamed from: k */
    public static h4t0 m70990k(jnm jnmVar, int i) {
        return be21.m28868a(new xrm(jnmVar, i, 20));
    }

    /* JADX INFO: renamed from: l */
    public static h4t0 m70991l(tsm tsmVar, int i) {
        return be21.m28868a(new ezm(tsmVar, i, 10));
    }

    /* JADX INFO: renamed from: m */
    public static h4t0 m70992m(vym vymVar, int i) {
        return b2s.m27972b(new yum(vymVar, i, 28));
    }

    /* JADX INFO: renamed from: n */
    public static h4t0 m70993n(d0n d0nVar, int i) {
        return b2s.m27972b(new ezm(d0nVar, i, 8));
    }

    /* JADX INFO: renamed from: o */
    public static h4t0 m70994o(z1n z1nVar, int i) {
        return b2s.m27972b(new ezm(z1nVar, i, 29));
    }

    /* JADX INFO: renamed from: p */
    public static h4t0 m70995p(m2n m2nVar, int i) {
        return b2s.m27972b(new l2n(m2nVar, i));
    }

    /* JADX INFO: renamed from: q */
    public static h4t0 m70996q(q4n q4nVar, int i) {
        return be21.m28868a(new c2n(q4nVar, i, 22));
    }

    /* JADX INFO: renamed from: r */
    public static h4t0 m70997r(ebn ebnVar, int i) {
        return be21.m28868a(new a7n(ebnVar, i, 17));
    }

    /* JADX INFO: renamed from: s */
    public static voc1 m70998s(String str, String str2, uoc1 uoc1Var) {
        return uoc1Var.m83614b(str + str2);
    }

    /* JADX INFO: renamed from: t */
    public static void m70999t(float f, kqi0 kqi0Var) {
        kqi0Var.setValue(new ybs(f));
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ boolean m71000u(AtomicReference atomicReference) {
        utl utlVar;
        do {
            utlVar = utl.f233938c;
            if (atomicReference.compareAndSet(utlVar, utl.f233939d)) {
                return true;
            }
        } while (atomicReference.get() == utlVar);
        return false;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ boolean m71001v(AtomicReference atomicReference, UrlRequest urlRequest, UrlRequest urlRequest2) {
        while (!atomicReference.compareAndSet(urlRequest, urlRequest2)) {
            if (atomicReference.get() != urlRequest) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ boolean m71002w(AtomicReference atomicReference, utl utlVar) {
        while (!atomicReference.compareAndSet(utlVar, utl.f233941f)) {
            if (atomicReference.get() != utlVar) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: x */
    public static h4t0 m71003x(vym vymVar, int i) {
        return be21.m28868a(new yum(vymVar, i, 28));
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ boolean m71004y(AtomicReference atomicReference) {
        utl utlVar;
        do {
            utlVar = utl.f233937b;
            if (atomicReference.compareAndSet(utlVar, utl.f233941f)) {
                return true;
            }
        } while (atomicReference.get() == utlVar);
        return false;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ String m71005z(int i) {
        switch (i) {
            case 1:
                return "IDLE";
            case 2:
                return "CHECKING_CACHE";
            case 3:
                return "RESOLVING_CUE_AUDIO";
            case 4:
                return "DUCKING";
            case 5:
                return "DOWNLOADING";
            case 6:
                return "PLAYING";
            case 7:
                return "UNDUCKING";
            default:
                throw null;
        }
    }
}
