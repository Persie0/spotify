package com.spotify.performancesdk.observationplatform.integrations.cpp;

/* JADX INFO: loaded from: classes9.dex */
public final class BuildConfig {
    public static final boolean ABORT_ON_ASSERTION = abortOnAssertion();
    public static final String BUILD_VARIANT = buildVariant();
    public static final boolean CRASH_REPORTING_ENABLED = crashReportingEnabled();
    public static final boolean DYNAMIC_FEATURE_ENABLED = dynamicFeatureEnabled();
    public static final boolean INTERNAL = internal();

    private static final boolean abortOnAssertion() {
        return false;
    }

    private static final String buildVariant() {
        return "release";
    }

    private static final boolean crashReportingEnabled() {
        return true;
    }

    private static final boolean dynamicFeatureEnabled() {
        return true;
    }

    private static final boolean internal() {
        return false;
    }
}
