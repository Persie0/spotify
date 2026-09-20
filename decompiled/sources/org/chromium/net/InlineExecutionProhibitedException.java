package org.chromium.net;

import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes11.dex */
public final class InlineExecutionProhibitedException extends RejectedExecutionException {
    public InlineExecutionProhibitedException() {
        super("Inline execution is prohibited for this request");
    }
}
