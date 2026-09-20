package p204p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class oq40 {
    public static int[] _values() {
        return edb.m38551G(5);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m67582a(int i, eab eabVar) {
        return (eabVar.mo38278l0() != 2) == (i == 1);
    }

    /* JADX INFO: renamed from: b */
    public static int m67583b(int i) {
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i != 4) {
                    return i != 5 ? 0 : 4;
                }
                return 3;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public static final String m67584c(int i) {
        return m67588g(i);
    }

    /* JADX INFO: renamed from: d */
    public static final String m67585d(int i) {
        return m67591j(i);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m67586e(int i) {
        switch (i) {
            case 1:
                return "add_artist";
            case 2:
                return "add_podcast";
            case 3:
                return "album";
            case 4:
                return "artist";
            case 5:
                return "audiobook";
            case 6:
                return "author";
            case 7:
                return "concert_campaign";
            case 8:
                return "course";
            case 9:
                return "dsa_banner";
            case 10:
                return "event";
            case 11:
                return "events_hub_navigation";
            case 12:
                return "import_music";
            case 13:
                return "liked_songs";
            case 14:
                return "local_files";
            case 15:
                return "new_episodes";
            case 16:
                return "playlist";
            case 17:
                return "playlist_folder";
            case 18:
                return "podcast";
            case 19:
                return "prerelease";
            case 20:
                return "venue";
            case 21:
                return "your_episodes";
            case 22:
                return "unknown";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m67587f(int i) {
        if (i == 1 || i == 2) {
            return false;
        }
        if (i == 3 || i == 4) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ String m67588g(int i) {
        switch (i) {
            case 1:
                return "email";
            case 2:
                return "password";
            case 3:
                return "username";
            case 4:
                return "birth_date";
            case 5:
                return "gender";
            case 6:
                return "display_name";
            case 7:
                return "none";
            case 8:
                return "calling_code";
            case 9:
                return "phone_number";
            case 10:
                return "otp";
            case 11:
                return "naver_button";
            case 12:
                return "google_auth_button";
            case 13:
                return "third_party_data_provision_link";
            case 14:
                return "tailored_ads_link";
            case 15:
                return "personal_information_collection_link";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ String m67589h(int i) {
        switch (i) {
            case 1:
                return "airplay_speaker";
            case 2:
                return "audio_dongle";
            case 3:
                return "automobile";
            case 4:
                return "avr";
            case 5:
                return "bluetooth_headphones";
            case 6:
                return "bluetooth_car";
            case 7:
                return "bluetooth_speaker";
            case 8:
                return "bluetooth_unknown";
            case 9:
                return "cast_audio";
            case 10:
                return "cast_video";
            case 11:
                return "chromebook";
            case 12:
                return "computer";
            case 13:
                return "game_console";
            case 14:
                return "home_thing";
            case 15:
                return "smartphone";
            case 16:
                return "smartwatch";
            case 17:
                return "face_wearable";
            case 18:
                return "speaker";
            case 19:
                return "stb";
            case 20:
                return "tablet";
            case 21:
                return "tv";
            case 22:
                return "unknown";
            case 23:
                return "unknown_spotify";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ String m67590i(int i) {
        switch (i) {
            case 1:
                return "airplay";
            case 2:
                return "android_auto";
            case 3:
                return "bluetooth";
            case 4:
                return "cast";
            case 5:
                return "connect";
            case 6:
                return "self";
            case 7:
                return "wired";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ String m67591j(int i) {
        if (i == 1) {
            return "voice";
        }
        if (i == 2) {
            return "text";
        }
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ String m67592k(int i) {
        if (i == 1) {
            return "local_network_missing";
        }
        if (i == 2) {
            return "mdns_unavailable";
        }
        if (i == 3) {
            return "not_reachable";
        }
        if (i == 4) {
            return "active_device_out_of_sync";
        }
        if (i == 5) {
            return "ui_toggle_out_of_sync";
        }
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public static int m67593l(jiu jiuVar, int i, int i2) {
        return (jiuVar.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m67594m(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, eg60 eg60Var, p9u p9uVar, in40 in40Var) {
        while (!atomicReferenceFieldUpdater.compareAndSet(eg60Var, p9uVar, in40Var) && atomicReferenceFieldUpdater.get(eg60Var) == p9uVar) {
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ boolean m67595n(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, eg60 eg60Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(eg60Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(eg60Var) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ boolean m67596o(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, eg60 eg60Var, Object obj, zf60 zf60Var) {
        while (!atomicReferenceFieldUpdater.compareAndSet(eg60Var, obj, zf60Var)) {
            if (atomicReferenceFieldUpdater.get(eg60Var) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ boolean m67597p(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, eg60 eg60Var, p9u p9uVar, r3e r3eVar) {
        while (!atomicReferenceFieldUpdater.compareAndSet(eg60Var, p9uVar, r3eVar)) {
            if (atomicReferenceFieldUpdater.get(eg60Var) != p9uVar) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ boolean m67598q(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, eg60 eg60Var, in40 in40Var, zf60 zf60Var) {
        while (!atomicReferenceFieldUpdater.compareAndSet(eg60Var, in40Var, zf60Var)) {
            if (atomicReferenceFieldUpdater.get(eg60Var) != in40Var) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ boolean m67599r(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, eg60 eg60Var, vf60 vf60Var) {
        while (!atomicReferenceFieldUpdater.compareAndSet(eg60Var, vf60Var, i091.f97179g)) {
            if (atomicReferenceFieldUpdater.get(eg60Var) != vf60Var) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ String m67600s(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "COMPUTER";
            case 3:
                return "TABLET";
            case 4:
                return "SMARTPHONE";
            case 5:
                return "SPEAKER";
            case 6:
                return "HEADPHONES";
            case 7:
                return "TV";
            case 8:
                return "AVR";
            case 9:
                return "STB";
            case 10:
                return "AUDIO_DONGLE";
            case 11:
                return "GAME_CONSOLE";
            case 12:
                return "CAST_VIDEO";
            case 13:
                return "CAST_AUDIO";
            case 14:
                return "AUTOMOBILE";
            case 15:
                return "SMARTWATCH";
            case 16:
                return "CHROMEBOOK";
            case 17:
                return "UNKNOWN_SPOTIFY";
            case 18:
                return "HOME_THING";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ String m67601t(int i) {
        if (i == 1) {
            return "BLUETOOTH";
        }
        if (i == 2) {
            return "AIRPLAY";
        }
        if (i == 3) {
            return "CAST";
        }
        if (i == 4) {
            return "CONNECT";
        }
        throw null;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ String m67602u(int i) {
        if (i == 1) {
            return "DEVICE_SPEAKER_ONLY";
        }
        if (i == 2) {
            return "LISTENING_ACTIVITY_ONLY";
        }
        if (i == 3) {
            return "MIXED";
        }
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ String m67603v(int i) {
        if (i == 1) {
            return "HOST";
        }
        if (i == 2) {
            return "PARTICIPANT";
        }
        throw null;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ String m67604w(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "BAD_CONFIG";
        }
        return "OK";
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ int m67605x(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("DEVICE_SPEAKER_ONLY")) {
            return 1;
        }
        if (str.equals("LISTENING_ACTIVITY_ONLY")) {
            return 2;
        }
        if (str.equals("MIXED")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.jam.features.jaminvitelearnmorepage.api.JamInviteLearnMorePage.PendingRequestsJoinType.".concat(str));
    }
}
