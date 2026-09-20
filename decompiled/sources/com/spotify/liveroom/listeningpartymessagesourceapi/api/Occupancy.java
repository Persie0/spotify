package com.spotify.liveroom.listeningpartymessagesourceapi.api;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/liveroom/listeningpartymessagesourceapi/api/Occupancy;", "", "src_main_java_com_spotify_liveroom_listeningpartymessagesourceapi-listeningpartymessagesourceapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class Occupancy {

    /* JADX INFO: renamed from: a */
    public final String f5227a;

    /* JADX INFO: renamed from: b */
    public final Integer f5228b;

    /* JADX INFO: renamed from: c */
    public final Integer f5229c;

    /* JADX INFO: renamed from: d */
    public final Integer f5230d;

    /* JADX INFO: renamed from: e */
    public final Boolean f5231e;

    public Occupancy(String str, Integer num, Integer num2, Integer num3, Boolean bool) {
        this.f5227a = str;
        this.f5228b = num;
        this.f5229c = num2;
        this.f5230d = num3;
        this.f5231e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Occupancy)) {
            return false;
        }
        Occupancy occupancy = (Occupancy) obj;
        return wj50.m88271j(this.f5227a, occupancy.f5227a) && wj50.m88271j(this.f5228b, occupancy.f5228b) && wj50.m88271j(this.f5229c, occupancy.f5229c) && wj50.m88271j(this.f5230d, occupancy.f5230d) && wj50.m88271j(this.f5231e, occupancy.f5231e);
    }

    public final int hashCode() {
        String str = this.f5227a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f5228b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f5229c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f5230d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.f5231e;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public /* synthetic */ Occupancy(String str, Integer num, Integer num2, Integer num3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : bool);
    }
}
