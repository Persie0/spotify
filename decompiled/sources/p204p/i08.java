package p204p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class i08 implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f97154a;

    /* JADX INFO: renamed from: b */
    public List f97155b;

    public /* synthetic */ i08(int i, List list) {
        this.f97154a = i;
        this.f97155b = list;
    }

    /* JADX INFO: renamed from: a */
    public j08 m49307a() {
        List list = this.f97155b;
        if (list != null) {
            return new j08(list);
        }
        throw new IllegalStateException("Missing required properties: rolloutAssignments");
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f97154a) {
            case 1:
                return kkc0.m56705r0(g6f.m43746s1(this.f97155b, ((CollectionPlatformEsperantoContainsResponse) obj).m6873o().m6864p()));
            default:
                return this.f97155b;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m49308b(List list) {
        if (list == null) {
            throw new NullPointerException("Null rolloutAssignments");
        }
        this.f97155b = list;
    }

    /* JADX INFO: renamed from: c */
    public ArrayList m49309c(hz80 hz80Var) {
        List list = this.f97155b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((mr31) obj).mo25368e(hz80Var)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public i08() {
        this.f97154a = 0;
    }
}
