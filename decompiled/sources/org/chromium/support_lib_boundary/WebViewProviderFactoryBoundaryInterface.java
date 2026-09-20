package org.chromium.support_lib_boundary;

import android.webkit.WebView;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationHandler;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes11.dex */
public interface WebViewProviderFactoryBoundaryInterface {
    public static final String MULTI_COOKIE_HEADER_NAME = "\u0000Set-Cookie-Multivalue\u0000";
    public static final String MULTI_COOKIE_VALUE_SEPARATOR = "\u0000";

    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface StartUpConfigField {
        public static final int BACKGROUND_EXECUTOR = 0;
        public static final int PROFILE_NAMES_TO_LOAD = 2;
        public static final int UI_THREAD_START_UP_TASKS = 1;
    }

    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface StartUpResultField {
        public static final int ASYNC_START_UP_LOCATION = 3;
        public static final int BLOCKING_START_UP_LOCATION = 2;
        public static final int MAX_TIME_PER_TASK_UI_THREAD_MILLIS = 1;
        public static final int TOTAL_TIME_UI_THREAD_MILLIS = 0;
    }

    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface StartupErrorType {
        public static final int CODE = 0;
        public static final int MESSAGE = 1;
    }

    InvocationHandler createWebView(WebView webView);

    InvocationHandler getDropDataProvider();

    InvocationHandler getProfileStore();

    InvocationHandler getProxyController();

    InvocationHandler getServiceWorkerController();

    InvocationHandler getStatics();

    String[] getSupportedFeatures();

    InvocationHandler getTracingController();

    InvocationHandler getWebViewBuilder();

    InvocationHandler getWebkitToCompatConverter();

    void startUpWebView(InvocationHandler invocationHandler, InvocationHandler invocationHandler2);

    void startUpWebView(Consumer<BiConsumer<Integer, Object>> consumer, Consumer<Consumer<BiConsumer<Integer, Object>>> consumer2, Consumer<Consumer<BiConsumer<Integer, Object>>> consumer3);
}
