package p204p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class j8y0 {

    /* JADX INFO: renamed from: a */
    public final n93 f110045a;

    /* JADX INFO: renamed from: b */
    public final t4f f110046b;

    public j8y0(n93 n93Var, t4f t4fVar) {
        this.f110045a = n93Var;
        this.f110046b = t4fVar;
    }

    /* JADX INFO: renamed from: a */
    public static Completable m52714a(j8y0 j8y0Var, String str) {
        voc1 voc1Var = xoc1.f264216w1;
        n93 n93Var = j8y0Var.f110045a;
        List listSingletonList = Collections.singletonList(str);
        String str2 = voc1Var.f243453a;
        return n93Var.m63880c(listSingletonList, str2, str2, true, new f93(31, null)).ignoreElement();
    }

    /* JADX INFO: renamed from: b */
    public static Completable m52715b(j8y0 j8y0Var, String str) {
        voc1 voc1Var = xoc1.f264216w1;
        n93 n93Var = j8y0Var.f110045a;
        List listSingletonList = Collections.singletonList(str);
        String str2 = voc1Var.f243453a;
        return n93Var.m63880c(listSingletonList, str2, str2, false, new f93(31, null)).ignoreElement();
    }

    /* JADX INFO: renamed from: c */
    public final Observable m52716c(String str) {
        List listSingletonList = Collections.singletonList(str);
        r4f r4fVarM6889s = CollectionPlatformItemsRequest.m6889s();
        r4fVarM6889s.m74750t(r5f.CONCERTS);
        r4fVarM6889s.m74746m(listSingletonList);
        return this.f110046b.m80062c((CollectionPlatformItemsRequest) r4fVarM6889s.build()).map(new i08(1, listSingletonList)).map(new nch1(str, 9));
    }

    /* JADX INFO: renamed from: d */
    public final Observable m52717d() {
        r4f r4fVarM6889s = CollectionPlatformItemsRequest.m6889s();
        r4fVarM6889s.m74750t(r5f.CONCERTS);
        return this.f110046b.callStream("spotify.collection_platform_esperanto.proto.CollectionPlatformService", "StreamGet", (CollectionPlatformItemsRequest) r4fVarM6889s.build()).map(s0o0.f204441O0).map(blr0.f28274t);
    }
}
