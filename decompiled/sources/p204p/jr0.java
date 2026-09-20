package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum jr0 {
    CORE_FETCH_AD_REQUESTED("core_metadata_requested"),
    CORE_FETCH_AD_COMPLETED("core_metadata_returned"),
    CORE_FETCH_AD_FAILED("core_metadata_failed"),
    FETCH_AD_REQUESTED("realtime_metadata_requested"),
    FETCH_AD_COMPLETED("realtime_metadata_returned"),
    FETCH_AD_FAILED("realtime_metadata_failed"),
    BUFFERING_STARTED("buffer_start"),
    BUFFERING_ENDED("buffer_end"),
    TIMEOUT_REACHED("timeout"),
    BACK_PRESSED("back_pressed"),
    DATE_TIME_PARSING_FAILED("date_time_parsing_failed");


    /* JADX INFO: renamed from: a */
    public final String f115045a;

    jr0(String str) {
        this.f115045a = str;
    }
}
