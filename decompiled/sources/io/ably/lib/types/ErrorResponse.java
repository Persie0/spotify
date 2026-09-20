package io.ably.lib.types;

import p204p.qtz0;

/* JADX INFO: loaded from: classes16.dex */
public class ErrorResponse {
    public ErrorInfo error;

    public static ErrorResponse fromJSON(String str) {
        return (ErrorResponse) qtz0.f192515b.fromJson(str, ErrorResponse.class);
    }
}
