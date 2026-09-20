package com.spotify.p060dj.interactionmanager.p061v0;

import java.util.List;
import java.util.Map;
import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes6.dex */
public interface ContextInfoOrBuilder extends sre0 {
    boolean containsMetadata(String str);

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    @Deprecated
    Map<String, String> getMetadata();

    int getMetadataCount();

    Map<String, String> getMetadataMap();

    String getMetadataOrDefault(String str, String str2);

    String getMetadataOrThrow(String str);

    ContextPage getPages(int i);

    int getPagesCount();

    List<ContextPage> getPagesList();

    String getUri();

    gva getUriBytes();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}
