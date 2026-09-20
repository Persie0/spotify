package com.spotify.devicelocation.consent;

import kotlin.Metadata;
import p204p.wj50;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m24212d2 = {"Lcom/spotify/devicelocation/consent/ConsentDataLoaderError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "Unknown", "BackendError", "Lcom/spotify/devicelocation/consent/ConsentDataLoaderError$BackendError;", "Lcom/spotify/devicelocation/consent/ConsentDataLoaderError$Unknown;", "src_main_java_com_spotify_devicelocation_consent-consent"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class ConsentDataLoaderError extends Exception {

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/devicelocation/consent/ConsentDataLoaderError$BackendError;", "Lcom/spotify/devicelocation/consent/ConsentDataLoaderError;", "src_main_java_com_spotify_devicelocation_consent-consent"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class BackendError extends ConsentDataLoaderError {

        /* JADX INFO: renamed from: a */
        public final int f3564a;

        /* JADX INFO: renamed from: b */
        public final String f3565b;

        public BackendError(int i, String str) {
            super(0);
            this.f3564a = i;
            this.f3565b = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF3564a() {
            return this.f3564a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BackendError)) {
                return false;
            }
            BackendError backendError = (BackendError) obj;
            return this.f3564a == backendError.f3564a && wj50.m88271j(this.f3565b, backendError.f3565b);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f3564a) * 31;
            String str = this.f3565b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }
    }

    @Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/devicelocation/consent/ConsentDataLoaderError$Unknown;", "Lcom/spotify/devicelocation/consent/ConsentDataLoaderError;", "<init>", "()V", "src_main_java_com_spotify_devicelocation_consent-consent"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class Unknown extends ConsentDataLoaderError {

        /* JADX INFO: renamed from: a */
        public static final Unknown f3566a = new Unknown();

        private Unknown() {
            super(0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        public final int hashCode() {
            return 538219331;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "Unknown";
        }
    }

    public /* synthetic */ ConsentDataLoaderError(int i) {
        this();
    }

    private ConsentDataLoaderError() {
    }
}
