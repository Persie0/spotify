package com.spotify.bluejay.data.api;

import kotlin.Metadata;
import p204p.edb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m24212d2 = {"Lcom/spotify/bluejay/data/api/AttachmentUploadException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "src_main_java_com_spotify_bluejay_data_api-api"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AttachmentUploadException extends Exception {

    /* JADX INFO: renamed from: a */
    public final String f3100a;

    /* JADX INFO: renamed from: b */
    public final String f3101b;

    /* JADX INFO: renamed from: c */
    public final int f3102c;

    /* JADX WARN: Illegal instructions before constructor call */
    public AttachmentUploadException(String str, String str2, int i) {
        StringBuilder sbM38571t = edb.m38571t(i, "Upload failed: ", str, " (", ") - ");
        sbM38571t.append(str2);
        super(sbM38571t.toString());
        this.f3100a = str;
        this.f3101b = str2;
        this.f3102c = i;
    }
}
