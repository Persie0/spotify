package com.spotify.player.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Set;
import p204p.ftv0;
import p204p.hg40;

/* JADX INFO: loaded from: classes2.dex */
@JsonDeserialize
public abstract class PlayOrigin {

    public static abstract class Builder {
        public static Builder builder() {
            return PlayOrigin.builder("");
        }

        public abstract PlayOrigin build();

        public abstract Builder deviceIdentifier(String str);

        public abstract Builder externalReferrer(String str);

        public abstract Builder featureClasses(Set<String> set);

        public abstract Builder featureIdentifier(String str);

        public abstract Builder featureVersion(String str);

        public abstract Builder referrerIdentifier(String str);

        public abstract Builder restrictionIdentifier(String str);

        public abstract Builder viewUri(String str);
    }

    public static Builder builder(String str) {
        Builder builderDeviceIdentifier = new AutoValue_PlayOrigin.Builder().featureIdentifier(str).featureVersion("").viewUri("").externalReferrer("").referrerIdentifier("").deviceIdentifier("");
        int i = hg40.f91023c;
        return builderDeviceIdentifier.featureClasses(ftv0.f73317t).restrictionIdentifier("");
    }

    public static PlayOrigin create(String str) {
        return builder(str).build();
    }

    public abstract String deviceIdentifier();

    public abstract String externalReferrer();

    public abstract hg40 featureClasses();

    public abstract String featureIdentifier();

    public abstract String featureVersion();

    public abstract String referrerIdentifier();

    public abstract String restrictionIdentifier();

    public abstract Builder toBuilder();

    public abstract String viewUri();
}
