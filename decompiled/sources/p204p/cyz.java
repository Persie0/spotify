package p204p;

import com.spotify.cosmos.cosmos.Request;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes2.dex */
public interface cyz {
    @fb20(hasBody = true, method = Request.DELETE, path = "socialgraph/v2/dismissed?format=json")
    /* JADX INFO: renamed from: a */
    Single<o2x0<p3x0>> m34399a(@h4a su61 su61Var);

    @j3m0("socialgraph/v2/counts?format=json")
    /* JADX INFO: renamed from: b */
    Single<fxk> m34400b(@h4a su61 su61Var);

    @fb20(hasBody = true, method = Request.DELETE, path = "socialgraph/v2/following?format=json")
    /* JADX INFO: renamed from: c */
    Single<o2x0<p3x0>> m34401c(@h4a su61 su61Var);

    @j3m0("socialgraph/v2/dismissed?format=json")
    /* JADX INFO: renamed from: d */
    Single<o2x0<p3x0>> m34402d(@h4a su61 su61Var);

    @j3m0("socialgraph/v2/following?format=json")
    /* JADX INFO: renamed from: e */
    Single<o2x0<p3x0>> m34403e(@h4a su61 su61Var);
}
