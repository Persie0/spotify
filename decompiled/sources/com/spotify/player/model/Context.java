package com.spotify.player.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p204p.kf40;
import p204p.pf40;
import p204p.xf40;
import p204p.xul0;

/* JADX INFO: loaded from: classes2.dex */
@JsonDeserialize
public abstract class Context {

    /* JADX INFO: loaded from: classes9.dex */
    public static abstract class Builder {
        public static Builder builder() {
            return Context.builder("");
        }

        public abstract Context build();

        public Builder metadata(Map<String, String> map) {
            return metadata(xf40.m90451c(map));
        }

        public abstract Builder metadata(xf40 xf40Var);

        public Builder pages(List<ContextPage> list) {
            return pages(pf40.m69791p(list));
        }

        public abstract Builder pages(pf40 pf40Var);

        public abstract Builder restrictions(Restrictions restrictions);

        public abstract Builder uri(String str);

        public abstract Builder url(String str);
    }

    /* JADX INFO: loaded from: classes9.dex */
    public static final class Metadata {
        public static final String KEY_AUTOPLAY_CANDIDATE = "autoplay_candidate";
        public static final String KEY_CONTEXT_DESCRIPTION = "context_description";
        public static final String KEY_CONTEXT_LONG_DESCRIPTION = "context_long_description";
        public static final String KEY_CONTEXT_OWNER = "context_owner";
        public static final String KEY_DURATION = "duration";
        public static final String KEY_END_CONTEXT_ACTION = "end_of_context_action";
        public static final String KEY_FILTERING_PREDICATE = "filtering.predicate";
        public static final String KEY_FORMAT_LIST_TYPE = "format_list_type";
        public static final String KEY_IMAGE_LARGE_URL = "image_large_url";
        public static final String KEY_IMAGE_SMALL_URL = "image_small_url";
        public static final String KEY_IMAGE_URL = "image_url";
        public static final String KEY_IMAGE_XLARGE_URL = "image_xlarge_url";
        public static final String KEY_INTERRUPTION_MANIFEST_IDS = "mod.interruption_manifest_ids";
        public static final String KEY_IS_ALGOTORIAL = "isAlgotorial";
        public static final String KEY_IS_AUDIOBOOK = "is_audiobook";
        public static final String KEY_IS_DATA_SAVER_CONTEXT = "is_data_saver_context";
        public static final String KEY_IS_LOADING = "is_loading";
        public static final String KEY_IS_MUSIC_VIDEO_CONTEXT = "is_music_video_context";
        public static final String KEY_IS_STRIPPED = "is_stripped";
        public static final String KEY_LICENSE = "license";
        public static final String KEY_LICENSE_ON_DEMAND_WHEN_FREE = "mobile_on_demand";
        public static final String KEY_MEDIA_TYPE = "media.type";
        public static final String KEY_REPORTING_URI = "reporting.uri";
        public static final String KEY_SHUFFLE_ALGORITHM = "shuffle.algorithm";
        public static final String KEY_SORTING_CRITERIA = "sorting.criteria";
        public static final String KEY_TRACK_COUNT = "track_count";
        public static final String KEY_TRANSFORMING_FAILED = "transforming.failed";
        public static final String KEY_TRANSFORMING_ONGOING = "transforming.ongoing";
        public static final String KEY_TRANSFORMING_SHUFFLE = "transforming.shuffle";
        public static final String KEY_TRANSFORMING_STATUS = "transforming.status";
        public static final String KEY_TRANSFORMING_TIMEOUT = "transforming.timeout";
        public static final String KEY_TRANSFORMING_URL = "transforming.url";
        public static final String KEY_TRANSFORMING_WAIT = "transforming.wait";
        public static final String LICENSE_ON_DEMAND_WHEN_FREE = "mod";
        public static final String SHUFFLE_ALGORITHM_HISTORY = "history";
        public static final String SHUFFLE_ALGORITHM_HISTORY_ONLY = "history_only";
        public static final String SHUFFLE_ALGORITHM_NONE = "none";
        public static final String SHUFFLE_ALGORITHM_STABLE = "stable";
        public static final String SHUFFLE_ALGORITHM_WEIGHTED = "weighted";
    }

    public static Builder builder(String str) {
        return new AutoValue_Context.Builder().uri(str).url("").metadata(Collections.EMPTY_MAP);
    }

    public static Context fromTrackUris(String str, pf40 pf40Var) {
        ArrayList arrayList = new ArrayList();
        kf40 kf40VarListIterator = pf40Var.listIterator(0);
        while (kf40VarListIterator.hasNext()) {
            arrayList.add(ContextTrack.create((String) kf40VarListIterator.next()));
        }
        return builder(str).pages((pf40) pf40.m69794t(ContextPage.builder().tracks(arrayList).build())).build();
    }

    public static Context fromUri(String str) {
        return builder(str).url("context://" + str).build();
    }

    public abstract xf40 metadata();

    public abstract xul0 pages();

    public abstract xul0 restrictions();

    public abstract Builder toBuilder();

    public abstract String uri();

    public abstract String url();
}
