package com.spotify.connectivity;

import com.spotify.concertcampaignview.p047v1.CtaType;
import kotlin.Metadata;
import p204p.kyx;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\bb\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u001a\u0010(\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R\u001a\u0010+\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0016\"\u0004\b-\u0010\u0018R\u001a\u0010.\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010\u0018R\u001a\u00101\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u0010\u0018R\u001c\u00104\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0007\"\u0004\b6\u0010\tR\u001a\u00107\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\"\"\u0004\b9\u0010$R\u001a\u0010:\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\"\"\u0004\b<\u0010$R\u001c\u0010=\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0007\"\u0004\b?\u0010\tR\u001c\u0010@\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0007\"\u0004\bB\u0010\tR\u001a\u0010C\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\"\"\u0004\bE\u0010$R\u001a\u0010F\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\"\"\u0004\bH\u0010$R\u001a\u0010I\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\"\"\u0004\bK\u0010$R\u001a\u0010L\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\"\"\u0004\bN\u0010$R\u001a\u0010O\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0016\"\u0004\bQ\u0010\u0018R\u001a\u0010R\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\"\"\u0004\bT\u0010$R\u001a\u0010U\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\"\"\u0004\bW\u0010$R\u001a\u0010X\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u0016\"\u0004\bZ\u0010\u0018R\u001a\u0010[\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u0016\"\u0004\b]\u0010\u0018R\u001a\u0010^\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u0016\"\u0004\b`\u0010\u0018R\u001a\u0010a\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u0016\"\u0004\bc\u0010\u0018R\u001a\u0010d\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0016\"\u0004\bf\u0010\u0018R\u001a\u0010g\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u0016\"\u0004\bi\u0010\u0018R\u001a\u0010j\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\u0016\"\u0004\bl\u0010\u0018R\u001a\u0010m\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010\u0016\"\u0004\bo\u0010\u0018R\u001a\u0010p\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\u0016\"\u0004\br\u0010\u0018R\u001a\u0010s\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010\u0016\"\u0004\bu\u0010\u0018R\u001a\u0010v\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010\u0016\"\u0004\bx\u0010\u0018R\u001a\u0010y\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010\"\"\u0004\b{\u0010$R\u001a\u0010|\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010\"\"\u0004\b~\u0010$R\u001c\u0010\u007f\u001a\u00020 X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010\"\"\u0005\b\u0081\u0001\u0010$¨\u0006\u0082\u0001"}, m24212d2 = {"Lcom/spotify/connectivity/ApplicationScopeConfiguration;", "", "<init>", "()V", kyx.f127931b, "", "getClientId", "()Ljava/lang/String;", "setClientId", "(Ljava/lang/String;)V", "cachePath", "getCachePath", "setCachePath", "deviceId", "getDeviceId", "setDeviceId", "deviceHardwareModel", "getDeviceHardwareModel", "setDeviceHardwareModel", "clientRevision", "", "getClientRevision", "()I", "setClientRevision", "(I)V", "clientVersionLong", "getClientVersionLong", "setClientVersionLong", "accesspointLanguage", "getAccesspointLanguage", "setAccesspointLanguage", "enableIPv6", "", "getEnableIPv6", "()Z", "setEnableIPv6", "(Z)V", "enableOldNetworkImplementation", "getEnableOldNetworkImplementation", "setEnableOldNetworkImplementation", "reconnectPolicy", "getReconnectPolicy", "setReconnectPolicy", "protocolOsOverride", "getProtocolOsOverride", "setProtocolOsOverride", "protocolPlatformOverride", "getProtocolPlatformOverride", "setProtocolPlatformOverride", "protocolProductOverride", "getProtocolProductOverride", "setProtocolProductOverride", "defaultHTTPUserAgent", "getDefaultHTTPUserAgent", "setDefaultHTTPUserAgent", "includePayloads", "getIncludePayloads", "setIncludePayloads", "enablePerformanceTracing", "getEnablePerformanceTracing", "setEnablePerformanceTracing", "encryptedPersistedClientToken", "getEncryptedPersistedClientToken", "setEncryptedPersistedClientToken", "contentAccessRefreshToken", "getContentAccessRefreshToken", "setContentAccessRefreshToken", "enableClientToken", "getEnableClientToken", "setEnableClientToken", "appNativeLogin5SetupLifecycle", "getAppNativeLogin5SetupLifecycle", "setAppNativeLogin5SetupLifecycle", "appNativeAccountsSetupLifecycle", "getAppNativeAccountsSetupLifecycle", "setAppNativeAccountsSetupLifecycle", "enableRequestBucketCollection", "getEnableRequestBucketCollection", "setEnableRequestBucketCollection", "requestBucketingInterval", "getRequestBucketingInterval", "setRequestBucketingInterval", "enableTrafficStatsCollection", "getEnableTrafficStatsCollection", "setEnableTrafficStatsCollection", "enableConnectionQualityReport", "getEnableConnectionQualityReport", "setEnableConnectionQualityReport", "connectionQualityMaxTimerErrorMs", "getConnectionQualityMaxTimerErrorMs", "setConnectionQualityMaxTimerErrorMs", "connectionQualityPoorLatencyThresholdMs", "getConnectionQualityPoorLatencyThresholdMs", "setConnectionQualityPoorLatencyThresholdMs", "connectionQualityMinP90SampleCount", "getConnectionQualityMinP90SampleCount", "setConnectionQualityMinP90SampleCount", "connectionQualityPoorTimeoutCount", "getConnectionQualityPoorTimeoutCount", "setConnectionQualityPoorTimeoutCount", "connectionQualityMaxConcurrentLatencyBypass", "getConnectionQualityMaxConcurrentLatencyBypass", "setConnectionQualityMaxConcurrentLatencyBypass", "debounceGoodToPoorThreshold", "getDebounceGoodToPoorThreshold", "setDebounceGoodToPoorThreshold", "debouncePoorToGoodThreshold", "getDebouncePoorToGoodThreshold", "setDebouncePoorToGoodThreshold", "debounceUnknownToPoorThreshold", "getDebounceUnknownToPoorThreshold", "setDebounceUnknownToPoorThreshold", "debounceUnknownToGoodThreshold", "getDebounceUnknownToGoodThreshold", "setDebounceUnknownToGoodThreshold", "speedTestUrlVariant", "getSpeedTestUrlVariant", "setSpeedTestUrlVariant", "speedTestSampleRatePercent", "getSpeedTestSampleRatePercent", "setSpeedTestSampleRatePercent", "useSharedReachability", "getUseSharedReachability", "setUseSharedReachability", "disableDecoratorScheduling", "getDisableDecoratorScheduling", "setDisableDecoratorScheduling", "decoratorZeroHop", "getDecoratorZeroHop", "setDecoratorZeroHop", "src_main_java_com_spotify_connectivity_connectivitysdkproductsimpl-connectivitysdkproductsimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ApplicationScopeConfiguration {
    private String accesspointLanguage;
    private boolean appNativeAccountsSetupLifecycle;
    private boolean appNativeLogin5SetupLifecycle;
    private String cachePath;
    private String clientId;
    private int clientRevision;
    private String clientVersionLong;
    private String contentAccessRefreshToken;
    private boolean decoratorZeroHop;
    private String defaultHTTPUserAgent;
    private String deviceHardwareModel;
    private String deviceId;
    private boolean disableDecoratorScheduling;
    private boolean enableClientToken;
    private boolean enableConnectionQualityReport;
    private boolean enableOldNetworkImplementation;
    private boolean enablePerformanceTracing;
    private boolean enableRequestBucketCollection;
    private boolean enableTrafficStatsCollection;
    private String encryptedPersistedClientToken;
    private boolean includePayloads;
    private int speedTestSampleRatePercent;
    private int speedTestUrlVariant;
    private boolean useSharedReachability;
    private boolean enableIPv6 = true;
    private int reconnectPolicy = ReconnectPolicy.AUTOMATIC_ON_CHANGE;
    private int protocolOsOverride = -1;
    private int protocolPlatformOverride = -1;
    private int protocolProductOverride = -1;
    private int requestBucketingInterval = 15;
    private int connectionQualityMaxTimerErrorMs = 100;
    private int connectionQualityPoorLatencyThresholdMs = CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER;
    private int connectionQualityMinP90SampleCount = 6;
    private int connectionQualityPoorTimeoutCount = 5;
    private int connectionQualityMaxConcurrentLatencyBypass = 20;
    private int debounceGoodToPoorThreshold = 2;
    private int debouncePoorToGoodThreshold = 2;
    private int debounceUnknownToPoorThreshold = 2;
    private int debounceUnknownToGoodThreshold = 2;

    public final String getAccesspointLanguage() {
        return this.accesspointLanguage;
    }

    public final boolean getAppNativeAccountsSetupLifecycle() {
        return this.appNativeAccountsSetupLifecycle;
    }

    public final boolean getAppNativeLogin5SetupLifecycle() {
        return this.appNativeLogin5SetupLifecycle;
    }

    public final String getCachePath() {
        return this.cachePath;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final int getClientRevision() {
        return this.clientRevision;
    }

    public final String getClientVersionLong() {
        return this.clientVersionLong;
    }

    public final int getConnectionQualityMaxConcurrentLatencyBypass() {
        return this.connectionQualityMaxConcurrentLatencyBypass;
    }

    public final int getConnectionQualityMaxTimerErrorMs() {
        return this.connectionQualityMaxTimerErrorMs;
    }

    public final int getConnectionQualityMinP90SampleCount() {
        return this.connectionQualityMinP90SampleCount;
    }

    public final int getConnectionQualityPoorLatencyThresholdMs() {
        return this.connectionQualityPoorLatencyThresholdMs;
    }

    public final int getConnectionQualityPoorTimeoutCount() {
        return this.connectionQualityPoorTimeoutCount;
    }

    public final String getContentAccessRefreshToken() {
        return this.contentAccessRefreshToken;
    }

    public final int getDebounceGoodToPoorThreshold() {
        return this.debounceGoodToPoorThreshold;
    }

    public final int getDebouncePoorToGoodThreshold() {
        return this.debouncePoorToGoodThreshold;
    }

    public final int getDebounceUnknownToGoodThreshold() {
        return this.debounceUnknownToGoodThreshold;
    }

    public final int getDebounceUnknownToPoorThreshold() {
        return this.debounceUnknownToPoorThreshold;
    }

    public final boolean getDecoratorZeroHop() {
        return this.decoratorZeroHop;
    }

    public final String getDefaultHTTPUserAgent() {
        return this.defaultHTTPUserAgent;
    }

    public final String getDeviceHardwareModel() {
        return this.deviceHardwareModel;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final boolean getDisableDecoratorScheduling() {
        return this.disableDecoratorScheduling;
    }

    public final boolean getEnableClientToken() {
        return this.enableClientToken;
    }

    public final boolean getEnableConnectionQualityReport() {
        return this.enableConnectionQualityReport;
    }

    public final boolean getEnableIPv6() {
        return this.enableIPv6;
    }

    public final boolean getEnableOldNetworkImplementation() {
        return this.enableOldNetworkImplementation;
    }

    public final boolean getEnablePerformanceTracing() {
        return this.enablePerformanceTracing;
    }

    public final boolean getEnableRequestBucketCollection() {
        return this.enableRequestBucketCollection;
    }

    public final boolean getEnableTrafficStatsCollection() {
        return this.enableTrafficStatsCollection;
    }

    public final String getEncryptedPersistedClientToken() {
        return this.encryptedPersistedClientToken;
    }

    public final boolean getIncludePayloads() {
        return this.includePayloads;
    }

    public final int getProtocolOsOverride() {
        return this.protocolOsOverride;
    }

    public final int getProtocolPlatformOverride() {
        return this.protocolPlatformOverride;
    }

    public final int getProtocolProductOverride() {
        return this.protocolProductOverride;
    }

    public final int getReconnectPolicy() {
        return this.reconnectPolicy;
    }

    public final int getRequestBucketingInterval() {
        return this.requestBucketingInterval;
    }

    public final int getSpeedTestSampleRatePercent() {
        return this.speedTestSampleRatePercent;
    }

    public final int getSpeedTestUrlVariant() {
        return this.speedTestUrlVariant;
    }

    public final boolean getUseSharedReachability() {
        return this.useSharedReachability;
    }

    public final void setAccesspointLanguage(String str) {
        this.accesspointLanguage = str;
    }

    public final void setAppNativeAccountsSetupLifecycle(boolean z) {
        this.appNativeAccountsSetupLifecycle = z;
    }

    public final void setAppNativeLogin5SetupLifecycle(boolean z) {
        this.appNativeLogin5SetupLifecycle = z;
    }

    public final void setCachePath(String str) {
        this.cachePath = str;
    }

    public final void setClientId(String str) {
        this.clientId = str;
    }

    public final void setClientRevision(int i) {
        this.clientRevision = i;
    }

    public final void setClientVersionLong(String str) {
        this.clientVersionLong = str;
    }

    public final void setConnectionQualityMaxConcurrentLatencyBypass(int i) {
        this.connectionQualityMaxConcurrentLatencyBypass = i;
    }

    public final void setConnectionQualityMaxTimerErrorMs(int i) {
        this.connectionQualityMaxTimerErrorMs = i;
    }

    public final void setConnectionQualityMinP90SampleCount(int i) {
        this.connectionQualityMinP90SampleCount = i;
    }

    public final void setConnectionQualityPoorLatencyThresholdMs(int i) {
        this.connectionQualityPoorLatencyThresholdMs = i;
    }

    public final void setConnectionQualityPoorTimeoutCount(int i) {
        this.connectionQualityPoorTimeoutCount = i;
    }

    public final void setContentAccessRefreshToken(String str) {
        this.contentAccessRefreshToken = str;
    }

    public final void setDebounceGoodToPoorThreshold(int i) {
        this.debounceGoodToPoorThreshold = i;
    }

    public final void setDebouncePoorToGoodThreshold(int i) {
        this.debouncePoorToGoodThreshold = i;
    }

    public final void setDebounceUnknownToGoodThreshold(int i) {
        this.debounceUnknownToGoodThreshold = i;
    }

    public final void setDebounceUnknownToPoorThreshold(int i) {
        this.debounceUnknownToPoorThreshold = i;
    }

    public final void setDecoratorZeroHop(boolean z) {
        this.decoratorZeroHop = z;
    }

    public final void setDefaultHTTPUserAgent(String str) {
        this.defaultHTTPUserAgent = str;
    }

    public final void setDeviceHardwareModel(String str) {
        this.deviceHardwareModel = str;
    }

    public final void setDeviceId(String str) {
        this.deviceId = str;
    }

    public final void setDisableDecoratorScheduling(boolean z) {
        this.disableDecoratorScheduling = z;
    }

    public final void setEnableClientToken(boolean z) {
        this.enableClientToken = z;
    }

    public final void setEnableConnectionQualityReport(boolean z) {
        this.enableConnectionQualityReport = z;
    }

    public final void setEnableIPv6(boolean z) {
        this.enableIPv6 = z;
    }

    public final void setEnableOldNetworkImplementation(boolean z) {
        this.enableOldNetworkImplementation = z;
    }

    public final void setEnablePerformanceTracing(boolean z) {
        this.enablePerformanceTracing = z;
    }

    public final void setEnableRequestBucketCollection(boolean z) {
        this.enableRequestBucketCollection = z;
    }

    public final void setEnableTrafficStatsCollection(boolean z) {
        this.enableTrafficStatsCollection = z;
    }

    public final void setEncryptedPersistedClientToken(String str) {
        this.encryptedPersistedClientToken = str;
    }

    public final void setIncludePayloads(boolean z) {
        this.includePayloads = z;
    }

    public final void setProtocolOsOverride(int i) {
        this.protocolOsOverride = i;
    }

    public final void setProtocolPlatformOverride(int i) {
        this.protocolPlatformOverride = i;
    }

    public final void setProtocolProductOverride(int i) {
        this.protocolProductOverride = i;
    }

    public final void setReconnectPolicy(int i) {
        this.reconnectPolicy = i;
    }

    public final void setRequestBucketingInterval(int i) {
        this.requestBucketingInterval = i;
    }

    public final void setSpeedTestSampleRatePercent(int i) {
        this.speedTestSampleRatePercent = i;
    }

    public final void setSpeedTestUrlVariant(int i) {
        this.speedTestUrlVariant = i;
    }

    public final void setUseSharedReachability(boolean z) {
        this.useSharedReachability = z;
    }
}
