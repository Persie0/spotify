package com.spotify.hubs.moshi;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import p204p.ar30;
import p204p.gk60;
import p204p.mj30;
import p204p.wj30;

/* JADX INFO: loaded from: classes7.dex */
final class HubsJsonCommandModel {

    /* JADX INFO: renamed from: c */
    private static final String f4176c = "name";

    /* JADX INFO: renamed from: d */
    private static final String f4177d = "data";

    /* JADX INFO: renamed from: a */
    @gk60(name = f4176c)
    private String f4178a;

    /* JADX INFO: renamed from: b */
    @gk60(name = f4177d)
    private wj30 f4179b;

    public static class JacksonCompatibilityHubsCommandModel extends ar30 {
        public JacksonCompatibilityHubsCommandModel(String str, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
            super(str, hubsImmutableComponentBundle);
        }
    }

    private HubsJsonCommandModel() {
    }

    /* JADX INFO: renamed from: a */
    public mj30 m11897a() {
        String str = this.f4178a;
        if (str == null) {
            str = "";
        }
        return new JacksonCompatibilityHubsCommandModel(str, HubsImmutableComponentBundle.fromNullable(this.f4179b));
    }
}
