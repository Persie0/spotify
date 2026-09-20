package p204p;

import io.reactivex.rxjava3.core.Single;
import java.util.List;
import spotify.mdata.proto.Mdata$LocalBatchedEntityRequest;
import spotify.mdata.proto.Mdata$LocalExtensionQuery;

/* JADX INFO: loaded from: classes2.dex */
public final class ak81 {

    /* JADX INFO: renamed from: a */
    public final u9f0 f16460a;

    /* JADX INFO: renamed from: b */
    public final xpx f16461b;

    public ak81(u9f0 u9f0Var, xpx xpxVar) {
        this.f16460a = u9f0Var;
        this.f16461b = xpxVar;
    }

    /* JADX INFO: renamed from: a */
    public final Single m26202a(List list) {
        y4d0 y4d0VarM97627o = Mdata$LocalBatchedEntityRequest.m97627o();
        z4d0 z4d0VarM97637q = Mdata$LocalExtensionQuery.m97637q();
        z4d0VarM97637q.m95345r(ntx.ORIGINAL_VIDEO);
        z4d0VarM97637q.m95343m(list);
        y4d0VarM97627o.m92812q((Mdata$LocalExtensionQuery) z4d0VarM97637q.build());
        return this.f16460a.m82604a((Mdata$LocalBatchedEntityRequest) y4d0VarM97627o.build()).map(new zj81(this));
    }
}
