package com.google.protobuf;

/* JADX INFO: loaded from: classes4.dex */
public final class RpcUtil$AlreadyCalledException extends RuntimeException {
    public RpcUtil$AlreadyCalledException() {
        super("This RpcCallback was already called and cannot be called multiple times.");
    }
}
