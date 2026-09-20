package com.spotify.core.coreimpl;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.edb;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006 "}, m24212d2 = {"Lcom/spotify/core/coreimpl/ApplicationScopeConfiguration;", "", "cachePath", "", "settingsPath", "enablePerformanceTracing", "", "performanceTracingLogsPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getCachePath", "()Ljava/lang/String;", "setCachePath", "(Ljava/lang/String;)V", "getSettingsPath", "setSettingsPath", "getEnablePerformanceTracing", "()Z", "setEnablePerformanceTracing", "(Z)V", "getPerformanceTracingLogsPath", "setPerformanceTracingLogsPath", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "src_main_java_com_spotify_core_coreimpl-coreimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class ApplicationScopeConfiguration {
    private String cachePath;
    private boolean enablePerformanceTracing;
    private String performanceTracingLogsPath;
    private String settingsPath;

    public ApplicationScopeConfiguration() {
        this(null, null, false, null, 15, null);
    }

    public static /* synthetic */ ApplicationScopeConfiguration copy$default(ApplicationScopeConfiguration applicationScopeConfiguration, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = applicationScopeConfiguration.cachePath;
        }
        if ((i & 2) != 0) {
            str2 = applicationScopeConfiguration.settingsPath;
        }
        if ((i & 4) != 0) {
            z = applicationScopeConfiguration.enablePerformanceTracing;
        }
        if ((i & 8) != 0) {
            str3 = applicationScopeConfiguration.performanceTracingLogsPath;
        }
        return applicationScopeConfiguration.copy(str, str2, z, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCachePath() {
        return this.cachePath;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSettingsPath() {
        return this.settingsPath;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnablePerformanceTracing() {
        return this.enablePerformanceTracing;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPerformanceTracingLogsPath() {
        return this.performanceTracingLogsPath;
    }

    public final ApplicationScopeConfiguration copy(String cachePath, String settingsPath, boolean enablePerformanceTracing, String performanceTracingLogsPath) {
        return new ApplicationScopeConfiguration(cachePath, settingsPath, enablePerformanceTracing, performanceTracingLogsPath);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicationScopeConfiguration)) {
            return false;
        }
        ApplicationScopeConfiguration applicationScopeConfiguration = (ApplicationScopeConfiguration) other;
        return wj50.m88271j(this.cachePath, applicationScopeConfiguration.cachePath) && wj50.m88271j(this.settingsPath, applicationScopeConfiguration.settingsPath) && this.enablePerformanceTracing == applicationScopeConfiguration.enablePerformanceTracing && wj50.m88271j(this.performanceTracingLogsPath, applicationScopeConfiguration.performanceTracingLogsPath);
    }

    public final String getCachePath() {
        return this.cachePath;
    }

    public final boolean getEnablePerformanceTracing() {
        return this.enablePerformanceTracing;
    }

    public final String getPerformanceTracingLogsPath() {
        return this.performanceTracingLogsPath;
    }

    public final String getSettingsPath() {
        return this.settingsPath;
    }

    public int hashCode() {
        String str = this.cachePath;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.settingsPath;
        int iM77245d = s571.m77245d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.enablePerformanceTracing);
        String str3 = this.performanceTracingLogsPath;
        return iM77245d + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setCachePath(String str) {
        this.cachePath = str;
    }

    public final void setEnablePerformanceTracing(boolean z) {
        this.enablePerformanceTracing = z;
    }

    public final void setPerformanceTracingLogsPath(String str) {
        this.performanceTracingLogsPath = str;
    }

    public final void setSettingsPath(String str) {
        this.settingsPath = str;
    }

    public String toString() {
        String str = this.cachePath;
        String str2 = this.settingsPath;
        boolean z = this.enablePerformanceTracing;
        String str3 = this.performanceTracingLogsPath;
        StringBuilder sbM38573v = edb.m38573v("ApplicationScopeConfiguration(cachePath=", str, ", settingsPath=", str2, ", enablePerformanceTracing=");
        sbM38573v.append(z);
        sbM38573v.append(", performanceTracingLogsPath=");
        sbM38573v.append(str3);
        sbM38573v.append(")");
        return sbM38573v.toString();
    }

    public ApplicationScopeConfiguration(String str, String str2, boolean z, String str3) {
        this.cachePath = str;
        this.settingsPath = str2;
        this.enablePerformanceTracing = z;
        this.performanceTracingLogsPath = str3;
    }

    public /* synthetic */ ApplicationScopeConfiguration(String str, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3);
    }
}
