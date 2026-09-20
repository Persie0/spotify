package com.spotify.collection.componentrecycler;

import kotlin.Metadata;
import p204p.up60;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m24212d2 = {"com/spotify/collection/componentrecycler/ComponentRecyclerAdapter$DuplicateComparatorFound", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "src_main_java_com_spotify_collection_componentrecycler-componentrecycler"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ComponentRecyclerAdapter$DuplicateComparatorFound extends RuntimeException {
    public ComponentRecyclerAdapter$DuplicateComparatorFound(up60 up60Var) {
        super("ComponentModelComparator instance for " + up60Var + " has already been supplied.");
    }
}
