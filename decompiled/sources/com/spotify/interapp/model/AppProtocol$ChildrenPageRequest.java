package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u0012\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u0017"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$ChildrenPageRequest", "Lcom/spotify/interapp/model/a;", "", "parentId", "", "limit", "offset", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "c", "Ljava/lang/String;", "getParentId", "()Ljava/lang/String;", "getParentId$annotations", "()V", "d", "Ljava/lang/Integer;", "getLimit", "()Ljava/lang/Integer;", "getLimit$annotations", "e", "getOffset", "getOffset$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final class AppProtocol$ChildrenPageRequest extends AbstractC0800a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String parentId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final Integer limit;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final Integer offset;

    public AppProtocol$ChildrenPageRequest(@gk60(name = "parent_id") String str, @gk60(name = "limit") Integer num, @gk60(name = "offset") Integer num2) {
        this.parentId = str;
        this.limit = num;
        this.offset = num2;
    }

    @gk60(name = "limit")
    public static /* synthetic */ void getLimit$annotations() {
    }

    @gk60(name = "offset")
    public static /* synthetic */ void getOffset$annotations() {
    }

    @gk60(name = "parent_id")
    public static /* synthetic */ void getParentId$annotations() {
    }
}
