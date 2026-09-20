package com.spotify.hubs.moshi;

import java.util.List;
import p204p.gk60;
import p204p.gs30;
import p204p.it30;
import p204p.pf40;
import p204p.vie1;

/* JADX INFO: loaded from: classes7.dex */
class HubsJsonTarget {

    /* JADX INFO: renamed from: c */
    private static final String f4233c = "uri";

    /* JADX INFO: renamed from: d */
    private static final String f4234d = "actions";

    /* JADX INFO: renamed from: a */
    @gk60(name = f4233c)
    private String f4235a;

    /* JADX INFO: renamed from: b */
    @gk60(name = f4234d)
    private List<String> f4236b;

    public static class HubsJsonTargetCompatibility extends gs30 {
        public HubsJsonTargetCompatibility(String str, pf40 pf40Var) {
            super(str, pf40Var);
        }
    }

    /* JADX INFO: renamed from: a */
    public it30 m11907a() {
        return new HubsJsonTargetCompatibility(this.f4235a, vie1.m85631m(this.f4236b));
    }
}
