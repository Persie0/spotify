package com.spotify.externalintegration.http;

import java.util.List;
import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m24212d2 = {"Lcom/spotify/externalintegration/http/ExternalIntegrationBackendResponseModel;", "", "", "Lcom/spotify/externalintegration/http/ExternalIntegrationSectionContentModel;", "sectionContent", "<init>", "(Ljava/util/List;)V", "copy", "(Ljava/util/List;)Lcom/spotify/externalintegration/http/ExternalIntegrationBackendResponseModel;", "a", "Ljava/util/List;", "getSectionContent", "()Ljava/util/List;", "getSectionContent$annotations", "()V", "src_main_java_com_spotify_externalintegration_http-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class ExternalIntegrationBackendResponseModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final List sectionContent;

    public ExternalIntegrationBackendResponseModel(@gk60(name = "section_content") List<ExternalIntegrationSectionContentModel> list) {
        this.sectionContent = list;
    }

    @gk60(name = "section_content")
    public static /* synthetic */ void getSectionContent$annotations() {
    }

    public final ExternalIntegrationBackendResponseModel copy(@gk60(name = "section_content") List<ExternalIntegrationSectionContentModel> sectionContent) {
        return new ExternalIntegrationBackendResponseModel(sectionContent);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExternalIntegrationBackendResponseModel) && wj50.m88271j(this.sectionContent, ((ExternalIntegrationBackendResponseModel) obj).sectionContent);
    }

    public final int hashCode() {
        return this.sectionContent.hashCode();
    }
}
