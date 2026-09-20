package p204p;

import android.content.Intent;
import com.spotify.esperanto.esperanto.Transport;
import com.spotify.jam.internal.socialconnect.models.SessionUpdate;
import com.spotify.metadata.proto.Metadata$Artist;
import com.spotify.metadata.proto.Metadata$Track;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.puffin_esperanto.proto.PuffinErrorOuterClass$PuffinError;
import com.spotify.recently_played_esperanto.proto.GetRecentlyPlayedTracksResponse;
import com.spotify.show_esperanto.proto.GetUnfinishedEpisodesResponse;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xjr0 implements Function, w1j0, Predicate, com.spotify.mobius.functions.Function, Init, rwf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f262220a;

    /* JADX INFO: renamed from: b */
    public static final xjr0 f262211b = new xjr0(0);

    /* JADX INFO: renamed from: c */
    public static final xjr0 f262212c = new xjr0(1);

    /* JADX INFO: renamed from: d */
    public static final xjr0 f262213d = new xjr0(2);

    /* JADX INFO: renamed from: e */
    public static final xjr0 f262214e = new xjr0(3);

    /* JADX INFO: renamed from: f */
    public static final xjr0 f262215f = new xjr0(4);

    /* JADX INFO: renamed from: g */
    public static final xjr0 f262216g = new xjr0(5);

    /* JADX INFO: renamed from: h */
    public static final xjr0 f262217h = new xjr0(6);

    /* JADX INFO: renamed from: i */
    public static final xjr0 f262218i = new xjr0(8);

    /* JADX INFO: renamed from: t */
    public static final xjr0 f262219t = new xjr0(9);

    /* JADX INFO: renamed from: X */
    public static final xjr0 f262204X = new xjr0(10);

    /* JADX INFO: renamed from: Y */
    public static final xjr0 f262206Y = new xjr0(11);

    /* JADX INFO: renamed from: Z */
    public static final xjr0 f262208Z = new xjr0(12);

    /* JADX INFO: renamed from: L0 */
    public static final xjr0 f262192L0 = new xjr0(13);

    /* JADX INFO: renamed from: M0 */
    public static final xjr0 f262193M0 = new xjr0(14);

    /* JADX INFO: renamed from: N0 */
    public static final xjr0 f262194N0 = new xjr0(15);

    /* JADX INFO: renamed from: O0 */
    public static final xjr0 f262195O0 = new xjr0(16);

    /* JADX INFO: renamed from: P0 */
    public static final xjr0 f262196P0 = new xjr0(17);

    /* JADX INFO: renamed from: Q0 */
    public static final xjr0 f262197Q0 = new xjr0(18);

    /* JADX INFO: renamed from: R0 */
    public static final xjr0 f262198R0 = new xjr0(19);

    /* JADX INFO: renamed from: S0 */
    public static final xjr0 f262199S0 = new xjr0(20);

    /* JADX INFO: renamed from: T0 */
    public static final xjr0 f262200T0 = new xjr0(21);

    /* JADX INFO: renamed from: U0 */
    public static final xjr0 f262201U0 = new xjr0(22);

    /* JADX INFO: renamed from: V0 */
    public static final xjr0 f262202V0 = new xjr0(23);

    /* JADX INFO: renamed from: W0 */
    public static final xjr0 f262203W0 = new xjr0(24);

    /* JADX INFO: renamed from: X0 */
    public static final xjr0 f262205X0 = new xjr0(25);

    /* JADX INFO: renamed from: Y0 */
    public static final /* synthetic */ xjr0 f262207Y0 = new xjr0(26);

    /* JADX INFO: renamed from: Z0 */
    public static final xjr0 f262209Z0 = new xjr0(27);

    /* JADX INFO: renamed from: a1 */
    public static final xjr0 f262210a1 = new xjr0(28);

    public /* synthetic */ xjr0(int i) {
        this.f262220a = i;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m91251a(InterfaceC2609yd interfaceC2609yd) {
        return !interfaceC2609yd.mo76359a(7) || interfaceC2609yd.mo76361c();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f262220a) {
            case 0:
                return Boolean.valueOf(dxf1.m37222K((Map) obj));
            case 1:
            case 3:
            case 7:
            case 11:
            case 14:
            case 21:
            case 22:
            default:
                return (Transport) ((xul0) obj).mo49278b();
            case 2:
                byte[] bArr = (byte[]) obj;
                try {
                    return PuffinErrorOuterClass$PuffinError.m20005o(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.puffin_esperanto.proto.PuffinErrorOuterClass.PuffinError: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 4:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return GetRecentlyPlayedTracksResponse.m20236p(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.recently_played_esperanto.proto.GetRecentlyPlayedTracksResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 5:
                return hw90.f95892a;
            case 6:
                return Integer.valueOf(((oa80) obj).f163262a);
            case 8:
                return new i6y0(false);
            case 9:
                return (ContextTrack) ((xul0) obj).mo49278b();
            case 10:
                return ((e301) obj).f55571a;
            case 12:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return GetUnfinishedEpisodesResponse.m21218o(bArr3);
                } catch (Exception e3) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.show_esperanto.proto.GetUnfinishedEpisodesResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e3);
                }
            case 13:
                return ((k621) obj).f119629f;
            case 15:
                return new o221(false, false, false, ((Boolean) obj).booleanValue());
            case 16:
                return new hi31((SessionUpdate) obj);
            case 17:
                return String.valueOf(((Boolean) obj).booleanValue());
            case 18:
                return ((acv0) obj).f14467a;
            case 19:
                return ((ContextTrack) ((PlayerState) obj).track().mo49278b()).uri();
            case 20:
                Metadata$Track metadata$Track = (Metadata$Track) obj;
                String strM60172a = lx8.m60172a(metadata$Track.m15452r().m45891s());
                String strM60172a2 = lx8.m60172a(((Metadata$Artist) g6f.m43741q0(metadata$Track.getArtistList())).m15432r().m45891s());
                Set set = dd41.f47702f;
                if (strM60172a2.length() != 22) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (strM60172a.length() != 22) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                return new r1j0(r46.m74726U("spotify:artist:" + strM60172a2 + ":play:" + strM60172a));
            case 23:
                String strUri = ((ContextTrack) ((PlayerState) obj).track().mo49278b()).uri();
                Set set2 = dd41.f47702f;
                return Boolean.valueOf(r46.m74726U(strUri).f47709c == gn80.SHOW_EPISODE);
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        switch (this.f262220a) {
            case 22:
                return First.m15574b((ecb1) obj);
            default:
                v8e1 v8e1Var = (v8e1) obj;
                return First.m15575c(v8e1Var, Collections.singleton(new g7e1(v8e1Var.f238487a)));
        }
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        Set set = dd41.f47702f;
        String strM35694A = r46.m74726U(intent.getDataString()).m35694A();
        wj50.m88279p(strM35694A);
        return new u1j0(s0s0.class, new t0s0(strM35694A, e301Var.f55571a), uzq0.f235620a);
    }

    @Override // p204p.rwf
    /* JADX INFO: renamed from: h */
    public Object mo1885h(sef0 sef0Var) {
        return new y5i0(sef0Var.mo54439c(eht0.m39004a(x5i0.class)));
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f262220a) {
            case 3:
                float fFloatValue = ((Float) obj).floatValue();
                return !(fFloatValue >= 2.4f && fFloatValue <= 3.6f);
            case 11:
                return !((iqx) ((gqx) obj)).f104863f;
            case 14:
                return ((nj11) obj).f154419a;
            default:
                return !((iqx) ((gqx) obj)).f104863f;
        }
    }
}
