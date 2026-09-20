package p204p;

import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;

/* JADX INFO: loaded from: classes9.dex */
public final class poz0 implements dut {

    /* JADX INFO: renamed from: t */
    public static final PlaylistRequestDecorationPolicy f179830t;

    /* JADX INFO: renamed from: a */
    public final String f179831a;

    /* JADX INFO: renamed from: b */
    public final String f179832b;

    /* JADX INFO: renamed from: c */
    public final eh00 f179833c;

    /* JADX INFO: renamed from: d */
    public final ksn f179834d;

    /* JADX INFO: renamed from: e */
    public final wt80 f179835e;

    /* JADX INFO: renamed from: f */
    public final wg61 f179836f = new wg61(new ohy0(this, 15));

    /* JADX INFO: renamed from: g */
    public final xiz f179837g = axf1.m27398m(new ooz0(this, 0), new ooz0(this, 1), new iox0(this, 16), null, null, 24);

    /* JADX INFO: renamed from: h */
    public final cph f179838h;

    /* JADX INFO: renamed from: i */
    public final j2a1 f179839i;

    static {
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        amp0 amp0VarM18396H = PlaylistItemDecorationPolicy.m18396H();
        amp0VarM18396H.m26440v();
        top0VarM18421v.m81213u((PlaylistItemDecorationPolicy) amp0VarM18396H.build());
        ktp0 ktp0VarM18427E = PlaylistTrackDecorationPolicy.m18427E();
        ktp0VarM18427E.m57345C();
        top0VarM18421v.m81217y((PlaylistTrackDecorationPolicy) ktp0VarM18427E.build());
        qjp0 qjp0VarM18379C = PlaylistEpisodeDecorationPolicy.m18379C();
        qjp0VarM18379C.m72936B();
        top0VarM18421v.m81211s((PlaylistEpisodeDecorationPolicy) qjp0VarM18379C.build());
        f179830t = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
    }

    public poz0(String str, String str2, eh00 eh00Var, ksn ksnVar, wt80 wt80Var, m57 m57Var) {
        this.f179831a = str;
        this.f179832b = str2;
        this.f179833c = eh00Var;
        this.f179834d = ksnVar;
        this.f179835e = wt80Var;
        fyf fyfVar = new fyf(new fqv0(this, 29), true, -1393535174);
        wpi0 wpi0Var = xwt.f266743a;
        this.f179838h = new cph(fyfVar, 3);
        this.f179839i = new j2a1();
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f179839i;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f179838h;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f179837g;
    }
}
