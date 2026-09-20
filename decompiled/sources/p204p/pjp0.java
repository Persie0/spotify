package p204p;

import android.content.Context;
import com.spotify.listplatform.sortingimpl.SortingModel;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class pjp0 implements njp0 {

    /* JADX INFO: renamed from: e */
    public static final fv31 f178294e = fv31.f73628b.m78183U("playlist");

    /* JADX INFO: renamed from: a */
    public final o3e0 f178295a;

    /* JADX INFO: renamed from: b */
    public final hv31 f178296b;

    /* JADX INFO: renamed from: c */
    public final wg61 f178297c;

    /* JADX INFO: renamed from: d */
    public final hk60 f178298d;

    public pjp0(Context context, String str, wb11 wb11Var, o3e0 o3e0Var) {
        this.f178295a = o3e0Var;
        wg61 wg61Var = new wg61(ojp0.f166110a);
        this.f178296b = wb11Var.mo35842b(context, str);
        this.f178297c = new wg61(new fyo0(this, 6));
        this.f178298d = ((p0i0) wg61Var.getValue()).m68703c(SortingModel.class);
    }

    /* JADX INFO: renamed from: a */
    public final i490 m70161a(String str) {
        Map map;
        String str2;
        i490 i490Var = (i490) this.f178295a.invoke(str);
        s9k s9kVarM55351k = k47.m55351k(str);
        return (s9kVarM55351k == null || (map = ((SortingModel) this.f178297c.getValue()).f5116a) == null || (str2 = (String) map.get(s9kVarM55351k)) == null) ? i490Var : ysj0.m94497l(str2, null);
    }
}
