package p204p;

import android.os.Bundle;
import androidx.compose.p002ui.geometry.Offset;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class ydj {
    /* JADX INFO: renamed from: a */
    public static final boolean m93442a(int i) {
        return i == 1 || i == 2 || i == 3;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m93443b(int i) {
        switch (i) {
            case 1:
                return R.string.show_context_menu_content_description_track;
            case 2:
                return R.string.show_context_menu_content_description_episode;
            case 3:
                return R.string.show_context_menu_content_description_album;
            case 4:
                return R.string.show_context_menu_content_description_artist;
            case 5:
                return R.string.show_context_menu_content_description_playlist;
            case 6:
                return R.string.show_context_menu_content_description_show;
            case 7:
                return R.string.show_context_menu_content_description_user;
            case 8:
                return R.string.show_context_menu_content_description_device;
            case 9:
                return R.string.livestream_context_menu_content_description;
            case 10:
                return R.string.show_context_menu_content_description_culturalmoment;
            case 11:
                return R.string.show_context_menu_content_description_dj;
            case 12:
                return R.string.show_context_menu_content_description_comment;
            case 13:
                return R.string.show_context_menu_content_description_video;
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ float m93444c(int i) {
        if (i == 1) {
            return 0.0f;
        }
        if (i == 2) {
            return 1.0f;
        }
        if (i == 3) {
            return 0.0f;
        }
        if (i == 4) {
            return 1.0f;
        }
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ float m93445d(int i) {
        float f = 0.0f;
        if (i != 1 && i != 2) {
            f = 1.0f;
            if (i != 3) {
                if (i == 4) {
                    return 1.0f;
                }
                throw null;
            }
        }
        return f;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m93446e(int i) {
        switch (i) {
            case 1:
                return "value";
            case 2:
                return "event_time";
            case 3:
                return "event_name";
            case 4:
                return "content_ids";
            case 5:
                return "contents";
            case 6:
                return "content_type";
            case 7:
                return "description";
            case 8:
                return "level";
            case 9:
                return "max_rating_value";
            case 10:
                return "num_items";
            case 11:
                return "payment_info_available";
            case 12:
                return "registration_method";
            case 13:
                return "search_string";
            case 14:
                return "success";
            case 15:
                return "order_id";
            case 16:
                return ContextTrack.Metadata.KEY_AD_TYPE;
            case 17:
                return "currency";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m93447f(int i) {
        switch (i) {
            case 1:
                return "anon_id";
            case 2:
                return "fb_login_id";
            case 3:
                return "madid";
            case 4:
                return "page_id";
            case 5:
                return "page_scoped_user_id";
            case 6:
                return "ud";
            case 7:
                return "advertiser_tracking_enabled";
            case 8:
                return "application_tracking_enabled";
            case 9:
                return "consider_views";
            case 10:
                return "device_token";
            case 11:
                return "extInfo";
            case 12:
                return "include_dwell_data";
            case 13:
                return "include_video_data";
            case 14:
                return "install_referrer";
            case 15:
                return "installer_package";
            case 16:
                return "receipt_data";
            case 17:
                return "url_schemes";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m93448g(pla1 pla1Var, int i, int i2) {
        return (pla1Var.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: h */
    public static Bundle m93449h(String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        bundle.putString(str3, str4);
        return bundle;
    }

    /* JADX INFO: renamed from: i */
    public static String m93450i(int i, String str) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static Iterator m93451j(xq00 xq00Var, fxh0 fxh0Var, yhh yhhVar, int i, List list) {
        zsf1.m96835F(fxh0Var, yhhVar, xq00Var);
        xq00Var.m91771i0(i);
        return list.iterator();
    }

    /* JADX INFO: renamed from: k */
    public static aqz m93452k(xq00 xq00Var) {
        aqz aqzVar = new aqz();
        xq00Var.m91793t0(aqzVar);
        return aqzVar;
    }

    /* JADX INFO: renamed from: l */
    public static void m93453l(long j, kqi0 kqi0Var) {
        kqi0Var.setValue(new Offset(j));
    }

    /* JADX INFO: renamed from: m */
    public static void m93454m(String str, String str2) {
        na6.m63957e(str + str2);
    }

    /* JADX INFO: renamed from: n */
    public static void m93455n(boolean z, hk60 hk60Var, rm60 rm60Var, String str) {
        hk60Var.toJson(rm60Var, Boolean.valueOf(z));
        rm60Var.mo56894s(str);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ boolean m93456o(AtomicReference atomicReference) {
        utl utlVar;
        do {
            utlVar = utl.f233936a;
            if (atomicReference.compareAndSet(utlVar, utl.f233941f)) {
                return true;
            }
        } while (atomicReference.get() == utlVar);
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ boolean m93457p(AtomicReference atomicReference) {
        utl utlVar;
        do {
            utlVar = utl.f233936a;
            if (atomicReference.compareAndSet(utlVar, utl.f233937b)) {
                return true;
            }
        } while (atomicReference.get() == utlVar);
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ boolean m93458q(AtomicReference atomicReference) {
        utl utlVar;
        do {
            utlVar = utl.f233937b;
            if (atomicReference.compareAndSet(utlVar, utl.f233939d)) {
                return true;
            }
        } while (atomicReference.get() == utlVar);
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ String m93459r(int i) {
        switch (i) {
            case 1:
                return "OTHER";
            case 2:
                return "NEW";
            case 3:
                return "GOOD";
            case 4:
                return "FAIR";
            case 5:
                return "POOR";
            case 6:
                return "USED";
            case 7:
                return "REFURBISHED";
            case 8:
                return "EXCELLENT";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ String m93460s(int i) {
        if (i == 1) {
            return "USER_DATA";
        }
        if (i == 2) {
            return "APP_DATA";
        }
        if (i != 3) {
            return i != 4 ? "null" : "CUSTOM_EVENTS";
        }
        return "CUSTOM_DATA";
    }
}
