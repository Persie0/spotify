package io.ably.lib.types;

import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessageUnpacker;
import p204p.qtz0;
import p204p.tx8;
import p204p.ug30;

/* JADX INFO: loaded from: classes16.dex */
public class PublishResponse {
    private static final String TAG = MessageSerializer.class.getName();
    private static ug30 batchErrorBodyHandler;
    private static ug30 bulkResponseBodyHandler;

    @SerializedName("channel")
    public String channelId;
    public ErrorInfo error;
    public String messageId;

    public static class BatchErrorBodyHandler implements ug30 {
        private BatchErrorBodyHandler() {
        }

        /* JADX INFO: renamed from: handleResponseBody, reason: merged with bridge method [inline-methods] */
        public PublishResponse[] m98360handleResponseBody(String str, byte[] bArr) throws AblyException {
            BatchErrorResponse msgpack;
            try {
                if ("application/json".equals(str)) {
                    msgpack = BatchErrorResponse.readJSON(bArr);
                } else {
                    msgpack = "application/x-msgpack".equals(str) ? BatchErrorResponse.readMsgpack(bArr) : null;
                }
                if (msgpack == null) {
                    return null;
                }
                ErrorInfo errorInfo = msgpack.error;
                if (errorInfo != null && errorInfo.code != 40020) {
                    throw AblyException.fromErrorInfo(errorInfo);
                }
                return msgpack.batchResponse;
            } catch (IOException e) {
                throw AblyException.fromThrowable(e);
            }
        }
    }

    public static class BulkResponseBodyHandler implements ug30 {
        private BulkResponseBodyHandler() {
        }

        /* JADX INFO: renamed from: handleResponseBody, reason: merged with bridge method [inline-methods] */
        public PublishResponse[] m98361handleResponseBody(String str, byte[] bArr) throws AblyException {
            try {
                if ("application/json".equals(str)) {
                    return PublishResponse.fromJSONArray(bArr);
                }
                if ("application/x-msgpack".equals(str)) {
                    return PublishResponse.fromMsgpackArray(bArr);
                }
                return null;
            } catch (IOException e) {
                throw AblyException.fromThrowable(e);
            }
        }
    }

    static {
        batchErrorBodyHandler = new BatchErrorBodyHandler();
        bulkResponseBodyHandler = new BulkResponseBodyHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PublishResponse[] fromJSONArray(byte[] bArr) {
        return (PublishResponse[]) qtz0.f192515b.fromJson(new String(bArr), PublishResponse[].class);
    }

    private static PublishResponse fromMsgpack(MessageUnpacker messageUnpacker) {
        return new PublishResponse().readMsgpack(messageUnpacker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PublishResponse[] fromMsgpackArray(byte[] bArr) {
        return fromMsgpackArray(qtz0.f192517d.newUnpacker(bArr));
    }

    public static ug30 getBulkPublishResponseHandler(int i) {
        return i < 300 ? bulkResponseBodyHandler : batchErrorBodyHandler;
    }

    private PublishResponse readMsgpack(MessageUnpacker messageUnpacker) {
        int iUnpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < iUnpackMapHeader; i++) {
            String strIntern = messageUnpacker.unpackString().intern();
            if (!messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                strIntern.getClass();
                switch (strIntern) {
                    case "messageId":
                        this.messageId = messageUnpacker.unpackString();
                        break;
                    case "error":
                        this.error = ErrorInfo.fromMsgpack(messageUnpacker);
                        break;
                    case "channel":
                    case "channelId":
                        this.channelId = messageUnpacker.unpackString();
                        break;
                    default:
                        tx8.m81897l(TAG, "Unexpected field: ".concat(strIntern));
                        messageUnpacker.skipValue();
                        break;
                }
            } else {
                messageUnpacker.unpackNil();
            }
        }
        return this;
    }

    public static class BatchErrorResponse {
        public PublishResponse[] batchResponse;
        public ErrorInfo error;

        private BatchErrorResponse() {
        }

        public static BatchErrorResponse readJSON(byte[] bArr) {
            return (BatchErrorResponse) qtz0.f192515b.fromJson(new String(bArr), BatchErrorResponse.class);
        }

        public static BatchErrorResponse readMsgpack(byte[] bArr) {
            return new BatchErrorResponse().readMsgpack(qtz0.f192517d.newUnpacker(bArr));
        }

        public BatchErrorResponse readMsgpack(MessageUnpacker messageUnpacker) {
            int iUnpackMapHeader = messageUnpacker.unpackMapHeader();
            for (int i = 0; i < iUnpackMapHeader; i++) {
                String strIntern = messageUnpacker.unpackString().intern();
                if (messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                    messageUnpacker.unpackNil();
                } else {
                    strIntern.getClass();
                    if (strIntern.equals("error")) {
                        this.error = ErrorInfo.fromMsgpack(messageUnpacker);
                    } else if (!strIntern.equals("batchResponse")) {
                        tx8.m81897l(PublishResponse.TAG, "Unexpected field: ".concat(strIntern));
                        messageUnpacker.skipValue();
                    } else {
                        this.batchResponse = PublishResponse.fromMsgpackArray(messageUnpacker);
                    }
                }
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PublishResponse[] fromMsgpackArray(MessageUnpacker messageUnpacker) {
        int iUnpackArrayHeader = messageUnpacker.unpackArrayHeader();
        PublishResponse[] publishResponseArr = new PublishResponse[iUnpackArrayHeader];
        for (int i = 0; i < iUnpackArrayHeader; i++) {
            publishResponseArr[i] = fromMsgpack(messageUnpacker);
        }
        return publishResponseArr;
    }
}
