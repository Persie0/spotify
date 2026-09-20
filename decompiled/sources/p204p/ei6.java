package p204p;

import android.os.Parcel;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.MessageText;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class ei6 {
    public static int[] _values() {
        return edb.m38551G(3);
    }

    /* JADX INFO: renamed from: a */
    public static int m39064a(int i) {
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m39065b(int i) {
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return i != 6 ? 0 : 4;
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m39066c(int i) {
        switch (i) {
            case 1:
                return "android-audio-focus";
            case 2:
                return "android-audio-focus-audiofocus";
            case 3:
                return "android-audio-focus-coreinternal";
            case 4:
                return "android-ubiquity-audio-focus-service";
            case 5:
                return "android-campaigns-audioplayerimpl";
            case 6:
                return "android-fullscreenstory-fullscreenstoryimpl";
            case 7:
                return "android-media-browser-service-mediabrowserservice";
            case 8:
                return "android-previewplayer-api";
            case 9:
                return "android-preview-previewapi";
            case 10:
                return "android-share-templates-entity";
            case 11:
                return "android-kids-playback-notification";
            case 12:
                return "test";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m39067d(int i) {
        switch (i) {
            case 1:
                return "audio.equalizer.low_shelf_gain_v2";
            case 2:
                return "audio.equalizer.low_peak_gain_v2";
            case 3:
                return "audio.equalizer.low_mid_peak_gain_v2";
            case 4:
                return "audio.equalizer.high_mid_peak_gain_v2";
            case 5:
                return "audio.equalizer.high_peak_gain_v2";
            case 6:
                return "audio.equalizer.high_shelf_gain_v2";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m39068e(int i) {
        switch (i) {
            case 1:
                return "ADD_TO_CART";
            case 2:
                return "ADD_TO_WISHLIST";
            case 3:
                return "VIEW_CART";
            case 4:
                return "INITIATE_PURCHASE";
            case 5:
                return "ADD_PAYMENT_INFO";
            case 6:
                return "PURCHASE";
            case 7:
                return "SPEND_CREDITS";
            case 8:
                return "SEARCH";
            case 9:
                return "VIEW_ITEM";
            case 10:
                return "VIEW_ITEMS";
            case 11:
                return "RATE";
            case 12:
                return "SHARE";
            case 13:
                return "INITIATE_STREAM";
            case 14:
                return "COMPLETE_STREAM";
            case 15:
                return "COMPLETE_REGISTRATION";
            case 16:
                return "COMPLETE_TUTORIAL";
            case 17:
                return "ACHIEVE_LEVEL";
            case 18:
                return "UNLOCK_ACHIEVEMENT";
            case 19:
                return "INVITE";
            case 20:
                return "LOGIN";
            case 21:
                return "RESERVE";
            case 22:
                return "SUBSCRIBE";
            case 23:
                return "START_TRIAL";
            case 24:
                return "CLICK_AD";
            case 25:
                return "VIEW_AD";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m39069f(int i) {
        if (i == 1) {
            return "top-tracks";
        }
        if (i == 2) {
            return "albums";
        }
        if (i == 3) {
            return "singles";
        }
        if (i == 4) {
            return "appears-on";
        }
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ String m39070g(int i) {
        switch (i) {
            case 1:
                return "AirPlay";
            case 2:
                return "Bluetooth";
            case 3:
                return "Built-in";
            case 4:
                return "LineOut";
            case 5:
                return "CarProjected";
            case 6:
                return "Unknown";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m39071h(MessageText messageText, int i, int i2) {
        return (messageText.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: i */
    public static ClassCastException m39072i(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    /* JADX INFO: renamed from: j */
    public static String m39073j(String str, Throwable th) {
        return str + th;
    }

    /* JADX INFO: renamed from: k */
    public static HashMap m39074k(Class cls, yn6 yn6Var) {
        HashMap map = new HashMap();
        map.put(cls, yn6Var);
        return map;
    }

    /* JADX INFO: renamed from: l */
    public static Map m39075l(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    /* JADX INFO: renamed from: m */
    public static fxh0 m39076m(nv4 nv4Var, int i, cxh0 cxh0Var) {
        return xfg1.m90478H(cxh0Var, new ni80(nv4Var, i));
    }

    /* JADX INFO: renamed from: n */
    public static void m39077n(int i, String str) {
        yif1.m93819w0(str + i);
    }

    /* JADX INFO: renamed from: o */
    public static void m39078o(Parcel parcel, int i, Boolean bool) {
        parcel.writeInt(i);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ boolean m39079p(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(null, obj)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ boolean m39080q(AtomicReference atomicReference, Throwable th) {
        while (!atomicReference.compareAndSet(null, th)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ String m39081r(int i) {
        switch (i) {
            case 1:
                return "Load";
            case 2:
                return "ResolveCurationHandler";
            case 3:
                return "LoadSeeds";
            case 4:
                return "LoadCard";
            case 5:
                return "LoadCardEndpoint";
            case 6:
                return "LoadCardMetadata";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ String m39082s(int i) {
        if (i == 1) {
            return "TOKEN";
        }
        if (i == 2) {
            return "CODE";
        }
        if (i == 3) {
            return "NONE";
        }
        if (i == 4) {
            return "UNKNOWN";
        }
        throw null;
    }
}
