package io.ably.lib.types;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;
import p204p.qtz0;
import p204p.sh30;
import p204p.tx8;
import p204p.ug30;
import p204p.vg30;

/* JADX INFO: loaded from: classes16.dex */
public class PresenceSerializer {
    private static ug30 presenceResponseHandler = new PresenceBodyHandler(null);
    private static final String TAG = PresenceSerializer.class.getName();

    public static class PresenceBodyHandler implements ug30 {
        private ChannelOptions opts;

        public PresenceBodyHandler(ChannelOptions channelOptions) {
            this.opts = channelOptions;
        }

        /* JADX INFO: renamed from: handleResponseBody, reason: merged with bridge method [inline-methods] */
        public PresenceMessage[] m98359handleResponseBody(String str, byte[] bArr) throws AblyException {
            try {
                PresenceMessage[] json = "application/json".equals(str) ? PresenceSerializer.readJson(bArr) : "application/x-msgpack".equals(str) ? PresenceSerializer.readMsgpack(bArr) : null;
                if (json != null) {
                    for (PresenceMessage presenceMessage : json) {
                        try {
                            presenceMessage.decode(this.opts);
                        } catch (MessageDecodeException e) {
                            tx8.m81889d(PresenceSerializer.TAG, e.errorInfo.message);
                        }
                    }
                }
                return json;
            } catch (IOException e2) {
                throw AblyException.fromThrowable(e2);
            }
        }
    }

    public static vg30 asJsonRequest(PresenceMessage presenceMessage) {
        return asJsonRequest(new PresenceMessage[]{presenceMessage});
    }

    public static ug30 getPresenceResponseHandler(ChannelOptions channelOptions) {
        return channelOptions == null ? presenceResponseHandler : new PresenceBodyHandler(channelOptions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PresenceMessage[] readJson(byte[] bArr) {
        return (PresenceMessage[]) qtz0.f192515b.fromJson(new String(bArr), PresenceMessage[].class);
    }

    public static PresenceMessage[] readMsgpack(byte[] bArr) throws AblyException {
        try {
            return readMsgpackArray(qtz0.f192517d.newUnpacker(bArr));
        } catch (IOException e) {
            throw AblyException.fromThrowable(e);
        }
    }

    public static PresenceMessage[] readMsgpackArray(MessageUnpacker messageUnpacker) {
        int iUnpackArrayHeader = messageUnpacker.unpackArrayHeader();
        PresenceMessage[] presenceMessageArr = new PresenceMessage[iUnpackArrayHeader];
        for (int i = 0; i < iUnpackArrayHeader; i++) {
            presenceMessageArr[i] = PresenceMessage.fromMsgpack(messageUnpacker);
        }
        return presenceMessageArr;
    }

    public static byte[] writeMsgpackArray(PresenceMessage[] presenceMessageArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            MessagePacker messagePackerNewPacker = qtz0.f192516c.newPacker(byteArrayOutputStream);
            writeMsgpackArray(presenceMessageArr, messagePackerNewPacker);
            messagePackerNewPacker.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            return null;
        }
    }

    public static vg30 asJsonRequest(PresenceMessage[] presenceMessageArr) {
        return new sh30(qtz0.f192515b.toJson(presenceMessageArr));
    }

    public static void writeMsgpackArray(PresenceMessage[] presenceMessageArr, MessagePacker messagePacker) {
        try {
            messagePacker.packArrayHeader(presenceMessageArr.length);
            for (PresenceMessage presenceMessage : presenceMessageArr) {
                presenceMessage.writeMsgpack(messagePacker);
            }
        } catch (IOException unused) {
        }
    }
}
