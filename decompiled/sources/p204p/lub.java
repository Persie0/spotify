package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingState;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class lub extends mif1 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f137044j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f137045k;

    public /* synthetic */ lub(Object obj, int i) {
        this.f137044j = i;
        this.f137045k = obj;
    }

    @Override // p204p.mif1
    /* JADX INFO: renamed from: f */
    public final void mo25449f(ezx0 ezx0Var, Object obj) {
        String str;
        switch (this.f137044j) {
            case 0:
                kpe0 kpe0Var = (kpe0) obj;
                ezx0Var.mo24842R(1, kpe0Var.f125049a);
                CappingState cappingState = kpe0Var.f125050b;
                kub kubVar = (kub) ((nub) this.f137045k).f158553c.getValue();
                kubVar.getClass();
                byte[] bArrM92670b = null;
                if (cappingState != null) {
                    try {
                        bArrM92670b = kubVar.f126498a.m92670b(CappingState.INSTANCE.serializer(), cappingState);
                    } catch (Exception e) {
                        Logger.m3966b(edb.m38564m("ClientMessagingPlatform: Error encoding capping: ", e.getMessage()), new Object[0]);
                    }
                }
                if (bArrM92670b == null) {
                    ezx0Var.mo24847v(2);
                    return;
                } else {
                    ezx0Var.mo24845q(bArrM92670b, 2);
                    return;
                }
            case 1:
                a5b a5bVar = (a5b) obj;
                wg61 wg61Var = ((drq) this.f137045k).f52378c;
                rl51 rl51Var = (rl51) wg61Var.getValue();
                Set set = a5bVar.f12478a;
                rl51Var.getClass();
                String strM41881b = "";
                ezx0Var.mo24842R(1, (set == null || set.isEmpty()) ? "" : rl51Var.f200222a.m41881b(rl51Var.f200223b, set));
                rl51 rl51Var2 = (rl51) wg61Var.getValue();
                Set set2 = a5bVar.f12479b;
                rl51Var2.getClass();
                if (set2 != null && !set2.isEmpty()) {
                    strM41881b = rl51Var2.f200222a.m41881b(rl51Var2.f200223b, set2);
                }
                ezx0Var.mo24842R(2, strM41881b);
                ezx0Var.mo24846u(3, a5bVar.f12480c);
                return;
            case 2:
                a4y a4yVar = (a4y) obj;
                ezx0Var.mo24842R(1, a4yVar.f12347a);
                v2z v2zVar = (v2z) ((z3y) this.f137045k).f279058c.getValue();
                ezx0Var.mo24842R(2, v2zVar.f236736a.m41881b(v2zVar.f236737b, a4yVar.f12348b));
                ezx0Var.mo24846u(3, a4yVar.f12349c);
                ezx0Var.mo24846u(4, a4yVar.f12350d);
                return;
            case 3:
                g4y g4yVar = (g4y) obj;
                ezx0Var.mo24842R(1, g4yVar.f76548a);
                v2z v2zVar2 = (v2z) ((f4y) this.f137045k).f65853c.getValue();
                ezx0Var.mo24842R(2, v2zVar2.f236736a.m41881b(v2zVar2.f236737b, g4yVar.f76549b));
                ezx0Var.mo24846u(3, g4yVar.f76550c);
                ezx0Var.mo24846u(4, g4yVar.f76551d);
                return;
            case 4:
                wz20 wz20Var = (wz20) obj;
                vx20 vx20Var = (vx20) this.f137045k;
                ezx0Var.mo24842R(1, wz20Var.f256442a);
                ezx0Var.mo24842R(2, wz20Var.f256443b);
                String str2 = wz20Var.f256444c;
                if (str2 == null) {
                    ezx0Var.mo24847v(3);
                } else {
                    ezx0Var.mo24842R(3, str2);
                }
                String str3 = wz20Var.f256445d;
                if (str3 == null) {
                    ezx0Var.mo24847v(4);
                } else {
                    ezx0Var.mo24842R(4, str3);
                }
                String str4 = wz20Var.f256446e;
                if (str4 == null) {
                    ezx0Var.mo24847v(5);
                } else {
                    ezx0Var.mo24842R(5, str4);
                }
                switch (edb.m38547C(wz20Var.f256447f)) {
                    case 0:
                        str = "ALBUM";
                        break;
                    case 1:
                        str = "ARTIST";
                        break;
                    case 2:
                        str = "AUDIOBOOK";
                        break;
                    case 3:
                        str = "AUDIO_EPISODE";
                        break;
                    case 4:
                        str = "AUDIO_SHOW";
                        break;
                    case 5:
                        str = "GENRE";
                        break;
                    case 6:
                        str = "PLAYLIST";
                        break;
                    case 7:
                        str = "PROFILE";
                        break;
                    case 8:
                        str = "TRACK";
                        break;
                    case 9:
                        str = "AUTHOR";
                        break;
                    case 10:
                        str = "CONCERT";
                        break;
                    case 11:
                        str = "VENUE";
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                ezx0Var.mo24842R(6, str);
                Boolean bool = wz20Var.f256448g;
                Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    ezx0Var.mo24847v(7);
                } else {
                    ezx0Var.mo24846u(7, numValueOf.intValue());
                }
                String str5 = wz20Var.f256449h;
                if (str5 == null) {
                    ezx0Var.mo24847v(8);
                } else {
                    ezx0Var.mo24842R(8, str5);
                }
                Boolean bool2 = wz20Var.f256450i;
                Integer numValueOf2 = bool2 != null ? Integer.valueOf(bool2.booleanValue() ? 1 : 0) : null;
                if (numValueOf2 == null) {
                    ezx0Var.mo24847v(9);
                } else {
                    ezx0Var.mo24846u(9, numValueOf2.intValue());
                }
                Boolean bool3 = wz20Var.f256451j;
                Integer numValueOf3 = bool3 != null ? Integer.valueOf(bool3.booleanValue() ? 1 : 0) : null;
                if (numValueOf3 == null) {
                    ezx0Var.mo24847v(10);
                } else {
                    ezx0Var.mo24846u(10, numValueOf3.intValue());
                }
                List list = wz20Var.f256452k;
                ml51 ml51Var = (ml51) vx20Var.f245609c.getValue();
                ml51Var.getClass();
                ezx0Var.mo24842R(11, (list == null || list.isEmpty()) ? "" : ml51Var.f144759a.m41881b(ml51Var.f144760b, list));
                ezx0Var.mo24846u(12, wz20Var.f256453l);
                Boolean bool4 = wz20Var.f256454m;
                Integer numValueOf4 = bool4 != null ? Integer.valueOf(bool4.booleanValue() ? 1 : 0) : null;
                if (numValueOf4 == null) {
                    ezx0Var.mo24847v(13);
                } else {
                    ezx0Var.mo24846u(13, numValueOf4.intValue());
                }
                Boolean bool5 = wz20Var.f256455n;
                Integer numValueOf5 = bool5 != null ? Integer.valueOf(bool5.booleanValue() ? 1 : 0) : null;
                if (numValueOf5 == null) {
                    ezx0Var.mo24847v(14);
                    return;
                } else {
                    ezx0Var.mo24846u(14, numValueOf5.intValue());
                    return;
                }
            case 5:
                wg40 wg40Var = (wg40) obj;
                ezx0Var.mo24842R(1, wg40Var.f250970a);
                ezx0Var.mo24842R(2, vg40.m85391a((vg40) this.f137045k, wg40Var.f250971b));
                ezx0Var.mo24843Y(wg40Var.f250972c);
                String str6 = wg40Var.f250973d;
                if (str6 == null) {
                    ezx0Var.mo24847v(4);
                } else {
                    ezx0Var.mo24842R(4, str6);
                }
                String str7 = wg40Var.f250974e;
                if (str7 == null) {
                    ezx0Var.mo24847v(5);
                } else {
                    ezx0Var.mo24842R(5, str7);
                }
                String str8 = wg40Var.f250975f;
                if (str8 == null) {
                    ezx0Var.mo24847v(6);
                } else {
                    ezx0Var.mo24842R(6, str8);
                }
                String str9 = wg40Var.f250976g;
                if (str9 == null) {
                    ezx0Var.mo24847v(7);
                } else {
                    ezx0Var.mo24842R(7, str9);
                }
                Integer num = wg40Var.f250977h;
                if (num == null) {
                    ezx0Var.mo24847v(8);
                } else {
                    ezx0Var.mo24846u(8, num.intValue());
                }
                String str10 = wg40Var.f250978i;
                if (str10 == null) {
                    ezx0Var.mo24847v(9);
                } else {
                    ezx0Var.mo24842R(9, str10);
                }
                String str11 = wg40Var.f250979j;
                if (str11 == null) {
                    ezx0Var.mo24847v(10);
                } else {
                    ezx0Var.mo24842R(10, str11);
                }
                String str12 = wg40Var.f250980k;
                if (str12 == null) {
                    ezx0Var.mo24847v(11);
                } else {
                    ezx0Var.mo24842R(11, str12);
                }
                String str13 = wg40Var.f250981l;
                if (str13 == null) {
                    ezx0Var.mo24847v(12);
                } else {
                    ezx0Var.mo24842R(12, str13);
                }
                String str14 = wg40Var.f250982m;
                if (str14 == null) {
                    ezx0Var.mo24847v(13);
                } else {
                    ezx0Var.mo24842R(13, str14);
                }
                String str15 = wg40Var.f250983n;
                if (str15 == null) {
                    ezx0Var.mo24847v(14);
                    return;
                } else {
                    ezx0Var.mo24842R(14, str15);
                    return;
                }
            case 6:
                uj91 uj91Var = (uj91) obj;
                ezx0Var.mo24842R(1, uj91Var.f230947a);
                ezx0Var.mo24846u(2, uj91Var.f230948b);
                Message message = uj91Var.f230949c;
                pme0 pme0Var = (pme0) ((vve0) this.f137045k).f245223c.getValue();
                a2t0 a2t0Var = pme0Var.f179024b;
                byte[] bArrM92670b2 = null;
                if (message != null) {
                    try {
                        bArrM92670b2 = pme0Var.f179023a ? a2t0Var.m92670b(Message.INSTANCE.serializer(), message) : a2t0Var.m92670b(new x8q0(qpv0.f191387a.mo54112b(Message.class)), message);
                    } catch (Exception e2) {
                        Logger.m3966b(edb.m38564m("ClientMessagingPlatform: Error encoding message: ", e2.getMessage()), new Object[0]);
                    }
                }
                if (bArrM92670b2 == null) {
                    ezx0Var.mo24847v(3);
                    return;
                } else {
                    ezx0Var.mo24845q(bArrM92670b2, 3);
                    return;
                }
            case 7:
                tx31 tx31Var = (tx31) obj;
                ezx0Var.mo24842R(1, tx31Var.f224553a);
                v2z v2zVar3 = (v2z) ((sx31) this.f137045k).f214802c.getValue();
                ezx0Var.mo24842R(2, v2zVar3.f236736a.m41881b(v2zVar3.f236737b, tx31Var.f224554b));
                ezx0Var.mo24846u(3, tx31Var.f224555c);
                ezx0Var.mo24846u(4, tx31Var.f224556d);
                return;
            default:
                dy31 dy31Var = (dy31) obj;
                ezx0Var.mo24842R(1, dy31Var.f54161a);
                v2z v2zVar4 = (v2z) ((cy31) this.f137045k).f43151c.getValue();
                ezx0Var.mo24842R(2, v2zVar4.f236736a.m41881b(v2zVar4.f236737b, dy31Var.f54162b));
                ezx0Var.mo24842R(3, dy31Var.f54163c);
                ezx0Var.mo24842R(4, dy31Var.f54164d);
                ezx0Var.mo24842R(5, dy31Var.f54165e);
                ezx0Var.mo24846u(6, dy31Var.f54166f);
                ezx0Var.mo24846u(7, dy31Var.f54167g);
                return;
        }
    }

    @Override // p204p.mif1
    /* JADX INFO: renamed from: m */
    public final String mo25450m() {
        switch (this.f137044j) {
            case 0:
                return "INSERT OR REPLACE INTO `message_id_and_capping` (`messageKey`,`capping`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `cachedDenylist` (`package_names`,`app_signatures`,`timestamp`) VALUES (?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `ExternalizationDisabledFilterEntity` (`id`,`paths`,`revision`,`format`) VALUES (?,?,?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `ExternalizationEnabledFilterEntity` (`id`,`paths`,`revision`,`format`) VALUES (?,?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `history` (`uri`,`title`,`subtitle`,`image_uri`,`video_image_uri`,`type`,`explicit`,`preview_id`,`mogef19`,`disabled`,`artist_uris`,`timestamp`,`has_video`,`is_verified`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 5:
                return "INSERT INTO `import_records` (`uri`,`stateType`,`progress`,`failureReason`,`title`,`artist`,`album`,`durationSeconds`,`coverArtUri`,`fileUri`,`contentType`,`showUri`,`imageToken`,`episodeUri`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `messages` (`trigger`,`messageId`,`message`) VALUES (?,?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `SpecificDisabledFilterEntity` (`id`,`paths`,`revision`,`format`) VALUES (?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `SpecificEnabledFilterEntity` (`id`,`paths`,`brand`,`model`,`deviceFormattedName`,`revision`,`format`) VALUES (?,?,?,?,?,?,?)";
        }
    }
}
