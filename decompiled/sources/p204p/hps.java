package p204p;

import com.spotify.music.R;
import com.spotify.signup.signup.p150v2.proto.Error;

/* JADX INFO: loaded from: classes6.dex */
public final class hps implements jps {

    /* JADX INFO: renamed from: b */
    public static final hps f93835b = new hps(0);

    /* JADX INFO: renamed from: c */
    public static final hps f93836c = new hps(1);

    /* JADX INFO: renamed from: d */
    public static final hps f93837d = new hps(2);

    /* JADX INFO: renamed from: e */
    public static final hps f93838e = new hps(3);

    /* JADX INFO: renamed from: f */
    public static final hps f93839f = new hps(4);

    /* JADX INFO: renamed from: g */
    public static final hps f93840g = new hps(5);

    /* JADX INFO: renamed from: h */
    public static final hps f93841h = new hps(6);

    /* JADX INFO: renamed from: i */
    public static final hps f93842i = new hps(7);

    /* JADX INFO: renamed from: j */
    public static final hps f93843j = new hps(8);

    /* JADX INFO: renamed from: k */
    public static final hps f93844k = new hps(9);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f93845a;

    public /* synthetic */ hps(int i) {
        this.f93845a = i;
    }

    @Override // p204p.jps
    /* JADX INFO: renamed from: a */
    public final int mo48179a() {
        switch (this.f93845a) {
            case 0:
                return R.string.external_integration_audiobook_not_playable;
            case 1:
                return R.string.external_integration_content_restricted;
            case 2:
                return R.string.external_integration_error_explicit_content;
            case 3:
                return R.string.external_integration_logged_out;
            case 4:
                return R.string.external_integration_error_no_content;
            case 5:
                return R.string.external_integration_search_failed;
            case 6:
                return R.string.external_integration_track_restricted;
            case 7:
                return R.string.external_integration_track_unavailable;
            case 8:
                return R.string.external_integration_offline_playback_failed;
            default:
                return R.string.external_integration_unknown_error;
        }
    }

    @Override // p204p.jps
    /* JADX INFO: renamed from: b */
    public final int mo48180b() {
        switch (this.f93845a) {
            case 0:
                return 108;
            case 1:
                return Error.TOO_YOUNG_FIELD_NUMBER;
            case 2:
                return 104;
            case 3:
                return 110;
            case 4:
                return 102;
            case 5:
                return 100;
            case 6:
                return Error.INVALID_COUNTRY_FIELD_NUMBER;
            case 7:
                return 105;
            case 8:
                return 103;
            default:
                return 101;
        }
    }

    @Override // p204p.jps
    /* JADX INFO: renamed from: c */
    public final boolean mo48181c() {
        switch (this.f93845a) {
            case 0:
                return true;
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return false;
            case 4:
                return false;
            case 5:
                return false;
            case 6:
                return false;
            case 7:
                return true;
            case 8:
                return false;
            default:
                return false;
        }
    }
}
