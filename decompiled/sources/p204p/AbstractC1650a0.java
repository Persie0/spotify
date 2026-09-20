package p204p;

import com.spotify.voiceassistants.playermodels.ParsedQueryKt;

/* JADX INFO: renamed from: p.a0 */
/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class AbstractC1650a0 {
    public static int[] _values() {
        return edb.m38551G(4);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m24304a(int i) {
        if (i == 1) {
            return "BatchedChatEvent";
        }
        if (i == 2) {
            return "SendMessage";
        }
        if (i == 3) {
            return "DeleteMessage";
        }
        if (i == 4) {
            return "UnpinMessage";
        }
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m24305b(int i) {
        if (i == 1) {
            return "GOLIVE";
        }
        if (i == 2) {
            return "CLOSEPARTY";
        }
        if (i == 3) {
            return "ARCHIVEPARTY";
        }
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m24306c(int i) {
        if (i == 1) {
            return ParsedQueryKt.INTENT_PLAY;
        }
        if (i == 2) {
            return "PAUSE";
        }
        if (i == 3) {
            return "STOP";
        }
        throw null;
    }
}
