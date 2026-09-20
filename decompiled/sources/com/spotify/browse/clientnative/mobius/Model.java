package com.spotify.browse.clientnative.mobius;

import androidx.annotation.Keep;
import com.spotify.browse.clientnative.integration.services.structureapi.DismissedEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.g6f;
import p204p.gbu;
import p204p.klh;
import p204p.s571;
import p204p.wj50;
import p204p.wma;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(m24211d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JX\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0011J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0011R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0014R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b*\u0010\u0011R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010\u0019R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b-\u0010\u0014¨\u0006/"}, m24212d2 = {"Lcom/spotify/browse/clientnative/mobius/Model;", "", "", "requestId", "pageId", "", "Lp/wma;", "sections", "", "Lcom/spotify/browse/clientnative/integration/services/structureapi/DismissedEntity;", "dismissedSectionUris", "dataSource", "", "shouldShowDSABanner", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Ljava/util/Set;", "component5", "component6", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/lang/String;Z)Lcom/spotify/browse/clientnative/mobius/Model;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRequestId", "getPageId", "Ljava/util/List;", "getSections", "Ljava/util/Set;", "getDismissedSectionUris", "getDataSource", "Z", "getShouldShowDSABanner", "getDisplayableSections", "displayableSections", "src_main_java_com_spotify_browse_clientnative-clientnative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class Model {
    public static final int $stable = 8;
    private final String dataSource;
    private final Set<DismissedEntity> dismissedSectionUris;
    private final String pageId;
    private final String requestId;
    private final List<wma> sections;
    private final boolean shouldShowDSABanner;

    /* JADX WARN: Multi-variable type inference failed */
    public Model(String str, String str2, List<? extends wma> list, Set<DismissedEntity> set, String str3, boolean z) {
        this.requestId = str;
        this.pageId = str2;
        this.sections = list;
        this.dismissedSectionUris = set;
        this.dataSource = str3;
        this.shouldShowDSABanner = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Model copy$default(Model model, String str, String str2, List list, Set set, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = model.requestId;
        }
        if ((i & 2) != 0) {
            str2 = model.pageId;
        }
        if ((i & 4) != 0) {
            list = model.sections;
        }
        if ((i & 8) != 0) {
            set = model.dismissedSectionUris;
        }
        if ((i & 16) != 0) {
            str3 = model.dataSource;
        }
        if ((i & 32) != 0) {
            z = model.shouldShowDSABanner;
        }
        String str4 = str3;
        boolean z2 = z;
        return model.copy(str, str2, list, set, str4, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    public final List<wma> component3() {
        return this.sections;
    }

    public final Set<DismissedEntity> component4() {
        return this.dismissedSectionUris;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDataSource() {
        return this.dataSource;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getShouldShowDSABanner() {
        return this.shouldShowDSABanner;
    }

    public final Model copy(String requestId, String pageId, List<? extends wma> sections, Set<DismissedEntity> dismissedSectionUris, String dataSource, boolean shouldShowDSABanner) {
        return new Model(requestId, pageId, sections, dismissedSectionUris, dataSource, shouldShowDSABanner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Model)) {
            return false;
        }
        Model model = (Model) other;
        return wj50.m88271j(this.requestId, model.requestId) && wj50.m88271j(this.pageId, model.pageId) && wj50.m88271j(this.sections, model.sections) && wj50.m88271j(this.dismissedSectionUris, model.dismissedSectionUris) && wj50.m88271j(this.dataSource, model.dataSource) && this.shouldShowDSABanner == model.shouldShowDSABanner;
    }

    public final String getDataSource() {
        return this.dataSource;
    }

    public final Set<DismissedEntity> getDismissedSectionUris() {
        return this.dismissedSectionUris;
    }

    public final List<wma> getDisplayableSections() {
        List<wma> list = this.sections;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            wma wmaVar = (wma) obj;
            Set<DismissedEntity> set = this.dismissedSectionUris;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!wj50.m88271j(((DismissedEntity) it.next()).getId(), wmaVar.getId()));
            }
            arrayList.add(obj);
        }
        return this.shouldShowDSABanner ? g6f.m43700N0(arrayList, Collections.singletonList(AbstractC0319c.f3117a)) : arrayList;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final List<wma> getSections() {
        return this.sections;
    }

    public final boolean getShouldShowDSABanner() {
        return this.shouldShowDSABanner;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldShowDSABanner) + s571.m77243b(klh.m56830b(s571.m77244c(s571.m77243b(this.requestId.hashCode() * 31, 31, this.pageId), 31, this.sections), 31, this.dismissedSectionUris), 31, this.dataSource);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ Model(String str, String str2, List list, Set set, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i & 8) != 0 ? gbu.f78413a : set, str3, (i & 32) != 0 ? false : z);
    }
}
