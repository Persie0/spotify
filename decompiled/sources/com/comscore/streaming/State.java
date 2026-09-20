package com.comscore.streaming;

/* JADX INFO: loaded from: classes3.dex */
public interface State {
    public static final int BUFFERING_BEFORE_PLAYBACK = 4;
    public static final int BUFFERING_DURING_PAUSE = 7;
    public static final int BUFFERING_DURING_PLAYBACK = 5;
    public static final int BUFFERING_DURING_SEEKING = 6;
    public static final int IDLE = 0;
    public static final int PAUSED = 3;
    public static final int PAUSE_DURING_BUFFERING = 12;
    public static final int PLAYBACK_NOT_STARTED = 1;
    public static final int PLAYING = 2;
    public static final int SEEKING_BEFORE_PLAYBACK = 8;
    public static final int SEEKING_DURING_BUFFERING = 10;
    public static final int SEEKING_DURING_PAUSE = 11;
    public static final int SEEKING_DURING_PLAYBACK = 9;
    public static final int UNDEFINED = -1;
}
