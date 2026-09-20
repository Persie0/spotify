package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes3.dex */
public class UninitializedMessageException extends RuntimeException {
    public UninitializedMessageException() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* JADX INFO: renamed from: a */
    public final InvalidProtocolBufferException m425a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
