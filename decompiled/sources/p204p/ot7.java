package p204p;

import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import spotify.autodownload.esperanto.proto.DecoratedFollowedShowsRequest;
import spotify.autodownload.esperanto.proto.DecoratedFollowedShowsResponse;
import spotify.autodownload.esperanto.proto.DecoratedShow;
import spotify.autodownload.esperanto.proto.EpisodeLimitRequest;

/* JADX INFO: loaded from: classes5.dex */
public final class ot7 {

    /* JADX INFO: renamed from: a */
    public final mt7 f168989a;

    /* JADX INFO: renamed from: b */
    public final epx f168990b;

    public ot7(mt7 mt7Var, epx epxVar) {
        this.f168989a = mt7Var;
        this.f168990b = epxVar;
    }

    /* JADX INFO: renamed from: a */
    public static final ua01 m67769a(ot7 ot7Var, DecoratedFollowedShowsResponse decoratedFollowedShowsResponse, Map map, b450 b450Var) {
        int i = b450Var.f278778a;
        int iM97400o = (i == 0 && decoratedFollowedShowsResponse.m97400o() == 0) ? 0 : decoratedFollowedShowsResponse.m97399n() == 0 ? decoratedFollowedShowsResponse.m97400o() + i : decoratedFollowedShowsResponse.m97399n() + b450Var.f278779b + 1;
        ae50<DecoratedShow> ae50VarM97401p = decoratedFollowedShowsResponse.m97401p();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM97401p, 10));
        for (DecoratedShow decoratedShow : ae50VarM97401p) {
            String uri = decoratedShow.getUri();
            String strM97404p = decoratedShow.m97404p();
            String title = decoratedShow.getTitle();
            String publisher = decoratedShow.getPublisher();
            boolean zM97402n = decoratedShow.m97402n();
            boolean zM97403o = decoratedShow.m97403o();
            rhj rhjVar = (rhj) map.get(decoratedShow.getUri());
            if (rhjVar == null) {
                rhjVar = rhj.f199233a;
            }
            arrayList.add(new ak11(uri, strM97404p, title, publisher, zM97402n, zM97403o, rhjVar != rhj.f199235c || decoratedShow.m97405q()));
        }
        return new ua01(i, iM97400o, b450Var, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final Observable m67770b(b450 b450Var) {
        int size;
        rro rroVarM97397p = DecoratedFollowedShowsRequest.m97397p();
        rroVarM97397p.m76293q(b450Var.f278778a);
        if (b450Var instanceof Collection) {
            size = ((Collection) b450Var).size();
        } else {
            Iterator it = b450Var.iterator();
            int i = 0;
            while (((a450) it).f12141c) {
                ((t350) it).next();
                i++;
                if (i < 0) {
                    h6f.m46721R();
                    throw null;
                }
            }
            size = i;
        }
        rroVarM97397p.m76292m(size);
        return this.f168989a.callStream("spotify.autodownload_esperanto.proto.AutoDownloadService", "StreamDecoratedFollowedShows", (DecoratedFollowedShowsRequest) rroVarM97397p.build()).map(uwk.f234692t).switchMap(new nt7(0, this, b450Var));
    }

    /* JADX INFO: renamed from: c */
    public final Observable m67771c() {
        q3w q3wVarM97414o = EpisodeLimitRequest.m97414o();
        q3wVarM97414o.m72130m();
        return this.f168989a.callStream("spotify.autodownload_esperanto.proto.AutoDownloadService", "StreamEpisodeLimit", (EpisodeLimitRequest) q3wVarM97414o.build()).map(crs.f41403t).map(nwh0.f159184t);
    }
}
