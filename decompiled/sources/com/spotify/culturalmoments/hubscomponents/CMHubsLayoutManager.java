package com.spotify.culturalmoments.hubscomponents;

import android.content.Context;
import com.spotify.legacyglue.hugs.layouttraits.TraitsLayoutManager;
import kotlin.Metadata;
import p204p.fwa;
import p204p.skp;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/culturalmoments/hubscomponents/CMHubsLayoutManager;", "Lcom/spotify/legacyglue/hugs/layouttraits/TraitsLayoutManager;", "src_main_java_com_spotify_culturalmoments_hubscomponents-hubscomponents"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CMHubsLayoutManager extends TraitsLayoutManager {

    /* JADX INFO: renamed from: q1 */
    public final fwa f3555q1;

    public CMHubsLayoutManager(Context context, skp skpVar, int i, fwa fwaVar) {
        super(skpVar, i);
        this.f3555q1 = fwaVar;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: r */
    public final boolean mo953r() {
        return this.f3555q1.f74035a && super.mo953r();
    }
}
