package p204p;

import com.spotify.cosmos.util.proto.Extension;
import com.spotify.cosmos.util.proto.ShowMetadata;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class u7s0 implements r7s0 {

    /* JADX INFO: renamed from: d */
    public static final u0q0 f227746d;

    /* JADX INFO: renamed from: a */
    public final x0q0 f227747a;

    /* JADX INFO: renamed from: b */
    public final mr11 f227748b;

    /* JADX INFO: renamed from: c */
    public final xpx f227749c;

    static {
        Boolean bool = Boolean.TRUE;
        f227746d = new u0q0(kkc0.m56695h0(new pqm0("length", bool), new pqm0("timeLeft", bool), new pqm0("isPlayed", bool)), null, null, null, null, 247);
    }

    public u7s0(x0q0 x0q0Var, mr11 mr11Var, xpx xpxVar) {
        this.f227747a = x0q0Var;
        this.f227748b = mr11Var;
        this.f227749c = xpxVar;
    }

    /* JADX INFO: renamed from: a */
    public static final upx m82547a(u7s0 u7s0Var, ShowMetadata showMetadata) {
        xpx xpxVar = u7s0Var.f227749c;
        List<Extension> extensionList = showMetadata.getExtensionList();
        ArrayList arrayList = new ArrayList(i6f.m49804T(extensionList, 10));
        for (Extension extension : extensionList) {
            arrayList.add(new ptx(extension.getData().m45891s(), extension.getExtensionKind().getNumber()));
        }
        return xpxVar.m91727a(arrayList);
    }

    @Override // p204p.r7s0
    /* JADX INFO: renamed from: b */
    public final Observable mo74958b(Set set) {
        return set.isEmpty() ? Observable.just(nau.f152117a) : Observable.merge(Observable.defer(new ve0(14, set, this)).map(mmq0.f145221d), Observable.defer(new t7s0(set, this)).map(new ezk0(this, 25))).onErrorReturn(new e06(2, set));
    }
}
