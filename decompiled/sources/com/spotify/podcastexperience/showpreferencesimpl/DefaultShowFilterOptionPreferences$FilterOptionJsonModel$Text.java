package com.spotify.podcastexperience.showpreferencesimpl;

import kotlin.Metadata;
import p204p.ok60;
import p204p.t6q;
import p204p.wj50;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"com/spotify/podcastexperience/showpreferencesimpl/DefaultShowFilterOptionPreferences$FilterOptionJsonModel$Text", "Lp/t6q;", "src_main_java_com_spotify_podcastexperience_showpreferencesimpl-showpreferencesimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class DefaultShowFilterOptionPreferences$FilterOptionJsonModel$Text implements t6q {

    /* JADX INFO: renamed from: a */
    public final String f6483a;

    public DefaultShowFilterOptionPreferences$FilterOptionJsonModel$Text(String str) {
        this.f6483a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultShowFilterOptionPreferences$FilterOptionJsonModel$Text) && wj50.m88271j(this.f6483a, ((DefaultShowFilterOptionPreferences$FilterOptionJsonModel$Text) obj).f6483a);
    }

    public final int hashCode() {
        return this.f6483a.hashCode();
    }
}
