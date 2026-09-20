package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

/* JADX INFO: loaded from: classes11.dex */
public interface JsReplyProxyBoundaryInterface extends IsomorphicObjectBoundaryInterface {
    void executeJavaScript(String str, InvocationHandler invocationHandler);

    void postMessage(String str);

    void postMessageWithPayload(InvocationHandler invocationHandler);
}
