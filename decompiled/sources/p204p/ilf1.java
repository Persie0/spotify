package p204p;

import com.comscore.streaming.ContentType;
import com.google.android.gms.internal.meet_coactivities.zzsc;
import com.spotify.metadata.proto.Metadata$Episode;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.signup.signup.p150v2.proto.Error;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class ilf1 {
    /* JADX INFO: renamed from: a */
    public static int m51013a(int i) {
        if (i == 90) {
            return 81;
        }
        if (i == 91) {
            return 82;
        }
        if (i == 93) {
            return 84;
        }
        if (i == 94) {
            return 85;
        }
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            default:
                switch (i) {
                    case 96:
                        return 87;
                    case Metadata$Episode.IS_PODCAST_SHORT_FIELD_NUMBER /* 97 */:
                        return 88;
                    case 98:
                        return 89;
                    case 99:
                        return 90;
                    case 100:
                        return 91;
                    case 101:
                        return 92;
                    case 102:
                        return 83;
                    case 103:
                        return 86;
                    case 104:
                        return 93;
                    case 105:
                        return 94;
                    case Error.INVALID_COUNTRY_FIELD_NUMBER /* 106 */:
                        return 95;
                    case Error.TOO_YOUNG_FIELD_NUMBER /* 107 */:
                        return 96;
                    case 108:
                        return 97;
                    case 109:
                        return 98;
                    case 110:
                        return 99;
                    case ContentType.SHORT_FORM_ON_DEMAND /* 111 */:
                        return 100;
                    case ContentType.LONG_FORM_ON_DEMAND /* 112 */:
                        return 101;
                    case ContentType.LIVE /* 113 */:
                        return 102;
                    case 114:
                        return 103;
                    case 115:
                        return 104;
                    case 116:
                        return 105;
                    case 117:
                        return Error.INVALID_COUNTRY_FIELD_NUMBER;
                    case 118:
                        return Error.TOO_YOUNG_FIELD_NUMBER;
                    case 119:
                        return 108;
                    case 120:
                        return 109;
                    case ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND /* 121 */:
                        return 110;
                    case ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND /* 122 */:
                        return ContentType.SHORT_FORM_ON_DEMAND;
                    case ContentType.USER_GENERATED_LIVE /* 123 */:
                        return ContentType.LONG_FORM_ON_DEMAND;
                    case 124:
                        return ContentType.LIVE;
                    case 125:
                        return 114;
                    case 126:
                        return 117;
                    case 127:
                        return 119;
                    case 128:
                        return 120;
                    case 129:
                        return ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND;
                    case 130:
                        return ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND;
                    case 131:
                        return ContentType.USER_GENERATED_LIVE;
                    case 132:
                        return 124;
                    case 133:
                        return 125;
                    case 134:
                        return 126;
                    case 135:
                        return 127;
                    case 136:
                        return 128;
                    case 137:
                        return 129;
                    case 138:
                        return 130;
                    case 139:
                        return 131;
                    case 140:
                        return 132;
                    case 141:
                        return 133;
                    case 142:
                        return 134;
                    case 143:
                        return 135;
                    case 144:
                        return 136;
                    case 145:
                        return 115;
                    case 146:
                        return 116;
                    case 147:
                        return 118;
                    case 148:
                        return 137;
                    case 149:
                        return 138;
                    case 150:
                        return 139;
                    case 151:
                        return 140;
                    case 152:
                        return 141;
                    default:
                        return 0;
                }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m51014b(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            case 19:
                return 18;
            case 20:
                return 19;
            case 21:
                return 20;
            case 22:
                return 21;
            case 23:
                return 22;
            case 24:
                return 23;
            case 25:
                return 24;
            case 26:
                return 25;
            case 27:
                return 26;
            case 28:
                return 27;
            case 29:
                return 28;
            case 30:
                return 29;
            case 31:
                return 30;
            case 32:
                return 31;
            case 33:
                return 32;
            case 34:
                return 33;
            case 35:
                return 34;
            case 36:
                return 35;
            case 37:
                return 36;
            case 38:
                return 37;
            case 39:
                return 38;
            case 40:
                return 39;
            case 41:
                return 40;
            case 42:
                return 41;
            case 43:
                return 42;
            case 44:
                return 43;
            case 45:
                return 44;
            case 46:
                return 45;
            case 47:
                return 46;
            case 48:
                return 47;
            case 49:
                return 48;
            case 50:
                return 49;
            case 51:
                return 50;
            case 52:
                return 51;
            case 53:
                return 52;
            case 54:
                return 53;
            case 55:
                return 54;
            case 56:
                return 55;
            case 57:
                return 56;
            case 58:
                return 57;
            case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                return 58;
            case 60:
                return 59;
            case 61:
                return 60;
            case 62:
                return 61;
            case 63:
                return 62;
            case 64:
                return 63;
            case 65:
                return 64;
            case 66:
                return 65;
            case 67:
                return 66;
            case 68:
                return 67;
            case 69:
                return 68;
            case 70:
                return 69;
            case 71:
                return 70;
            case 72:
                return 71;
            case 73:
                return 72;
            case 74:
                return 73;
            case 75:
                return 74;
            case 76:
                return 75;
            case 77:
                return 76;
            case 78:
                return 77;
            case 79:
                return 78;
            case 80:
                return 79;
            case 81:
                return 90;
            case 82:
                return 91;
            case 83:
                return 102;
            case 84:
                return 93;
            case 85:
                return 94;
            case com.spotify.metadata.classic.proto.Metadata$Episode.RSS_GUID_FIELD_NUMBER /* 86 */:
                return 103;
            case 87:
                return 96;
            case com.spotify.metadata.classic.proto.Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
                return 97;
            case 89:
                return 98;
            case 90:
                return 99;
            case 91:
                return 100;
            case 92:
                return 101;
            case 93:
                return 104;
            case 94:
                return 105;
            case 95:
                return Error.INVALID_COUNTRY_FIELD_NUMBER;
            case 96:
                return Error.TOO_YOUNG_FIELD_NUMBER;
            case Metadata$Episode.IS_PODCAST_SHORT_FIELD_NUMBER /* 97 */:
                return 108;
            case 98:
                return 109;
            case 99:
                return 110;
            case 100:
                return ContentType.SHORT_FORM_ON_DEMAND;
            case 101:
                return ContentType.LONG_FORM_ON_DEMAND;
            case 102:
                return ContentType.LIVE;
            case 103:
                return 114;
            case 104:
                return 115;
            case 105:
                return 116;
            case Error.INVALID_COUNTRY_FIELD_NUMBER /* 106 */:
                return 117;
            case Error.TOO_YOUNG_FIELD_NUMBER /* 107 */:
                return 118;
            case 108:
                return 119;
            case 109:
                return 120;
            case 110:
                return ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND;
            case ContentType.SHORT_FORM_ON_DEMAND /* 111 */:
                return ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND;
            case ContentType.LONG_FORM_ON_DEMAND /* 112 */:
                return ContentType.USER_GENERATED_LIVE;
            case ContentType.LIVE /* 113 */:
                return 124;
            case 114:
                return 125;
            case 115:
                return 145;
            case 116:
                return 146;
            case 117:
                return 126;
            case 118:
                return 147;
            case 119:
                return 127;
            case 120:
                return 128;
            case ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND /* 121 */:
                return 129;
            case ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND /* 122 */:
                return 130;
            case ContentType.USER_GENERATED_LIVE /* 123 */:
                return 131;
            case 124:
                return 132;
            case 125:
                return 133;
            case 126:
                return 134;
            case 127:
                return 135;
            case 128:
                return 136;
            case 129:
                return 137;
            case 130:
                return 138;
            case 131:
                return 139;
            case 132:
                return 140;
            case 133:
                return 141;
            case 134:
                return 142;
            case 135:
                return 143;
            case 136:
                return 144;
            case 137:
                return 148;
            case 138:
                return 149;
            case 139:
                return 150;
            case 140:
                return 151;
            case 141:
                return 152;
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m51015c(int i, int i2, int i3) {
        return djf1.m36195v(i) + i2 + i3;
    }

    /* JADX INFO: renamed from: d */
    public static int m51016d(int i, int i2, int i3, int i4) {
        return djf1.m36195v(i) + i2 + i3 + i4;
    }

    /* JADX INFO: renamed from: e */
    public static HashMap m51017e(Class cls, iqf1 iqf1Var) {
        HashMap map = new HashMap();
        map.put(cls, iqf1Var);
        return map;
    }

    /* JADX INFO: renamed from: f */
    public static v8f1 m51018f(HashMap map, int i) {
        Collections.unmodifiableMap(new HashMap(map));
        return new v8f1(i);
    }

    /* JADX INFO: renamed from: g */
    public static iqf1 m51019g(HashMap map, int i) {
        Collections.unmodifiableMap(new HashMap(map));
        return new iqf1(i);
    }

    /* JADX INFO: renamed from: h */
    public static void m51020h(HashMap map) {
        Collections.unmodifiableMap(new HashMap(map));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m51021i(gnf1 gnf1Var) {
        if (gnf1Var != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m51022j(ytf1 ytf1Var) {
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: k */
    public static void m51023k(d9h1 d9h1Var) {
        boolean zIsTerminated;
        ExecutorService executorService = d9h1Var.f46837a;
        if (d9h1Var == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        d9h1Var.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    d9h1Var.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: l */
    public static int m51024l(int i, int i2, int i3) {
        return (djf1.m36194M(i) * i2) + i3;
    }

    /* JADX INFO: renamed from: m */
    public static int m51025m(int i, int i2, int i3, int i4) {
        return v0g1.m84377P(i) + i2 + i3 + i4;
    }

    /* JADX INFO: renamed from: n */
    public static int m51026n(int i, int i2, int i3) {
        return v0g1.m84377P(i) + i2 + i3;
    }

    /* JADX INFO: renamed from: o */
    public static int m51027o(int i, int i2, int i3, int i4) {
        return oah1.m66551W(i) + i2 + i3 + i4;
    }

    /* JADX INFO: renamed from: p */
    public static int m51028p(int i, int i2, int i3) {
        return zzsc.zzz(i) + i2 + i3;
    }

    /* JADX INFO: renamed from: q */
    public static int m51029q(int i, int i2, int i3) {
        int i4 = i / i2;
        return i4 + i4 + i3;
    }

    /* JADX INFO: renamed from: r */
    public static int m51030r(int i, int i2, int i3) {
        return oah1.m66551W(i) + i2 + i3;
    }
}
