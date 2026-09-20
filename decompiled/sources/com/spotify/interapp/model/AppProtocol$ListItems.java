package com.spotify.interapp.model;

import java.util.List;
import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001B=\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010\f\u0012\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010R*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010\f\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R0\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b!\u0010\u0012\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$ListItems", "Lcom/spotify/interapp/model/a;", "", "limit", "offset", "total", "", "Lcom/spotify/interapp/model/AppProtocol$ListItem;", "items", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "c", "Ljava/lang/Integer;", "getLimit", "()Ljava/lang/Integer;", "setLimit", "(Ljava/lang/Integer;)V", "getLimit$annotations", "()V", "d", "getOffset", "setOffset", "getOffset$annotations", "e", "getTotal", "setTotal", "getTotal$annotations", "f", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getItems$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final class AppProtocol$ListItems extends AbstractC0800a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Integer limit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final Integer offset;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final Integer total;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final List items;

    public AppProtocol$ListItems(@gk60(name = "limit") Integer num, @gk60(name = "offset") Integer num2, @gk60(name = "total") Integer num3, @gk60(name = "items") List<AppProtocol$ListItem> list) {
        this.limit = num;
        this.offset = num2;
        this.total = num3;
        this.items = list;
    }

    @gk60(name = "items")
    public static /* synthetic */ void getItems$annotations() {
    }

    @gk60(name = "limit")
    public static /* synthetic */ void getLimit$annotations() {
    }

    @gk60(name = "offset")
    public static /* synthetic */ void getOffset$annotations() {
    }

    @gk60(name = "total")
    public static /* synthetic */ void getTotal$annotations() {
    }
}
