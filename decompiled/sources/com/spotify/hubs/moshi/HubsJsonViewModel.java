package com.spotify.hubs.moshi;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.util.List;
import p204p.fk30;
import p204p.gk60;
import p204p.ks30;
import p204p.nt30;
import p204p.pf40;
import p204p.vie1;
import p204p.vvx;
import p204p.wj30;
import p204p.wr30;

/* JADX INFO: loaded from: classes7.dex */
public class HubsJsonViewModel {

    /* JADX INFO: renamed from: h */
    private static final String f4237h = "id";

    /* JADX INFO: renamed from: i */
    private static final String f4238i = "title";

    /* JADX INFO: renamed from: j */
    private static final String f4239j = "header";

    /* JADX INFO: renamed from: k */
    private static final String f4240k = "body";

    /* JADX INFO: renamed from: l */
    private static final String f4241l = "overlays";

    /* JADX INFO: renamed from: m */
    private static final String f4242m = "extension";

    /* JADX INFO: renamed from: n */
    private static final String f4243n = "custom";

    /* JADX INFO: renamed from: a */
    @gk60(name = f4237h)
    private String f4244a;

    /* JADX INFO: renamed from: b */
    @gk60(name = "title")
    private String f4245b;

    /* JADX INFO: renamed from: c */
    @gk60(name = f4239j)
    private fk30 f4246c;

    /* JADX INFO: renamed from: d */
    @gk60(name = f4240k)
    private List<fk30> f4247d;

    /* JADX INFO: renamed from: e */
    @gk60(name = f4241l)
    private List<fk30> f4248e;

    /* JADX INFO: renamed from: f */
    @gk60(name = f4242m)
    private String f4249f;

    /* JADX INFO: renamed from: g */
    @gk60(name = f4243n)
    private wj30 f4250g;

    public static class HubsJsonViewModelCompatibility extends ks30 {
        public HubsJsonViewModelCompatibility(String str, String str2, wr30 wr30Var, pf40 pf40Var, pf40 pf40Var2, String str3, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
            super(str, str2, wr30Var, pf40Var, pf40Var2, str3, hubsImmutableComponentBundle);
        }
    }

    /* JADX INFO: renamed from: a */
    public nt30 m11908a() {
        return new HubsJsonViewModelCompatibility(this.f4244a, this.f4245b, (wr30) this.f4246c, vie1.m85631m(vvx.m86508i(this.f4247d)), vie1.m85631m(vvx.m86508i(this.f4248e)), this.f4249f, HubsImmutableComponentBundle.fromNullable(this.f4250g));
    }
}
