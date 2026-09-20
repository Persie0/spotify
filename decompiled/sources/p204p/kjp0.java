package p204p;

import android.app.Activity;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.music.R;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import com.spotify.playlistmixing.proto.SetMixState;
import com.spotify.playlistmixing.proto.SignalData;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class kjp0 implements sgv {

    /* JADX INFO: renamed from: X */
    public final nbl f123394X;

    /* JADX INFO: renamed from: Y */
    public final boolean f123395Y;

    /* JADX INFO: renamed from: Z */
    public final st80 f123396Z;

    /* JADX INFO: renamed from: a */
    public final wt80 f123397a;

    /* JADX INFO: renamed from: b */
    public final yz80 f123398b;

    /* JADX INFO: renamed from: c */
    public final qkx0 f123399c;

    /* JADX INFO: renamed from: d */
    public final cx21 f123400d;

    /* JADX INFO: renamed from: e */
    public final rbl f123401e;

    /* JADX INFO: renamed from: f */
    public final epx f123402f;

    /* JADX INFO: renamed from: g */
    public final luk f123403g;

    /* JADX INFO: renamed from: h */
    public final luk f123404h;

    /* JADX INFO: renamed from: i */
    public final gcu0 f123405i;

    /* JADX INFO: renamed from: t */
    public final v5g0 f123406t;

    public kjp0(wt80 wt80Var, yz80 yz80Var, qkx0 qkx0Var, cx21 cx21Var, rbl rblVar, epx epxVar, luk lukVar, luk lukVar2, gcu0 gcu0Var, v5g0 v5g0Var, nbl nblVar) {
        this.f123397a = wt80Var;
        this.f123398b = yz80Var;
        this.f123399c = qkx0Var;
        this.f123400d = cx21Var;
        this.f123401e = rblVar;
        this.f123402f = epxVar;
        this.f123403g = lukVar;
        this.f123404h = lukVar2;
        this.f123405i = gcu0Var;
        this.f123406t = v5g0Var;
        this.f123394X = nblVar;
        this.f123395Y = !nblVar.f152313e.isEmpty();
        i490 i490Var = nblVar.f152314f;
        Set setSingleton = Collections.singleton(ys80.f275721a);
        qt80 qt80Var = new qt80(bk5.m29624m1(new in80[]{in80.f103921b, in80.f103923d, in80.f103926g}));
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        amp0 amp0VarM18396H = PlaylistItemDecorationPolicy.m18396H();
        amp0VarM18396H.m26433D(true);
        top0VarM18421v.m81214v(amp0VarM18396H);
        ktp0 ktp0VarM18427E = PlaylistTrackDecorationPolicy.m18427E();
        ktp0VarM18427E.m57346D(TrackDecorationPolicy.newBuilder().setLink(true));
        top0VarM18421v.m81218z(ktp0VarM18427E);
        qjp0 qjp0VarM18379C = PlaylistEpisodeDecorationPolicy.m18379C();
        qjp0VarM18379C.m72941s(EpisodeDecorationPolicy.newBuilder().setLink(true));
        top0VarM18421v.m81212t(qjp0VarM18379C);
        this.f123396Z = new st80((PlaylistRequestDecorationPolicy) top0VarM18421v.build(), i490Var, setSingleton, false, qt80Var, a5u0.f12598a, null, 0, null, 456);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public static final Object m56613a(kjp0 kjp0Var, String str, pbl pblVar, ibk ibkVar) {
        fjp0 fjp0Var;
        if (ibkVar instanceof fjp0) {
            fjp0Var = (fjp0) ibkVar;
            int i = fjp0Var.f70337c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fjp0Var.f70337c = i - Integer.MIN_VALUE;
            } else {
                fjp0Var = new fjp0(kjp0Var, ibkVar);
            }
        } else {
            fjp0Var = new fjp0(kjp0Var, ibkVar);
        }
        fjp0 fjp0Var2 = fjp0Var;
        Object objM84720a = fjp0Var2.f70335a;
        int i2 = fjp0Var2.f70337c;
        if (i2 == 0) {
            bga.m29073P(objM84720a);
            v5g0 v5g0Var = kjp0Var.f123406t;
            String str2 = pblVar.f175867c;
            nbl nblVar = kjp0Var.f123394X;
            String str3 = nblVar.f152316h;
            String str4 = nblVar.f152317i;
            fjp0Var2.f70337c = 1;
            objM84720a = v5g0Var.m84720a(str, str2, str3, str4, rg61.f198850R0, fjp0Var2);
            yuk yukVar = yuk.f276404a;
            if (objM84720a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM84720a);
        }
        ((p2x0) objM84720a).m68971d();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Object m56614d(kjp0 kjp0Var, String str, ibk ibkVar) {
        ijp0 ijp0Var;
        if (ibkVar instanceof ijp0) {
            ijp0Var = (ijp0) ibkVar;
            int i = ijp0Var.f102863c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ijp0Var.f102863c = i - Integer.MIN_VALUE;
            } else {
                ijp0Var = new ijp0(kjp0Var, ibkVar);
            }
        } else {
            ijp0Var = new ijp0(kjp0Var, ibkVar);
        }
        Object obj = ijp0Var.f102861a;
        int i2 = ijp0Var.f102863c;
        if (i2 == 0) {
            bga.m29073P(obj);
            yz80 yz80Var = kjp0Var.f123398b;
            u121 u121VarM19433o = SignalData.m19433o();
            u121VarM19433o.m82191m();
            gva byteString = ((SignalData) u121VarM19433o.build()).toByteString();
            p501 p501VarM19426o = SetMixState.m19426o();
            p501VarM19426o.m69160m(true);
            List listSingletonList = Collections.singletonList(new rz80("mix-state", byteString, ((SetMixState) p501VarM19426o.build()).toByteString(), 8));
            List listSingletonList2 = Collections.singletonList("mix");
            ijp0Var.f102863c = 1;
            Object objM63324u = ((n090) yz80Var).m63324u(str, listSingletonList, listSingletonList2, ijp0Var);
            yuk yukVar = yuk.f276404a;
            if (objM63324u == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:41:0x011a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x011a -> B:42:0x0122). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: e */
    public static final java.io.Serializable m56615e(p204p.kjp0 r17, java.util.List r18, p204p.ibk r19) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.kjp0.m56615e(p.kjp0, java.util.List, p.ibk):java.io.Serializable");
    }

    @Override // p204p.sgv
    /* JADX INFO: renamed from: b */
    public final Object mo56616b(String str, a6l a6lVar) {
        return x0h1.m89557A(this.f123403g, new uyf0(this, str, (fbk) null, 11), a6lVar);
    }

    @Override // p204p.sgv
    /* JADX INFO: renamed from: c */
    public final void mo56617c(String str) {
        if (this.f123395Y && this.f123394X.f152309a) {
            cx21 cx21Var = this.f123400d;
            q831 q831Var = (q831) cx21Var.f42890c;
            Activity activity = (Activity) cx21Var.f42889b;
            g631 g631Var = new g631(null, activity.getString(R.string.toast_added_to_playlist, str), null, null, null, null, null, null, false);
            if (((k5m0) cx21Var.f42891d).mo55547g(activity)) {
                q831Var.m72307m(g631Var);
            } else {
                q831Var.m72305j(g631Var);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m56618f(List list, ibk ibkVar) {
        gjp0 gjp0Var;
        if (ibkVar instanceof gjp0) {
            gjp0Var = (gjp0) ibkVar;
            int i = gjp0Var.f80518c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gjp0Var.f80518c = i - Integer.MIN_VALUE;
            } else {
                gjp0Var = new gjp0(this, ibkVar);
            }
        } else {
            gjp0Var = new gjp0(this, ibkVar);
        }
        Object obj = gjp0Var.f80516a;
        int i2 = gjp0Var.f80518c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        Single map = ((jpx) this.f123402f).m53978b(new C1668ai("create-playlist", false, (gh00) new C2602y6(29, list))).filter(lby.f131766a1).firstOrError().map(qby.f187200Z0);
        gjp0Var.f80518c = 1;
        Object objM96567o = zn91.m96567o(map, gjp0Var);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }
}
