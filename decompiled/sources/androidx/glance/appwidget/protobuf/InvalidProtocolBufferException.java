package androidx.glance.appwidget.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class InvalidProtocolBufferException extends IOException {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f893b = 0;

    /* JADX INFO: renamed from: a */
    public boolean f894a;

    /* JADX INFO: loaded from: classes3.dex */
    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
        public InvalidWireTypeException() {
            super("Protocol message tag had invalid wire type.");
        }
    }

    /* JADX INFO: renamed from: a */
    public static InvalidProtocolBufferException m597a() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: b */
    public static InvalidProtocolBufferException m598b() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: c */
    public static InvalidProtocolBufferException m599c() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: d */
    public static InvalidProtocolBufferException m600d() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
