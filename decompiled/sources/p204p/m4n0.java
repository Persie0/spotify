package p204p;

import com.spotify.messages.PartnerBannerSessionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m4n0 {

    /* JADX INFO: renamed from: a */
    public final qre0 f139996a;

    public m4n0(qre0 qre0Var) {
        this.f139996a = qre0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m60814a(String str, String str2, long j, String str3, List list, String str4) {
        l4n0 l4n0VarM14337u = PartnerBannerSessionEvent.m14337u();
        l4n0VarM14337u.m58181q(str);
        l4n0VarM14337u.m58184t("end");
        l4n0VarM14337u.m58183s(str2);
        l4n0VarM14337u.m58185u(j);
        l4n0VarM14337u.m58186v(str3);
        l4n0VarM14337u.m58180m(list);
        l4n0VarM14337u.m58182r(str4);
        this.f139996a.m73616a(l4n0VarM14337u.build());
    }
}
