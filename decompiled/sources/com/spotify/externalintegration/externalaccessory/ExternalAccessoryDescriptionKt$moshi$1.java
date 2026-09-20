package com.spotify.externalintegration.externalaccessory;

import kotlin.Metadata;
import p204p.be00;
import p204p.hk60;
import p204p.jx71;
import p204p.rm60;
import p204p.xl60;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m24212d2 = {"com/spotify/externalintegration/externalaccessory/ExternalAccessoryDescriptionKt$moshi$1", "Lp/hk60;", "", "Lp/xl60;", "r", "kotlin.jvm.PlatformType", "fromJson", "(Lp/xl60;)Ljava/lang/String;", "Lp/rm60;", "writer", "v", "Lp/w2a1;", "toJson", "(Lp/rm60;Ljava/lang/String;)V", "src_main_java_com_spotify_externalintegration_externalaccessory-externalaccessory"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ExternalAccessoryDescriptionKt$moshi$1 extends hk60<String> {
    @Override // p204p.hk60
    @be00
    public String fromJson(xl60 r) {
        return r.mo51087y();
    }

    @Override // p204p.hk60
    @jx71
    public void toJson(rm60 writer, String v) {
        if (v == null || v.length() == 0) {
            writer.mo56895t();
        } else {
            writer.mo56887N(v);
        }
    }
}
