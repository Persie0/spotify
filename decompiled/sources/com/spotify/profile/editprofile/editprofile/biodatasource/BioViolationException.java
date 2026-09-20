package com.spotify.profile.editprofile.editprofile.biodatasource;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m24212d2 = {"Lcom/spotify/profile/editprofile/editprofile/biodatasource/BioViolationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "src_main_java_com_spotify_profile_editprofile_editprofile_biodatasource-biodatasource"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class BioViolationException extends Exception {

    /* JADX INFO: renamed from: a */
    public final int f6517a;

    public BioViolationException(int i) {
        super("Bio violation: ".concat(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "MODERATION_BLOCKED" : "CONTAINS_PHONE" : "CONTAINS_EMAIL" : "TOO_LONG"));
        this.f6517a = i;
    }
}
