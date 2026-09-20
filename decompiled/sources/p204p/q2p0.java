package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum q2p0 implements od50 {
    UNKNOWN_FIELD_ID(0),
    AUDIO_QUALITY(1),
    SOCIAL_DISCOVERABLE(2),
    PLAYBACK_SPEED(3),
    SHUFFLE(4),
    CONTEXT_ENHANCEMENT(5),
    DISABLE_SMART_SHUFFLE(6),
    MEDIA_MODE(7),
    SKIP_FINISHED_EPISODES(8),
    GAPLESS(9),
    CROSSFADE(10),
    CROSSFADE_DURATION_MS(11),
    NORMALIZE(12),
    NORMALIZE_LEVEL(13),
    EQUALIZER_ENABLED(14),
    EQUALIZER_LOW_SHELF_GAIN(15),
    EQUALIZER_LOW_PEAK_GAIN(16),
    EQUALIZER_LOW_MID_PEAK_GAIN(17),
    EQUALIZER_HIGH_MID_PEAK_GAIN(18),
    EQUALIZER_HIGH_PEAK_GAIN(19),
    EQUALIZER_HIGH_SHELF_GAIN(20),
    TRANSLATION_LANGUAGE(21),
    AUDIO_LANGUAGE(22),
    SUBTITLE_LANGUAGE(23),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f184692a;

    q2p0(int i) {
        this.f184692a = i;
    }

    /* JADX INFO: renamed from: a */
    public static q2p0 m72028a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_FIELD_ID;
            case 1:
                return AUDIO_QUALITY;
            case 2:
                return SOCIAL_DISCOVERABLE;
            case 3:
                return PLAYBACK_SPEED;
            case 4:
                return SHUFFLE;
            case 5:
                return CONTEXT_ENHANCEMENT;
            case 6:
                return DISABLE_SMART_SHUFFLE;
            case 7:
                return MEDIA_MODE;
            case 8:
                return SKIP_FINISHED_EPISODES;
            case 9:
                return GAPLESS;
            case 10:
                return CROSSFADE;
            case 11:
                return CROSSFADE_DURATION_MS;
            case 12:
                return NORMALIZE;
            case 13:
                return NORMALIZE_LEVEL;
            case 14:
                return EQUALIZER_ENABLED;
            case 15:
                return EQUALIZER_LOW_SHELF_GAIN;
            case 16:
                return EQUALIZER_LOW_PEAK_GAIN;
            case 17:
                return EQUALIZER_LOW_MID_PEAK_GAIN;
            case 18:
                return EQUALIZER_HIGH_MID_PEAK_GAIN;
            case 19:
                return EQUALIZER_HIGH_PEAK_GAIN;
            case 20:
                return EQUALIZER_HIGH_SHELF_GAIN;
            case 21:
                return TRANSLATION_LANGUAGE;
            case 22:
                return AUDIO_LANGUAGE;
            case 23:
                return SUBTITLE_LANGUAGE;
            default:
                return null;
        }
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f184692a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
