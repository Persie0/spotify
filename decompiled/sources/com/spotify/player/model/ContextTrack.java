package com.spotify.player.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p204p.xf40;

/* JADX INFO: loaded from: classes2.dex */
@JsonDeserialize
public abstract class ContextTrack {
    public static final String TRACK_THUMB_STATE_DOWN = "down";
    public static final String TRACK_THUMB_STATE_UP = "up";
    private static List<String> delimiters = Arrays.asList("spotify:meta:delimiter", "spotify:delimiter");

    /* JADX INFO: loaded from: classes9.dex */
    public static abstract class Builder {
        public static Builder builder() {
            return ContextTrack.builder("");
        }

        public abstract ContextTrack build();

        public abstract Builder metadata(Map<String, String> map);

        public abstract Builder provider(String str);

        public abstract Builder uid(String str);

        public abstract Builder uri(String str);
    }

    /* JADX INFO: loaded from: classes9.dex */
    public static final class MediaType {
        public static final String AUDIO = "audio";
        public static final String MIXED = "mixed";
        public static final String VIDEO = "video";
    }

    /* JADX INFO: loaded from: classes9.dex */
    public static final class Metadata {
        public static final String ACTIVE_PLAY_INTERRUPTION = "sas_active";
        public static final String KEY_ACTIONS_ADVANCING_PAST_TRACK = "actions.advancing_past_track";
        public static final String KEY_ACTIONS_ADVANCING_TO_TRACK = "actions.advancing_to_track";
        public static final String KEY_ACTIONS_REPEATING_TRACK = "actions.repeating_track";
        public static final String KEY_ACTIONS_REVERSING_PAST_TRACK = "actions.reversing_past_track";
        public static final String KEY_ACTIONS_REVERSING_TO_TRACK = "actions.reversing_to_track";
        public static final String KEY_ACTIONS_SKIPPING_NEXT_PAST_TRACK = "actions.skipping_next_past_track";
        public static final String KEY_ACTIONS_SKIPPING_PREV_PAST_TRACK = "actions.skipping_prev_past_track";
        public static final String KEY_ACTIVE_LICENSOR = "mod.active_licensor";
        public static final String KEY_ADDED_AT = "added_at";
        public static final String KEY_ADDED_BY_NAME = "added_by_name";
        public static final String KEY_ADDED_BY_USERNAME = "added_by_username";
        public static final String KEY_ADVERTISER = "advertiser";
        public static final String KEY_AD_ID = "ad_id";
        public static final String KEY_AD_TYPE = "ad_type";
        public static final String KEY_ALBUM_ARTIST_NAME = "album_artist_name";
        public static final String KEY_ALBUM_DISC_COUNT = "album_disc_count";
        public static final String KEY_ALBUM_DISC_NUMBER = "album_disc_number";
        public static final String KEY_ALBUM_TITLE = "album_title";
        public static final String KEY_ALBUM_TRACK_COUNT = "album_track_count";
        public static final String KEY_ALBUM_TRACK_NUMBER = "album_track_number";
        public static final String KEY_ALBUM_URI = "album_uri";
        public static final String KEY_ARTIST_NAME = "artist_name";
        public static final String KEY_ARTIST_URI = "artist_uri";
        public static final String KEY_ASSOCIATED_VIDEO_MANIFEST_ID = "associated_video_id";
        public static final String KEY_AUDIO_ASSOCIATION = "audio_association";
        public static final String KEY_AUDIO_ASSOCIATION_IMAGE_SMALL = "audio_association_image_small";
        public static final String KEY_AUDIO_FADE_IN_CURVES = "audio.fade_in_curves";
        public static final String KEY_AUDIO_FADE_IN_DURATION = "audio.fade_in_duration";
        public static final String KEY_AUDIO_FADE_IN_START_TIME = "audio.fade_in_start_time";
        public static final String KEY_AUDIO_FADE_OUT_CURVES = "audio.fade_out_curves";
        public static final String KEY_AUDIO_FADE_OUT_DURATION = "audio.fade_out_duration";
        public static final String KEY_AUDIO_FADE_OUT_START_TIME = "audio.fade_out_start_time";
        public static final String KEY_AUDIO_FADE_OVERLAP = "audio.fade_overlap";
        public static final String KEY_AUTOPLAY_IS_AUTOPLAY = "autoplay.is_autoplay";
        public static final String KEY_AVAILABILITY_RESTRICTIONS = "availability_restrictions";
        public static final String KEY_AVAILABLE_FILE_FORMATS = "available_file_formats";
        public static final String KEY_CLICK_URL = "click_url";
        public static final String KEY_COLLECTION_CAN_ADD = "collection.can_add";
        public static final String KEY_COLLECTION_CAN_BAN = "collection.can_ban";
        public static final String KEY_COLLECTION_IN_COLLECTION = "collection.in_collection";
        public static final String KEY_COLLECTION_IS_ARTIST_BANNED = "collection.artist.is_banned";
        public static final String KEY_COLLECTION_IS_BANNED = "collection.is_banned";
        public static final String KEY_CONTEXT_URI = "context_uri";
        public static final String KEY_DISLIKE_FEEDBACK_AVAILABLE = "dislike-feedback-available";
        public static final String KEY_DISLIKE_FEEDBACK_ENABLED = "dislike-feedback-enabled";
        public static final String KEY_DISLIKE_FEEDBACK_SELECTED = "dislike-feedback-selected";
        public static final String KEY_DURATION = "duration";
        public static final String KEY_ENTITY_URI = "entity_uri";
        public static final String KEY_EXTERNALLY_INJECTED = "mft.externally_injected";
        public static final String KEY_EXTRACTED_COLOR = "extracted_color";
        public static final String KEY_HAS_LYRICS = "has_lyrics";
        public static final String KEY_HAS_TRANSCRIPTS = "has_transcripts";
        public static final String KEY_HIDDEN = "hidden";
        public static final String KEY_IMAGE_LARGE_URL = "image_large_url";
        public static final String KEY_IMAGE_SMALL_URL = "image_small_url";
        public static final String KEY_IMAGE_URL = "image_url";
        public static final String KEY_IMAGE_XLARGE_URL = "image_xlarge_url";
        public static final String KEY_INTERACTION_ID = "interaction_id";
        public static final String KEY_INTERRUPTION_SOURCE = "mod.interruption_source";
        public static final String KEY_IS_19_PLUS = "is_19_plus";
        public static final String KEY_IS_ACTIVE_PLAY_INTERRUPTION = "mod.is_active_play_interruption";
        public static final String KEY_IS_ADVERTISEMENT = "is_advertisement";
        public static final String KEY_IS_AD_SKIPPABLE = "ad.is_skippable";
        public static final String KEY_IS_AUDIOBOOK_CHAPTER = "is_audiobook_chapter";
        public static final String KEY_IS_AUDIOBOOK_RECAP = "is_audiobook_recap";
        public static final String KEY_IS_BACKGROUNDABLE = "is_backgroundable";
        public static final String KEY_IS_DATA_SAVER_TRACK = "is_data_saver_track";
        public static final String KEY_IS_EXPLICIT = "is_explicit";
        public static final String KEY_IS_INTERRUPTION = "mod.is_interruption";
        public static final String KEY_IS_LOCAL = "is_local";
        public static final String KEY_IS_NARRATION = "is_narration";
        public static final String KEY_IS_PODCAST_ADVERTISEMENT = "is_podcast_advertisement";
        public static final String KEY_IS_PODCAST_ADVERTISEMENT_IN_VIDEO = "is_podcast_advertisement_in_video";
        public static final String KEY_IS_PREMIUM_ONLY = "is_premium_only";
        public static final String KEY_IS_QUEUED = "is_queued";
        public static final String KEY_IS_REPEAT_INTERRUPTION = "mod.is_repeat_interruption";
        public static final String KEY_ITERATION = "iteration";
        public static final String KEY_JUMP_TRACK = "jump_track";
        public static final String KEY_KEEP_SKIP_DIRECTION = "keep_skip_direction";
        public static final String KEY_LEXICON_EXPIRATION_TIME = "lexicon_expiration_time";
        public static final String KEY_LEXICON_SET_TYPE = "lexicon_set_type";
        public static final String KEY_LIKE_FEEDBACK_AVAILABLE = "like-feedback-available";
        public static final String KEY_LIKE_FEEDBACK_ENABLED = "like-feedback-enabled";
        public static final String KEY_LIKE_FEEDBACK_SELECTED = "like-feedback-selected";
        public static final String KEY_LOADING_FAILED = "loading.failed";
        public static final String KEY_LOADING_STATUS = "loading.status";
        public static final String KEY_LOCAL_FILE_PATH = "local_file_path";
        public static final String KEY_LOCAL_FILE_SIZE = "local_file_size";
        public static final String KEY_MARKED_FOR_DOWNLOAD = "marked_for_download";
        public static final String KEY_MEDIA_EXTERNAL_URL = "media.external_url";
        public static final String KEY_MEDIA_LIVE = "media.live";
        public static final String KEY_MEDIA_MANIFEST = "media.manifest";
        public static final String KEY_MEDIA_MANIFEST_ID = "media.manifest_id";
        public static final String KEY_MEDIA_START_POSITION = "media.start_position";
        public static final String KEY_MEDIA_STOP_POSITION = "media.stop_position";
        public static final String KEY_MEDIA_TYPE = "media.type";
        public static final String KEY_MFT_INJECTION_REASON = "mft.injection_reason";
        public static final String KEY_MFT_INJECTION_SOURCE = "mft.injection_source";
        public static final String KEY_MFT_UNPLAYABLE_POLICY = "mft.unplayable.policy";
        public static final String KEY_NARRATION_INTRO_SSML = "narration.intro.ssml";
        public static final String KEY_NARRATION_INTRO_URI = "narration.intro.uri";
        public static final String KEY_ON_DEMAND_TYPE = "user_behavior.on_demand_type";
        public static final String KEY_ORIGINAL_INDEX = "original_index";
        public static final String KEY_PAGE_INSTANCE_ID = "page_instance_id";
        public static final String KEY_PARENT_EPISODE_URI = "parent_episode.uri";
        public static final String KEY_PIP_DISALLOWED = "pip_disallowed";
        public static final String KEY_PLAYBACK_SPEED = "playback_speed";
        public static final String KEY_POINTER_URI = "pointer.uri";
        public static final String KEY_POPULARITY = "popularity";
        public static final String KEY_PREVIOUS_ACCUMULATIVE_MS = "previous_accumulative_ms";
        public static final String KEY_PROMOTION_TYPE = "promotion_type";
        public static final String KEY_PROVIDER = "provider";
        public static final String KEY_REPEATING_TRACK_COUNT = "repeating_track.count";
        public static final String KEY_REPEATING_TRACK_MAX = "repeating_track.max";
        public static final String KEY_REPEATING_TRACK_MIN = "repeating_track.min";
        public static final String KEY_SAVE_TRACK_URI = "save_track.uri";
        public static final String KEY_SEGMENT_INDEX = "segment.index";
        public static final String KEY_SEGMENT_NAME = "segment_name";
        public static final String KEY_SEGMENT_URI = "segment.uri";
        public static final String KEY_SHOW_COVER_IMAGE_URI = "show.cover_image.uri";
        public static final String KEY_SHOW_HTML_DESCRIPTION = "show.html_description";
        public static final String KEY_SHOW_PUBLISHER = "show.publisher";
        public static final String KEY_SHUFFLE_AVERAGE_POSITION = "shuffle.average_position";
        public static final String KEY_SKIPPABLE_AD_DELAY = "ad.skippable_ad_delay";
        public static final String KEY_STATION_SUBTITLE = "station_subtitle";
        public static final String KEY_STATION_TITLE = "station_title";
        public static final String KEY_STATION_URI = "station_uri";
        public static final String KEY_SUBTITLE = "subtitle";
        public static final String KEY_THUMBNAIL_IMAGE_URL = "thumbnail_image_url";
        public static final String KEY_TITLE = "title";
        public static final String KEY_TRACK_PLAYER = "track_player";
        public static final String KEY_TRACK_RADIO_THUMB_STATE = "radio.thumb";
        public static final String KEY_VIDEO_ASSOCIATION = "video_association";
        public static final String KEY_VIDEO_RENDERING_ENABLED = "video_rendering_enabled";
        public static final String KEY_VIDEO_SECONDS_BEFORE_TRACK_STUCK = "video.seconds_before_track_stuck";
        public static final String KEY_VISUALIZATION_PLAYBACK_SPEED = "visualization.playback_speed";
        public static final String KEY_VISUALIZATION_POSITION_AS_OF_TIMESTAMP = "visualization.position_as_of_timestamp";
        public static final String REPEAT_PLAY_INTERRUPTION = "sas_repeat";
    }

    /* JADX INFO: loaded from: classes9.dex */
    public static final class TrackAction {
        public static final String PAUSE = "pause";
        public static final String RESUME = "resume";
        public static final String STOP = "stop";
    }

    /* JADX INFO: loaded from: classes9.dex */
    public static final class TrackPlayer {
        public static final String AUDIO = "audio";
        public static final String VIDEO = "video";
    }

    public static Builder builder(String str) {
        return new AutoValue_ContextTrack.Builder().uri(str).uid("").metadata(Collections.EMPTY_MAP).provider("");
    }

    public static ContextTrack create(String str) {
        return builder(str).build();
    }

    public boolean isDelimiter() {
        return delimiters.contains(uri());
    }

    public abstract xf40 metadata();

    public abstract String provider();

    public abstract Builder toBuilder();

    public abstract String uid();

    public abstract String uri();
}
