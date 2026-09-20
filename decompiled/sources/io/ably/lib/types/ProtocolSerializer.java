package io.ably.lib.types;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import org.msgpack.core.MessagePacker;
import p204p.qtz0;

/* JADX INFO: loaded from: classes16.dex */
public class ProtocolSerializer {
    public static ProtocolMessage fromJSON(String str) {
        return (ProtocolMessage) qtz0.f192515b.fromJson(str, ProtocolMessage.class);
    }

    public static ProtocolMessage readMsgpack(byte[] bArr) throws AblyException {
        try {
            return ProtocolMessage.fromMsgpack(qtz0.f192517d.newUnpacker(bArr));
        } catch (IOException e) {
            throw AblyException.fromThrowable(e);
        }
    }

    public static byte[] writeJSON(ProtocolMessage protocolMessage) {
        return qtz0.f192515b.toJson(protocolMessage).getBytes(Charset.forName("UTF-8"));
    }

    public static byte[] writeMsgpack(ProtocolMessage protocolMessage) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        MessagePacker messagePackerNewPacker = qtz0.f192516c.newPacker(byteArrayOutputStream);
        try {
            protocolMessage.writeMsgpack(messagePackerNewPacker);
            messagePackerNewPacker.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            return null;
        }
    }
}
