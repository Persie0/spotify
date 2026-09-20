package com.spotify.hubs.moshi;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.util.List;
import java.util.Map;
import p204p.ar30;
import p204p.bk30;
import p204p.dk30;
import p204p.fk30;
import p204p.gk60;
import p204p.gs30;
import p204p.it30;
import p204p.mj30;
import p204p.or30;
import p204p.pf40;
import p204p.qk30;
import p204p.sr30;
import p204p.vie1;
import p204p.vvx;
import p204p.wj30;
import p204p.wr30;
import p204p.xf40;
import p204p.zr30;

/* JADX INFO: loaded from: classes7.dex */
class HubsJsonComponentModel {

    /* JADX INFO: renamed from: l */
    private static final String f4194l = "component";

    /* JADX INFO: renamed from: m */
    private static final String f4195m = "text";

    /* JADX INFO: renamed from: n */
    private static final String f4196n = "images";

    /* JADX INFO: renamed from: o */
    private static final String f4197o = "metadata";

    /* JADX INFO: renamed from: p */
    private static final String f4198p = "logging";

    /* JADX INFO: renamed from: q */
    private static final String f4199q = "custom";

    /* JADX INFO: renamed from: r */
    private static final String f4200r = "target";

    /* JADX INFO: renamed from: s */
    private static final String f4201s = "id";

    /* JADX INFO: renamed from: t */
    private static final String f4202t = "group";

    /* JADX INFO: renamed from: u */
    private static final String f4203u = "events";

    /* JADX INFO: renamed from: v */
    private static final String f4204v = "children";

    /* JADX INFO: renamed from: a */
    @gk60(name = f4194l)
    private bk30 f4205a;

    /* JADX INFO: renamed from: b */
    @gk60(name = f4195m)
    private qk30 f4206b;

    /* JADX INFO: renamed from: c */
    @gk60(name = f4196n)
    private dk30 f4207c;

    /* JADX INFO: renamed from: d */
    @gk60(name = f4197o)
    private wj30 f4208d;

    /* JADX INFO: renamed from: e */
    @gk60(name = f4198p)
    private wj30 f4209e;

    /* JADX INFO: renamed from: f */
    @gk60(name = f4199q)
    private wj30 f4210f;

    /* JADX INFO: renamed from: g */
    @gk60(name = f4200r)
    private it30 f4211g;

    /* JADX INFO: renamed from: h */
    @gk60(name = f4201s)
    private String f4212h;

    /* JADX INFO: renamed from: i */
    @gk60(name = f4202t)
    private String f4213i;

    /* JADX INFO: renamed from: j */
    @gk60(name = f4203u)
    private Map<String, mj30> f4214j;

    /* JADX INFO: renamed from: k */
    @gk60(name = f4204v)
    private List<fk30> f4215k;

    public static class HubsJsonComponentModelCompatibility extends wr30 {
        public HubsJsonComponentModelCompatibility(or30 or30Var, zr30 zr30Var, sr30 sr30Var, HubsImmutableComponentBundle hubsImmutableComponentBundle, HubsImmutableComponentBundle hubsImmutableComponentBundle2, HubsImmutableComponentBundle hubsImmutableComponentBundle3, gs30 gs30Var, String str, String str2, xf40 xf40Var, pf40 pf40Var) {
            super(or30Var, zr30Var, sr30Var, hubsImmutableComponentBundle, hubsImmutableComponentBundle2, hubsImmutableComponentBundle3, gs30Var, str, str2, xf40Var, pf40Var);
        }
    }

    /* JADX INFO: renamed from: a */
    public fk30 m11903a() {
        return new HubsJsonComponentModelCompatibility(or30.fromNullable(this.f4205a), zr30.fromNullable(this.f4206b), sr30.fromNullable(this.f4207c), HubsImmutableComponentBundle.fromNullable(this.f4208d), HubsImmutableComponentBundle.fromNullable(this.f4209e), HubsImmutableComponentBundle.fromNullable(this.f4210f), gs30.immutableOrNull(this.f4211g), this.f4212h, this.f4213i, ar30.asImmutableCommandMap(this.f4214j), vie1.m85631m(vvx.m86508i(this.f4215k)));
    }
}
