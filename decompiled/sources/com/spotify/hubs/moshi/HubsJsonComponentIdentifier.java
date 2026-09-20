package com.spotify.hubs.moshi;

import p204p.bk30;
import p204p.gk60;
import p204p.or30;

/* JADX INFO: loaded from: classes7.dex */
final class HubsJsonComponentIdentifier {

    /* JADX INFO: renamed from: c */
    private static final String f4182c = "id";

    /* JADX INFO: renamed from: d */
    private static final String f4183d = "category";

    /* JADX INFO: renamed from: a */
    @gk60(name = f4182c)
    private String f4184a;

    /* JADX INFO: renamed from: b */
    @gk60(name = "category")
    private String f4185b;

    public static class HubsJsonComponentIdentifierCompatibility extends or30 {
        public HubsJsonComponentIdentifierCompatibility(String str, String str2) {
            super(str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public bk30 m11901a() {
        String str = this.f4184a;
        if (str == null) {
            str = "";
        }
        String str2 = this.f4185b;
        return new HubsJsonComponentIdentifierCompatibility(str, str2 != null ? str2 : "");
    }
}
