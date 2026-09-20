package io.ably.lib.types;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;
import p204p.C1761d0;
import p204p.hyl;
import p204p.iyl;
import p204p.jyl;
import p204p.kyl;
import p204p.qtz0;
import p204p.r1b1;
import p204p.tx8;
import p204p.vx8;
import p204p.x1b1;

/* JADX INFO: loaded from: classes16.dex */
public class BaseMessage implements Cloneable {
    private static final String CLIENT_ID = "clientId";
    private static final String CONNECTION_ID = "connectionId";
    private static final String DATA = "data";
    private static final String ENCODING = "encoding";

    /* JADX INFO: renamed from: ID */
    private static final String f7165ID = "id";
    private static final String TAG;
    private static final String TIMESTAMP = "timestamp";
    private static final r1b1 vcdiffDecoder;
    private static Pattern xformPattern;
    public String clientId;
    public String connectionId;
    public Object data;
    public String encoding;

    /* JADX INFO: renamed from: id */
    public String f7166id;
    public long timestamp;

    static {
        C1761d0 c1761d0 = new C1761d0();
        x1b1 x1b1Var = new x1b1();
        synchronized (c1761d0) {
            if (x1b1Var.f257140o) {
                throw new IllegalStateException("setAllowVcdTarget() called after startDecoding()");
            }
            x1b1Var.f257141p = true;
        }
        vcdiffDecoder = new r1b1(x1b1Var);
        xformPattern = Pattern.compile("([\\-\\w]+)(\\+([\\-\\w]+))?");
        TAG = BaseMessage.class.getName();
    }

    private String join(String[] strArr, char c, int i, int i2) {
        StringBuilder sb = new StringBuilder(strArr[i]);
        for (int i3 = i + 1; i3 < i2; i3++) {
            sb.append(c);
            sb.append(strArr[i3]);
        }
        return sb.toString();
    }

