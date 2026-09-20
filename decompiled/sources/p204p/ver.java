package p204p;

import com.spotify.devicepredictability.devicesuggestionprovider.events.proto.DeviceSuggestionProvided;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class ver {

    /* JADX INFO: renamed from: a */
    public final qre0 f240790a;

    public ver(qre0 qre0Var) {
        this.f240790a = qre0Var;
    }

    /* JADX INFO: renamed from: b */
    public static String m85325b(int i) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            return "LOW";
        }
        if (iM38547C == 1) {
            return "MEDIUM";
        }
        if (iM38547C == 2) {
            return "HIGH";
        }
        if (iM38547C == 3) {
            return "UNKNOWN";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public static String m85326c(xfr xfrVar) {
        switch (xfrVar.ordinal()) {
            case 0:
                return "UNKNOWN";
            case 1:
                return "COMPUTER";
            case 2:
                return "TABLET";
            case 3:
                return "SMARTPHONE";
            case 4:
                return "SPEAKER";
            case 5:
                return "TV";
            case 6:
                return "AVR";
            case 7:
                return "STB";
            case 8:
                return "AUDIO_DONGLE";
            case 9:
                return "GAME_CONSOLE";
            case 10:
                return "CAST_VIDEO";
            case 11:
                return "CAST_AUDIO";
            case 12:
                return "AUTOMOBILE";
            case 13:
                return "SMARTWATCH";
            case 14:
                return "CHROMEBOOK";
            case 15:
                return "UNKNOWN_SPOTIFY_HW";
            case 16:
                return "HOMETHING";
            case 17:
                return "BLUETOOTH_SPEAKER";
            case 18:
                return "BLUETOOTH_HEADPHONES";
            case 19:
                return "AIRPLAY_SPEAKER";
            case 20:
                return "BLUETOOTH_UNKNOWN";
            case 21:
                return "BLUETOOTH_CAR";
            case 22:
                return "GLASSES";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m85327a(qcr qcrVar, e261 e261Var, List list) {
        String str;
        ncr ncrVarM9266t = DeviceSuggestionProvided.m9266t();
        ncrVarM9266t.m64169t(qcrVar.mo66725d());
        int iOrdinal = e261Var.ordinal();
        if (iOrdinal == 0) {
            str = "WHERE_TO_PLAY";
        } else if (iOrdinal == 1) {
            str = "GOOGLE_INTENT_ENGINE";
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "BLE_PROXIMITY";
        }
        ncrVarM9266t.m64170u(str);
        ncrVarM9266t.m64166q(m85325b(qcrVar.mo66722a()));
        ncrVarM9266t.m64168s(m85326c(qcrVar.getType()));
        ncrVarM9266t.m64167r(qcrVar.mo66726e());
        ncrVarM9266t.m64165m(list);
        int iM73616a = this.f240790a.m73616a(ncrVarM9266t.build());
        if (iM73616a != 1) {
            na6.m63971s("Failed to publish DeviceSuggestionProvided event with result: ".concat(dq60.m36600B(iM73616a)));
        }
    }
}
