package com.spotify.jvm.jni;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m24212d2 = {"Lcom/spotify/jvm/jni/NativeExceptionHandler;", "", "<init>", "()V", "Companion", "UncaughtExceptionException", "src_main_java_com_spotify_jvm_jni-jni"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeExceptionHandler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "JniNativeExceptionHandler";

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005H\u0007R\u0014\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/jvm/jni/NativeExceptionHandler$Companion;", "", "<init>", "()V", "TAG", "", "getTAG$annotations", "handleException", "", "throwable", "nativeStackTrace", "src_main_java_com_spotify_jvm_jni-jni"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void getTAG$annotations() {
        }

        public final Throwable handleException(Throwable throwable, String nativeStackTrace) {
            try {
                UncaughtExceptionException uncaughtExceptionException = new UncaughtExceptionException(nativeStackTrace, throwable);
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler != null) {
                    defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), uncaughtExceptionException);
                }
                return null;
            } catch (OutOfMemoryError unused) {
                return null;
            } catch (Throwable th) {
                return th;
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m24212d2 = {"Lcom/spotify/jvm/jni/NativeExceptionHandler$UncaughtExceptionException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "nativeStackTrace", "", "uncaughtException", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "src_main_java_com_spotify_jvm_jni-jni"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class UncaughtExceptionException extends RuntimeException {
        public UncaughtExceptionException(String str, Throwable th) {
            super("Native stack trace:\n".concat(str), th);
        }
    }

    public static final Throwable handleException(Throwable th, String str) {
        return INSTANCE.handleException(th, str);
    }
}
