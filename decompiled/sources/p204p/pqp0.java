package p204p;

import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.ItemExtensionPolicy;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class pqp0 implements nqp0 {

    /* JADX INFO: renamed from: d */
    public static final st80 f180357d;

    /* JADX INFO: renamed from: a */
    public final wt80 f180358a;

    /* JADX INFO: renamed from: b */
    public final z6g0 f180359b;

    /* JADX INFO: renamed from: c */
    public final String f180360c;

    static {
        Set setM29624m1 = bk5.m29624m1(new nt80[]{us80.f233558a, zs80.f285887a, at80.f19613a});
        qt80 qt80Var = new qt80(bk5.m29624m1(new in80[]{in80.f103921b, in80.f103923d, in80.f103926g}));
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        bjp0 bjp0VarM18365h0 = PlaylistDecorationPolicy.m18365h0();
        bjp0VarM18365h0.m29495G();
        bjp0VarM18365h0.m29496H();
        bjp0VarM18365h0.m29506R();
        bjp0VarM18365h0.m29530t();
        top0VarM18421v.m81216x(bjp0VarM18365h0);
        qjp0 qjp0VarM18379C = PlaylistEpisodeDecorationPolicy.m18379C();
        qjp0VarM18379C.m72948z(ShowDecorationPolicy.newBuilder().setLink(true));
        qjp0VarM18379C.m72941s(EpisodeDecorationPolicy.newBuilder().setLink(true));
        top0VarM18421v.m81212t(qjp0VarM18379C);
        ktp0 ktp0VarM18427E = PlaylistTrackDecorationPolicy.m18427E();
        ktp0VarM18427E.m57346D(TrackDecorationPolicy.newBuilder().setLink(true));
        top0VarM18421v.m81218z(ktp0VarM18427E);
        amp0 amp0VarM18396H = PlaylistItemDecorationPolicy.m18396H();
        amp0VarM18396H.m26433D(true);
        vr50 vr50VarM18316q = ItemExtensionPolicy.m18316q();
        vr50VarM18316q.m86274r(hn80.SHOW);
        vr50VarM18316q.m86272m(ntx.SHOW_V4);
        amp0VarM18396H.m26434m(Collections.singletonList(vr50VarM18316q.build()));
        top0VarM18421v.m81213u((PlaylistItemDecorationPolicy) amp0VarM18396H.build());
        f180357d = new st80((PlaylistRequestDecorationPolicy) top0VarM18421v.build(), null, setM29624m1, false, qt80Var, a5u0.f12598a, null, 0, null, 458);
    }

    public pqp0(wt80 wt80Var, wrf0 wrf0Var, z6g0 z6g0Var, String str) {
        this.f180358a = wt80Var;
        this.f180359b = z6g0Var;
        this.f180360c = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m70687b(pqp0 pqp0Var, qu80 qu80Var, ibk ibkVar) {
        oqp0 oqp0Var;
        if (ibkVar instanceof oqp0) {
            oqp0Var = (oqp0) ibkVar;
            int i = oqp0Var.f168335d;
            if ((i & Integer.MIN_VALUE) != 0) {
                oqp0Var.f168335d = i - Integer.MIN_VALUE;
            } else {
                oqp0Var = new oqp0(pqp0Var, ibkVar);
            }
        } else {
            oqp0Var = new oqp0(pqp0Var, ibkVar);
        }
        Object objM86755t = oqp0Var.f168333b;
        int i2 = oqp0Var.f168335d;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            fiz fizVar = pqp0Var.f180359b.f279870a;
            oqp0Var.f168332a = qu80Var;
            oqp0Var.f168335d = 1;
            objM86755t = vyf1.m86755t(fizVar, oqp0Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qu80Var = oqp0Var.f168332a;
            bga.m29073P(objM86755t);
        }
        return Boolean.valueOf(((uvf0) objM86755t).m84056b() && wrf0.m88858b(qu80Var.f192599e.f271272q));
    }

    @Override // p204p.lbz0
    /* JADX INFO: renamed from: c */
    public final Single mo41414c() {
        return vjf1.m85770t(dau.f47107a, new iso0(this, null, 9));
    }

    @Override // p204p.lbz0
    /* JADX INFO: renamed from: d */
    public final String mo41415d() {
        throw null;
    }
}
