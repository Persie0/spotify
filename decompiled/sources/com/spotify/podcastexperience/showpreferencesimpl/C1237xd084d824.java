package com.spotify.podcastexperience.showpreferencesimpl;

import kotlin.Metadata;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: renamed from: com.spotify.podcastexperience.showpreferencesimpl.DefaultShowFilterOptionPreferences_FilterOptionJsonModel_AvailableOfflineOnlyJsonAdapter */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/podcastexperience/showpreferencesimpl/DefaultShowFilterOptionPreferences_FilterOptionJsonModel_AvailableOfflineOnlyJsonAdapter;", "Lp/hk60;", "Lcom/spotify/podcastexperience/showpreferencesimpl/DefaultShowFilterOptionPreferences$FilterOptionJsonModel$AvailableOfflineOnly;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_podcastexperience_showpreferencesimpl-showpreferencesimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class C1237xd084d824 extends hk60<C1234x3fea9ed> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f6484a = xl60.C2578b.m91389a(new String[0]);

    public C1237xd084d824(p0i0 p0i0Var) {
    }

    @Override // p204p.hk60
    public final C1234x3fea9ed fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        while (xl60Var.mo51079i()) {
            if (xl60Var.mo51071K(this.f6484a) == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            }
        }
        xl60Var.mo51078f();
        return new C1234x3fea9ed();
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, C1234x3fea9ed c1234x3fea9ed) {
        if (c1234x3fea9ed == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(99, "GeneratedJsonAdapter(DefaultShowFilterOptionPreferences.FilterOptionJsonModel.AvailableOfflineOnly)");
    }
}
