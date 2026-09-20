package io.ably.lib.types;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;
import p204p.C1880g0;
import p204p.qtz0;
import p204p.sh30;
import p204p.tx8;
import p204p.ug30;
import p204p.vg30;

/* JADX INFO: loaded from: classes16.dex */
public class MessageSerializer {
    private static ug30 messageResponseHandler = new MessageBodyHandler(null);
    private static final String TAG = MessageSerializer.class.getName();

    public static class MessageBodyHandler implements ug30 {
        private ChannelOptions opts;

        public MessageBodyHandler(ChannelOptions channelOptions) {
            this.opts = channelOptions;
        }

        /* JADX INFO: renamed from: handleResponseBody, reason: merged with bridge method [inline-methods] */
        public Message[] m98358handleResponseBody(String str, byte[] bArr) throws AblyException {
            try {
                Message[] messagesFromJson = "application/json".equals(str) ? MessageSerializer.readMessagesFromJson(bArr) : "application/x-msgpack".equals(str) ? MessageSerializer.readMsgpack(bArr) : null;
                if (messagesFromJson != null) {
                    for (Message message : messagesFromJson) {
                        try {
                            message.decode(this.opts);
                        } catch (MessageDecodeException e) {
                            tx8.m81889d(MessageSerializer.TAG, e.errorInfo.message);
                        }
                    }
                }
                return messagesFromJson;
            } catch (MessageDecodeException e2) {
                throw AblyException.fromThrowable(e2);
            }
        }
    }

    public static vg30 asJSONRequest(Message.Batch[] batchArr) {
        return new sh30(qtz0.f192515b.toJson(batchArr));
    }

    public static vg30 asJsonRequest(Message message) {
        return asJsonRequest(new Message[]{message});
    }

    public static vg30 asMsgpackRequest(Message message) {
        return asMsgpackRequest(new Message[]{message});
    }

    public static ug30 getMessageResponseHandler(ChannelOptions channelOptions) {
        return channelOptions == null ? messageResponseHandler : new MessageBodyHandler(channelOptions);
    }

    public static Message[] readMessagesFromJson(byte[] bArr) {
        return (Message[]) qtz0.f192515b.fromJson(new String(bArr), Message[].class);
    }

    public static Message[] readMsgpack(byte[] bArr) throws AblyException {
        try {
            return readMsgpackArray(qtz0.f192517d.newUnpacker(bArr));
        } catch (IOException e) {
            throw AblyException.fromThrowable(e);
        }
    }

    public static Message[] readMsgpackArray(MessageUnpacker messageUnpacker) {
        int iUnpackArrayHeader = messageUnpacker.unpackArrayHeader();
        Message[] messageArr = new Message[iUnpackArrayHeader];
        for (int i = 0; i < iUnpackArrayHeader; i++) {
            messageArr[i] = Message.fromMsgpack(messageUnpacker);
        }
        return messageArr;
    }

    public static Map<String, String> readStringMap(MessageUnpacker messageUnpacker) {
        HashMap map = new HashMap();
        int iUnpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < iUnpackMapHeader; i++) {
            String strUnpackString = messageUnpacker.unpackString();
            if (messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                messageUnpacker.unpackNil();
            } else {
                map.put(strUnpackString, messageUnpacker.unpackString());
            }
        }
        return map;
    }

    public static void write(Map<String, String> map, MessagePacker messagePacker) {
        messagePacker.packMapHeader(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            messagePacker.packString(entry.getKey());
            messagePacker.packString(entry.getValue());
        }
    }

    public static byte[] writeMsgpackArray(Message[] messageArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            MessagePacker messagePackerNewPacker = qtz0.f192516c.newPacker(byteArrayOutputStream);
            writeMsgpackArray(messageArr, messagePackerNewPacker);
            messagePackerNewPacker.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            return null;
        }
    }

    public static vg30 asJsonRequest(Message[] messageArr) {
        return new sh30(qtz0.f192515b.toJson(messageArr));
    }

    public static vg30 asMsgpackRequest(Message[] messageArr) {
        return new C1880g0(writeMsgpackArray(messageArr));
    }

    public static vg30 asMsgpackRequest(Message.Batch[] batchArr) {
        return new C1880g0(writeMsgpackArray(batchArr));
    }

    public static void writeMsgpackArray(Message[] messageArr, MessagePacker messagePacker) {
        try {
            messagePacker.packArrayHeader(messageArr.length);
            for (Message message : messageArr) {
                message.writeMsgpack(messagePacker);
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] writeMsgpackArray(Message.Batch[] batchArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            MessagePacker messagePackerNewPacker = qtz0.f192516c.newPacker(byteArrayOutputStream);
            writeMsgpackArray(batchArr, messagePackerNewPacker);
            messagePackerNewPacker.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            return null;
        }
    }

    public static void writeMsgpackArray(Message.Batch[] batchArr, MessagePacker messagePacker) {
        try {
            messagePacker.packArrayHeader(batchArr.length);
            for (Message.Batch batch : batchArr) {
                batch.writeMsgpack(messagePacker);
            }
        } catch (IOException unused) {
        }
    }
}
