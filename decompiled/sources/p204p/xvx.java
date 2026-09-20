package p204p;

import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xvx {
    /* JADX INFO: renamed from: a */
    public static final ArrayList m92258a(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            esf esfVar = (esf) it.next();
            ArrayList arrayList2 = esfVar.f62352b;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (linkedHashSet.add(((pvf) obj).f181734c)) {
                    arrayList3.add(obj);
                }
            }
            arrayList.add(new esf(esfVar.f62351a, arrayList3));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: b */
    public static final Serializable m92259b(String str, ibk ibkVar, wt80 wt80Var) {
        uux uuxVar;
        if (ibkVar instanceof uux) {
            uuxVar = (uux) ibkVar;
            int i = uuxVar.f234295b;
            if ((i & Integer.MIN_VALUE) != 0) {
                uuxVar.f234295b = i - Integer.MIN_VALUE;
            } else {
                uuxVar = new uux(ibkVar);
            }
        } else {
            uuxVar = new uux(ibkVar);
        }
        Object objM62841f = uuxVar.f234294a;
        int i2 = uuxVar.f234295b;
        if (i2 == 0) {
            bga.m29073P(objM62841f);
            top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
            qjp0 qjp0VarM18379C = PlaylistEpisodeDecorationPolicy.m18379C();
            qjp0VarM18379C.m72941s(EpisodeDecorationPolicy.newBuilder().setLink(true));
            top0VarM18421v.m81212t(qjp0VarM18379C);
            PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
            wj50.m88279p(playlistRequestDecorationPolicy);
            st80 st80Var = new st80(playlistRequestDecorationPolicy, null, null, false, null, a5u0.f12598a, null, 0, null, 478);
            uuxVar.f234295b = 1;
            objM62841f = ((mu80) wt80Var).m62841f(str, st80Var, uuxVar);
            yuk yukVar = yuk.f276404a;
            if (objM62841f == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM62841f);
        }
        qu80 qu80Var = (qu80) ((p2x0) objM62841f).m68970c();
        if (qu80Var == null) {
            return lau.f131415a;
        }
        List list = qu80Var.f192598d;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((nw80) it.next()).f159049c);
        }
        return arrayList;
    }
}
