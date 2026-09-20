package p204p;

import com.spotify.highlightsstats.data.proto.sharing.p074v1.ShareHighlightRequest;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes7.dex */
public final class uw20 {

    /* JADX INFO: renamed from: a */
    public final kw20 f234547a;

    public uw20(kw20 kw20Var) {
        this.f234547a = kw20Var;
    }

    /* JADX INFO: renamed from: a */
    public final Single m84082a(String str, boolean z) {
        kw20 kw20Var = this.f234547a;
        kw20Var.getClass();
        zy61 zy61Var = z ? zy61.TEMPLATE_VERSION_V2 : zy61.TEMPLATE_VERSION_V1;
        lw20 lw20Var = kw20Var.f126997a;
        js01 js01VarM11307q = ShareHighlightRequest.m11307q();
        js01VarM11307q.m54203m(str);
        js01VarM11307q.m54205r(tg1.m80715e());
        js01VarM11307q.m54204q(zy61Var);
        return lw20Var.m60092b((ShareHighlightRequest) js01VarM11307q.build());
    }
}
