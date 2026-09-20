package org.chromium.support_lib_boundary;

import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public interface WebViewStartUpConfigBoundaryInterface {
    Executor getBackgroundExecutor();

    Set<String> getProfileNamesToLoad();

    boolean shouldRunUiThreadStartUpTasks();
}