    public static JsonObject toJsonObject(BaseMessage baseMessage) {
        JsonObject jsonObject = new JsonObject();
        Object obj = baseMessage.data;
        String strConcat = baseMessage.encoding;
        if (obj != null) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                jsonObject.addProperty(DATA, new String(vx8.m86643b(bArr, bArr.length)));
                strConcat = strConcat == null ? "base64" : strConcat.concat("/base64");
            } else {
                jsonObject.addProperty(DATA, obj.toString());
            }
            if (strConcat != null) {
                jsonObject.addProperty(ENCODING, strConcat);
            }
        }
        String str = baseMessage.f7166id;
        if (str != null) {
            jsonObject.addProperty(f7165ID, str);
        }
        String str2 = baseMessage.clientId;
        if (str2 != null) {
            jsonObject.addProperty("clientId", str2);
        }
        String str3 = baseMessage.connectionId;
        if (str3 != null) {
            jsonObject.addProperty(CONNECTION_ID, str3);
        }
        return jsonObject;
    }

    private static byte[] vcdiffApply(byte[] bArr, byte[] bArr2) throws MessageDecodeException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            r1b1 r1b1Var = vcdiffDecoder;
            r1b1Var.getClass();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2);
            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr);
            x1b1 x1b1Var = r1b1Var.f194817a;
            x1b1Var.m89630g(byteBufferWrap);
            x1b1Var.m89624a(byteBufferWrap2, byteArrayOutputStream);
            x1b1Var.m89625b();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            throw MessageDecodeException.fromThrowableAndErrorInfo(th, new ErrorInfo("VCDIFF delta decode failed", 400, 40018));
        }
    }

    public int countFields() {
        int i = this.timestamp > 0 ? 1 : 0;
        if (this.f7166id != null) {
            i++;
        }
        if (this.clientId != null) {
            i++;
        }
        if (this.connectionId != null) {
            i++;
        }
        if (this.encoding != null) {
            i++;
        }
        return this.data != null ? i + 1 : i;
    }

    public void decode(ChannelOptions channelOptions) {
        decode(channelOptions, new DecodingContext());
    }

    public void encode(ChannelOptions channelOptions) throws AblyException {
        String str;
        String str2;
        Object obj = this.data;
        String str3 = "";
        if (obj != null) {
            if (obj instanceof JsonElement) {
                this.data = qtz0.f192515b.toJson((JsonElement) obj);
                StringBuilder sb = new StringBuilder();
                if (this.encoding == null) {
                    str2 = "";
                } else {
                    str2 = this.encoding + "/";
                }
                sb.append(str2);
                sb.append("json");
                this.encoding = sb.toString();
            }
            Object obj2 = this.data;
            if (obj2 instanceof String) {
                if (channelOptions != null && channelOptions.encrypted) {
                    try {
                        this.data = ((String) obj2).getBytes("UTF-8");
                    } catch (UnsupportedEncodingException unused) {
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if (this.encoding == null) {
                        str = "";
                    } else {
                        str = this.encoding + "/";
                    }
                    sb2.append(str);
                    sb2.append("utf-8");
                    this.encoding = sb2.toString();
                }
            } else if (!(obj2 instanceof byte[])) {
                tx8.m81888c(TAG, "Message data must be either `byte[]`, `String` or `JSONElement`; implicit coercion of other types to String is deprecated");
                throw AblyException.fromErrorInfo(new ErrorInfo("Invalid message data or encoding", 400, 40013));
            }
        }
        if (channelOptions == null || !channelOptions.encrypted) {
            return;
        }
        hyl cipherParamsOrDefault = channelOptions.getCipherParamsOrDefault();
        int i = kyl.f127884a;
        jyl jylVar = new jyl(cipherParamsOrDefault);
        Cipher cipher = jylVar.f85671c;
        try {
            cipher.init(1, jylVar.f85669a, jylVar.f85670b);
            jylVar.f117432f = cipherParamsOrDefault.f96603d.getIV();
            byte[] bArr = (byte[]) this.data;
            byte[] bArr2 = null;
            if (bArr != null) {
                int length = bArr.length;
                int i2 = (length + 16) & (-16);
                byte[] bArr3 = new byte[i2];
                int i3 = jylVar.f85672d;
                byte[] bArr4 = new byte[i2 + i3];
                int i4 = i2 - length;
                System.arraycopy(bArr, 0, bArr3, 0, length);
                System.arraycopy(jyl.f117431h[i4], 0, bArr3, length, i4);
                byte[] bArrUpdate = jylVar.f117432f;
                if (bArrUpdate == null) {
                    bArrUpdate = cipher.update(jyl.f117430g);
                } else {
                    jylVar.f117432f = null;
                }
                System.arraycopy(bArrUpdate, 0, bArr4, 0, i3);
                System.arraycopy(cipher.update(bArr3), 0, bArr4, i3, i2);
                bArr2 = bArr4;
            }
            this.data = bArr2;
            StringBuilder sb3 = new StringBuilder();
            if (this.encoding != null) {
                str3 = this.encoding + "/";
            }
            sb3.append(str3);
            sb3.append("cipher+");
            sb3.append(jylVar.f85673e);
            this.encoding = sb3.toString();
        } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
            throw AblyException.fromThrowable(e);
        }
    }

    public void getDetails(StringBuilder sb) {
        if (this.clientId != null) {
            sb.append(" clientId=");
            sb.append(this.clientId);
        }
        if (this.connectionId != null) {
            sb.append(" connectionId=");
            sb.append(this.connectionId);
        }
        if (this.data != null) {
            sb.append(" data=");
            sb.append(this.data);
        }
        if (this.encoding != null) {
            sb.append(" encoding=");
            sb.append(this.encoding);
        }
        if (this.f7166id != null) {
            sb.append(" id=");
            sb.append(this.f7166id);
        }
    }

    public void read(JsonObject jsonObject) {
        Long l = readLong(jsonObject, TIMESTAMP);
        if (l != null) {
            this.timestamp = l.longValue();
        }
        this.f7166id = readString(jsonObject, f7165ID);
        this.clientId = readString(jsonObject, "clientId");
        this.connectionId = readString(jsonObject, CONNECTION_ID);
        this.encoding = readString(jsonObject, ENCODING);
        this.data = readString(jsonObject, DATA);
    }

    public boolean readField(MessageUnpacker messageUnpacker, String str, MessageFormat messageFormat) {
        str.getClass();
        switch (str) {
            case "id":
                this.f7166id = messageUnpacker.unpackString();
                return true;
            case "data":
                if (!messageFormat.getValueType().isBinaryType()) {
                    this.data = messageUnpacker.unpackString();
                    return true;
                }
                byte[] bArr = new byte[messageUnpacker.unpackBinaryHeader()];
                messageUnpacker.readPayload(bArr);
                this.data = bArr;
                return true;
            case "timestamp":
                this.timestamp = messageUnpacker.unpackLong();
                return true;
            case "clientId":
                this.clientId = messageUnpacker.unpackString();
                return true;
            case "encoding":
                this.encoding = messageUnpacker.unpackString();
                return true;
            case "connectionId":
                this.connectionId = messageUnpacker.unpackString();
                return true;
            default:
                return false;
        }
    }

    public Long readLong(JsonObject jsonObject, String str) {
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement == null || (jsonElement instanceof JsonNull)) {
            return null;
        }
        return Long.valueOf(jsonElement.getAsLong());
    }

    public String readString(JsonObject jsonObject, String str) {
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement == null || (jsonElement instanceof JsonNull)) {
            return null;
        }
        return jsonElement.getAsString();
    }

    public void writeFields(MessagePacker messagePacker) {
        if (this.timestamp > 0) {
            messagePacker.packString(TIMESTAMP);
            messagePacker.packLong(this.timestamp);
        }
        if (this.f7166id != null) {
            messagePacker.packString(f7165ID);
            messagePacker.packString(this.f7166id);
        }
        if (this.clientId != null) {
            messagePacker.packString("clientId");
            messagePacker.packString(this.clientId);
        }
        if (this.connectionId != null) {
            messagePacker.packString(CONNECTION_ID);
            messagePacker.packString(this.connectionId);
        }
        if (this.encoding != null) {
            messagePacker.packString(ENCODING);
            messagePacker.packString(this.encoding);
        }
        if (this.data != null) {
            messagePacker.packString(DATA);
            Object obj = this.data;
            if (!(obj instanceof byte[])) {
                messagePacker.packString(obj.toString());
                return;
            }
            byte[] bArr = (byte[]) obj;
            messagePacker.packBinaryHeader(bArr.length);
            messagePacker.writePayload(bArr);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void decode(ChannelOptions channelOptions, DecodingContext decodingContext) {
        Object objVcdiffApply = this.data;
        String str = this.encoding;
        if (str != null) {
            String[] strArrSplit = str.split("\\/");
            int length = strArrSplit.length;
            while (true) {
                if (length > 0) {
                    try {
                        int i = length - 1;
                        Matcher matcher = xformPattern.matcher(strArrSplit[i]);
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            switch (strGroup.hashCode()) {
                                case -1396204209:
                                    if (strGroup.equals("base64")) {
                                        try {
                                            byte[] bArrM86642a = vx8.m86642a((String) this.data);
                                            this.data = bArrM86642a;
                                            if (length == strArrSplit.length) {
                                                objVcdiffApply = bArrM86642a;
                                            }
                                            length = i;
                                        } catch (IllegalArgumentException unused) {
                                            throw MessageDecodeException.fromDescription("Invalid base64 data received");
                                        }
                                    }
                                    break;
                                case -1360271861:
                                    if (strGroup.equals("cipher")) {
                                        if (channelOptions == null || !channelOptions.encrypted) {
                                            throw MessageDecodeException.fromDescription("Encrypted message received but encryption is not set up");
                                        }
                                        try {
                                            hyl cipherParamsOrDefault = channelOptions.getCipherParamsOrDefault();
                                            int i2 = kyl.f127884a;
                                            this.data = new iyl(cipherParamsOrDefault).m51940a((byte[]) this.data);
                                            length = i;
                                        } catch (AblyException e) {
                                            throw MessageDecodeException.fromDescription(e.errorInfo.message);
                                        }
                                    }
                                    break;
                                case -822215630:
                                    if (strGroup.equals(DeltaExtras.FORMAT_VCDIFF)) {
                                        objVcdiffApply = vcdiffApply((byte[]) this.data, decodingContext.getLastMessageData());
                                        this.data = objVcdiffApply;
                                        length = i;
                                    }
                                    break;
                                case 3271912:
                                    if (strGroup.equals("json")) {
                                        try {
                                            this.data = qtz0.f192514a.parse(((String) this.data).trim());
                                            length = i;
                                        } catch (JsonParseException unused2) {
                                            throw MessageDecodeException.fromDescription("Invalid JSON data received");
                                        }
                                    }
                                    break;
                                case 111607186:
                                    if (strGroup.equals("utf-8")) {
                                        try {
                                            this.data = new String((byte[]) this.data, "UTF-8");
                                        } catch (UnsupportedEncodingException | ClassCastException unused3) {
                                        }
                                        length = i;
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                    } catch (Throwable th) {
                        this.encoding = length > 0 ? join(strArrSplit, '/', 0, length) : null;
                        throw th;
                    }
                }
            }
            this.encoding = length > 0 ? join(strArrSplit, '/', 0, length) : null;
        }
        if (objVcdiffApply instanceof String) {
            decodingContext.setLastMessageData((String) objVcdiffApply);
        } else {
            if (!(objVcdiffApply instanceof byte[])) {
                throw MessageDecodeException.fromDescription("Message data neither String nor byte[]. Unsupported message data type.");
            }
            decodingContext.setLastMessageData((byte[]) objVcdiffApply);
        }
    }
}
