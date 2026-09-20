package com.spotify.sts.mascot;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m24212d2 = {"Lcom/spotify/sts/mascot/MascotLimitException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "RateLimited", "CapacityExceeded", "Unknown", "Lcom/spotify/sts/mascot/MascotLimitException$CapacityExceeded;", "Lcom/spotify/sts/mascot/MascotLimitException$RateLimited;", "Lcom/spotify/sts/mascot/MascotLimitException$Unknown;", "src_main_java_com_spotify_sts_mascot-mascot"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class MascotLimitException extends Exception {

    @Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/sts/mascot/MascotLimitException$CapacityExceeded;", "Lcom/spotify/sts/mascot/MascotLimitException;", "<init>", "()V", "src_main_java_com_spotify_sts_mascot-mascot"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class CapacityExceeded extends MascotLimitException {
        public CapacityExceeded() {
            super("Capacity limit reached (429)");
        }
    }

    @Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/sts/mascot/MascotLimitException$RateLimited;", "Lcom/spotify/sts/mascot/MascotLimitException;", "<init>", "()V", "src_main_java_com_spotify_sts_mascot-mascot"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class RateLimited extends MascotLimitException {
        public RateLimited() {
            super("Too many requests (429)");
        }
    }

    @Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/sts/mascot/MascotLimitException$Unknown;", "Lcom/spotify/sts/mascot/MascotLimitException;", "<init>", "()V", "src_main_java_com_spotify_sts_mascot-mascot"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Unknown extends MascotLimitException {
        public Unknown() {
            super("Unknown limit reached (429)");
        }
    }
}
