package com.spotify.player.model;

import java.util.Collections;
import java.util.Set;
import p204p.ftv0;
import p204p.hg40;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Suppressions {
    public static final Suppressions EMPTY = create();

    /* JADX INFO: loaded from: classes9.dex */
    public static final class Providers {
        public static final String ADS = "ad";
        public static final String MFT = "mft";
        public static final String MFT_DISALLOW_RESTART_PLAY = "mft/disallow_restart_play";
        public static final String MFT_INJECT_FILLER_TRACKS = "mft/inject_filler_tracks";
        public static final String MFT_INJECT_RANDOM_TRACKS = "mft/inject_random_tracks";
        public static final String MFT_INJECT_TRACK_ON_START_PLAY = "mft/inject_track_on_start_play";
        public static final String PODCAST_AD = "podcast_ad";
        public static final String RESUME_POINT = "played_state/resume_point";
    }

    public static Suppressions create() {
        return create(Collections.EMPTY_SET);
    }

    public abstract hg40 providers();

    public static Suppressions create(Set<String> set) {
        hg40 hg40VarM47406p;
        if (set == null) {
            int i = hg40.f91023c;
            hg40VarM47406p = ftv0.f73317t;
        } else {
            hg40VarM47406p = hg40.m47406p(set);
        }
        return new AutoValue_Suppressions(hg40VarM47406p);
    }
}
