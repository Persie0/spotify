package com.spotify.hubs.moshi;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import p204p.ds30;
import p204p.gk60;
import p204p.wj30;
import p204p.wq30;

/* JADX INFO: loaded from: classes7.dex */
class HubsJsonImage {

    /* JADX INFO: renamed from: d */
    private static final String f4224d = "uri";

    /* JADX INFO: renamed from: e */
    private static final String f4225e = "custom";

    /* JADX INFO: renamed from: f */
    private static final String f4226f = "placeholder";

    /* JADX INFO: renamed from: a */
    @gk60(name = f4224d)
    private String f4227a;

    /* JADX INFO: renamed from: b */
    @gk60(name = f4226f)
    private String f4228b;

    /* JADX INFO: renamed from: c */
    @gk60(name = f4225e)
    private wj30 f4229c;

    public static class HubsJsonImageCompatibility extends ds30 {
        public HubsJsonImageCompatibility(String str, String str2, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
            super(str, str2, hubsImmutableComponentBundle);
        }
    }

    /* JADX INFO: renamed from: a */
    public wq30 m11905a() {
        return new HubsJsonImageCompatibility(this.f4227a, this.f4228b, HubsImmutableComponentBundle.fromNullable(this.f4229c));
    }
}
