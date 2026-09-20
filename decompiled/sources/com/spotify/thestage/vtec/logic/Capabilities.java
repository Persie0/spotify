package com.spotify.thestage.vtec.logic;

import java.util.Map;
import kotlin.Metadata;
import p204p.mt60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/thestage/vtec/logic/Capabilities;", "", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class Capabilities {

    /* JADX INFO: renamed from: a */
    public final int f6726a;

    /* JADX INFO: renamed from: b */
    public final int f6727b;

    /* JADX INFO: renamed from: c */
    public final int f6728c;

    /* JADX INFO: renamed from: d */
    public final int f6729d;

    /* JADX INFO: renamed from: e */
    public final int f6730e;

    /* JADX INFO: renamed from: f */
    public final int f6731f;

    /* JADX INFO: renamed from: g */
    public final int f6732g;

    /* JADX INFO: renamed from: h */
    public final int f6733h;

    /* JADX INFO: renamed from: i */
    public final int f6734i;

    /* JADX INFO: renamed from: j */
    public final Map f6735j;

    public Capabilities(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Map map) {
        this.f6726a = i;
        this.f6727b = i2;
        this.f6728c = i3;
        this.f6729d = i4;
        this.f6730e = i5;
        this.f6731f = i6;
        this.f6732g = i7;
        this.f6733h = i8;
        this.f6734i = i9;
        this.f6735j = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Capabilities)) {
            return false;
        }
        Capabilities capabilities = (Capabilities) obj;
        return this.f6726a == capabilities.f6726a && this.f6727b == capabilities.f6727b && this.f6728c == capabilities.f6728c && this.f6729d == capabilities.f6729d && this.f6730e == capabilities.f6730e && this.f6731f == capabilities.f6731f && this.f6732g == capabilities.f6732g && this.f6733h == capabilities.f6733h && this.f6734i == capabilities.f6734i && wj50.m88271j(this.f6735j, capabilities.f6735j);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f6734i, mt60.m62800g(this.f6733h, mt60.m62800g(this.f6732g, mt60.m62800g(this.f6731f, mt60.m62800g(this.f6730e, mt60.m62800g(this.f6729d, mt60.m62800g(this.f6728c, mt60.m62800g(this.f6727b, Integer.hashCode(this.f6726a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        Map map = this.f6735j;
        return iM62800g + (map == null ? 0 : map.hashCode());
    }
}
