package com.spotify.hubs.moshi;

import p204p.gk60;
import p204p.qk30;
import p204p.zr30;

/* JADX INFO: loaded from: classes7.dex */
class HubsJsonComponentText {

    /* JADX INFO: renamed from: e */
    private static final String f4216e = "title";

    /* JADX INFO: renamed from: f */
    private static final String f4217f = "subtitle";

    /* JADX INFO: renamed from: g */
    private static final String f4218g = "accessory";

    /* JADX INFO: renamed from: h */
    private static final String f4219h = "description";

    /* JADX INFO: renamed from: a */
    @gk60(name = "title")
    private String f4220a;

    /* JADX INFO: renamed from: b */
    @gk60(name = "subtitle")
    private String f4221b;

    /* JADX INFO: renamed from: c */
    @gk60(name = f4218g)
    private String f4222c;

    /* JADX INFO: renamed from: d */
    @gk60(name = f4219h)
    private String f4223d;

    public static class HubsJsonComponentTextCompatibility extends zr30 {
        public HubsJsonComponentTextCompatibility(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
        }
    }

    /* JADX INFO: renamed from: a */
    public qk30 m11904a() {
        return new HubsJsonComponentTextCompatibility(this.f4220a, this.f4221b, this.f4222c, this.f4223d);
    }
}
