package com.comscore;

import com.comscore.util.cpp.CppJavaBinder;
import com.comscore.util.log.Logger;
import com.comscore.util.setup.Setup;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ClientConfiguration extends CppJavaBinder {

    /* JADX INFO: renamed from: b */
    long f1522b;

    /* JADX INFO: renamed from: c */
    Builder f1523c;

    public ClientConfiguration() {
        this.f1522b = 0L;
        this.f1523c = null;
    }

    private static native void addPersistentLabelsNative(long j, Map<String, String> map);

    private static native boolean containsPersistentLabelNative(long j, String str);

    private static native boolean containsStartLabelNative(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean getDefaultHttpRedirectCachingEnabledNative();

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean getDefaultKeepAliveMeasurementNative();

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean getDefaultSecureTransmissionNative();

    private static native String getPersistentLabelNative(long j, String str);

    private static native Map<String, String> getPersistentLabelsNative(long j);

    private static native Map<String, String> getStartLabelsNative(long j);

    private static native boolean isHttpRedirectCachingEnabledNative(long j);

    private static native boolean isKeepAliveMeasurementEnabledNative(long j);

    private static native boolean isSecureTransmissionEnabledNative(long j);

    private static native void removeAllPersistentLabelsNative(long j);

    private static native void removePersistentLabelNative(long j, String str);

    private static native void setPersistentLabelNative(long j, String str, String str2);

    /* JADX INFO: renamed from: a */
    public long m1197a() {
        return this.f1522b;
    }

    public void addPersistentLabels(Map<String, String> map) {
        try {
            addPersistentLabelsNative(this.f1522b, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public boolean containsPersistentLabel(String str) {
        Builder builder;
        if (!Setup.isNativeLibrarySuccessfullyLoaded() && (builder = this.f1523c) != null) {
            return builder.persistentLabels.containsKey(str);
        }
        try {
            return containsPersistentLabelNative(this.f1522b, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean containsStartLabel(String str) {
        Builder builder;
        if (!Setup.isNativeLibrarySuccessfullyLoaded() && (builder = this.f1523c) != null) {
            return builder.startLabels.containsKey(str);
        }
        try {
            return containsStartLabelNative(this.f1522b, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public String getPersistentLabel(String str) {
        Builder builder;
        if (!Setup.isNativeLibrarySuccessfullyLoaded() && (builder = this.f1523c) != null) {
            return builder.persistentLabels.get(str);
        }
        try {
            return getPersistentLabelNative(this.f1522b, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public Map<String, String> getPersistentLabels() {
        Builder builder;
        if (!Setup.isNativeLibrarySuccessfullyLoaded() && (builder = this.f1523c) != null) {
            return builder.persistentLabels;
        }
        try {
            return getPersistentLabelsNative(this.f1522b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public Map<String, String> getStartLabels() {
        Builder builder;
        if (!Setup.isNativeLibrarySuccessfullyLoaded() && (builder = this.f1523c) != null) {
            return builder.startLabels;
        }
        try {
            return getStartLabelsNative(this.f1522b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public boolean isHttpRedirectCachingEnabled() {
        Builder builder;
        if (!Setup.isNativeLibrarySuccessfullyLoaded() && (builder = this.f1523c) != null) {
            return builder.httpRedirectCaching;
        }
        try {
            return isHttpRedirectCachingEnabledNative(this.f1522b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean isKeepAliveMeasurementEnabled() {
        Builder builder;
        if (!Setup.isNativeLibrarySuccessfullyLoaded() && (builder = this.f1523c) != null) {
            return builder.keepAliveMeasurement;
        }
        try {
            return isKeepAliveMeasurementEnabledNative(this.f1522b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean isSecureTransmissionEnabled() {
        Builder builder;
        if (!Setup.isNativeLibrarySuccessfullyLoaded() && (builder = this.f1523c) != null) {
            return builder.secureTransmission;
        }
        try {
            return isSecureTransmissionEnabledNative(this.f1522b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    @Deprecated
    public boolean isVceEnabled() {
        return false;
    }

    public void removeAllPersistentLabels() {
        try {
            removeAllPersistentLabelsNative(this.f1522b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void removePersistentLabel(String str) {
        try {
            removePersistentLabelNative(this.f1522b, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setPersistentLabel(String str, String str2) {
        try {
            setPersistentLabelNative(this.f1522b, str, str2);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public ClientConfiguration(Builder builder) {
        this.f1522b = 0L;
        this.f1523c = null;
        this.f1523c = builder.mo1198a();
    }

    public static abstract class Builder<T extends Builder, P extends ClientConfiguration> {
        protected String clientId;
        protected boolean httpRedirectCaching;
        protected boolean keepAliveMeasurement;
        protected Map<String, String> persistentLabels;
        protected boolean secureTransmission;
        protected Map<String, String> startLabels;

        public Builder(Builder builder) {
            this.persistentLabels = new HashMap(builder.persistentLabels);
            this.startLabels = new HashMap(builder.startLabels);
            this.keepAliveMeasurement = builder.keepAliveMeasurement;
            this.secureTransmission = builder.secureTransmission;
            this.httpRedirectCaching = builder.httpRedirectCaching;
            this.clientId = builder.clientId;
        }

        /* JADX INFO: renamed from: a */
        public abstract T mo1198a();

        public abstract P build();

        public T httpRedirectCaching(boolean z) {
            this.httpRedirectCaching = z;
            return (T) self();
        }

        public T keepAliveMeasurement(boolean z) {
            this.keepAliveMeasurement = z;
            return (T) self();
        }

        public T persistentLabels(Map<String, String> map) {
            this.persistentLabels.clear();
            this.persistentLabels.putAll(map);
            return (T) self();
        }

        public T secureTransmission(boolean z) {
            this.secureTransmission = z;
            return (T) self();
        }

        public abstract T self();

        public void setClientId(String str) {
            this.clientId = str;
        }

        public T startLabels(Map<String, String> map) {
            this.startLabels.clear();
            this.startLabels.putAll(map);
            return (T) self();
        }

        @Deprecated
        public T vce(boolean z) {
            return (T) self();
        }

        public Builder() {
            try {
                this.keepAliveMeasurement = ClientConfiguration.getDefaultKeepAliveMeasurementNative();
                this.secureTransmission = ClientConfiguration.getDefaultSecureTransmissionNative();
                this.httpRedirectCaching = ClientConfiguration.getDefaultHttpRedirectCachingEnabledNative();
            } catch (UnsatisfiedLinkError e) {
                Logger.m1418e("Error using the native library: ", e);
            }
            this.persistentLabels = new HashMap();
            this.startLabels = new HashMap();
        }
    }
}
