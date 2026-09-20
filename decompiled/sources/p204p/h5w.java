package p204p;

import io.reactivex.rxjava3.core.Single;
import java.util.List;
import spotify.mdata.proto.Mdata$LocalBatchedEntityRequest;
import spotify.mdata.proto.Mdata$LocalExtensionQuery;

/* JADX INFO: loaded from: classes6.dex */
public final class h5w {

    /* JADX INFO: renamed from: a */
    public final u9f0 f87915a;

    /* JADX INFO: renamed from: b */
    public final xpx f87916b;

    public h5w(u9f0 u9f0Var, xpx xpxVar) {
        this.f87915a = u9f0Var;
        this.f87916b = xpxVar;
    }

    /* JADX INFO: renamed from: a */
    public final Single m46699a(List list) {
        y4d0 y4d0VarM97627o = Mdata$LocalBatchedEntityRequest.m97627o();
        z4d0 z4d0VarM97637q = Mdata$LocalExtensionQuery.m97637q();
        z4d0VarM97637q.m95345r(ntx.EPISODE_V4);
        z4d0VarM97637q.m95343m(list);
        y4d0VarM97627o.m92812q((Mdata$LocalExtensionQuery) z4d0VarM97637q.build());
        return this.f87915a.m82604a((Mdata$LocalBatchedEntityRequest) y4d0VarM97627o.build()).flatMap(new g5w(this));
    }
}
