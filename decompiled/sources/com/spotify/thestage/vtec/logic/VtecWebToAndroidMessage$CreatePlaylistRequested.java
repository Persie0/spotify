package com.spotify.thestage.vtec.logic;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.a7d1;
import p204p.mt60;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"com/spotify/thestage/vtec/logic/VtecWebToAndroidMessage$CreatePlaylistRequested", "Lp/a7d1;", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class VtecWebToAndroidMessage$CreatePlaylistRequested extends a7d1 {

    /* JADX INFO: renamed from: a */
    public final transient String f6803a;

    /* JADX INFO: renamed from: b */
    public final int f6804b;

    /* JADX INFO: renamed from: c */
    public final String f6805c;

    /* JADX INFO: renamed from: d */
    public final String f6806d;

    /* JADX INFO: renamed from: e */
    public final String f6807e;

    /* JADX INFO: renamed from: f */
    public final String[] f6808f;

    public VtecWebToAndroidMessage$CreatePlaylistRequested(String str, int i, String str2, String str3, String str4, String[] strArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this.f6803a = (i2 & 1) != 0 ? "didRequestCreatePlaylist" : str;
        this.f6804b = i;
        this.f6805c = str2;
        this.f6806d = str3;
        this.f6807e = str4;
        this.f6808f = strArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VtecWebToAndroidMessage$CreatePlaylistRequested)) {
            return false;
        }
        VtecWebToAndroidMessage$CreatePlaylistRequested vtecWebToAndroidMessage$CreatePlaylistRequested = (VtecWebToAndroidMessage$CreatePlaylistRequested) obj;
        return wj50.m88271j(this.f6803a, vtecWebToAndroidMessage$CreatePlaylistRequested.f6803a) && this.f6804b == vtecWebToAndroidMessage$CreatePlaylistRequested.f6804b && wj50.m88271j(this.f6805c, vtecWebToAndroidMessage$CreatePlaylistRequested.f6805c) && wj50.m88271j(this.f6806d, vtecWebToAndroidMessage$CreatePlaylistRequested.f6806d) && wj50.m88271j(this.f6807e, vtecWebToAndroidMessage$CreatePlaylistRequested.f6807e) && wj50.m88271j(this.f6808f, vtecWebToAndroidMessage$CreatePlaylistRequested.f6808f);
    }

    public final int hashCode() {
        return s571.m77243b(s571.m77243b(s571.m77243b(mt60.m62800g(this.f6804b, this.f6803a.hashCode() * 31, 31), 31, this.f6805c), 31, this.f6806d), 31, this.f6807e) + Arrays.hashCode(this.f6808f);
    }
}
