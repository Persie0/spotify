package com.spotify.hubs.moshi;

import java.util.Map;
import p204p.dk30;
import p204p.ds30;
import p204p.gk60;
import p204p.sr30;
import p204p.vie1;
import p204p.wq30;
import p204p.xf40;

/* JADX INFO: loaded from: classes7.dex */
class HubsJsonComponentImages {

    /* JADX INFO: renamed from: e */
    private static final String f4186e = "main";

    /* JADX INFO: renamed from: f */
    private static final String f4187f = "background";

    /* JADX INFO: renamed from: g */
    private static final String f4188g = "custom";

    /* JADX INFO: renamed from: h */
    private static final String f4189h = "icon";

    /* JADX INFO: renamed from: a */
    @gk60(name = f4186e)
    private wq30 f4190a;

    /* JADX INFO: renamed from: b */
    @gk60(name = f4187f)
    private wq30 f4191b;

    /* JADX INFO: renamed from: c */
    @gk60(name = f4188g)
    private Map<String, ? extends wq30> f4192c;

    /* JADX INFO: renamed from: d */
    @gk60(name = f4189h)
    private String f4193d;

    public static class HubsJsonComponentImagesCompatibility extends sr30 {
        public HubsJsonComponentImagesCompatibility(ds30 ds30Var, ds30 ds30Var2, xf40 xf40Var, String str) {
            super(ds30Var, ds30Var2, xf40Var, str);
        }
    }

    /* JADX INFO: renamed from: a */
    public dk30 m11902a() {
        return new HubsJsonComponentImagesCompatibility((ds30) this.f4190a, (ds30) this.f4191b, vie1.m85632n(this.f4192c), this.f4193d);
    }
}
