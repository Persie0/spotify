package org.apache.commons.p202io;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class TaggedIOException extends IOExceptionWithCause {
    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return (IOException) super.getCause();
    }
}
